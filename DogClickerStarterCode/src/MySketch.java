import processing.core.PApplet;
/**
 * Represents a sketch(canvas) to draw on.  This class extends PApplet and
 * therefore has access to all Processing methods.
 * @author TODO: Neona Prado
 * @version 1.0
 * @since 1.0
 */
public class MySketch extends PApplet {
    private Dog dog;

    public void settings(){
        size(800,800);
        
        System.out.println("i am in settings");
    }
    
    // makes new dog object and gives the parameters
    public void setup() {
        dog = new Dog (this, width, height);
   }

    /* This method over and over again, repainting the background and
     * drawing the dog in an endless cycle of dog drawing.
     */
    //draw method for the dog class
    public void draw(){
        background(152,190,100);
        dog.draw();
    }

    /* This method is called every time the mouse is pressed */
   public void mousePressed() {
       if (dog.isSelected(mouseX, mouseY)){
            dog = new Dog(this, width, height);
        }    
   }
}


