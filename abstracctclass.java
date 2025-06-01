//  class animal{
//     void eat(){
//         System.out.println("eatttttttttt");
//     }

// }
// class dog extends animal{
//     void bark(){
//         System.out.println("barkkkkkkkk");
//     }

// }


// class subtraction{
//     void sub(char a,char b){
//         System.out.println(a-b);
//     }
//     void sub(char a,char b ,char c){
//         System.out.println(a-b-c);
//     }
// }

// public class overloading {
//     public static void main(String[] args){
//        subtraction obj = new subtraction();
//        obj.sub('a','e'); 
//     }
    
// }

// abstract class Animal{
//     abstract void eat();
//     void print(){
//         System.out.println("hiiiiiii");
//     }
// }   
//     class dog extends Animal{
//        void eat(){
//         System.out.println("hellooooo");
//        }
//     }
//     class cat extends Animal{
//       void eat(){
//         System.out.println("byyyyyyy");
//       }
//     }


// public class abstracctclass {
//     public static void main(String[]args){
//           Animal obj = new dog();
//           obj.eat();
//           obj.print();

//           Animal obj1 =new cat();
//           obj.eat();
//           obj.print();
//     }

// }


abstract class shape{
    abstract void area(int a,int b);
    void print(){
        System.out.println("to be calculate");
    }
}
  class rectangle extends shape{
    //int a,b;
    //int A=a*b;
        void area(int a,int b){
            int A=a*b;
           System.out.println("area of rectangle="+A);
        }
  }
class circle extends shape{
    void area(int a){
         float pi=3.14f;
        double S= 3.14f*a*a;
        System.out.println("area of circle="+S);
    }
}


public class abstracctclass{
    public static void main(String[] args) {
        shape obj = new rectangle();
        obj.area(2,4);
        obj.print();
        shape obj1 = new circle();
        obj1.area(2);
        obj.print
    }
}