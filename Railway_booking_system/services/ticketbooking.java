package Railway_booking_system.services;

import java.util.*;

import Railway_booking_system.models.*;

public class ticketbooking {

    private final Map<Integer,Train> trains ;

    public ticketbooking(Map<Integer, Train> trains){
        this.trains = trains;
   

    }

    public void book(String name, int age, String gender, int trainNumber){

        Train train = trains.get(trainNumber);

        if(train==null){
            System.out.println("Invalid train option you select");
            return;
        }

        System.out.println("avaliable seats");
        train.displayAvailability();

        System.out.println("enter the seat you want (LOWER, UPPER, MIDDLE) :");
        Scanner input = new Scanner(System.in);
        String seat = input.next().toUpperCase();

        try{
         SeatType seatType = SeatType.valueOf(seat);

         if(train.bookseat(seatType)){
            System.out.println("succesfully booked you ticket"+seatType+ " for " +name);
         }
            else{
                System.out.println("seat is not avaliable");
            }
         

        } catch (IllegalArgumentException e) {
            System.out.println("Invalid seat type.");
        }
       
    }

    
    
}
