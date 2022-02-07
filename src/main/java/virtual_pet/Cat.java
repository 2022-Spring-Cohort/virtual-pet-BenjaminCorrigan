package virtual_pet;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class Cat {

    private String name;
    private String furColor;
    private int hunger;
    private int thirst;
    private int boredom;
    private boolean dead;

    public Cat(String name, String furColor, int hunger, int thirst, int boredom) {
        //System.out.println("creating a new cat" + name );
        this.name = name;
        this.furColor = furColor;
        this.hunger = hunger;
        this.thirst = thirst;
        this.boredom = boredom;
        this.dead = false;
    }
    public Cat(String name, String furColor) {
        //System.out.println("creating a new cat" + name );
        this.name = name;
        this.furColor = furColor;
        this.hunger = 10;
        this.thirst = 10;
        this.boredom = 10;
        this.dead = false;
    }

    public String healthStatus() {
        return   name +  "'s Health status"
                + " Hunger: " + hunger
                + " Thirst: " + thirst
                + " Boredom: " + boredom;

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

    public void tick(){
        //System.out.println("Name = " + name + " hunger = "+ hunger + " thirst = " + thirst + " boredom = " + boredom);

        hunger =  Math.max(0, hunger - 2);
        thirst = Math.max(0, thirst - 2);
        boredom = Math.max(0, boredom - 2);



        if(hunger <=0 || thirst <= 0 || boredom <0){
            dead =true;
        }

        //System.out.println("Name = " + name + " hunger = "+ hunger + " thirst = " + thirst + " boredom = " + boredom + " dead = " + dead);
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


