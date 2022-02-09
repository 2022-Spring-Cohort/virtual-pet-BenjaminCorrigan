package virtual_pet;

public class RoboticCat extends Cat {

    private int maintenance;


    public RoboticCat(String name, String furColor, int maintenance) {
        super(name, furColor);
        this.maintenance = maintenance;

    }
    // method for maintenance
    public void oilCat(){
        maintenance += 20;
    }
    public void chargeCatBattery(){
        maintenance += 20;
    }

    public void walk() {

    }
}
