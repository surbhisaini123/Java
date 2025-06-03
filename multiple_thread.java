class filedownload{
    String filename;
    filedownload(String filename){
        this.filename=filename;
    }

    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(filename +" "+"downloading...."+(i*20)+filename);
            try {
                Thread.sleep(2000);

            }catch(Exception e){


            }
        } 
        System.out.println("done");


    }

}
public class multiple_thread {
    public static void main(String[] args){
        filedownload t1= new filedownload("A");
         filedownload t2= new filedownload("B");
         
         obj.run();

        

    }

    
}
