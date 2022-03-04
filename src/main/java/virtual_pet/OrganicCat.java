package virtual_pet;

public abstract class OrganicCat extends Cat {

    protected int exercise;
    protected int cleanliness;
    protected int hunger;
    private int thirst;
    private int boredom;

    public OrganicCat(String name, String furColor, int cleanliness) {
        super(name, furColor);
        this.cleanliness = cleanliness;
        this.exercise = exercise;
        this.thirst = 10;
        this.boredom = 10;
        this.hunger = 10;
    }
    //method for cleaning.
    public void clean(){
        cleanliness += 20;
    }
//    public void walk(){
//        int exercise = 20;
//    }

    public void walk() {
        hunger = Math.min(20, hunger - 5);}


    public int getHunger() {
        return hunger;
    }
    public String healthStatus() {
        return   name +  "'s Health status"
                + " Hunger: " + hunger
                + " Thirst: " + thirst
                + " Boredom: " + boredom;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public void feed() {
        hunger = Math.min(20,hunger + 5);
    }
    public void water() {
        thirst = Math.min(20,thirst + 5);
    }
    public void play() {
        boredom = Math.min(20,boredom + 5);
    }
    public void tick(){
        hunger =  Math.max(0, hunger - 2);
        thirst = Math.max(0, thirst - 2);
        boredom = Math.max(0, boredom - 2);

    }
    public void gameOver(){
        if (hunger == 0);
        if (thirst == 0);
        if (boredom == 0);
            System.out.println("Your musk of panther and gasoline has burned your nostrils and none likes you. Game over.");

    }
    public void youWon (){
        if (hunger == 20);
        if (thirst == 20);
        if (boredom == 20);
            System.out.println("It's pretty much my favorite animal. It's like a lion and a tiger mixed... bred for its skills in magic. You won.");
    }




}

