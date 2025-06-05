

class allnotifiedwait{
    
    private Boolean isSignalled=false;
    public  synchronized void send_signal(){
        isSignalled=true;
        System.out.println("producer: SENDING SIGNAL");
        notify();
    }
    public synchronized void wait_singnal(){
        while(!isSignalled){
            try {
                System.out.println("consumer wait for signal.....");
                wait();
                
            } catch (Exception e) {
                
            }

        }
        System.out.println("consumer wait for signal..");
    }
    

    
}


public class thread3{
    public static void main(String[] args) {
        allnotifiedwait obj =new allnotifiedwait();
        Thread consumer =new Thread(()->{
            
          obj.send_signal();
        }) ;
        Thread producer =new Thread(()->{
            try {
                Thread.sleep(5000);
            } catch (Exception e) {
                
            }
           obj.wait_singnal();

        });
        consumer.start();
        producer.start();


    //     mythread t1=new mythread();
    //     mythread t2=new mythread();
        
    //     t1.setName("low priority");
    //     t2.setName("high priority");

    //     t1.setPriority(Thread.MIN_PRIORITY);
    //     t2.setPriority(Thread.MAX_PRIORITY);
    //     t1.start();
    //     t2.start();
    }
}