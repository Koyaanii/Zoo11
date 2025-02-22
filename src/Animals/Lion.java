package Animals;

public class Lion extends Animal {
    public Lion(String name, int year) {
        super(name, year);
    }

    @Override
    public String make_sound() {
        return "PPPPPP!!!";
    }
}


