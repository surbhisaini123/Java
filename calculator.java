import java.util.*;

public class calculator {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
         //int P = in.nextInt();
           System.out.println("first value enter");
           int P = in.nextInt();
          // int O = in.nextInt();   
           System.out.println("second value enter");
           int O = in.nextInt();   
           int c = in.next().charAt(0);   
           
           switch(c){
             
            case'+' :
                       System.out.println("a+b");
                  
            case '-':
                       System.out.println("a-b"); break;    
                       
            case '*':
                       System.out.println(" a*b"); break;           

            case '/' : 
                       System.out.println(" a/b"); break;
           }

    }
    
}
