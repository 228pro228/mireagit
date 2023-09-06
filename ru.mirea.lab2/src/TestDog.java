public class TestDog {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[2];

        dogs[0] = new Dog("Mikee", 9);
        dogs[1] = new Dog("Bob", 3);

        for (Dog dog : dogs) {
            System.out.println(dog.toString());
        }

        for (Dog dog : dogs) {
            dog.intoHumanAge();
        }
    }
}
