import java.util.Scanner;
public class pdf2nd {
    static void sum(){
        int [] arr1={1,2,3,4};
        int [] arr2={3,7,8,0};
        
        int sum1=0;
        for(int i=0;i<arr1.length;i++){
            sum1=sum1+arr1[i];
        }
        System.out.println("sum1="+sum1);
        int sum2=0;
        for(int j=0;j<arr2.length;j++){
            sum2=sum2+arr2[j];
        }
        System.out.println("sum2="+sum2);
        int SUM=sum1+sum2;
        System.out.println("Sum="+ SUM);
    }

   static void compare(){
       Scanner in =new Scanner(System.in);
       System.out.println("enter a size of first array");
       int n=in.nextInt();
       int [] arr1=new int[n];
      System.out.println("enter of element 1st array");
       
       System.out.println("enter a size of second array");
       int m=in.nextInt();
       int [] arr2=new int[m];
       System.out.println("enter of element 2nd array");
      
       
       if(arr1==arr2){
        System.out.println("array is equal");
       }
       else{
        System.out.println("array is not equal");
       }
    }
    public static void main(String[] args){
        sum();
        compare();
    
    }
}
