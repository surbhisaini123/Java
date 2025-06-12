import java.util.*;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.*;

public class feature {

    public static void main(String[] args){


   //****** FILTER AND MAP FUNCTION********

    //.filter IS USED LIKE A LOOP 

    // List<Integer> list=Arrays.asList(5,10,15,20,25);
    // List<Integer> evenlist = list.stream()
    //                             .filter(n->n%2==0)
    //                             //  .filter(n->n>2)
    //                              .map(n-> n*5)
    //                              .collect(Collectors.toList());

    // System.out.println(evenlist);  
    // System.out.println(" ");  


    //************* REDUCE FUNCCTION************

    
    //  List<Integer> list=Arrays.asList(5,10,15,20,25);
    //  int sum=list.stream().reduce(10,(a,b)->a+b);

    //  System.out.println(sum);


     List<Integer> list=Arrays.asList(14,6,2,8,99,5,33,222,1111,1,2,3);
     List<Integer> greaterthan2=list.stream()
                               .filter(n->n>2)
                               .collect(Collectors.toList());
                            
   // List<Integer> greaterthan2=list.stream()

    System.out.println(greaterthan2);
    



    }
    
}

