import java.util.ArrayList;

public class Library implements LibraryOperations {

    private ArrayList<Book> books;
    private ArrayList<Student> students;

    public Library() {
        books = new ArrayList<>();
        students = new ArrayList<>();
    }

    // Add Book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book Added Successfully");
    }

    // Add Student
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully");
    }

    // View Books
    public void viewBooks() {

        if (books.isEmpty()) {
            System.out.println("No books available");
            return;
        }

        for (Book b : books) {
            b.displayBook();
        }
    }

    // View Student
    public void viewStudent(int studentId) {

        for (Student s : students) {

            if (s.id == studentId) {
                s.displayDetails();
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    // Search Book
    private Book findBook(int id) {

        for (Book b : books) {

            if (b.getBookId() == id) {
                return b;
            }
        }

        return null;
    }

    // Search Student
    private Student findStudent(int id) {

        for (Student s : students) {

            if (s.id == id) {
                return s;
            }
        }

        return null;
    }

    // Issue Book
    @Override
    public void issueBook(int studentId, int bookId) {

        try {

            Student student = findStudent(studentId);

            if (student == null) {
                throw new Exception("Student Not Found");
            }

            Book book = findBook(bookId);

            if (book == null) {
                throw new Exception("Book Not Found");
            }

            if (book.isIssued()) {
                throw new Exception("Book Already Issued");
            }

            if (student.getBorrowedBooks().size() >= 3) {
                throw new Exception("Borrow Limit Exceeded");
            }

            student.getBorrowedBooks().add(book);

            book.setIssued(true);

            System.out.println("Book Issued Successfully");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }

    // Return Book
    @Override
    public void returnBook(int studentId, int bookId) {

        try {

            Student student = findStudent(studentId);

            if (student == null) {
                throw new Exception("Student Not Found");
            }

            Book book = findBook(bookId);

            if (book == null) {
                throw new Exception("Book Not Found");
            }

            if (!student.getBorrowedBooks().contains(book)) {
                throw new Exception("This student did not borrow this book");
            }

            student.getBorrowedBooks().remove(book);

            book.setIssued(false);

            System.out.println("Book Returned Successfully");

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
        }
    }
}