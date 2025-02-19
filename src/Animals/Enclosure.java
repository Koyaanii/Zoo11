package Animals;

import java.util.LinkedList;

public class Enclosure {
    private Boolean clean;

    public Boolean getClean() {
        return clean;
    }

    public void setClean(Boolean clean) {
        this.clean = clean;
    }

    private int id;
    private LinkedList<Animal> linkedList;
    private Size size;

    public Enclosure(int id, Size size) {
        this.id = id;
        this.linkedList = new LinkedList();
        this.size = size;
        System.out.println("Создан вольер размером " + size);
    }

    public void add_animal(Animal animal) {
        switch (this.size) {
            case SMALL -> {
                if (this.linkedList.size() < 2) {
                    this.linkedList.add(animal);
                    System.out.println("Животное " + animal.getName() + " добавлено в вольер номер " + id);
                } else {
                    System.out.println("Вольер номер " + id + " полон, невозможно добавить животное " + animal.getName());
                }
            }
            case MEDIUM -> {
                if (this.linkedList.size() < 4) {
                    this.linkedList.add(animal);
                    System.out.println("Животное " + animal.getName() + " добавлено в вольер номер " + id);
                } else {
                    System.out.println("Вольер номер " + id + " полон, невозможно добавить животное " + animal.getName());
                }

            }
            case BIG -> {
                if (this.linkedList.size() < 8) {
                    this.linkedList.add(animal);
                    System.out.println("Животное " + animal.getName() + " добавлено в вольер номер " + id);
                } else {
                    System.out.println("Вольер номер " + id + " полон, невозможно добавить животное " + animal.getName());
                }
            }
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

            switch (this.size) {
                case SMALL -> {
                    if (linkedList.size() == 2) {
                        System.out.println("Вольер " + id + " заполнен");
                    }
                }

                case MEDIUM -> {
                    if (linkedList.size() == 4) {
                        System.out.println("Вольер " + id + " заполнен");
                    }

                }
                case BIG -> {
                    if (linkedList.size() == 8) {
                        System.out.println("Вольер " + id + " заполнен");
                    }

                }

            }
        }
    }


    @Override
    public String toString() {
        return "Enclosure{" +
                "номер=" + id +
                ",\nlinkedList=\n" + linkedList +
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
