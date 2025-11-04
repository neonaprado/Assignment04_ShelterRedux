
/*
 * Demonstrate the use of abstract classes
 * @Author  Neona Prado
 * 
 * Note: All classes are in the same file for the purpose of this gist.
 * In reality, each class should be in its own file and you'll need to create
 * an appropriate Java project structure in VS Code.
 *
 * Do the following steps:
 *
 * Step 0: Add YOUR NAME above as part of the Animal class definition
 *
 * Step 1: Copy the code into the apporopriate files, run the code and notice how it works
 *
 * Step 2:  For our purposes, the Animal class can be an abstract class since its high-level idea that should not 
 * be used to create objects. Make the Animal class an abstract class
 *
 * Step 3:  Notice how our animalSound method in class Animal doesn't make sense.  It doesn't * make sense to define 
 * the sound method in class Animal. Make this method abstract, forcing all derived classes to implement it but leaving 
 * it unimplemented in the base/Animal class
 *
 * Step 4: Run it. Does everything still work?
 * 
 * Step 5: Add another Animal subclass of your choice.  Remember it MUST implemenent all 
 * abstract methods in its parent class. 
 * 
 * Step 6: In your main method, instantiate a new animal using your new class and add it to
 * your zoo.  Run it. Does everything work? 
 *
 * Notice how you can easily create a new Animal, add it to your zoo, and have it make a sound? Your array list 
 * can contain any type of animal.  During run-time, when animal.animalSound() is invoked, the object referenced 
 * by animal calls it's sound method.
 */

class Animal {
    public void sound() {
    }
    public void sleep() {
        System.out.println(getClass().getName() + " is catching some Zzz's. Let' all envy " + getClass().getName());
    }
}
