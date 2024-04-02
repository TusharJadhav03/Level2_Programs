public class ArithmeticSum {


    public int arithmeticSum(int x,int y){
        System.out.println("Sum is : ");
        return x + y;
    }
    public int arithmeticSum(int x,int y,int z){
        System.out.println("Sum is : ");
        return x + y + z;
    }
    public int arithmeticSum(int x,int y,int z,int a){
        System.out.println("Sum is : ");
        return x + y + z + a;
    }
    
    
    public static void main(String[] args) {
        
        ArithmeticSum sum = new ArithmeticSum();
        System.out.println(sum.arithmeticSum(10, 2));
        System.out.println(sum.arithmeticSum(10, 2, 5));
        System.out.println(sum.arithmeticSum(10, 2, 5, 7));

    }
}
