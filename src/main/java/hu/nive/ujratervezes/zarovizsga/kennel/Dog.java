package hu.nive.ujratervezes.zarovizsga.kennel;

public abstract class Dog {

    private String name;
    protected int happyness =0;

    public String getName() {
        return name;
    }




    public abstract void feed();
    public abstract void play(int hours);

    public Dog(String name) {
        this.name = name;
    }

    public abstract int getHappiness();
}
