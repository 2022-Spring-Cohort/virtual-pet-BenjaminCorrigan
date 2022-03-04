package virtual_pet;

import java.sql.SQLOutput;
import java.util.Scanner;

import com.sun.tools.javac.Main;
import org.w3c.dom.ls.LSInput;

public class VirtualPetApplication {
    VirtualPetShelter myShelter;

    public static void main(String[] args) {
        //System.out.println("In Main");

        VirtualPetApplication virtualPetApplication = new VirtualPetApplication();
        virtualPetApplication.game();
    }

    public void game() {
        //System.out.println("in game");
        myShelter = new VirtualPetShelter();
        //method to add pet from shelter
        myShelter.addPetToShelter(new OrganicLiger("Liger Napoleon Dynamite", "Tan with stripes", 10));
        myShelter.addPetToShelter(new OrganicPanther("Panther Brian Fontana", "Black",            10));
        myShelter.addPetToShelter(new RoboticLiger("Cyborg Jon Heder","Brown",                 10));
        myShelter.addPetToShelter(new RoboticPanther("Cyborg Paul Rudd","Midnight black",     10));
//        myShelter.addPetToShelter(new Cat("Cat Toomey", "orange",           10,  10, 10));
//        myShelter.addPetToShelter(new Cat("Cat Rogue", "Gray, orange, white", 10, 10, 10));




        myShelter.greeting();
       // myShelter.listPets();



        boolean keepPlaying = true;

        while (keepPlaying) {

            petStats();
            System.out.println();
            myShelter.mainMenu();



            System.out.println("What would you like to do next?");
            Scanner scan = new Scanner(System.in);
            int userSelection;


            userSelection = scan.nextInt();
            scan.nextLine();
            //userSelection = scan.nextInt();

            // 0 - list menu
            if (userSelection == 0) {
                myShelter.mainMenu();
            }
            // 1 - adopt a pet
            if (userSelection == 1) {
                System.out.println("Option 1 picked");
                myShelter.adoptPet(scan);
                System.out.println("Congratulation on your new Pet, this pet likes to eat and play, but mostly he likes to eat.");
            }
            // 2 - admit pet
            if (userSelection == 2) {
                myShelter.admitPet(scan);
            }
            // 3 - feed single pet
            if (userSelection == 3) {
                System.out.println("Option 3 picked");
                myShelter.feedPet(scan);
                System.out.println("Yummy in my tummy.");
            }
            // 4 - water single pet
            if (userSelection == 4) {
                myShelter.waterPet();
                System.out.println("Hydration is key.");
            }
            // 5 - play with pet
            if (userSelection == 5) {
                System.out.println("You have chosen to play with pet");
                myShelter.listPets();
                System.out.println("Enter the number for the pet you would like to play with:");
                int catNumber = scan.nextInt();
                Cat luckyCat = myShelter.getPetShelter().get(catNumber- 1);
                luckyCat.play();
                System.out.println("Playing makes me thirsty and hungry.");
            }

            // 6- feed all pets
//            if (userSelection == 6) {
//                System.out.println("Option 6 picked");
//                myShelter.feedAllPets();
//                //System.out.println(myCat.healthStatus());
//            }
//            // 7 - water all pets
//            if (userSelection == 7) {
//                System.out.println("Option 7 picked");
//                myShelter.waterAllPets();
//            }
            // 8 - play with all pets
            if (userSelection == 8) {
                System.out.println("Option 8 picked");
                myShelter.playAllPets();
            }
            // 9 - list all pets in shelter
            if (userSelection == 9) {
                System.out.println("======*=====");
                System.out.println("LIST OF PETS");
                myShelter.listNames();

            }
            // walk all panthers A

            if (userSelection == 10) {
                System.out.println("You picked option A to walk pets");
                myShelter.walkAllPets();
                    //userSelection = scan.nextLine().toUpperCase().charAt(0);
            }
            // clean cage

            if (userSelection == 11){
                System.out.println("You picked option B to clean the cage");
                myShelter.cleanAllPets();
            }
            // oil RoboticCat

            if (userSelection == 12){
                System.out.println("You picked option C to oil the robotic Pets");
                myShelter.oilRoboticCat();
            }
            // charge battery

            if (userSelection == 13){
                System.out.println("You picked option C to oil the robotic Pets");
                myShelter.chargeRoboticCat(scan);
            }
            if (userSelection == 14) {
//                System.out.println("You picked option C to oil the robotic Pets");
                myShelter.walkPet(scan);
            }
            if (userSelection != 9 && userSelection != 0){
                myShelter.tickPets();
            }
//            System.out.println("THIS IS WHEN I GET TICKED.  KeepPlaying = " + keepPlaying);


            if(!myShelter.allPetsAlive()){
                System.out.println("Unfortunately a pet has died due to your negligence.");
                keepPlaying = false;
            }

        }

    }


//    public void mainMenu() {
//        System.out.println("Enter option ");
//
//    }
    public void petStats(){

        System.out.println("==================================================================");
        System.out.println("= PET STATS ======================================================");
        System.out.println("==================================================================");
        for(Cat currentCat:myShelter.getPetShelter()) {
            System.out.println(currentCat.healthStatus());
        }
    }

}
