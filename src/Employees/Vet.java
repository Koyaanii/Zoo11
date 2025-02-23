package Employees;

import Animals.Animal;
import Cage.Enclosure;

import java.util.LinkedList;

public class Vet extends Employee{


    public Vet(String name, Job job) {
        super(name, job);
    }
    @Override
    public void work(Enclosure enclosure) {
        if (enclosure.getLinkedList() != null) {
            LinkedList<Animal> list = enclosure.getLinkedList();
            for (Animal animal : list) {
                animal.sleep();
            }
            System.out.println("Животные в вольере " + enclosure.getId() + " вылечены");
        } else {
            System.out.println("Вольер "+ enclosure.getId()+" пуст, лечить не кого");
        }
    }
}
