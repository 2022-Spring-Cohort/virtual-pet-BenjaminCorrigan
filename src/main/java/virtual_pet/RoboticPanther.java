package virtual_pet;

public class RoboticPanther extends RoboticCat implements Walkable{

    public RoboticPanther(String name, String furColor, int maintenance) {
        super(name, furColor, maintenance);
    }

    @Override
    public void walk() {
        System.out.println("Your panther needs to go for a walk");
        int exercise = 20;
    }
    //maintenance will be less effective
    @Override
    public void oilRoboticCat(){
        System.out.println("Come and get your oil Napoleon");
        int maintenance = 15;
    }
//    @Override
//    public void chargeRoboticCat(){
//        System.out.println("Duh, I know my battery is getting low");
//        int maintenance = 15;
//    }
}
