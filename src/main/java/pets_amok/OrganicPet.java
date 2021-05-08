package pets_amok;

public abstract class OrganicPet extends VirtualPet implements Organic {


    public OrganicPet(String name, String type, String description, int hunger, int sleepy, int bored, int happy, int waste) {
        super(name, type, description, hunger, sleepy, bored, happy);
        this.waste = waste;
    }

    public OrganicPet(String newPet, String petDescription) {
        super(newPet, petDescription);
        this.waste = 0;

    }

    protected int waste = 5;
    public int cleanWaste() {
        waste -=4;
        return waste;
    }

    //public int getWaste() {
       // return waste;
   // }


    @Override
    public void tick() {
        super.tick();
        waste +=1;

    }
}
