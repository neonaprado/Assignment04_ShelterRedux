import processing.core.PApplet;
import processing.core.PImage;
import processing.sound.SoundFile;

/**
 * An animal that can be put in a shelter and be adopted.
 */
public class Animal {
   
    private static final int INFO_TEXT_SIZE = 13;
    private static final int PADDING = 10;
    //distance between adopt and hear buttons
    private final static int HEAR_DIST_X = 120;
    protected String type;
    protected String name;
    protected int age;

    protected PImage img;
    protected int x, y = 0;
    protected Button button;

    //make new button for hearME
    //add the soundfile
    //need a constant for the distance b/w adopt me button and hear me button
    protected Button hearButton = new Button("Hear Me");
    protected SoundFile sound;
    
    

    /**
     * Creates a new animal.
     * 
     * @param name the name of the animal. 
     * @param age the age of the animal.
     * @param img an picture of the animal.
     */
    public Animal(String type, String name, int age, PImage img) {
        this.name = name;
        this.age = age;
        img.resize(0, 75); // Resize image to max 75 height; keep scale by using 0 as the width.
        this.img = img; 
        button = new Button("Adopt Me");  
    }

    /**
     * Returns the X coordinate of the animal.
     * 
     * @return the X coordinate.
     */
    public int getX() {
        return x;
    }

    /**
     * Sets the X coordinate of the animal.
     * 
     * @param x the X coordinate.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Returns the Y coordinate of the animal. 
     * 
     * @return the Y coordinate.
     */
    public int getY() {
        return y;
    } 

    /**
     * Sets the Y coordinate of the animal.
     * 
     * @param y the Y coordinate.
     */
    public void setY(int y) {
        this.y = y;
    }

    //need to set the sound for this animal
    /**
     * 
     * @param sound 
     * // public void setSound(soundfile ?){
     * this.sound = s;}
     */

     //add true id the hear me button if pressed
     /*
      * public boolean hearisclicked(papplet)
        adopt X x + imagewidth + constanst for distance
        adopt Y "" + ""height /2
        hear X = adopt X + constant for the hear gap
        hear y = adopt y

        return if the hearbutton isinbutton detect(mouseX, mouseY, hearX, hear Y)
      */
    /*
     * add something to play sound if there
     *  if sound id not null
     *      then: sound.play()
     */

    // button.draw(sketch, x + image width, distance constant, y + image height /2);

    /**
     * Draws the animal at the current X and Y coordinates.
     * 
     * @param sketch the sketch to draw on.
     */
    public void draw(PApplet sketch) {
        sketch.textAlign(PApplet.LEFT);
        sketch.textSize(INFO_TEXT_SIZE);
        sketch.text(toString(), x, y);

        // Draw the image below the text
        sketch.image(img, x, y + INFO_TEXT_SIZE);

        // Draw the button centered on the image
        button.draw(sketch, x + img.width + PADDING, y + img.height / 2);
    }

    public String toString() {
        return name + ", age";
    }
 
    /**
     * Returns true if the current mouse coordinates of the sketch are inside the adopt button.
     * 
     * @param sketch the sketch to check.
     */
    public boolean isAdoptClicked(PApplet sketch) {
        int buttonX = x + img.width + PADDING;
        int buttonY = y + img.height / 2;
        return button.isInButton(sketch.mouseX, sketch.mouseY, buttonX, buttonY);
    }
}