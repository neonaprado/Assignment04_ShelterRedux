import processing.core.PApplet;
import processing.core.PImage;

public class Dog {
    //where to draw dog
    float x, y;
    //dog picture
    PImage img;
    float size = 100;

    //dog constructor
    public Dog(PApplet p, float x, float y){
        //set the location
        this.x = x;
        this.y = y;
        //pull image from data folder
        img = p.loadImage("funnyDog.png");

    }
    //draws the dog image if image not already on screen
    public void draw(PApplet p){
        if (img!= null)
            p.image(img, x, y, size, size);
    }

    public void move(PApplet p){
        //random movement
        x = p.random(p.width - 100);
        y = p.random(p.height - 100);
    }
   

}
