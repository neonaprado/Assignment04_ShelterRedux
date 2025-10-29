import processing.core.PApplet;
import static processing.core.PConstants.CENTER;

/**
 * A simple representation of a Button.
 */
public class Button {

    private static final int WHITE = 255;
    private static final int GRAY = 200;
    private static final int BLACK = 0;

    private static final float DEFAULT_BUTTON_WIDTH = 100;
    private static final float DEFAULT_BUTTON_HEIGHT = 20;

    private String text;
    private float width;
    private float height;
    
    /**
     * Creates a new Button of default width and height with the specified text.
     * 
     * @param text the text the button should display.
     */
    public Button(String text) {
        // Use default button width and height
        this(text, DEFAULT_BUTTON_WIDTH, DEFAULT_BUTTON_HEIGHT);
    }

    /**
     * Creates a new Button with specified width and height using the supplied text.
     * 
     * @param text the text the button should display.
     * @param width the button width.
     * @param height the button height.
     */
    public Button(String text, float width, float height) {
        this.text = text;
        this.width = width;
        this.height = height;
    }

    /**
     * Draws the button on a Sketch.
     * 
     * @param sketch the sketch to draw on.
     * @param x the starting x coordinate.
     * @param y the starting y coordinate.
     */
    public void draw(PApplet sketch, int x, int y) {
        // Set the color of the button background based on whether the mouse is over it
        if (isInButton(sketch.mouseX, sketch.mouseY, x, y)) {
            sketch.fill(GRAY);
        }
        else {
            sketch.fill(WHITE);
        }
        sketch.rect(x, y, width, height);

        sketch.fill(BLACK);
        sketch.textAlign(CENTER, CENTER); // center text
        sketch.text(text, x, y, width, height); // draw the text inside the box
    }

    /**
     * Returns true if the mouse coordinates are inside the button boundaries if the
     * button is draw at the specified x and y coordinates.
     *  
     * @param mouseX the X coordinate of the mouse position to check.
     * @param mouseY the Y coordinate of the mouse position to check.
     * @param x the starting X coordinate of the button. 
     * @param y the starting Y coordinate of the button.
     * @return true if the mouse coordinates are inside the button.
     */
    public boolean isInButton(int mouseX, int mouseY, int x, int y) {
        return mouseX >= x && mouseX <= x + width && mouseY >= y && mouseY <= y + height;
    }
}