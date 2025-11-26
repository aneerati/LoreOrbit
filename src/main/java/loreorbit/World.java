package loreorbit;

import java.util.ArrayList;
import java.util.HashMap;

public class World {
	
	private String user;
	private String name;
	private String description;
	private ArrayList<Book> books;
	
	private HashMap<String, Integer> bookIndex;
	
	public World(String name, String description, String user) {
		this.user = user;
		this.name = name;
		this.description = description;
		this.books = new ArrayList<>();
		this.bookIndex = new HashMap<>();
		
		books.add(new Book("Book of " + name, user));
		bookIndex.put("Book of " + name, 0);
		
		
	}
	
	public Book getBookByTitle(String title) {
		return books.get(bookIndex.get(title));
	}
	
	// Getters
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public ArrayList<Book> getBooks() {
		return this.books;
	}
	
	public String getUser() {
		return this.user;
	}

}
