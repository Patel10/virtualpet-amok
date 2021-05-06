package pets_amok;
public abstract class VirtualPet {


    protected String name;
    protected int hunger;
    protected String type;
    protected String description;
    protected int sleepy;
    protected int bored;
    protected int happy;

    public VirtualPet(String name, String type,  String description , int hunger, int sleepy, int bored, int happy){


        this.name = name;
        this.type = type;
        this.description = description;
        this.sleepy = sleepy;
        this.hunger = hunger;
        this.bored = bored;
        this.happy = happy;
    }

    public VirtualPet(String newPet, String petDescription) {
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getSleepy() {
        return sleepy;
    }

    public int getBored() {
        return bored;
    }

    public int happyLevel(){
        return happy;
    }
    public String getType(){ return type;}
    public String getDescription(){return description;}
// this for the amok methods
public abstract void walkPet();




    public void setHunger(int h) {
        hunger = h;
    }

    public void setSleepy(int s) {
        sleepy = s;
    }

    public void setBored(int b) {
        bored = b;
    }

    public void modifyHunger(int h) {
        hunger += h;
    }

    public void updateSleepy(int s) {
        sleepy += s;
    }

    public void updateHunger(int h) { hunger += h;
    }
    public void updateBored(int b ) { bored += b;
    }
    public void feed(int f) { updateHunger(f);}
    public void rest(int r) { updateSleepy(r);}
    public void play(int p) { updateBored(p);}
    public void tick() {
        updateSleepy(1);
        updateHunger(1);
        updateBored(1);



    }


}
