package hu.nive.ujratervezes.zarovizsga.kennel;

public class Beagle extends Dog {

    @Override
    public void feed() {
        happyness = happyness+2;

    }

    @Override
    public void play(int hours) {
        happyness = happyness + (2*hours);

    }

    public Beagle(String name) {
        super(name);
    }

    @Override
    public int getHappiness() {
        return happyness;
    }


}
