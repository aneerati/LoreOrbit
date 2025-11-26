package loreorbit;

import java.util.ArrayList;
import java.util.HashMap;

public class Book {
	
	private String title;
	private ArrayList<String> authors;
	private ArrayList<Page> pages;
	private HashMap<String, Integer> tableOfContents;
	
	public Book(String title, String author) {
		this.title = title;
		this.authors = new ArrayList<>();
		this.authors.add(author);
		this.pages = new ArrayList<>();
		this.tableOfContents = new HashMap<>();
		this.tableOfContents.put(title, 0);
		
	}
	
	
	// Author List Edits
	public void addAuthor(String author) {
		this.authors.add(author);
	}
	
	public boolean removeAuthor(String author) {
		if (this.authors.size() > 1) {
			return this.authors.remove(author);
		}
		else {
			return false;
		}
	}
	
	
	// Getters
	public String getTitle() {
		return this.title;
	}
	
	public ArrayList<String> getAuthors() {
		return this.authors;
	}
	
	public ArrayList<Page> getPages() {
		return this.pages;
	}
	
	public Page getPagebyNumber(int pageNum) {
		return this.pages.get(pageNum);
	}
	
	public int getPageCount() {
		return this.pages.size();
	}

}
