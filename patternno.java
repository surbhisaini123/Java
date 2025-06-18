public class patternno {
    public static void main(String[] args) {
        int row=3;
        int col=3;
        int num=1;
        int [][] arr= new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j]=num;
                num++;
            }
        }
        System.out.println("the 2d array is:");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }
}