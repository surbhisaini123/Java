
class array{
    public static void main(String[]args){
        int [][] arr={{1,2,3,4},{2,4,5,6}};
        int count=0;
        int row;
        int col;
       
        for(int i=0;i<arr.length;i++){
            count=count + arr[i].length;
            // count++;     
        }
        System.out.println(count);
        // convert 1D array
        int[] arr[]={count};
        int index=0;
        for(int i=0;i<arr[i].length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[index]=arr[i][j];
                index++;
            }
        }
        //       TO print a 1D array
        
        for(int i=0;i<count;i++){
            System.out.println(arr[index]);
        }        
    
    }
}