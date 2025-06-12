import java.util.HashMap;

public class frequenccy {
    public static void main(String[] args) {
        String str="hello";
        String str1="ollerh";
        char[] ch=str.toCharArray();

        //FREQUENCY OF FIRST STRING......

        char[] ch1=str1.toCharArray();
     HashMap<Character,Integer>frequency=new HashMap<>();
      for(char i: ch){
        frequency.put(i, frequency.getOrDefault(i, 0)+1);
    
      }   
      System.out.println(frequency); 

     //FREQUENCY OF SECOND STRING........

      HashMap<Character,Integer>frequency2=new HashMap<>();
      for(char i: ch1){
        frequency2.put(i, frequency2.getOrDefault(i, 0)+1);
    
      }   
      System.out.println(frequency2);

      if(str.length()==str1.length()){
        System.out.println("true");
      }
      else{
        System.out.println("false");
      }

     
    }
    
}
