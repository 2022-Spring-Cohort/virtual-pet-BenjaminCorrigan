package virtual_pet;

public class Pet {

    private String name;
    private String furColor;
    private int hunger;
    private int thirst;
    private int boredom;
    private boolean dead;

    public Pet(String name, String furColor, int hunger, int thirst, int boredom) {
        this.name = name;
        this.furColor = furColor;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.dead = false;
    }

    public String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getBoredom() {
        return boredom;
    }

    public boolean isDead() {
        return dead;
    }
}
