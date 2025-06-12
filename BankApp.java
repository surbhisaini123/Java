import java.util.ArrayList;
import java.util.Scanner;

class Transaction{
   private String type;
    private double amount;
    Transaction(String type,double amount){
        this.type=type;
        this.amount=amount;
    }

}

class Account{
    private String name;
    private int accountnumber;
    private double balance;
   public Account(String name,int accountnumber,double balance){
        this.name=name;
        this.accountnumber= accountnumber;
        this.balance=balance;
    }
    ArrayList<Transaction> transaction=new ArrayList<>();

    public void deposit(double amount , double balance ){
        if(amount>0){
            balance=balance+amount;
            transaction.add(new Transaction("deposite",amount));
            System.out.println("succesfully deposite");
        }
    }
    public void withdraw(double amount,double balancce){
        if(balance>0 && amount>0){
            balance=balance-amount;
            transaction.add(new Transaction("withdraw",amount));
            System.out.println("succesfull withdraw");
        }else{
            System.out.println("insufficent balance");
        }

    }
    public void checkbalance(){
        System.out.println("current balance :"+balance);

    }
 
}

public class BankApp {
        
    public static void main(String[] args){
        Account account;
        Scanner in = new Scanner(System.in);
       
        System.out.println("enter a account holder===");
        String name=in.nextLine();
        System.out.println("enter a acount number===");
        int accountnumber=in.nextInt();
        System.out.println("Account succesfully created!!!!");
         int choice;

        while(choice!=4){
            System.out.println("enter your choice===");
            choice=in.nextInt();

            switch(choice){
                case 1 :
                         System.out.println("entre amount to deposit:");
                          double dep = in.nextDouble();
                         account.deposit(dep);
                         break;
                case 2 :
                        System.out.println("enter amount to withdraw:");
                          double with = in.nextDouble();
                        account.withdraw(with);
                        break;
                case 3 :
                        account.checkbalance();  
                        break;
                default :
                        System.out.println("invalid");          
            }
        }

    }
    
}
