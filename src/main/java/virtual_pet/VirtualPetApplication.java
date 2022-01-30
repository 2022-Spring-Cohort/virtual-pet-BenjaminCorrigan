package virtual_pet;

import java.util.Scanner;

import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSInput;

public class VirtualPetApplication {
    VirtualPetShelter myShelter;

    public static void main(String[] args) {
        VirtualPetApplication virtualPetApplication = new VirtualPetApplication();
        virtualPetApplication.game();
    }

    public void game() {
        myShelter = new VirtualPetShelter();

        Cat myCat = new Cat("Simba", "Yellow", 10, 10, 10);
        myShelter.addPet(myCat);
        myShelter.addPet(new Cat("Fluffy", "gray",10,10,10));
        myShelter.addPet(new Cat("Toomey", "orange", 10, 10, 10));
        myShelter.addPet(new Cat("Rogue", "Gray, orange, white", 10, 10, 10));
        //System.out.println();
        Cat.greeting();

        myShelter.mainMenu();
        System.out.println();
        petStats();

        System.out.println("What would you like to do next?");
        Scanner scan = new Scanner(System.in);
        int userSelection;
        boolean keepPlaying = true;


        while (keepPlaying) {



            userSelection = scan.nextInt();
            if (userSelection == 6) {
                System.out.println("Option 6 picked");
                myShelter.feedAllPets();
            }
            if (userSelection == 7) {
                System.out.println("Option 7 picked");
                myShelter.waterAllPets();
            }
            if (userSelection == 8) {
                System.out.println("Option 8 picked");
                myShelter.playAllPets();
            }
            userSelection = scan.nextInt();
            if (userSelection == 0) {
                myShelter.mainMenu();
            }
            if (userSelection == 1) {
                System.out.println("Option 1 picked");
                myShelter.adoptCat();
            }
            myShelter.tickPets();
            if(!myShelter.petsNotDead()){
                System.out.println("Unfortunately a pet has died due to your negligence.");
                break;

            }


        }




    }


//    public void mainMenu() {
//        System.out.println("Enter option ");
//
//    }
    public void petStats(){
        for(Cat currentCat:myShelter.getPetShelter()) {
            System.out.println(currentCat.healhtStatus());
        }
    }

}
//break;

//System.out.println("Game over!");
//keepPlaying = false;
//myCat.gameOver();
//}
//System.out.println(myCat.healhtStatus());
//keepPlaying = myCat.getHunger() < 20;
//keepPlaying = myCat.getThirst() > 0;
//keepPlaying = myCat.getThirst() < 20;
//keepPlaying = myCat.getBoredom() > 0;
//keepPlaying = myCat.getBoredom() < 20;