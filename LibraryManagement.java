import java.util.ArrayList;
import java.util.Scanner;

class Book {
    String title;
    String author;
    int id;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("ID: " + id + ", Title: " + title + ", Author: " + author);
    }
}

public class LibraryManagement {
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void addBook() {
        System.out.print("Enter Book ID: ");
        int id = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        String author = sc.nextLine();

        books.add(new Book(id, title, author));
        System.out.println("✅ Book Added Successfully!");
    }

    public static void removeBook() {
        System.out.print("Enter Book ID to remove: ");
        int id = sc.nextInt();

        for (Book b : books) {
            if (b.id == id) {
                books.remove(b);
                System.out.println("📕 Book Removed Successfully!");
                return;
            }
        }
        System.out.println("❌ Book Not Found!");
    }

    public static void searchBook() {
        sc.nextLine(); 
        System.out.print("Enter Book Title to Search: ");
        String title = sc.nextLine();

        boolean found = false;
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                b.display();
                found = true;
            }
        }

        if (!found) {
            System.out.println("❌ Book Not Found!");
        }
    }

    public static void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("📂 No books available.");
            return;
        }

        System.out.println("\n📚 Available Books:");
        for (Book b : books) {
            b.display();
        }
    }

    public static void main(String[] args) {
        int choice;

        do {
            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book");
            System.out.println("4. Display All Books");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1: addBook(); break;
                case 2: removeBook(); break;
                case 3: searchBook(); break;
                case 4: displayBooks(); break;
                case 5: System.out.println("👋 Exiting..."); break;
                default: System.out.println("❌ Invalid Choice!");
            }

        } while (choice != 5);
    }
}
