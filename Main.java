import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library lib = new Library();

        // Sample Data
        lib.addBook(new Book(1, "Abc"));
        lib.addBook(new Book(2, "aBc"));
        lib.addBook(new Book(3, "abC"));

        lib.addUser(new User(1, "Xyz"));
        lib.addUser(new User(2, "xYz"));

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n  Library Menu   ");
            System.out.println("1. Show Books");
            System.out.println("2. Show Users");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    lib.showBooks();
                    break;
                case 2:
                    lib.showUsers();
                    break;
                case 3:
                    System.out.print("Enter Book ID to issue: ");
                    int issueId = sc.nextInt();
                    lib.issueBook(issueId);
                    break;
                case 4:
                    System.out.print("Enter Book ID to return: ");
                    int returnId = sc.nextInt();
                    lib.returnBook(returnId);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid input.");
            }
        } while (choice != 0);

        sc.close();
    }
}
