abstract class User {
    protected String name;

    public User(String name) {
        this.name = name;
    }

    abstract void showRole();
}