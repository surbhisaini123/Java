public class searchandsorrt(){
    public static void sort(){
        String [] str={"B","A","C"};
        for(int i=0;i<str.length-1;i++){
           for(int j=0;j<str.length-1-i;j++){
               if(str[j].charAt(0)>str[j+1].charAt(0)){
                   String temp=str[i];
                   str[j]=str[j+1];
                   str[j+1]=temp;
               }
           }
        }
        System.out.println(temp);
     }
    public static void main(String[] args){
       sort();
    }

   
}



