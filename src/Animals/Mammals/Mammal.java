package Animals.Mammals;

import Animals.Animal;

public abstract class Mammal extends Animal {
    public Mammal(String name, int year) {
        super(name, year);
    }

    @Override
    public abstract String make_sound();

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getYear() {
        return super.getYear();
    }

    @Override
    public void setYear(int year) {
        super.setYear(year);
    }

    @Override
    public int getHp() {
        return super.getHp();
    }

    @Override
    public void setHp(int hp) {
        super.setHp(hp);
    }

    @Override
    public int getHungry() {
        return super.getHungry();
    }

    @Override
    public void setHungry(int hungry) {
        super.setHungry(hungry);
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void sleep() {
        super.sleep();
    }

    @Override
    public Boolean isSick() {
        return super.isSick();
    }

    @Override
    public Boolean isHungry() {
        return super.isHungry();
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
