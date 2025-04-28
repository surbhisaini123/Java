// QUESTION 4

import java.util.*;

public class vowelconsonant {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("enter a charactor");
        int a= in.next().charAt(0);
        //char alphabet;
        switch(a){

            case 'a':
                     System.out.println("vowel"); break;
            case 'e':
                     System.out.println("vowel"); break;    
            case 'i': 
                     System.out.println("vowel"); break;  
            case 'o':
                     System.out.println("vowel"); break;
            case 'u':
                     System.out.println("vowel"); break;   
             default :
                     System.out.println("consunant"); break;           
                     
        }
    }
}
