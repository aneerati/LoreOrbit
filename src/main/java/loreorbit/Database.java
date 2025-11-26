package loreorbit;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.WriteResult;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.cloud.FirestoreClient;

public class Database {

	private static Database single_instance = null;
    public Firestore database;
    
    private Database() {
    	InputStream serviceAccount = Main.class.getResourceAsStream("/loreorbit-firebase-adminsdk-fbsvc-960b789128.json");
    	FirebaseOptions options;
    	
    	try {
			options = FirebaseOptions.builder().setCredentials(GoogleCredentials.fromStream(serviceAccount))
			        .build();
			FirebaseApp.initializeApp(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
    	
        database = FirestoreClient.getFirestore();
    }
    
    public static synchronized Database getInstance() {
        if (single_instance == null)
            single_instance = new Database();

        return single_instance;
    }
    
    
    // Write Data
    public void createUserFB(String username, String planet, String description) {
    	DocumentReference docRef = database.collection("users").document(username);
    	Map<String, Object> data = new HashMap<>();
    	data.put("planet", planet);
    	
    	//asynchronously write data
    	ApiFuture<WriteResult> result = docRef.set(data);
    	try {
			System.out.println("Update time : " + result.get().getUpdateTime());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
    	
    	docRef = database.collection("worlds").document(planet);
    	data = new HashMap<>();
    	data.put("description", description);
    	result = docRef.set(data);
    	try {
			System.out.println("Update time : " + result.get().getUpdateTime());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
    	
    	

    }
    
}
