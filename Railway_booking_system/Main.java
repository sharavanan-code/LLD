package Railway_booking_system;
import java.util.*;

import Railway_booking_system.models.Train;
import Railway_booking_system.services.ticketbooking;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Map<Integer, Train> trains = new HashMap<>();
        // System.out.println("enter the number of seat numbers");
        // int z = input.nextInt();


        trains.put(1, new Train(1, "Chennai to kovai", 10,10,10));
        trains.put(2, new Train(2, "Chennai to Salem", 10, 10, 10));
        trains.put(3, new Train(3, "Chennai to Theni", 10, 10, 10));
        trains.put(4, new Train(4, "Chennai to Erode", 10, 10, 10));
        
        ticketbooking book = new ticketbooking(trains);
        

        while(true) {
            System.out.println("Enter No. 1 for ticket booking");
            System.out.println("Enter No. 2 for exit");
            System.out.print("Enter your choice: ");

            int n = input.nextInt();
            input.nextLine(); // Consume leftover newline

            switch (n) {
                case 1 -> {
                    System.out.print("Enter your name: ");
                    String name = input.nextLine();

                    System.out.print("Enter your age: ");
                    int age = input.nextInt();
                    input.nextLine(); // Consume newline

                    System.out.print("Enter your gender (male, female, other): ");
                    String gender = input.nextLine().toUpperCase();

                    System.out.println("1. Chennai to Kovai");
                    System.out.println("2. Chennai to Salem");
                    System.out.println("3. Chennai to Theni");
                    System.out.println("4. Chennai to Erode");

                    System.out.print("Enter the train number (1-4): ");
                    int trainNumber = input.nextInt();

                    book.book(name, age, gender, trainNumber); // Correct method call
                }

                case 2 -> {
                    System.out.println("Thank you for using the Railway Booking System.");
                    input.close();
                    return; // Exit the program
                }

                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }
}
