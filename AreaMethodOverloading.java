public class AreaMethodOverloading {
    
    public  int  area(int side){

        System.out.println("Area of Square is : ");
        return 2 * side;
    }

    public  int area(int length,int width){

        System.out.println("Area of Rectangle is : ");
        return length * width;
    }

    public  double area(double radius){
        System.out.println("Area of Circle is : ");
        return Math.PI * radius * radius; 
    }

    public static void main(String[] args) {
        
        AreaMethodOverloading area1 = new AreaMethodOverloading();
        System.out.println(area1.area(5));
        System.out.println(area1.area(5.0));
        System.out.println(area1.area(10, 5));

    }
}
