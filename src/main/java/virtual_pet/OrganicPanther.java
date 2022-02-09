package virtual_pet;

public class OrganicPanther extends OrganicCat implements Walkable {

    public OrganicPanther(String name, String furColor, int cleanliness) {
        super(name, furColor, cleanliness);
    }

    @Override
    public void walk() {
        System.out.println("Your panther needs to go for a walk");
        int exercise = 20;
    }
    //clean method will be less effective += 15
    @Override
    public void clean(){
        System.out.println("clean the panther litterbox");
        cleanliness += 15;
    }
}
