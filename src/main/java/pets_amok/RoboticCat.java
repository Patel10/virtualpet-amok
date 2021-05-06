package pets_amok;

public class RoboticCat extends RoboticPet{
    public RoboticCat(String name, String type, String description, int hunger, int sleepy, int bored, int happy, int oilLevel) {
        super(name, type, description, hunger, sleepy, bored, happy, oilLevel);
    }

    public RoboticCat(String newPet, String petDescription) {
        super(newPet, petDescription);
    }

    @Override
    public void walkPet() {

    }

    @Override
    public void oilPet() {
        oilLevel -= 4;
    }
}
