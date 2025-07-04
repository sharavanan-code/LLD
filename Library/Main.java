package Library;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BookMangement book = new BookMangement();  
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("\nLibrary Menu:");
            System.out.println("1. Register Member");
            System.out.println("2. Take a book");
            System.out.println("3. Submit a book");
            System.out.println("4. Show Available books");
            System.out.println("5. Show Member's Borrowed Books");
            System.out.println("6. Exit");
            System.out.println("7. Add a book");

            int choice = input.nextInt();
            input.nextLine(); // consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter your name to register: ");
                    String name = input.nextLine();
                    book.register(name);
                }

                case 2 -> {
                    System.out.print("Enter your name: ");
                    String memberName = input.nextLine().toLowerCase(); // ✅ fix
                    System.out.print("Enter the book name to take: ");
                    String bookName = input.nextLine().toUpperCase();
                    book.takebook(memberName, bookName);
                }

                case 3 -> {
                    System.out.print("Enter your name: ");
                    String memberName = input.nextLine().toLowerCase(); // ✅ fix
                    System.out.print("Enter the book name to return: ");
                    String bookName = input.nextLine().toUpperCase();
                    book.returnbook(memberName, bookName);
                }

                case 4 -> {
                    book.showAvaliable();
                }

                case 5 -> {
                    System.out.print("Enter member name to see borrowed books: ");
                    String memberName = input.nextLine().toLowerCase(); // ✅ fix
                    book.showMemberBooks(memberName);
                }

                case 6 -> {
                    System.out.println("Thank you for using the Library.");
                    return;
                }

                case 7 ->{
                    System.out.println("Enter the book name to add");
                    String name = input.nextLine().toUpperCase();
                    System.out.println("enter the number of copies");
                    int n = input.nextInt();

                    book.addbook(name, n);
                }

                default -> System.out.println("Invalid choice. Please choose 1-6.");
            }
        }
    }
}
