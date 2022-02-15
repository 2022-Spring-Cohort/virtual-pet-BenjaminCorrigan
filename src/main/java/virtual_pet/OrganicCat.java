package virtual_pet;

public class OrganicCat extends Cat {

    protected int exercise;
    protected int cleanliness;

    public OrganicCat(String name, String furColor, int cleanliness) {
        super(name, furColor);

        this.cleanliness = cleanliness;
        this.exercise = exercise;
    }
    //method for cleaning.
    public void clean(){
        cleanliness += 20;
    }
    public void walk(){
        int exercise = 20;
    }





}
