package virtual_pet;

public class RoboticLiger extends RoboticCat {

    public RoboticLiger(String name, String furColor, int maintenance) {
        super(name, furColor, maintenance);
    }

    public void maintenance() {

    }

    @Override
    public void oilCat(){
        System.out.println("Come and get your oil Napoleon");
        int maintenance = 20;
    }
    @Override
    public void chargeCatBattery(){
        System.out.println("Duh, I know my battery is getting low");
        int maintenance = 20;
    }


}
