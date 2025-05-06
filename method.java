import java.util.Scanner;
public class method {
     
  static void array(){
    Scanner in=new Scanner(System.in);
    System.out.println("enter a size of array");
    int arr=in.nextInt();
    int arr1[]=new int[arr];
    int sum=0;
    System.out.println("enter a element of array");

     for(int i=0;i<arr;i++){
        
         sum=sum+arr1[i];
    }   
         System.out.println(sum);
    
    
  }
    public static void main(String[]args){
        array();
    }
}
