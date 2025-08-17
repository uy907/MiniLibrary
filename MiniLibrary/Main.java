 import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        int bookId = 1;
        boolean running = true;

        while (running) { System.out.println("\n1. Add Book");
            System.out.println("2. List Books");
            System.out.println("3. Delete Book by ID");
            System.out.println("4. Exit");
            System.out.print("Choose: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // buffer temizliği

            if (choice == 1) {
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();

                System.out.print("Enter author name: ");
                String author = scanner.nextLine();

                System.out.print("Enter page count: ");
                int pageCount = scanner.nextInt();
                scanner.nextLine();

                bookList.add(new Book(bookId++, title, author, pageCount));
                System.out.println("Book added successfully!");

            } else if (choice == 2) {
                if (bookList.isEmpty()) {
                    System.out.println("No books in the library.");
                } else {
                    for (Book b : bookList) {
                        System.out.println(b);
                    }
                }

            } else if (choice == 3) {
                System.out.print("Enter book ID to delete: ");
 int id = scanner.nextInt();
                scanner.nextLine();

                boolean removed = bookList.removeIf(b -> b.getId() == id);
                if (removed) {
                    System.out.println("Book removed.");
                } else {
                    System.out.println("Book with that ID not found.");
                }

            } else if (choice == 4) {
                running = false;
                System.out.println("Exiting program.");
            } else {
                System.out.println("Invalid choice.");
            }
        }
        scanner.close();
    }
}