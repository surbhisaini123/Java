class student{
    String firstName="khushi";
    String lastNmae="saini";
    void fullName(){
        System.out.println(firstName+ " "+lastNmae);
    }
}
class AreaOfRectangle{
    int lenght=2;
    int breath=4;
    int A=lenght*breath;
    void area(){
        System.out .println(A);

    }

}
class car{
    String brand="BMW";
    int model=2020;
    double price = 20000000;
    void BrandOfCar(){
        System.out .println(brand);
    }
    void ModelOfCar(){
        System.out .println(model);   
    }
    void PriceOfCar(){
        System.out .println(price);
    }
}
class circle{
    int radius=2;
    double area=3.14*radius*radius;
    void AreaOfCircle(){
        System.out .println(area);
    }
}




public class classobject {
    public static void main(String[] args){
        // student obj=new student();
        // obj.fullName();
        //AreaOfRectangle obj=new AreaOfRectangle();
       // obj.area();
        // car obj=new car();
        // obj.BrandOfCar();
        // obj.ModelOfCar();
        // obj.PriceOfCar();
        circle obj=new circle();
        obj.AreaOfCircle();
    }
    
}
