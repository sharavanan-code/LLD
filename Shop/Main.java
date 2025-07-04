package Shop;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        shopManage shop = new shopManage();
        
        Scanner input = new Scanner(System.in);
       

        while(true){
            System.out.println("welcome to the shop");
            System.out.println("1.need items");
            System.out.println("2.total bill amount");
            System.out.println("3. avaliable item list");
            System.out.println("4.exit...");
             int choice = input.nextInt();
             input.nextLine();

            switch (choice) {
                case 1 ->{
                    System.out.println("enter the customer name");
                    String name = input.nextLine().toUpperCase();
                    shop.createcustomer(name);

                    while (true) {
                    System.out.println("enter the items your need or enter exit to exit");
                    String item = input.nextLine().toUpperCase();

                    if(item.equals("EXIT")){
                        break;
                    }
                    shop.itemadd(name,item); 
                }


                }
                case 2 ->{
                    System.out.println("enter your name");
                    String name = input.nextLine().toUpperCase();

                    shop.total(name);
                    

                }
                case 3->{
                    shop.showitems();
                }
                case 4->{
                    System.out.println("Thank you visit again");
                    return;
                }
                default -> System.out.println("you enter the Invalid number");
             
            }
        }
        
    }
    
}
