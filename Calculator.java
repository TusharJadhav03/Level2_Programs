import java.util.Scanner;

public class Calculator {


    public  double input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        double num1 = sc.nextDouble();
        System.out.println("Enter the second number : ");
        double num2 = sc.nextDouble();

        double result = add(num1, num2);
        sc.close();
        return result;
    }

    public double add(double num1,double num2){

        return num1 + num2;
    }

    public static void main(String[] args) {
        
        Calculator c1 = new Calculator();
        double result = c1.input();
        System.out.println(result);

    }
    
}