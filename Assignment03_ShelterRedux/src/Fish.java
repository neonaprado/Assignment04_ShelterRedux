import processing.core.PImage;

public class Fish extends Animal {
    
    private String breed;
  

    public Fish(String name, String breed, int age, PImage img) {
        super("Fish", name, age, img);
        
        this.breed = breed;
    }

    public String toString() {
        return String.format("Fish's name: %s, Breed: %s, Age: %d",name, breed, age);
    }
}
