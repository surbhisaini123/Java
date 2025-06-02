
//QUESTION 1,,,

interface walkable{
    void walk();
    void run();
}
interface runable{
    void walk();
   void run();
}
public class interfaceeeeeee implements walkable,runable {
    public void walk(){
        System.out.println("goooooooooooooooo");
    }
    public void run(){
        System.out.println("youuuuuuuuu cannnnnnnnn doooooooooo itttttttttt");
    }
    public static void main(String[] args){
      interfaceeeeeee obj=new interfaceeeeeee();
      
     obj.run();
     obj.walk();
    }   
}