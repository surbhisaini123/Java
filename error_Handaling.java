import java.util.Scanner;
public class error_Handaling {
    public static void main(String[] args){
        // Scanner in=new Scanner(System.in);
        // System.out.println("enter a size of arr=");
        // int size=in.nextInt();
        // System.out.println("enter a element of arr=");
        // int[] arr=new int[size];
        
        // // int c=A/B;
        // // System.out.println(c);
        // // System.out.println("hello");
        // // System.out.println("hiiiiiiiiiii");
        // // System.out.println("byyyyyyy");
        // try {
        //     System.out.println(arr[5]);
        // } catch (Exception e) {
        //    System.out.println(e);
        //    System.out.println("hiiiiiiii");

        // }
        // finally{
        //     System.out.println("all okkkkkkkkk");
        // }

        int [] arr={-2,1,7,9,1,-6,4};
       
        int sum=0;
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
               sum=arr[i]+arr[j];
               j++;
               System.out.println(sum);
               
            }
            i++; 
            if(sum>max){ 
                max=sum; 
                 System.out.println(max); 
            }
            
        }
    
        System.out.println("mmax sum="+max);
        //System.out.println(arr[i]);
        // System.out.println(arr[mmax]);
        //  System.out.println("max sum is ="+max);
        
        

    }
    
}
