import java.util.ArrayList;
import java.util.Collection;

class student implements Comparable <student>{
    int age;
    String name;
    public  student(int age,String name){
        this.age=age;
        this.name=name;
    }
    public String toString(){
        return age+" "+name;
    }
    public int compareTo(student s){
      return this.age-s.age;
    }
}
public class Inbuildsorted {
    public static void main(String[] args){
        ArrayList<student> List=new ArrayList<>();
        List.add(new student(12, "rohit"));
        List.add(new student(13,"mohit"));
        Collection.sort();


        // List.add(1);
        // List.add(6);
        // List.add(7);
        // Collection.sort(List);
        // System.out.println(List);
    }
    
}
