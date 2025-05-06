//JAVA PDF 1ST

public class pdf1st {
    static void maximum(){
        int[] arr={33,76,12,99,43,89};
        int max=0;
        for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);

           if(arr[i]>max){
             max=arr[i];
           }
        }
        System.out.println(" ");
        System.out.println("maximum element="+max);
        
    }
    void minimum(){
        int[] arr2={22,5,33,1,7};
        int min=arr2.length;
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
            if(arr2[i]<min){
            min=arr2[i];
            }
        }
        System.out.println(" ");
        System.out.println("minimum element="+min);
    }
    static void evenodd(){
        int[] arr3={3,4,6,8,9,2,8};
        int even=0;
        int odd=0;
        for(int i=0;i<arr3.length;i++){
           System.out.println(arr3[i]);
            if(arr3[i]%2==0){
               System.out.println("number is even="+even);
                even++;
            }
            else{
                System.out.println("number is odd="+odd);
                odd++;
            }
        }
        System.out.println("even="+even);
        System.out.println("odd="+odd);
        System.out.println(" ");
    } 
    static void reverse(){
        int[] arr4={2,5,7,9,0,4};
        for(int i=0;i<arr4.length;i++){
           System.out.println(arr4[i]);
        }
        System.out.println(" ");
        for(int i=arr4.length-1;i>=0;i--){
            System.out.println(arr4[i]);
        }
    }
    public static void main(String[]args){
        maximum(); 
        pdf1st obj= new pdf1st();
         obj.minimum();
         evenodd();
         reverse();
    }

}
