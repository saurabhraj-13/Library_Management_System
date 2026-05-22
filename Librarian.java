public class Librarian extends Person {

    public Librarian(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayDetails() {

        System.out.println("\nLibrarian Details");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}