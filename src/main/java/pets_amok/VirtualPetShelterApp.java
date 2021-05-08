package pets_amok;


import java.util.Scanner;

public class VirtualPetShelterApp {

    public static void main(String[] args) {

        VirtualPet petC = new RoboticDog("Clelion" ,"dog", "Loud", 0, 0, 0,5,3); //5 happy
        VirtualPet petD = new RoboticCat("Pella", "cat", "Sweet", 0, 0, 0,5,3);
        VirtualPet petE = new OrganicCat("Rowdy", "cat", "Short temper", 0, 0, 0,4,3);
        VirtualPet petF = new OrganicDog("Test","dog","Slim slick",0,0,0,4,3);

        VirtualPetShelter pets = new VirtualPetShelter();
        pets.add(petC);
        pets.add(petD);
        pets.add(petE);
        pets.add(petF);

        Scanner input = new Scanner(System.in);

        int select;
        do {
            System.out.println("Welcome to Code R Us Shelter");
            System.out.println("Status of your pets");

            //Status of animal

            pets.outPutPet();

            System.out.println("Choose from the following");
            System.out.println("[0] Quit");
            System.out.println("[1] Feed the pets");
            System.out.println("[2] Rest All");
            System.out.println("[3] Play with pet you like");
            System.out.println("[4] Adopt a pet");
            System.out.println("[5] Admit a pet");
            System.out.println("[6] Walk the pet");  // 9 and 10 cleanCage and 10 cleanLitterBox
            System.out.println("[7] Oil Robot Pet"); //
            System.out.println("[8] Clean Dog Cage");
            System.out.println("[9] Clean Cat Litterbox");
            System.out.println("[10] Monitor Status");
            select = input.nextInt();

            input.nextLine();

            if (select == 0) {
                System.out.println("Oops you have walked out the shelter. ");
                System.exit(0);
            } else if (select == 1) {
                pets.feedAll();

                System.out.println("All are fed");

            } else if (select == 2) {
                pets.restAll();

                System.out.println("Needed a break");

            } else if (select == 3) {
                System.out.println("You chose to play");
                String selectPet;
                for (VirtualPet myPet : pets.getAllPets()) {
                    System.out.println(myPet.getName() + " " + myPet.getDescription());
                }

                System.out.println("Enter name of pet");
                input.nextLine();
                selectPet = input.nextLine();
                System.out.println("You want to play" + " " + selectPet);
                pets.playWithPet(selectPet);



            }
        else if (select == 4) {
                System.out.println("So! You want to take a pet? Choose from the following.");
                for (VirtualPet adoptPet : pets.getAllPets()) {
                    System.out.println(adoptPet.getName() + " " + adoptPet.getDescription());
                }
                System.out.println("Which pet? Not all..");
                input.nextLine();
                String adoptPet = input.nextLine();
                pets.remove(adoptPet);
                System.out.println("Great call! Pet " + adoptPet + " yours to take.");


            } else if (select == 5) {
                System.out.println("You want to donate a pet");
                System.out.println("Type in name of your pet");
                input.nextLine();
                String newPet = input.nextLine();
                System.out.println("Describe your pet");
                String petDescription = input.nextLine();
                System.out.println("What type of pet");
                String petType = input.nextLine();

                if (petType.equalsIgnoreCase("roboticdog")) {
                    VirtualPet petG = new RoboticDog(newPet, petDescription); //type of pet you have to select
                    pets.add(petG);
                }
                if (petType.equalsIgnoreCase("roboticcat")) {
                    VirtualPet petG = new RoboticCat(newPet, petDescription);
                    pets.add(petG);
                }
                if (petType.equalsIgnoreCase("organicdog")) {
                    VirtualPet petG = new OrganicDog(newPet, petDescription);
                    pets.add(petG);
                }
                if (petType.equalsIgnoreCase("organiccat")) { //if(petType.toLowerCase().equals("organiccat")){
                    VirtualPet petG = new OrganicCat(newPet, petDescription);
                    pets.add(petG);
                }

                System.out.println("Taking in " + newPet);

            }else if (select == 6) {
                System.out.println("You'd like to take pet for a walk");
                pets.walkPet();
            } else if (select == 7) {
                System.out.println("You'd like to Oil your pets?");
                pets.oilRobotPets();
                System.out.println("Good choice, all are now oiled.");
            } else if (select == 8) {
                System.out.println("Cleaning the Cages...");
                pets.cleanCage();
            } else if (select == 9) {
                System.out.println("Cleaning the LitterBox");
                pets.cleanLitterBox();
                System.out.println();

            } else if (select == 10){
                System.out.println("Loading... ");
                System.out.println();
                System.out.println();
                System.out.println(" -vv- current status -vv-");
               pets.outPutPet();

            }
        else {
                System.out.println("Wrong number, what are you doing?");
            }
            pets.tick();
        } while (select != 0);


    }
}

