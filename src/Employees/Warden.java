package Employees;

import Animals.Animal;
import Animals.Enclosure;

import java.util.LinkedList;

public class Warden extends Employee {
    public Warden(String name, Job job) {
        super(name, job);
    }
    @Override
    public void work(Enclosure enclosure) {
        if (enclosure.getLinkedList() != null) {
            LinkedList<Animal> list = enclosure.getLinkedList();
            for (Animal animal : list) {
                animal.eat();
            }
            System.out.println("Животные в вольере " + enclosure.getId() + " накормлены");
        } else {
            System.out.println("Вольер "+ enclosure.getId()+" пуст, кормить не кого");
        }
    }
}
