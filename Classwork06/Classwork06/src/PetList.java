import java.util.ArrayList;

public class PetList {
    public static void main(String[] args) {
        ArrayList<String> pets = new ArrayList<>();
        pets.add("Dog");
        pets.add("Cat");
        pets.add("Fish");

        for (String pet : pets){
            System.out.println(pet);
        }

    }
}


