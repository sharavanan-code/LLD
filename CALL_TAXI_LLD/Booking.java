package CALL_TAXI_LLD;

public class Booking {

    int bookingId;
    int customerId;
    char from;
    char to;
    int pickupTime;
    int dropTime;
    int amount;

     public Booking(int bookingId, int customerId, char from, char to, int pickupTime, int dropTime, int amount) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.from = from;
        this.to = to;
        this.pickupTime = pickupTime;
        this.dropTime = dropTime;
        this.amount = amount;
    }

    public void display(){
        System.out.printf("%-10d%-13d%-7c%-7c%-13d%-11dRS. %d\n", bookingId, customerId, from, to, pickupTime, dropTime, amount);
    }

    
}
