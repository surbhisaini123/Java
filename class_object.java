//CLASS_OBJECT QUESTION !!!!!!!!
import java.util.Scanner;

class student{
    String firstName="khushi";
    String lastNmae="saini";
    void fullName(){
        System.out.println(firstName+ " "+lastNmae);
    }
}
class AreaOfRectangle{
    int lenght=2;
    int breath=4;
    int A=lenght*breath;
    void area(){
        System.out .println(A);

    }

}
class car{
    String brand="BMW";
    int model=2020;
    double price = 20000000;
    void BrandOfCar(){
        System.out .println(brand);
    }
    void ModelOfCar(){
        System.out .println(model);   
    }
    void PriceOfCar(){
        System.out .println(price);
    }
}
class circle{
    int radius=2;
    double area=3.14*radius*radius;
    void AreaOfCircle(){
        System.out .println(area);
    }
}     
class calculator{
    public static void sum(){
     Scanner in=new Scanner(System.in);
      System.out.println("enter a 1st number=");
      int A =in.nextInt();
      System.out.println("enter a 2nd number=");
      int N =in.nextInt();
     int sum=A+N;
      System.out.println("sum="+sum);
    }
    public static void subtract(){
        Scanner in =new Scanner(System.in);
        System.out.println("enter a 1st number=");
        int D =in.nextInt();
        System.out.println("enter a 2nd number=");
        int M =in.nextInt();
        
        int sub=D-M;
        System.out.println("sub="+sub);
    }
    public static void multiple(){
        Scanner in =new Scanner(System.in);
        System.out.println("enter a 1st number=");
        int Q =in.nextInt();
        System.out.println("enter a 2nd number=");
        int W =in.nextInt();
        
        int mul=Q*W;
        System.out.println("mul="+mul);
    }
    public static void division(){
        Scanner in =new Scanner(System.in);
        System.out.println("enter a 1st number=");
        int O =in.nextInt();
        System.out.println("enter a 2nd number=");
        int P =in.nextInt();
        
        int div=O/P;
        System.out.println("div="+div);
    }

}
class BankAccount{
    String name="XYZ";
    void Account_holder_name(){
        System.out.println("Holder Name=" +name);
    }
    int Account_Number = 1234567;
    void accountnumber(){
        System.out.println("Account Number="+Account_Number );
    }
    double balance=35000;
    void accountbalance(){
      System.out.println("main balance="+balance);
    }
    double  amount;
    void deposit(){
      Scanner in = new Scanner(System.in);
      System.out.println("entre a deposit amoumt =");
      double amount=in.nextInt();
        if( amount  >0){
         System.out.println("deposite");
        }
        else{
            System.out.println("error");
        }
        System.out.println(balance +amount);
        System.out.println("total balance=" +balance +amount);
    }

    void withdraw(){
     Scanner in = new Scanner(System.in);
     System.out.println("enter a withdraw amount");
     double amount = in .nextInt();
     if(balance>=amount){
        System.out.println("witdraw");
     }
     else{
        System.out.println("sorry not enough amount");
     }
     System.out.println("total balancce="  +balance +amount);
    }
    
}



public class class_object { 
    public static void main(String[] args){
    //     student obj=new student();
    //     obj.fullName();
    //     AreaOfRectangle obj=new AreaOfRectangle();
    //    obj.area();
    //     car obj=new car();
    //     obj.BrandOfCar();
    //     obj.ModelOfCar();
    //     obj.PriceOfCar();
        // circle obj=new circle();
        // obj.AreaOfCircle();
        // calculator obj= new calculator();
        // obj.sum();
        // obj.subtract();
        // obj.multiple();
        // obj.division();
        BankAccount obj=new BankAccount();
        obj.Account_holder_name(); 
        obj.accountnumber();
        obj.accountbalance();
        obj.deposit();
        obj.withdraw();

    }
    
}
