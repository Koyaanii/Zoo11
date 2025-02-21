package Visitors;

import Animals.Enclosure;

public class Visitor {
    private String name;
    private int age;
    private boolean tiket;

    public Visitor(String name, int age) {
        this.name = name;
        this.age = age;
        this.tiket = false;
    }
    public void watch_animals(Enclosure enclosure){
        System.out.println("Посетитель " + name + " наблюдает за животными в вольере номер " + enclosure.getId() + ", он видит " +
             enclosure.getLinkedList() + ".");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isTiket() {
        return tiket;
    }

    public void setTiket(boolean tiket) {
        this.tiket = tiket;
    }
}
