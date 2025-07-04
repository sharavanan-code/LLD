package CALL_TAXI_LLD;

import java.util.ArrayList;
import java.util.List;

public class Taxi {

    int id;
    int totalEarnings;
    char currentLocation;
    int freeTime; 
    List<Booking> bookings;
    public int pickupTime;

    public Taxi(int id){
        this.id = id;
        this.totalEarnings = 0;
        this.currentLocation = 'A';
        this.freeTime = 0;
        this.bookings = new ArrayList<>();

    }

    public void addbooking(Booking booking){
        bookings.add(booking);
        totalEarnings+=booking.amount;
        currentLocation = booking.to;
        freeTime = booking.dropTime;
    }

    public void displayDetails(){

        System.out.println("Taxi-" + id + "    Total Earnings: Rs. " + totalEarnings);
        System.out.printf("%-10s%-13s%-7s%-7s%-13s%-11s%s\n", "BookingID", "CustomerID", "From", "To", "PickupTime", "DropTime", "Amount");

        
        for(Booking b: bookings){
            b.display();
        }
        System.out.println();
    }
    
}
