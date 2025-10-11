import java.util.Scanner;
public class RepeatFruit2 {
    public static void main(String[] args){
        //System.out.println("hi");
        int phraseRepeat = Integer.parseInt(args[0]);
        System.out.println("What is your favorite fruit?");
        Scanner scanner = new Scanner(System.in);
        String favFruit = scanner.nextLine();

        String fruitPhrase = "Your favorite fruit is " + favFruit + "!";

        for (int i = 0; i < phraseRepeat; i++){
            System.out.println(fruitPhrase);
            
        }
        System.out.println("Thanks!");
        scanner.close();

    }
}
