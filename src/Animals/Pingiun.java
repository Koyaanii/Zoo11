package Animals;

public class Pingiun extends Animal {
    public Pingiun(String name, int year) {
        super(name, year);
    }

    @Override
    public void make_sound() {
        System.out.println("кря кря");
    }
}
