package pets_amok;

public class OrganicCat extends OrganicPet {

    public OrganicCat(String name, String type, String description, int hunger, int sleepy, int bored, int happy, int waste) {
        super(name, type, description, hunger, sleepy, bored, happy, waste);
    }

    public OrganicCat(String newPet, String petDescription) {
        super(newPet, petDescription);
    }

    @Override
    public void walkPet() {

    }

    @Override
    public int cleanWaste() {
        waste =0;
        return waste;
    }

    @Override
    public void makeWaste() {
        waste +=2;
    }
}
