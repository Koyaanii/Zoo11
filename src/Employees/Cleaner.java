package Employees;

import Cage.Enclosure;

public class Cleaner extends Employee {
    public Cleaner(String name, Job job) {
        super(name, job);
    }

    @Override
    public void work(Enclosure enclosure) {
        if (!enclosure.getClean()) {
            enclosure.setClean(true);
            System.out.println("Вольер номер " + enclosure.getId() + " очищен");
        } else {
            System.out.println("Вольер номер " + enclosure.getId() + " чист, уборка не требуется");
        }
    }
}
