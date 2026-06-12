 import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by Title");
            System.out.println("4. Search Book by Author");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter title: ");
                String title = sc.nextLine();

                System.out.print("Enter author: ");
                String author = sc.nextLine();

                System.out.print("Enter ISBN: ");
                String isbn = sc.nextLine();

                Book book = new Book(title, author, isbn);
                library.addBook(book);
            }

            else if (choice == 2) {
                System.out.print("Enter ISBN to remove: ");
                String isbn = sc.nextLine();
                library.removeBook(isbn);
            }

            else if (choice == 3) {
                System.out.print("Enter title: ");
                String title = sc.nextLine();
                library.searchByTitle(title);
            }

            else if (choice == 4) {
                System.out.print("Enter author: ");
                String author = sc.nextLine();  
                library.searchByAuthor(author);
            }

            else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }

            else if(choice==6){
                System.out.println("Thank you for using the Library Management System. Goodbye!");
                break;
            }
            else{
                System.out.println("Invalid choice. Please try again.");
            }

        }

        sc.close();
    }
}



















