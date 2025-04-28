public class searchandsort {
    // public static void bubblesort(){
    //     int [] arr={2,4,6,3,7};
    //  for(int i=0;i<arr.length-1;i++){
    //     for(int j=0;j<arr.length;i++){
    //         if(arr[j]>arr[j+1]){
    //             int temp=arr[j];
    //             arr[j]=arr[j+1];
    //             arr[j+1]=temp;
    //         }
    //     }
    //  }
    //  System.out.println(temp);
    // }
    // public static void main(String[]args){
    //     int [] arr={2,4,6,3,7};
    //     bblesort();
    // }
     public static int search1(){
        int [] arr={1,2,3,4,5};
        int target = 4;
        int start=0;
        int end;
        int mid= (arr[start]+arr[end])/2;
        while(start<==end){
            if(target==mid){
                return mid;
            }
            else if(target>mid){
                return start+1;
            }
            else{
                return end-1;
            }
            return -1;
        }
     }
     public static void main(String[] args){
        search1();
     }

    
}


