package library;

public class LibraryTest {
    public static void main(String[] args) {
        Book book1 = new Book(" the hunger games", "Suzanne Collins") ;
        book1.borrowBook ();
        book1.returnBook ();
        book1.getBookInfo();

    }
}

