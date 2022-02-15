package virtual_pet;

public class OrganicLiger extends OrganicCat{

    public OrganicLiger(String name, String furColor, int cleanliness) {
        super(name, furColor, cleanliness);
    }

    public void cleanliness(){
    }
    @Override
    public void clean(){
        System.out.println("clean the Ligers litterbox");
        cleanliness += 20;
    }
}
