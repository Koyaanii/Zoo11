package Animals;

public class Pingiun extends Animal {
    public Pingiun(String name, int year) {
        super(name, year);
    }

    @Override
    public String make_sound() {

        return "кря кря";
    }
}
