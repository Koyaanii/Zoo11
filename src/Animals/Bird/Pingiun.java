package Animals.Bird;

public class Pingiun extends Bird {
    public Pingiun(String name, int year) {
        super(name, year);
    }

    @Override
    public String make_sound() {

        return "кря кря";
    }
}
