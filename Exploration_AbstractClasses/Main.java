import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n");
        ArrayList<Animal> zoo = new ArrayList<Animal>();
        zoo.add(new Pig());
        zoo.add(new Dog());
        for (Animal animal: zoo) {
            animal.sound();
            animal.sleep();
        }
    }
}