import processing.core.PApplet;
import java.util.ArrayList;
import processing.sound.SoundFile;

/**
 * Represents an animal shelter. Animals can be intaken or adopted.
 */
public class Shelter {
    
    private final int ENTRY_X_OFFSET = 50;
    private final int ENTRY_Y_SIZE = 110;
    private final int NAME_Y_OFFSET = 50;
    private final int NAME_TEXT_SIZE = 32;

    
    
    private ArrayList<Animal> animals;
    private String shelterName;
    
    /**
     * Creates a new Shelter.
     * 
     * @param shelterName the name of the shelter.
     */
    public Shelter(String shelterName) {
        animals = new ArrayList<Animal>();
        this.shelterName = shelterName;
    }

    /**
     * Intake a new animal. Won't someone please adopt them?!
     * 
     * @param animal the aniaml to intake into the shelter.
     */
    public void intake(Animal animal) {
        // Set the coordinates for the animal
        animal.setX(ENTRY_X_OFFSET);
        animal.setY(ENTRY_Y_SIZE + ENTRY_Y_SIZE * animals.size());
        // Add it
        animals.add(animal);
    }

    /**
     * Adopts an animal. 
     * 
     * @param animal the animal to adopt, which will be removed from the shelter.
     */
    public void adopt(Animal animal) {
        // TODO: implement this method. You may need to move the placement of remaining animals?
        animals.remove(animal);
    }

    /**
     * Draws a representation of the animals in the shelter on a sketch.
     * 
     * @param sketch the PApplet sketch to draw the shelter on.
     */
    public void draw(PApplet sketch) {
        // First display the name of the shelter
        sketch.textSize(NAME_TEXT_SIZE);
        sketch.textAlign(PApplet.CENTER); // center the text 
        sketch.text(shelterName, sketch.width/2f, NAME_Y_OFFSET);

        // Now display the animals
        for (Animal animal : animals) {
            animal.draw(sketch);
        }

        //need to add a hear button next to adopt button
        /**
         * int hearX = animal.getX + animal img width + hear button gap
         * int hearyY = "" .getY + "" animal im height /2 
         *  DONT FORGET TO MAKE CONSTANTS
         * sketch fill(smth)
         * sketch.rect(hearX, hearY, hear width, hear height)
         * sketch fill(smth)
         * align the text 
         * sketch.text("hear", need to figure out math for this still)
         */
    }

    public void mouseClicked(PApplet sketch) {
        // Check to see if the adopt button was clicked on any animal
        for (Animal animal : animals) {
            if (animal.isAdoptClicked(sketch)) {
                // TODO: actually adopt the animal!
                /**
                 * adopt(animal)
                 * system.out.println(Animal adopted + animal)
                 * break; 
                 */
                System.out.println("Animal adopted -- " + animal);

                
            }

            //add the detect click for the hear button
            /**
             * if (sketch.mouseX >= hearX and sketch.mouseX <= hearX + hearY 
             *     and sketch.mouseY >= hearY and sketch.mouseY <= hearY + HEAR_H)
             *     then: soundfile s = new soundfile(sketch, "get asset")
             *     s.play() <-- check that still
             *     break
             */  
            
             //add for hear me
             /*
              * if animal isHearClicked (sketch)
                animal.playSound();
                break;
              */

        }   
    } 
}