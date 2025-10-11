import processing.core.PApplet;
import processing.core.PImage;

public class Dog extends PApplet{
    //where to draw dog
    float x, y;
    //dog picture
    PImage image;
    float size;
    float xSpeed;
    float ySpeed;
    Sketch mySketch;
    PImage img;

    public Dog(PApplet p, float x, float y, Sketch mySketch){
        this.x = x;
        this.y = y;
            
        size = mySketch.random(10, 100);
        xSpeed = mySketch.random(-10, 10);
        ySpeed = mySketch.random(-10, 10);
        this.mySketch = mySketch;
    }
    public void draw(PApplet p){
        p.image(img, x, y, size, size);
    }
    public void move(){
        x += xSpeed;
        if(x < 0 || x > mySketch.width){ 
            xSpeed *= -1;
        }

        y += ySpeed;
        if(y < 0 || y > mySketch.height){
            ySpeed *= -1;
        }
    }
   

}
