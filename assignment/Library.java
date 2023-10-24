package assignment;

public class Library {
	String address;
	String[] bookName = new String[999];
	Boolean[] isBorrowed = new Boolean[999];
	int i = -1;

	// Add the missing implementation to this class
	public Library(String add) {
		address = add;
	}

	public void addBook(Book book) {
		i += 1;
		bookName[i] = book.getTitle();
		isBorrowed[i] = false;
	}

	static void printOpeningHours() {
		System.out.println("Libraries are open daily from 9am to 5pm.");
	}

	public void printAddress() {
		System.out.println(address);
	}

	public void borrowBook(String book) {
		if (i == -1) {
			System.out.println("Sorry, this book is not in our catalog.");
		}
		for (int j = 0; j <= i; j++) {
			if (bookName[j] != book && j != i) {
				continue;
			} else if (j == i && bookName[j] != book) {
				System.out.println("Sorry, this book is not in our catalog.");
			} else if (isBorrowed[j] == false) {
				System.out.println("You successfully borrowed " + book);
				isBorrowed[j] = true;
				break;
			} else {
				System.out.println("Sorry, this book is already borrowed.");

			}
		}
	}

//	
	public void printAvailableBooks() {
		if (i == -1) {
			System.out.println("No book in catalog");
		}
		for (int j = 0; j <= i; j++) {
			if (isBorrowed[j] == false) {
				System.out.println(bookName[j]);
			}

		}
	}

	public void returnBook(String book) {
		for (int j = 0; j <= i; j++) {
			if (bookName[j] == book) {
				isBorrowed[j] = false;
				System.out.println("You successfully returned " + book);
				break;
			}
		}
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
//
		// Print the titles of all available books from both libraries
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
		System.out.println();
		System.out.println("Books available in the second library:");
		secondLibrary.printAvailableBooks();
		System.out.println();
//
		// Return The Lords of the Rings to the first library
		System.out.println("Returning The Lord of the Rings:");
		firstLibrary.returnBook("The Lord of the Rings");
		System.out.println();
//
		// Print the titles of available from the first library
		System.out.println("Books available in the first library:");
		firstLibrary.printAvailableBooks();
	}
}