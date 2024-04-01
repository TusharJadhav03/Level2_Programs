import java.util.Scanner;

class Rectangle{

    double area;
    double length;
    double breath;

    public void setRectangle(double l , double b){

        length = l;
        breath = b;

    }
    public void calculateArea(){
        area = length * breath;
    }

}

class Triangle extends Rectangle{

    double height;
    double base;

    public void setTriangle(double h,double b){
        height = h;
        base = b;
    }

    public void calculateArea(){
        area = 0.5 * height * base;
    }
}


public class Area {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breath : ");
        double length = sc.nextDouble();
        double breath = sc.nextDouble();

        System.out.println("Enter base and height");
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        Rectangle r1 = new Rectangle();
        r1.setRectangle(length, breath);
        r1.calculateArea();
        System.out.println("Area is :"+r1.area);

        Triangle t1 = new Triangle();
        t1.setTriangle(height, base);
        t1.calculateArea();
        System.out.println("Area is : "+t1.area);

        sc.close();
    }
}
