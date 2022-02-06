package br.com.araujo.solid.s;

public class Book {
	private final String name;
	private final String author;
	private final String text;
	
	public Book(String name, String author, String text) {
		super();
		this.name = name;
		this.author = author;
		this.text = text;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getText() {
		return text;
	}
	
	// methods that directly relate to the book properties
	public String replaceWordInText(String actualWord, String newWord) {
		return text.replaceAll(actualWord, newWord);
	}

	public boolean isWordInText(String word) {
		return text.contains(word);
	}
}
