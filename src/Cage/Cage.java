package Cage;

import Animals.Animal;
import Animals.Fish.FIsh;

import java.util.LinkedList;

public abstract class Cage {
    private Boolean clean;
    private int id;
    private LinkedList<Animal> linkedList;
    private Size size;

    public Cage(int id, Size size) {
        this.clean = false;
        this.id = id;
        this.linkedList = new LinkedList();
        this.size = size;
    }
    public void add_animal(Animal animal) {
        if (getLinkedList().size() < size.getValue()) {
            this.linkedList.add(animal);
            System.out.println("Животное " + animal.getName() + " добавлено в вольер номер " + id);
        } else {
            System.out.println("Вольер номер " + id + " полон, невозможно добавить животное " + animal.getName());
        }
    }

    public Boolean getClean() {
        return clean;
    }

    public void setClean(Boolean clean) {
        this.clean = clean;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LinkedList<Animal> getLinkedList() {
        return linkedList;
    }

    public void setLinkedList(LinkedList<Animal> linkedList) {
        this.linkedList = linkedList;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
