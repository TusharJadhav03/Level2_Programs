public class CountNumberObject {

    String name;
    int age;
    public static int counter = 0;

    public CountNumberObject(String name, int age) {

        this.name = name;
        this.age = age;
        counter++;
    }

    public void Info() {
        System.out.println("Name : " + name);
        System.out.println("Age : "+age);
        
    }

    public static void main(String[] args) {

        CountNumberObject obj1 = new CountNumberObject("Tushar", 24);
        obj1.Info();

        CountNumberObject obj2 = new CountNumberObject("Anjali", 22);
        obj2.Info();

        CountNumberObject obj3 = new CountNumberObject("Sushmita", 22);
        obj3.Info();

        System.out.println("Object found in "+CountNumberObject.counter+ " time");

        

    }
}
