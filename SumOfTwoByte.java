import java.util.*;
public class SumOfTwoByte {
    
    public static int Addition(int x,int y){

         return x + y;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a first value : ");
        byte num1 = sc.nextByte();
        System.out.println("Enter a second value : ");
        byte num2 = sc.nextByte();
        System.out.println(Addition(num1, num2));
        sc.close();
    }
}
