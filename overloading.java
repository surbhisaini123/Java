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


class subtraction{
    void sub(char a,char b){
        System.out.println(a-b);
    }
    void sub(char a,char b ,char c){
        System.out.println(a-b-c);
    }
}
class addition{

}
public class overloading {
    public static void main(String[] args){
       subtraction obj = new subtraction();
       obj.sub('a','e'); 
    }
    
}
