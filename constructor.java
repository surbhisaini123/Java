// class main{
//     void sum(){
//         System.out.println(this);
//     }
// }

class student{
    int a;
    student(){
        System.out.println("hiiiiiiiiiiiiiiiiiiiiiiiiiiiiii");
    }
    student(int a){
        this();
      System.out.println(a);
    }
    student(int a,int b){
        this(1);
        System.out.println(a+b);
    }
}



public class constructor {
    public static void main(String[] args){
    student obj= new student(10,3);
    }
    
}
