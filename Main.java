import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Library library = new Library();

        while (true) {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");

            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Add Student");
            System.out.println("4. Issue Book");
            System.out.println("5. Return Book");
            System.out.println("6. View Student Details");
            System.out.println("7. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Book ID: ");
                    int bookId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Book Name: ");
                    String bookName = sc.nextLine();

                    System.out.print("Enter Author Name: ");
                    String author = sc.nextLine();

                    Book book = new Book(bookId, bookName, author);

                    library.addBook(book);

                    break;

                case 2:

                    library.viewBooks();

                    break;

                case 3:

                    System.out.print("Enter Student ID: ");
                    int studentId = sc.nextInt();

                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String studentName = sc.nextLine();

                    System.out.print("Enter Department: ");
                    String department = sc.nextLine();

                    Student student =
                            new Student(studentId, studentName, department);

                    library.addStudent(student);

                    break;

                case 4:

                    System.out.print("Enter Student ID: ");
                    int sId = sc.nextInt();

                    System.out.print("Enter Book ID: ");
                    int bId = sc.nextInt();

                    library.issueBook(sId, bId);

                    break;

                case 5:

                    System.out.print("Enter Student ID: ");
                    int rsId = sc.nextInt();

                    System.out.print("Enter Book ID: ");
                    int rbId = sc.nextInt();

                    library.returnBook(rsId, rbId);

                    break;

                case 6:

                    System.out.print("Enter Student ID: ");

                    int viewId = sc.nextInt();

                    library.viewStudent(viewId);

                    break;

                case 7:

                    System.out.println("Thank You");

                    System.exit(0);

                default:

                    System.out.println("Invalid Choice");
            }
        }
    }
}