package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {

    private ArrayList<Cat> petShelter;


    public VirtualPetShelter() {
        this.petShelter = new ArrayList<>();
    }

    public void addPet(Cat myCat){
        petShelter.add(myCat);

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
    public ArrayList<Cat> getPetShelter() {
        return petShelter;
    }
    public boolean petsNotDead(){
        for (Cat currentCat:petShelter) {
            if(currentCat.isDead()){
                return false;
            }
        }
        return true;
    }
    public void tickPets(){
        for (Cat currentCat:petShelter) {
            currentCat.tick();
        }
    }
    public void mainMenu() {
        System.out.println("Using the numbers choose what you would like to do." +
                "\n1- Adopt a pet " +
                "\n2- Admit a pet" +
                "\n3- Feed a pet" +
                "\n4- Give water to a pet" +
                "\n5- Play with a pet" +
                "\n6- Feed all pets" +
                "\n7- Give water to all pets" +
                "\n8- Play with all the pets" +
                "\n9- Select to see a list of all the pets currently here");
    }
    public void adoptCat() {
        System.out.println("Which cat would you like to adopt?");
        for (Cat myshelter : petShelter)
            System.out.println(myshelter.getName());
    }



}
