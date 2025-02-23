package Animals.Mammals;

public class Lion extends Mammal {
    public Lion(String name, int year) {
        super(name, year);
    }

    @Override
    public String make_sound() {
        return "PPPPPP!!!";
    }
}


