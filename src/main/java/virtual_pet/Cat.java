package virtual_pet;

public abstract class Cat {

    protected String name;
    private String furColor;
    private boolean dead;
    private int maintenance;
    protected int hunger;
    private int thirst;
    private int boredom;


//    public Cat(String name, String furColor, int thirst, int boredom) {
//        //System.out.println("creating a new cat" + name );
//        this.name = name;
//        this.furColor = furColor;
//        this.thirst = thirst;
//        this.boredom = boredom;

    //
//    }
    public Cat(String name, String furColor) {
        //System.out.println("creating a new cat" + name );
        this.name = name;
        this.furColor = furColor;
        this.dead = false;
        //this.maintenance = 10;
    }

    public abstract String healthStatus();


    public String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public boolean isDead() {
        return dead;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public abstract void tick();

    public abstract void play();

    public abstract void walk();

//    public abstract void chargeRoboticCat();
}


//    public abstract void tick(){
//    public void isDead(){
//        if(hunger <=0 || thirst <= 0 || boredom <0 || maintenance <=0) {
//            dead = true;
//        }
//
//            //cleanliness = Math.max(0, cleanliness -2);
//    }









