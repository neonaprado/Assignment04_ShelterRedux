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

    // TODO: remove all these arrays and make the program work by reading in the contents of data.txt instead 
    //private static final String[] dogNames = { "Scooby-Doo", "Toto", "Spuds Mackenzie", "Snoopy" };
    //private static final String[] dogBreeds = { "Great Dane", "Cairn Terrier", "Bull Terrier", "Beagle" };
    ///private static final int[] dogAges = { 10, 2, 7, 55 };
    ///private static final String[] dogImages = { "assets/scoobydoo_small.png", "assets/toto_small.png", 
           // "assets/spuds_small.png", "assets/snoopy_small.png" };
    private int loadAnimalFiles(){
        String [] lines = loadStrings("assets/data.txt");
        int count = 0;

        for (String line : lines){
            String[] f = line.split(",");
            String name = f[0];
            String breed = f[1];
            int age = Integer.parseInt(f[2]);
            PImage img = loadImage(f[3]);
            SoundFile sound = new SoundFile(this, f[4]);
            Dog dog = new Dog(name, breed, age, img);
            dog.setSound(sound);
            shelter.intake(dog);
            count ++;

            
        }
        return count;

    }
    

    private Shelter shelter;

    public void settings() {
        size(500, 700);
    }

    public void setup() {
        // Set the font.
        PFont font = createFont("Arial", FONT_SIZE);
        textFont(font);

        // TODO give your shelter a name!
        shelter = new Shelter("Neona's Rescue Shelter");
        addAnimals();

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

    private void addAnimals() {
        for(int i=0; i<dogNames.length; i++) {
            Dog dog = new Dog(dogNames[i], dogBreeds[i], dogAges[i], loadImage(dogImages[i]));
            shelter.intake(dog);
        }
    }
}