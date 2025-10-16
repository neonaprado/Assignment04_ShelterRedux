import processing.core.PApplet;
import processing.core.PImage;
/**
 * Represents a dog.  This class DOES NOT extends PApplet since a Dog is not a skectch(canvas)
 * To use Processing's methods in this class, you must pass the sketch object into its constructor
 * and then assign it to the instance variable (mySketch).
 * @author Neona Prado
 * @version 1.0
 * @since 1.0
 */
public class Dog {

    private PApplet mySketch; 
    private PImage img;         
    private float x;
    private float y;

    /* Assign values to all the instance variables in the constructor */
    public Dog(PApplet mySketch, int screenWidth, int screenHeight) {
        this.mySketch = mySketch;
        img = mySketch.loadImage("assets/dog.png");
        x = mySketch.random(screenWidth - img.width);
        y = mySketch.random(screenHeight - img.height); 
    }

    /* Draws the dog */
    public void draw() {
        
        mySketch.image(img,x,y);
    }
    // detects the edges of the dog image 
    public boolean isSelected(int mouse_X, int mouse_Y) {
        if (mouse_X  <= rightEdge() && mouse_X >= leftEdge() && mouse_Y >= topEdge() && mouse_Y <= bottomEdge()){
            return (true);
        }
        return(false);  
    }

    private float rightEdge(){
        return (x + img.width);

    }
    private float leftEdge(){
        return(x);

    }
    private float topEdge(){
         return (y); 
    }
    private float bottomEdge(){
         return (y + img.height); 
    }


    
}
