package library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	private List<Book> books;
	
	public Library() {
		books = new ArrayList<>();
	}
	public void addBook(Book book) {
		books.add(book);
	}
	public void removeBook(String isbn) {
		books.removeIf(book -> book.getIsbn().equals(isbn));
	}
	public List<Book> listBooks(){
		return books;
	}
}
