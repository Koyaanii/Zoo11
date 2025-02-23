package Cage;

import Animals.Mammals.Mammal;

import java.util.LinkedList;

public class Enclosure extends Cage {
    private Boolean clean;
    private int id;
    private LinkedList<Mammal> linkedList;
    private Size size;

    public Enclosure(int id, Size size) {
        this.clean = clean;
        this.id = id;
        this.linkedList = new LinkedList<>();
        this.size = size;
    }

    public void add_mammal(Mammal mammal) {
        if (getLinkedList().size() < size.getValue()) {
            this.linkedList.add(mammal);
            System.out.println("Животное " + mammal.getName() + " добавлено в вольер номер " + id);
        } else {
            System.out.println("Вольер номер " + id + " полон, невозможно добавить животное " + mammal.getName());
        }
    }

    public void remove_mammal(Mammal mammal) {
        this.linkedList.remove(mammal);
        System.out.println("Животное " + mammal.getName() + " удалено из вольера номер " + id);

    }

    public void check_capacity() {
        if (linkedList == null) {
            System.out.println("Вольер " + id + " пуст");
        } else {
            if (linkedList.size() == this.size.getValue()) {
                System.out.println("Вольер " + id + " заполнен");
            }
        }
    }

    public Boolean getClean() {
        return clean;
    }

    public void setClean(Boolean clean) {
        this.clean = clean;
    }


    @Override
    public String toString() {
        return "\nEnclosure{" +
                "номер=" + id +
                ",\nlinkedList=" + linkedList +
                ",\nsize=" + size +
                '}';
    }

    public int getId() {
        return id;
    }

    public LinkedList getLinkedList() {
        return linkedList;
    }

    public Size getSize() {
        return size;
    }

}
