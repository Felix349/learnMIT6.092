package lec4oopAndClasses;

import java.util.ArrayList;

public class Library {
	// Add the missing implementation to this class
	static String openingHours = "Libraries are open daily from 9am to 5pm.";
	String address;
	ArrayList<Book> booksList = new ArrayList<>();

	Library(String libAddress) {
		address = libAddress;
	}

	public static void printOpeningHours() {
		System.out.println(openingHours);
	}

	public void addBook(Book addbook) {
		booksList.add(addbook);
	}

	public void printAddress() {
		System.out.println(address);
	}

	public void borrowBook(String bookname) {
		for (int i = 0; i < booksList.size(); i++) {// traverse all books in catalog of the library
			Book candidateBook = booksList.get(i);
			if (candidateBook.getTitle().equals(bookname)) {// found the book to borrow in catalog successfully
				if (candidateBook.isBorrowed()) {// book is in catalog but is not available
					System.out.println("Sorry, this book is already borrowed.");
					return;
				} else {
					candidateBook.borrowed();// the available book to mark as borrowed
					System.out.println("You successfully borrowed " + candidateBook.getTitle());
					return;
				}
			}
		} // the book is not in catalog
		System.out.println("Sorry, this book is not in our catalog.");
		return;
	}

	public void printAvailableBooks() {
		if (booksList.size() == 0) {// no book in catalog
			System.out.println("No book in catalog");
			return;
		} else {// # books > 0
			for (int i = 0; i < booksList.size(); i++) {// traverse all books in catalog of the library
				Book candidateBook = booksList.get(i);
				if (!candidateBook.isBorrowed()) {// print only the available books that is not borrowed
					System.out.println(candidateBook.getTitle());
				}
			}
		}
	}
	
	public void returnBook(String bookname) {
		for (int i = 0; i < booksList.size(); i++) {// traverse booksList
			Book candidateBook = booksList.get(i);
			if (candidateBook.getTitle().equals(bookname)) {// found the book in booksList
				if (candidateBook.isBorrowed()) {// the book has been borrowed
					candidateBook.returned();// return the book
					System.out.println("You successfully returned " + candidateBook.getTitle());
					return;
				}else {//the book has already been returned
					System.out.println("Weird! The book has already been returned.");
					return;
				}
			}
		}// the book is not in booksList
		System.out.println("Sorry, this book is not in our catalog.");
		return;
	}

	public static void main(String[] args) {
		// Create two libraries
		Library firstLibrary = new Library("10 Main St.");
		Library secondLibrary = new Library("228 Liberty St.");
		// Add four books to the first library
		firstLibrary.addBook(new Book("The Da Vinci Code"));
		firstLibrary.addBook(new Book("Le Petit Prince"));
		firstLibrary.addBook(new Book("A Tale of Two Cities"));
		firstLibrary.addBook(new Book("The Lord of the Rings"));
		// Print opening hours and the addresses
		System.out.println("Library hours:");
		printOpeningHours();
		System.out.println();
		System.out.println("Library addresses:");
		firstLibrary.printAddress();
		secondLibrary.printAddress();
		System.out.println();
		// Try to borrow The Lords of the Rings from both libraries
		System.out.println("Borrowing The Lord of the Rings:");
		firstLibrary.borrowBook("The Lord of the Rings");
		firstLibrary.borrowBook("The Lord of the Rings");
		secondLibrary.borrowBook("The Lord of the Rings");
		System.out.println();
		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();
		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();
		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}
}