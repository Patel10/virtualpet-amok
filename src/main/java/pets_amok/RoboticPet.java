package pets_amok;

public abstract class RoboticPet extends VirtualPet  implements Robotic {
    public RoboticPet(String name, String type, String description, int hunger, int sleepy, int bored, int happy, int oilLevel) {
        super(name, type, description, hunger, sleepy, bored, happy);
        this.oilLevel = oilLevel;
    }

    protected int oilLevel = 10;

    public RoboticPet(String newPet, String petDescription) {
        super(newPet, petDescription);
    }

    public int getOilLevel() {
        return oilLevel;
    }

    public void oilPet() {
        oilLevel += 4;
        happy +=4;
    }



    @Override
    public void tick() {
        super.tick();
        oilLevel -=1;



    }
}
