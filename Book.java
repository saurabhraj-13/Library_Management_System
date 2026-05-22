public class Book {

    private int bookId;
    private String bookName;
    private String authorName;
    private boolean issued;

    // Constructor
    public Book(int bookId, String bookName, String authorName) {

        this.bookId = bookId;
        this.bookName = bookName;
        this.authorName = authorName;
        this.issued = false;
    }

    // Getter for Book ID
    public int getBookId() {
        return bookId;
    }

    // Getter for Book Name
    public String getBookName() {
        return bookName;
    }

    // Getter for Issued Status
    public boolean isIssued() {
        return issued;
    }

    // Setter for Issued Status
    public void setIssued(boolean issued) {
        this.issued = issued;
    }

    // Display Book Details
    public void displayBook() {

        System.out.println(
                bookId + " | " +
                bookName + " | " +
                authorName + " | Issued: " + issued
        );
    }
}