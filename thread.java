// class MyThread extends Thread{
//     public void run(){

//         System.out.println("hello");
//         System.out.println("hiiiii" );
//     }

// }




// public class thread {
    
// }



class downloadfile{
    public static void file(String file){
        for(int i=0;i<=5;i++){
            System.out.println(file +" "+"downloading...."+(i*20)+"%");
            try {
                Thread.sleep(2000);

            }catch(Exception e){


            }
        } 
        System.out.println("done");
    }
}
public class thread{

    public static void main(String[] args) {
       downloadfile obj =new downloadfile();
       obj.file("file A ");
       obj.file("file B ");
        
    }
}
