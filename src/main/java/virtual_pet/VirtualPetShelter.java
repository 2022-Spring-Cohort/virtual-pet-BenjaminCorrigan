package virtual_pet;

import java.util.ArrayList;
import java.util.Scanner;

//import static org.graalvm.compiler.nodeinfo.Verbosity.Name;

public class VirtualPetShelter {

    protected ArrayList<Cat> petShelter;


    public VirtualPetShelter() {

        System.out.println("VIRTUAL PET SHELTER CONSTRUCTOR");
        petShelter = new ArrayList<>();
    }
    public void listPets(){
        int i = 1;
        for (Cat currentCat : petShelter) {
            System.out.println(i + " - " + currentCat.getName() + " " + currentCat.getFurColor());
            i++;
        }
    }

    public void waterPet(){
        this.listPets();
        System.out.println("You have chosen to water a pet.  Which one?");
        Scanner scan = new Scanner(System.in);
        int catNumber = scan.nextInt();
        // subtract 1 from catIndex.  find that cat.  water that cat
        Cat luckyCat = petShelter.get(catNumber - 1);
        luckyCat.water();
        luckyCat.healthStatus();
    }

    public void feedPet(Scanner scan){
        listPets();
        System.out.println("You have chosen to feed a pet.  Which one?");
//        Scanner scan = new Scanner(System.in);
        int catNumber = scan.nextInt();
        // subtract 1 from catIndex.  find that cat.  feed that cat
        Cat luckyCat = petShelter.get(catNumber - 1);
        luckyCat.feed();
        luckyCat.healthStatus();
    }

    public void playPet(int catIndex){
        // subtract 1 from catIndex.  find that cat.  water that cat
        Cat luckyCat = petShelter.get(catIndex - 1);
        luckyCat.play();
        luckyCat.healthStatus();
    }


    //loop through all pets
    //call each pets feed,water, and play method
    public void waterAllPets() {
        for (Cat currentCat : petShelter) {
            currentCat.water();
        }
    }

    public void feedAllPets() {
        for (Cat currentCat : petShelter) {
            currentCat.feed();
        }
    }

    public void playAllPets() {
        for (Cat currentCat : petShelter) {
            currentCat.play();
        }
    }
    public void cleanAllPets() {
        for (Cat currentCat : petShelter) {
            if (currentCat instanceof OrganicCat){
                ((OrganicCat)currentCat).clean();
            }
        }
    }
    //oil all
    public void oilAllPets(){
        for (Cat currentCat : petShelter) {
            if (currentCat instanceof RoboticCat){
                ((RoboticCat)currentCat).oilCat();
            }
        }
    }
    public void chargeAllPets(){
        for (Cat currentCat : petShelter) {
            if (currentCat instanceof RoboticCat){
                ((RoboticCat)currentCat).chargeCatBattery();
            }
        }
    }

    //walk all
    public void walkAllPets(){
        for (Cat currentCat : petShelter) {
            if (currentCat instanceof RoboticCat){
                ((RoboticCat)currentCat).walk();
            }
        }
    }

    public ArrayList<Cat> getPetShelter() {
        return petShelter;
    }

    public boolean allPetsAlive() {
        for (Cat currentCat : petShelter) {
            if (currentCat.isDead()) {
                return false;
            }
        }
        return true;
    }
    public void listNames(){
        for (Cat myShelter : petShelter)
            System.out.println(myShelter.getName());
    }

    public void tickPets() {
        for (Cat currentCat : petShelter) {
            //System.out.println("ticking " + currentCat.getName());
            currentCat.healthStatus();
            currentCat.tick();
        }
    }
    public static String greeting(){
        System.out.println(" IN GREETING");
        String greetingMessage = "";
        System.out.println("==================================================================");
        System.out.println("= WELCOME ========================================================");
        System.out.println("==================================================================");
        System.out.println("Welcome to the Pet shelter. You can admit a pet or adopt a pet." +
                "\nOr if you would like to volunteer you can help out." +
                "\nYou can choose to feed, water or play with all or just one of them.\n\n");
        return greetingMessage;

    }

    public void mainMenu() {
        System.out.println("-----------------------------MENU---------------------------------");
        System.out.println("Using the numbers choose what you would like to do." +
                "\n1- Adopt a pet " +
                "\n2- Admit a pet" +
                "\n3- Feed a pet" +
                "\n4- Give water to a pet" +
                "\n5- Play with a pet" +
                "\n6- Feed all pets" +
                "\n7- Give water to all pets" +
                "\n8- Play with all the pets" +
                "\n9- Select to see a list of all the pets currently here"+
                "\n10- Walk both organic and robotic Panthers"+
                "\n11- Clean the organic panther and liger cages"+
                "\n12- Oil robotic panther and robotic ligers"+
                "\n13- Charge robotic panther and ligers batteries"+
                "\n0- To see the menu at any time");
        System.out.println("------------------------------------------------------------------");
    }

    public void adoptPet(Scanner scan) {
        // TO DO - figure out how to select a specific pet and then, once selected, REMOVE it from the list
        System.out.println("Which cat would you like to adopt?");
        for (Cat myShelter : petShelter) {
            System.out.println(myShelter.getName());
        }
            String petName = scan.nextLine();
            Cat foundCat= null;
        for (Cat myCat : petShelter){
            if (myCat.getName().equals(petName)){
               foundCat = myCat;
            }
        }
        petShelter.remove(foundCat);
    }
    public void addPetToShelter(Cat myCat) {
//        System.out.println("Tell us about your cat you would like to admit.");
//        for (Cat myShelter : petShelter)
//            System.out.println(myShelter.getName());
            petShelter.add(myCat);
//        Scanner scan = new Scanner(System.in);
//        System.out.println("What is your pets color?");
//        String newColor = scan.nextLine();
//        System.out.println("What is your pets name?");
//        String newName = scan.nextLine();

    }

    public void admitPet(Scanner scan) {

        System.out.println("What is your pets color?");
        String newColor = scan.nextLine();
        System.out.println("What is your pets name?");
        String newName = scan.nextLine();
        Cat myCat = new Cat(newName, newColor);
        petShelter.add(myCat);
        System.out.println("Your lovely pet has been added to the shelter."+
                "\n You can see your pet in the Pet Stats list.");
    }

    public void petShelter(Cat myCat){

    }

//    public Pet addNewPet(Scanner scan) {
//        System.out.println("What is your pets name?");
//        String newName = scan.nextLine();
//
//
//
//
//        Pet newPet = new Pet(newName,newColor);
//        VirtualPetShelter.add(newPet);
//
//        return newPet;
//    }
//
//    private static <Pet> void add(Pet newPet) {
    //}


}
