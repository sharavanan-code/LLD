package CALL_TAXI_LLD;

import java.util.*;


public class TaxiBookingSystem {
    private final List<Taxi> taxis = new ArrayList<>();
    private int bookingCounter =1;

    public TaxiBookingSystem(int taxiCount){
        for(int i =1; i<=taxiCount; i++){
            taxis.add(new Taxi(i));
        }
    }

    public void bookTaxi(int CustomerID, char pickupPoint, char dropPoint, int pickupTime){
        List<Taxi> avaliable = new ArrayList<>();

        for(Taxi t :taxis){
            if(t.freeTime <= t.pickupTime){
                avaliable.add(t);

            }

        }

        Taxi chosenTaxi = findbesttaxi(avaliable, pickupPoint);

        if(chosenTaxi == null){
            System.out.println("NO Taxi will allocated");
            return;
        }

        int distance = Math.abs(pickupPoint - dropPoint) * 15;
        int dropTime = pickupTime + Math.abs(pickupPoint - dropPoint);
        int amount = calculateFare(distance);

        Booking booking = new Booking(bookingCounter++, CustomerID, pickupPoint, dropPoint, pickupTime, dropTime, amount);
        chosenTaxi.addbooking(booking);

        System.out.println("taxi can be allotted");
        System.out.println("Taxi-" + chosenTaxi.id + " is allotted.\n");


    }

    private Taxi findbesttaxi(List<Taxi> available,char pickupPoint ){

        Taxi best = null;
        for(Taxi t : available){
            if(best == null || Math.abs(t.currentLocation - pickupPoint) < Math.abs(best.currentLocation - pickupPoint) || Math.abs(t.currentLocation - pickupPoint) < Math.abs(best.currentLocation - pickupPoint) && t.totalEarnings < best.totalEarnings ){
                best =t;

            }
        }

        return best;
    }

    private int calculateFare(int distance){
        if(distance <= 5) return 100;
        return 100 + (distance -5) *10;
    }

       public void displayTaxiDetails() {
        for (Taxi t : taxis) {
            t.displayDetails();
        }

    
}
}