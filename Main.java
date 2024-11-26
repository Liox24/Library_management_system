import java.util.Scanner;

public class Main {

    static Scanner scn;
    static Database database;

    public static void main(String[] args) {

        database = new Database();

        System.out.println("\nWelcome to Library Management System...");

        int n;
        do {
            System.out.println("\n" + "0 .Exit\n" + "1 .Login\n" + "2 .New User");
            System.out.print("Choose the number : ");
            scn = new Scanner(System.in);
            n = scn.nextInt();
            switch (n) {
                case 1:
                    login();
                    break;
                case 2:
                    newUser();
                    break;
            }
        } while (n != 0);
    }

    private static void login() {
        System.out.print("Enter Phone number : ");
        String phoneNumber = scn.next();
        System.out.println("Enter Email : ");
        String email = scn.next();
        int n = database.login(phoneNumber, email);
        if (n != -1) {
            User user = database.getUser(n);
            user.menu();
            System.out.println("Welcome " + user.getName());
        } else {
            System.out.println("User Does not Exist...!");
        }
    }

    private static void newUser() {
        System.out.print("\nEnter Name: ");
        String name = scn.next(); // Reads the full name with spaces.

        System.out.print("\nEnter Phone Number:");
        String phoneNumber = scn.next(); // Reads the phone number.

        System.out.print("\nEnter Email:");
        String email = scn.next(); // Reads the email.

        System.out.println("1. Admin\n2. Normal User");
        int n2 = scn.nextInt(); // Reads the user type.

        // Consume the leftover newline after nextInt()
        scn.nextLine();

        User user;
        // Create the user based on input.
        if (n2 == 1) {
            user = new Admin(name, email, phoneNumber);
        } else {
            user = new NormalUser(name, email, phoneNumber);
        }

        database.AddUser(user);
        user.menu();
    }

}   