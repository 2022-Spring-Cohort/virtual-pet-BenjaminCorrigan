package virtual_pet;

public class RoboticLiger extends RoboticCat {

    public RoboticLiger(String name, String furColor, int maintenance) {
        super(name, furColor, maintenance);
    }

    public void maintenance() {

    }

    @Override
    public void oilRoboticCat(){
        System.out.println("Come and get your oil Napoleon");
        int maintenance = 20;
    }

//    public void chargeRoboticCat(){
//        System.out.println("Duh, I know my battery is getting low");
//        int maintenance = 20;
//    }




}
