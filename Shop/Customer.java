package Shop;

import java.util.*;

public class Customer {
    private String name;
    private List<Item> cart;

    public Customer(String name){
        this.name = name;
        this.cart = new ArrayList<>();
    }

    public String getName(){
        return name;
    }

    public void additem(Item item){
        cart.add(item);
    }

    public int total(){
        int total =0;
        for(Item item : cart){
            total+=item.getPrice();
        }
        return total;
    }

    public void show(){
        if(cart.isEmpty()){
            System.out.println("cartis empty");

        }
        else{
            for(Item item : cart){
                System.out.println("item name"+item.getName()+" price name"+item.getPrice());
            }
        }
    }

    
}
