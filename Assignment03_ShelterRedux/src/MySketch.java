import processing.core.PApplet;
import processing.core.PFont;
import processing.core.PImage;
import processing.sound.SoundFile;

/**
 * Sketch to draw an animal shelter and the animals that can be adopted.
 */
public class MySketch extends PApplet {
    
    private static final int BACKGROUND_COLOR = 122;
    private static final int FONT_SIZE = 12;
    

    private Shelter shelter;

    public void settings() {
        size(500, 900);
    }

    public void setup() {
        // Set the font.
        PFont font = createFont("Arial", FONT_SIZE);
        textFont(font);
        //initialize shelter name and animals in shelter
        shelter = new Shelter("Neona's Rescue Shelter");
        loadAnimalFiles();


        // Play a welcome sound
        SoundFile welcomeSound = new SoundFile(this, "./assets/welcome.mp3");
        welcomeSound.play();
    }

    public void draw() {
        background(BACKGROUND_COLOR);
        shelter.draw(this);
    }

    public void mouseClicked() {
        shelter.mouseClicked(this); // pass the event to the shelter
    }

   

    /**
     * @return
     * 
     */
    private int loadAnimalFiles(){
        String[]lines = loadStrings("assets/data.txt");
        if (lines == null){
            return 0;
        }
        for (String line: lines){
            if (line == null || line.isEmpty()){
                continue;
            }
            String[] f = line.split(",");
            String type = f[0];
            String name = f[0];
            String breed = f[1];
            int age = parseInt(f[2]);
            PImage img = loadImage("assets/" + f[4]);
            SoundFile sound = new SoundFile(this, "assets/" + f[0] + ".aiff");

            Animal animal;
            if (type.equalsIgnoreCase("dog")){
                animal = new Dog(name,breed,age,img);
            }
            else if (type.equalsIgnoreCase("cat")){
                animal = new Cat(name,breed,age,img);
            }
            else{
                animal = new Fish (name,breed,age,img);
            }
            animal.setSound(sound);
            shelter.intake(animal);

            }
            return lines.length;
          
       }
    
}
