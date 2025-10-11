//Assignment number 2
//Neona Prado
//Project that creates a random movement when clicking on a dog object 
import processing.core.PApplet;
import processing.core.PImage;
public class Sketch extends PApplet {
    Dog dog;
    PImage img;


    //runs settings once
    public void settings() {
        size(500, 500);
    }

    public void draw (){
        background(200);
    }

    public static void main(String[] args) {
        //tells main class to run the stuff in MySketch class
        PApplet.main("Sketch");
    }

    //run and draw dog class on mouse press on dog move to random position


    
}
