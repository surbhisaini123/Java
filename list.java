import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList ;
import java.util.TreeMap;
import java.util.TreeSet;
public class list {
    public static void main(String[] args){
        //LinkedList<Integer>arr=new LinkedList<>();
        // long start=System.nanoTime();
        // arr.add(5);
        // System.out.println(arr.contains(5));
        // long end =System.nanoTime();
        // System.out.println(end-start);
        // arr.add(5);
        // arr.add(7);
        // arr.add(6);
        // System.out.println(arr);
        // System.out.println(arr.get(1));
        // System.out.println(arr.remove(2));
        // System.out.println(arr.set(1, 9));
        // System.out.println(arr);
        // HashSet<String>set=new HashSet<>();
        // set.add("AAAA");
        // set.add("NNNN");
        // set.add("mm");
        // set.add("ssss");
        // System.out.println(set);
        // TreeSet<String> sett=new TreeSet<>();
        // set.add("AAA");
        // set.add("NNNN");
        // set.add("mmm");
        // set.add("sss");
        // System.out.println(sett);
         

        // int[] arr={1,2,3,4,4,4,6,7,6,9,4,4,1};
        // TreeSet<Integer>set=new TreeSet<>();
        // // arr.add(2);
        // // arr.add(2);
        // // arr.add(8);
        // // arr.add(9);
        // // arr.add(4);
        // // arr.add(4);
        // // arr.add(9);
        // // System.out.println(arr);
        // int count=0;
        // for(int i:arr){
        //     if(set.contains(i)){
        //         System.out.println(i);
                
        //         break;
        //     }
        //     set.add(i);
            
        // }
        // count++;
        // System.out.println(count);
        
       //    HashMap<String , Integer> map=new HashMap<>();
      //    map.put("id0",1);
      //     map.put("id1",2);
      //      map.put("id2",3);
      //       map.put("id3",5);
      //       //System.out.println(map);
     //       //System.out.println(map.get("id6"));
     //     for(int key;map.value){
     //         System.out.println(key);
     //     }  
        
   
    // String str="programming";
     // char[] charArray=str.toCharArray();

    // HashMap<Character,Integer>map=new HashMap<>();
    // for(char i:charArray){
    //     map.put(i, map.getOrDefault(i, 0)+1);
    // }
    // System.out.println( map);
     String str="aaaabcccf";
     char[] ch=str.toCharArray();
     HashMap<Character,Integer>map=new HashMap<>();
      for(char i: ch){
        map.put(i, map.getOrDefault(i, 0)+1);
    
      }   
      System.out.println(map);  
    }
}
