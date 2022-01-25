package virtual_pet;

public class Cat {

    private String name;
    private String furColor;
    private int hunger;
    private int thirst;
    private int boredom;


    public Cat(String name, String furColor, int hunger, int thirst, int boredom) {
        this.name = name;
        this.furColor = furColor;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
    }

    public String healhtStatus() {
        return  "********"
                + "\n"+ name +  "'s Health status"
                + "\n1 Hunger: " + hunger
                + "\n2 Thirst: " + thirst
                + "\n3 Boredom: " + boredom
                + "\n********";
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
   public void tick(){
        hunger =  Math.max(0, hunger - 2);
        thirst = Math.max(0, thirst - 2);
        boredom = Math.max(0, boredom - 2);

    }
        public static String greeting(){
        String greetingMessage = "";
        System.out.println("Give Simba food and water or play with him to keep him happy." +
                "\nIf you don't he will run away and Scar will rule the land");
        return greetingMessage;

    }


    public void feed() {
        hunger = Math.min(20,hunger + 5);
    }
    public void water() {
        thirst = Math.min(20,hunger + 5);
    }
    public void play() {
        boredom = Math.min(20,hunger + 5);
    }

    public void gameOver (){
        if (hunger == 0);
        if (thirst == 0);
        if (boredom == 0);
            System.out.println("Game over, you didn't feed Simba enough. He ran away");




    }
    public void youWon (){
        if (hunger == 20);
        if (thirst == 20);
        if (boredom == 20);
            System.out.println("Game over, you won Simba will stay to rule over the land.");
    }




}


