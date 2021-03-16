package hu.nive.ujratervezes.zarovizsga.kennel;

public class Husky extends Dog{


    @Override
    public void feed() {
        happyness = happyness + 4;
    }

    @Override
    public void play(int hours) {
        happyness = happyness + (3*hours);

    }

    public Husky(String name) {
        super(name);
    }

    @Override
    public int getHappiness() {
        return happyness;
    }
}
