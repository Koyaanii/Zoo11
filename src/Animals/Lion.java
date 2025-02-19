package Animals;

public class Lion extends Animal {
    public Lion(String name, int year) {
        super(name, year);
    }

    @Override
    public void make_sound() {
        System.out.println("PPPPPP!!!");;
    }
}


