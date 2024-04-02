import java.util.Scanner;

public class NestingMethods {
    
     void volume(double height,double length,double breath){
        
        double volume = (height * length * breath);
        System.out.println("The volume of cuboid : "+volume);
        
    }
     void area(double height,double length,double breath){
        double area = 2 * (length*breath)+(breath*height)+(length*height);
        System.out.println("The area of cuboid : "+area);
        volume(height, length, breath);
    }
    void perimeter(double height,double length,double breath){
        double perimeter = 4 * (length + breath + height);
        System.out.println("The perimeter of cuboid : "+perimeter);
        area(height, length, breath);
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length , breath, height : ");
        double length = sc.nextDouble();
        double breath = sc.nextDouble();
        double height = sc.nextDouble();

        NestingMethods m1 = new NestingMethods();
         m1.perimeter(height, length, breath);
        //  m1.area(height, length, breath);
        //  m1.volume(height, length, breath);

        sc.close();
    }
}
