import processing.core.PImage;

public class Cat extends Animal {
    
    private String breed;
  

    public Cat(String name, String breed, int age, PImage img) {
        super("Cat", name, age, img);
        
        this.breed = breed;
    }

    public String toString() {
        return String.format("Cat's name: %s, Breed: %s, Age: %d",name, breed, age);
    }
}