// public class thread2 {
//     public static void main(String[] args){
//         MyRunnable obj =new MyRunnable();
//         Thread t1=new Thread(obj);
//         t1.start();n

//         try{
//             t1.join();
//         }catch(Exception e){
//             s.printStackTrace
//         }

//     }
    
// 
class withdraw extends Thread{
    int totalbalance=1000;
    int amount;
    public withdraw(int amount){
        this.amount=amount;

    }
    public  void run(){
        if(totalbalance>=amount){
            System.out.println("is going to withdrawl"+" "+amount);
            try{

                Thread.sleep(1000);

            }catch(InterruptedException ex){

            }
            totalbalance-=amount;
            System.out.println("remaing paisaaaa"+" "+amount);
        }
        else{
            System.out.println("sorry aap gareeb haii"+" "+amount);
        }
    }
}

public class thread2{
    public static void main(String[] args){
        withdraw t1= new withdraw(800);
        withdraw t2=new withdraw(300);
        t1.start();
        t2.start();
      }
}
