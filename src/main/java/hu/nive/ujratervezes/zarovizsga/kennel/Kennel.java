package hu.nive.ujratervezes.zarovizsga.kennel;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    List<Dog> dogs = new ArrayList<>();

    public void addDog(Dog dog) {
        dogs.add(dog);

    }

    public List<Dog> getDogs() {
        return dogs;
    }

    public void feedAll() {
        for(Dog dog: dogs){
            dog.feed();
        }
    }

    public Dog findByName(String name) {

        for(Dog dog: dogs){
            if(dog.getName().equals(name)){
                return dog;
            }

        }
        throw new IllegalArgumentException("Nincs ilyen nevű kutya");
    }

    public void playWith(String name, int hours) {
        for (Dog dog : dogs) {
            if (dog.getName().equals(name)) {
                dog.play(hours);
            }
        }
    }

    public List<String> getHappyDogNames(int grade) {
        List<String> result = new ArrayList<>();

        for (Dog dog : dogs) {
            if (dog.getHappiness() > grade) {
                result.add(dog.getName());
            }

        }
        return result;
    }
}
