public class NameableTest {
    public static void main(String[] args) {
        Nameable earth = new Planet("Earth");
        Nameable myCar = new Car("Toyota");

        System.out.println("Planet name: " + earth.getName());
        System.out.println("Car name: " + myCar.getName());
    }
}
