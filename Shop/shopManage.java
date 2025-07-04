package Shop;

import java.util.HashMap;

public class shopManage {
    private HashMap<String, Customer> customers;
    private HashMap<String, Item> items;

    public shopManage(){
        this.customers = new HashMap<>();
        this.items = new HashMap<>();

        items.put("MILK", new Item("MILK", 40));
        items.put("BREAD", new Item("BREAD", 25));
        items.put("EGGS", new Item("EGGS", 6));
        items.put("RICE", new Item("RICE", 60));
    }

    public void createcustomer(String name) {
        name = name.toUpperCase();
        if(!customers.containsKey(name)){
            customers.put(name, new Customer(name));
        }
        else{
            System.out.println("Welcome back, " + name + "!");
        }
    }

    public void addNewItem(String name, int price){
        name = name.toUpperCase();

        if(items.containsKey(name)){
            System.out.println("item already exist");
        }
        else{
            System.out.println("New item added");
        }

        items.put(name, new Item(name, price));
    }

    public void itemadd(String name, String item) {
       name = name.toUpperCase();
       item = item.toUpperCase();

       Customer customer = customers.get(name);
       if(customer == null){
        System.out.println("customer not found ");
        return;
       }
       Item itemss = items.get(item);
       if(itemss == null){
        System.out.println("you not selecting any itemss");
        return;
       }
       customer.additem(itemss);
       System.out.println(itemss + " added to " + name + "'s cart.");

    }

    public void total(String name) {
        Customer customer = customers.get(name);
        if(name == null){
            System.out.println("customer is not in the list");
            return;
        }

        customer.show();
        System.out.println("Total bill: ₹" + customer.total());



        
    }

    public void showitems(){
        for(Item itemss: items.values()){
            System.out.println("this are the items are avaliable in the shop"+itemss);
        }
    }

    

    
    
}
