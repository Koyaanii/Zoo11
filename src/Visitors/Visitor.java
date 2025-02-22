package Visitors;

import Animals.Animal;
import Animals.Enclosure;
import Employees.Vet;

import java.util.LinkedList;

public class Visitor {
    private String name;
    private int age;
    private boolean tiket;

    public Visitor(String name, int age) {
        this.name = name;
        this.age = age;
        this.tiket = false;
    }

    public void watch_animals(Enclosure enclosure) {
        LinkedList<Animal> listAnimals = enclosure.getLinkedList();
        System.out.println("Посетитель " + name + " наблюдает за животными в вольере номер " + enclosure.getId() + ", он видит: ");
        for (Animal animal : listAnimals) {
            System.out.println(animal.getName());
            if (animal.isSick()) {
                System.out.println("Кажется животному " + animal.getName() + " не здороится, ему нужен ветеринар.");

            } else {
                System.out.println("От него слышно: " + animal.make_sound() + ".");
            }

        }
        System.out.println();
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
