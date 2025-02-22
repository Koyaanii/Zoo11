package Animals;

public abstract class Animal {
    private String name;
    private int year;
    private int hp;
    private int hungry;

    public Animal(String name, int year) {
        this.name = name;
        this.year = year;
        this.hp = 100;
        this.hungry = 100;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHungry() {
        return hungry;
    }

    public void setHungry(int hungry) {
        this.hungry = hungry;
    }

    public void eat() {
        this.hungry = 100;
    }

    public void sleep() {
        this.hp = 100;
    }

    public Boolean isSick() {
        return hp <= 20;
    }

    public Boolean isHungry() {
        return hungry <= 35;
    }


    public abstract String make_sound();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", hp=" + hp +
                ", hungry=" + hungry +
                '}';
    }
}
