package loreorbit;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws IOException {
		
		// Initialize Database on Startup
		Database db = Database.getInstance();
		
		db.createUserFB("aneerati", "Abysson", "A world plagued by deep seas, vast mountains, and pirates.");
		
		World myWorld = new World("Abysson", "A world plagued by deep seas, vast mountains, and pirates.", "aneerati");
	
	}

}
