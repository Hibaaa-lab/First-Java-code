
package library;


public class Book {
    // Private attributes
    private String title;
    private String author;
    private boolean isAvailable;

    // Constructor
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true; 
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("The book '" + title + "' is already borrowed.");
        }
    }

    // Method to return book
    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true ;
           System.out.println("the book'"+ title +"'returned successfully");
        } else {
            System.out.println("the book has not been borrowed");
        }
              
    }
    
    // Method to return book information
    public void getBookInfo(){
        System.out.println("the book title is : '"+ title + "' and the author is :" + author+ ", the availability status is :" + isAvailable)   ;
     
    }

}
