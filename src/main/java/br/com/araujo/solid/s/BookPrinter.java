package br.com.araujo.solid.s;

/**
 * Single Responsibility
 * 
 * Aqui é separada a funcionalidade de printar o texto, pois não faz parte da manipulação das propriedades da classe Book
 * 
 * @author araujo
 *
 */
public class BookPrinter {
	
	private final Book book;

	public BookPrinter(Book book) {
		super();
		this.book = book;
	}
	
	public String printText() {
		return "Text Content: " + book.getText();
	}
	
	public String printTextToAnotherMedium() {
		return "Text Content 2: " + book.getText();
	}
}
