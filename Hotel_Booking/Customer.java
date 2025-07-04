package Hotel_Booking;

public class Customer {

    private String name;
    private int roomsno;

    public Customer(String name, int roomsno){
        this.name = name;
        this.roomsno = roomsno;
    }

    public String getName(){
        return name;
    }

    public int getRoomNo(){
        return roomsno;
    }
    
}
