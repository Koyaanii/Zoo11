package Animals;

import java.util.LinkedList;

public class Enclosure {
    private Boolean clean;
    private int id;
    private LinkedList<Animal> linkedList;
    private Size size;

    public Enclosure(int id, Size size) {
        this.clean = false;
        this.id = id;
        this.linkedList = new LinkedList();
        this.size = size;
        System.out.println("Создан вольер размером " + size);
    }

    public void add_animal(Animal animal) {
        if (getLinkedList().size() < size.getValue()) {
            this.linkedList.add(animal);
            System.out.println("Животное " + animal.getName() + " добавлено в вольер номер " + id);
        } else {
            System.out.println("Вольер номер " + id + " полон, невозможно добавить животное " + animal.getName());
        }
    }

    public void remove_animal(Animal animal) {
        this.linkedList.remove(animal);
        System.out.println("Животное " + animal.getName() + " удалено из вольера номер " + id);

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
