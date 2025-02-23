package Cage;

import Animals.Animal;
import Animals.Fish.FIsh;

public class Aquarium extends Cage {
    public Aquarium(int id, Size size) {
        super(id, size);
    }
    @Override
    public void add_animal(Animal animal) {
        super.add_animal(animal);
    }
}
