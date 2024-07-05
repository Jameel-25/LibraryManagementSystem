package library;

public class Main {
	public static void main(String[] args) {
		Library library = new Library();
		//Add some books
		library.addBook(new Book("The Great Gatsby","F. Scott Fitzgerald","1122334455"));
		library.addBook(new Book("To Kill a Mockingbird","Harper Lee","0987654321"));
		
		//List all books
		System.out.println("Books in the library:");
		for(Book book: library.listBooks()) {
			System.out.println(book);
		}
		// Remove a book

		library.removeBook("0987654321");
		
		//List all books after removeal
		System.out.println("\nBooks in the library after removal:");
		for(Book book: library.listBooks()) {
			library.listBooks();
			System.out.println(book);
		}
	}
}
