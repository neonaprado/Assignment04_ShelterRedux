import processing.core.PImage;
import processing.core.PApplet;

public class Dog extends Animal {
    
    private String breed;
  

    public Dog(String name, String breed, int age, PImage img) {
        super("Dog", name, age, img);
        
        this.breed = breed;
    }

    public String toString() {
        return String.format("Dog's name: %s, Breed: %s, Age: %d",name, breed, age);
    }
}