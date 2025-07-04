package CALL_TAXI_LLD;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TaxiBookingSystem system = new TaxiBookingSystem(4);

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("\n 1.Book taxi");
            System.out.println("2.Display the taxi details");
            System.out.println("3. exit");
            System.out.println("enter the choice");
            int n = input.nextInt();

            switch (n) {
                case 1 ->{
                    System.out.println("enter the customer ID");
                    int cusID = input.nextInt();

                    System.out.println("enter the pickup location(A-F)");
                    char pick = input.next().toUpperCase().charAt(0);

                    System.out.println("enter the drop location (A-F)");
                    char drop = input.next().toUpperCase().charAt(0);

                    System.out.println("enter the pickup time in hrs or minutes");
                     int time = input.nextInt();

                     if(pick == drop || pick < 'A' || pick > 'F' || drop < 'A' || drop > 'F'){
                        System.out.println("Invalid pick or drop point");
                        continue;
                     }

                     system.bookTaxi(cusID, pick, drop, time);
                }

                case 2 ->{
                    system.displayTaxiDetails();
                }

                case 3 ->{
                    System.out.println("Thank you visit again");
                    return;
                }
                 default -> System.out.println("Invalid choice. Try again.");
            }
        }
        
    }
    
}
