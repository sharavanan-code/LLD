
import java.util.*;
public class Main {
    public static void main(String[] args) {

        Bank account = new Bank();
        Scanner input = new Scanner(System.in);

        while(true){
        System.out.println("enter No.1 for deposite");
        System.out.println("enter No.2 for withdraw");
        System.out.println("enter No.3 for check_balance");
        System.out.println("enter No.4 for exit");
        int z = input.nextInt();

        switch (z) {
            case 1 -> {
                System.out.println("enter the amount you want to deposite");
                int amount = input.nextInt();
                account.deposite(amount);
                
            }

            case 2->{
                System.out.println("enter the amount you want to withdrawal");
                int amount = input.nextInt();
                account.withdarwal(amount);
            }
            case 3 ->{
                account.check();
            }
            case 4 ->{
                System.out.println("thank you so much visit again exit....");
                return;
            }
            default -> System.out.println("your selecting the wrong number select 1 - 4");
            
        
        }

        }
        
    }
    
}

class Bank{
    private int balance;

    public void deposite(int amount){
        balance+=amount;
        System.out.println("your amount was deposite");

    }

    public void withdarwal(int amount){
        if(balance  < amount){
            System.out.println("your balance is insufficient");
        }
        else{
            balance-=amount;
            System.out.println("your money withdarwal successfully");
        }
    }

    public void check(){
        System.out.println("your cuurent balance is"+ balance);
    }
}
