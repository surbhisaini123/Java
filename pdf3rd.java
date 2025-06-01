//METHOD QUESTION 

import java.util.Scanner;
public class pdf3rd{
    public static void naturalnumberandreverse(){
        Scanner in = new Scanner(System.in);
        
        System.out.println("enter a number");
        int A=in.nextInt();
        System.out.println(" ");
        for(int i=0;i<=A;i++){
            System.out.println(i);
        }
        System.out.println(" ");

        for(int i=A;i>=0;i--){
            System.out.println(i);
            
        }
        
    }
    public static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a number");
        int A=in.nextInt();
        System.out.println(" ");
        //int check=0;
        int sum=0;
        int product=1;
        for(int i=1;i<=A;i++){
            sum=sum+i;
        }    
        System.out.println("sum="+sum);
        for(int i=1;i<=A;i++){
            product=product*i;
        }
        System.out.println("product="+product);
    }
    public static void digit(){
       int digit=123;
      int check=0;
      int sum=0;
       for(int i=0;i<=digit;i++){
        sum+=i;
    //    check++;
       }
       check++;
       System.out.println("sum="+sum);
       
     }
   
    public static void main(String[] args){
        naturalnumberandreverse();
        sum();
        digit();
       
    }
}