package virtual_pet;

public abstract class RoboticCat extends Cat {


    private int maintenance;
    private int batteryLevel;
    private int oilLevel;


    public RoboticCat(String name, String furColor, int maintenance) {
        super(name, furColor);
        this.maintenance = maintenance;
        this.batteryLevel = 60;
        this.oilLevel = 70;

    }



    public int getOilLevel() {
        return oilLevel;
    }

    public int getMaintenance() {
        return maintenance;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
    // method for maintenance

    public void oilRoboticCat() {
        oilLevel = Math.min(20,oilLevel + 5);
    }
    public void chargeRoboticCat() {
        batteryLevel = Math.max(20,batteryLevel + 5);
    }
//    public void oilLevel(){
//        maintenance += 20;
//    }
//    public void roboticMaintenance(){
//        maintenance += 20;
//    }


    public void walk() {
        batteryLevel = Math.min(20, batteryLevel - 5);
    }

    public String healthStatus() {
        return   name +  "'s Health status"
                + " Oil Level: " + maintenance
                + " Charge Battery: " + batteryLevel;

    }

    public void tick(){

        maintenance = Math.max(0, maintenance - 2);
    }

    @Override
    public void play() {
        maintenance = Math.max(0, maintenance - 2);
        batteryLevel = Math.min(20, batteryLevel - 5);
    }


}
