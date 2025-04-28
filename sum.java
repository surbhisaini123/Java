import java.util.Scanner;
public class sum {
      public static void main(String[]arg){
         Scanner in = new Scanner(System.in);
         System.out.println("enter size of arr");
         int n=in.nextInt();
         int[] arr=new int[n];
         System.out.println("enter valueof arr");
         for(int i=0; i<n;i++){
            arr[i] = in.nextInt();
         }
         System.out.println(" ");
         for(int j=0;j<arr.length;j++){
            System.out.println(arr[j]);
         }
         System.out.println(" ");
         for(int i=n-1;i>=0;i--){
            System.out.println(arr[i]);
         }
    }
}