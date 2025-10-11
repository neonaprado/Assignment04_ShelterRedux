//Assignment number 2
//Neona Prado
//Project that creates a random movement when clicking on a dog object 
import processing.core.PApplet;
public class Sketch extends PApplet {
    //runs settings once
    public void settings() {
        size(1040, 1400);
    }

    public void draw (){
        background(200);
    }
    public void setup(){
        //background color
        background(200);
        pixelDensity(1);
    }

    public static void main(String[] args) {
        //tells main class to run the stuff in MySketch class
        PApplet.main("Sketch");
    }

    
}
