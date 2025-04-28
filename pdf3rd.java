import java.util.Scanner;
public class pdf3rd {
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
        int check=0;
        int sum=0;
        for(int i=1;i<=A;i++){
            sum=sum+i;
            check++;
        }
        System.out.println("sum="+sum);
        


    }
    public static void main(String[] args){
        //naturalnumberandreverse();
        sum();
    }
}
