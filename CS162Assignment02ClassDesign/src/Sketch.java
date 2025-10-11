//Assignment number 2
//Neona Prado
//Project that creates a random movement when clicking on a dog object 
import processing.core.PApplet;
public class Sketch extends PApplet {
    Dog dog;

    //runs settings once
    public void settings() {
        size(500, 500);
    }
    public void setup(){
        //makes sure the dog stays on the screen when animated
        float x = random(width-100);
        float y = random(height-100);
        //creates a new dog object
        dog = new Dog(this, x,y);
    }
    public void draw (){
        background(200);
        dog.draw(this);
    }

    public static void main(String[] args) {
        //tells main class to run the stuff in MySketch class
        PApplet.main("Sketch");
    }
    
}
