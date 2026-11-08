package library;

import library.model.Book;
import library.model.LibraryMember;
import library.system.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Clean Code", "Robert Martin", "111");
        Book book2 = new Book("Effective Java", "Joshua Bloch", "222");

        LibraryMember member1 = new LibraryMember("Alice", 1);
        LibraryMember member2 = new LibraryMember("Bob", 2);

        library.addBook(book1);
        library.addBook(book2);
        library.addMember(member1);
        library.addMember(member2);

        System.out.println();
        library.borrowBook(member1, book1);
        library.returnBook(member1, book1);

        System.out.println();
        library.reserveBook(member1, book1);
        library.reserveBook(member2, book1);
        library.borrowBook(member2, book1);
        library.displayReservedBooks(member1);

        System.out.println();
        library.cancelReservation(member2, book1);
        library.cancelReservation(member1, book1);
        library.displayReservedBooks(member1);

        System.out.println();
        library.borrowBook(member2, book1);
    }
}