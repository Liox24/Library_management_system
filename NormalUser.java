public class NormalUser extends User {
    public NormalUser(String name) {
        super(name);
        this.operations = new IOOperations[]{
            new ViewBooks(),
            new AddBook(),
            new DeleteBook(),
            new Search(),
            new DeleteAllData(),
            new ViewOrders(),
            new Exit()
        };
    }

    public NormalUser(String name, String email, String phonenumber) {
        super(name, email, phonenumber);
    }
 
    public void menu() {
        System.out.println("1. View Books");
        System.out.println("2. Search");
        System.out.println("3. Place Order");
        System.out.println("4. Borrow book");
        System.out.println("5. Calculate Fine");
        System.out.println("6. Return Book");
        System.out.println("7. Exit");
    }
}
