package pets_amok;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetShelterTest {
    VirtualPetShelter underTest;
    VirtualPet petC;
    VirtualPet petD;
    VirtualPet petE;
    VirtualPet petF;



@BeforeEach
public void setup() {
        underTest = new VirtualPetShelter();
     petC = new RoboticDog("Clelion" ,"wild", "testing", 0, 0, 0,5,3); //5 happy
     petD = new RoboticCat("Pella", "dog", "testing2", 0, 0, 0,5,3);
     petE = new OrganicCat("Rowdy", "dog", "testing3", 0, 0, 0,4,3);
     petF = new OrganicDog("Test","dog","testing4",0,0,0,4,3);

    }
@Test
public void ableToAddPet(){
    underTest.add(petC);  //test passes
    VirtualPet getPet = underTest.findPet("Clelion");
    assertEquals(getPet, petC);
}
@Test
public void ableToFindPet(){
    underTest.findPet(petC.getName()); // returning null
    VirtualPet findPet = underTest.findPet("Clelion");
    assertEquals(findPet, petC.getName());
}
@Test
public void ableToAddPetTwoPets(){
    underTest.add(petC);
    underTest.add(petD);
    Collection <VirtualPet> allPets = underTest.getAllPets();
    assertEquals(2,allPets.size());
}
@Test
public void ableToAdoptPet(){
    underTest.add(petC);
    underTest.remove(petC.getName());
    VirtualPet retrievedPet = underTest.findPet(petC.getName());
    assertEquals(retrievedPet, retrievedPet);
}
//@Test
//public void shouldFeedPet(){
    //underTest.feedAll(petC.getHunger());
    //VirtualPet feedAll = underTest.findPet(petC.getName()).getHunger();  doesn't run correctly
    //assertEquals(petC.getHunger());

//}
@Test
public void shouldFeedPet(){
    underTest.feed(petC);
    assertEquals(petC.getHunger(),(-2));
}
@Test
public void shouldFeedAllPet(){
    underTest.feedAll();
    assertEquals(petC.getHunger(),(0));
    assertEquals(petD.getHunger(),(0));
    assertEquals(petE.getHunger(),(0));
    assertEquals(petF.getHunger(),(0));
}
@Test
public void restAllPet(){
    underTest.restAll();
    assertEquals(petC.getSleepy(),(0));


}


}
