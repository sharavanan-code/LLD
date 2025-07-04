package Hotel_Booking;

import java.util.*;

public class HotelManage {
    private int avaliablehotelrooms = 10;
    List<Customer> customer;

    public void bookRoom(String name, int roomcount){
        if(roomcount > avaliablehotelrooms){
            System.out.println("sorry rooms not avaliable");
        }else{
            roomcount-=avaliablehotelrooms;
            customer.add(new Customer(name, roomcount));
            System.out.println("booking succcessful"+name);
        }

    }

    public void avaliableRoom(){
        System.out.println("Rooms avaliable"+ avaliablehotelrooms);
    }

    public void customershow(){
        for(Customer cus : customer){
            System.out.println("Name"+cus.getName()+"Room no"+cus.getRoomNo());
        }
    }

    public void extraRoom(int n){
        avaliablehotelrooms+=n;

    }

    public void checkout(String name, int count){

        Customer found =null;

        for(Customer c :customer){
            if(name.equals(c.getName())){
                found =c;
                break;

            }
        }

        if(found == null){
            System.out.println("customer not found");
            return;
        }

        if(count > found.getRoomNo()){
            System.out.println("Error: Trying to checkout more rooms than booked.");
            return;
        }

        if(count == found.getRoomNo()){
            customer.remove(found);
        }else{
            int remianing = found.getRoomNo() - count;
            customer.remove(found);
            customer.add(new Customer(found.getName(), remianing));
        }

         avaliablehotelrooms += count;
         System.out.println("thank you for check out");
        

    }
    
}
