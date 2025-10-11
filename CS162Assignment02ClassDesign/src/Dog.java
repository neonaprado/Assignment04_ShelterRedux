import processing.core.PApplet;

public class Dog extends PApplet{
    float x;
    float y;
    float size;
    float xSpeed;
    float ySpeed;
    Sketch mySketch;

    public Dog(float x, float y, Sketch mySketch){
        this.x = x;
        this.y = y;
        size = mySketch.random(10, 100);
        xSpeed = mySketch.random(-10, 10);
        ySpeed = mySketch.random(-10, 10);
        this.mySketch = mySketch;
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

    public void draw(){
        mySketch.ellipse(x, y, size, size);
    }
}
