package Hotel_Booking;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        HotelManage hotel = new HotelManage();
        
        

        Scanner input = new Scanner(System.in);

        while(true){
            System.out.println("enter the choice Number");
            System.out.println("1.Hotel booking");
            System.out.println("2.Avaliable Rooms");
            System.out.println("3.customer Details");
            System.out.println("4.enter extra rooms");
            System.out.println("5.enter check out");
            System.out.println("6.Exit.....");
            int choice =input.nextInt();
            switch (choice) {                
                case 1 ->{
                    System.out.println("enter the your name");
                    String name = input.nextLine();

                    System.out.println("enter the number of rooms need");
                    int num = input.nextInt();

                    hotel.bookRoom(name, num);
                }
                case 2->{
                    hotel.avaliableRoom();
                }

                case 3 ->{
                    hotel.customershow();

                }
                case 4->{

                    System.out.println("enter the number of Rooms want to add");
                    int n = input.nextInt();
                    hotel.extraRoom(n);

                }
                case 5->{
                    System.out.println("enter the your name");
                    String name = input.next();

                    System.out.println("enter the room no you check out how many rooms only");
                    int count = input.nextInt();
                    hotel.checkout(name,count);
                }
              
            }
        }
    }
    
}
