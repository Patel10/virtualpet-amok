package pets_amok;

public class RoboticDog extends RoboticPet{
    public RoboticDog(String name, String type, String description, int hunger, int sleepy, int bored, int happy, int oilLevel) {
        super(name, type, description, hunger, sleepy, bored, happy, oilLevel);
    }

    public RoboticDog(String newPet, String petDescription) {
        super(newPet, petDescription);
    }

    @Override
    public void walkPet() {

    }

//    @Override
//    public void walkRobotic(){
//        oilLevel -=4;
//    }


    @Override
    public void oilPet() {
        oilLevel -=4;
    }
}
