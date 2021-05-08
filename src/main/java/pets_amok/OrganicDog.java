package pets_amok;

public class OrganicDog extends OrganicPet {
    public OrganicDog(String name, String type, String description, int hunger, int sleepy, int bored, int happy, int waste) {
        super(name, type, description, hunger, sleepy, bored, happy, waste);
    }

    public OrganicDog(String newPet, String petDescription) {
        super(newPet, petDescription);
    }

    @Override
    public void walkPet() {
        happy +=5;
        cleanWaste();

    }

    @Override
    public int cleanWaste() {
        waste -= 4;
        return waste;

    }

    @Override
    public void makeWaste() {
        waste +=2;
    }
}