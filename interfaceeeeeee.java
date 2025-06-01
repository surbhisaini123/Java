//QUESTION 1,,,

// interface walkable{
//     void walk();
//     void run();
// }
// interface runable{
//     void walk();
//    void run();
// }
// public class interfaceeeeeee implements walkable,runable {
//     public void walk(){
//         System.out.println("goooooooooooooooo");
//     }
//     public void run(){
//         System.out.println("youuuuuuuuu cannnnnnnnn doooooooooo itttttttttt");
//     }
//     public static void main(String[] args){
//       interfaceeeeeee obj=new interfaceeeeeee();
      
//      obj.run();
//      obj.walk();
//     }   
//}

//QUESTION 2,,,

// interface Aaa{
//     void name();
// }
// interface Bbb{
//     void name();
// }
// public class interfaceeeeeee implements Aaa,Bbb{
//     public void name(){
//         System.out.println("BANDARRRRRRRRRRRRRR");
//     }
//     public static void main(String[] args){
//       interfaceeeeeee obj =new interfaceeeeeee();
//       obj.name();
//     }
// }

//QUESTION 3,,,,,,

// interface animal{
//     void sound();
// }
// class dog implements animal{
//     public void sound(){
//         System.out.println("barkkkkkkkkkkk");
//     }
// }
// public class interfaceeeeeee {
//     public static void main(String[] args){
//      dog obj=new dog();
//      obj.sound();
//     }
// }

//QUESTION 4,,,,,,,,

interface shape{
    int r=5;
    float A=3.14f*r*r;
    void area();
}
class circle implements shape{
    public void area(){
        
        System.out.println("hooooooooooooo");
    }
}
public class interfaceeeeeee{
    public static void main(String[] args) {
    circle obj=new circle();
    obj.area();
    
    System.out.println(obj.A);
  
    }
}


