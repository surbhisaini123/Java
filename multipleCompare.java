import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


class student{
    int rollN;
    String name;
    int age;
    //constructor====>
    public student(int rollN,String name,int age){
        this.rollN=rollN;
        this.name=name;
        this.age=age;
    }
    public String toString(){
        return age+" "+name+" "+rollN;
    }

}
class sortByName implements Comparator<student>{
    public int compare(student s1,student s2){
        return s1.name.compareTo(s2.name);

    }

}
class sortByrollN implements Comparator<student>{
    public int compare(student s1,student s2){
        return s1.rollN - s2.rollN;

    }

}

public class multipleCompare {
    public static void main(String[] args) {
        ArrayList<student> list=new ArrayList<>();
        list.add(new student(22, "rohit", 15));
        list.add(new student(34, "mohit", 17));
        list.add(new student(55, "sobit", 11));
        list.add(new student(56, "ritu", 18));
        Collections.sort(list,new sortByName());
        for(student s: list){
            System.out.println(s);
        }
        
        Collections.sort(list,new sortByrollN());
        for(student s: list){
            System.out.println(s);
        }

    }
}
