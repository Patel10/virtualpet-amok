package pets_amok;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {


    Map<String, VirtualPet> pets = new HashMap<>();

    public void add(VirtualPet pet) {
        pets.put(pet.getName(),pet);
    }
    public VirtualPet findPet(String petName){
    return pets.get(petName);
    }
    public void remove(String myPet){
        pets.remove(myPet);
    }
    public VirtualPet getPet(String name){
        return pets.get(name);
    }
    public Collection<VirtualPet> getAllPets(){
        return pets.values();
    }
    public void feed(VirtualPet pet1){
        pet1.modifyHunger(-2);
    }
    public void tick(){
        for (VirtualPet myPetTick : getAllPets()) {
            myPetTick.tick();
        }

    }
    public void outPutPet(){
        for(VirtualPet outPet : getAllPets()) {
            System.out.println(outPet.getName() + " " + outPet.getHunger() + " " + outPet.getSleepy() + " " + outPet.getBored());
        }
    }
    public void feedAll(){
        for (VirtualPet feedPet: pets.values()){
            feedPet.updateHunger(-5);
            feedPet.updateHunger(-2);
            feedPet.updateBored(1);
            if(feedPet instanceof Organic){
                ((Organic)feedPet).makeWaste(); //same for robo create a method for
            }
            if(feedPet instanceof Robotic){
                ((Robotic)feedPet).oilPet();
            }

        }
    }
    public void walkPet() {
        for (VirtualPet pet : pets.values()) {
            pet.walkPet();
        }
    }
    public void playWithPet(String petName){
        VirtualPet thisPet = findPet(petName);

        thisPet.updateHunger(5);
        thisPet.updateSleepy(5);
        thisPet.updateBored(5);
    }
    public void restAll() {
        for (VirtualPet sleepPet: pets.values()){
            sleepPet.updateSleepy(5);
            sleepPet.updateSleepy(3);
            sleepPet.updateHunger(-2);
        }
    }


}
