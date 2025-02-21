import Animals.*;
import Employees.Job;
import Employees.Vet;
import Employees.Warden;
import Visitors.Visitor;

public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Лёва", 2);
        Slon slon1 = new Slon("Slonik", 5);
        Pingiun pingiun1 = new Pingiun("Pin", 4);
        lion1.setHp(10);
        lion1.setHungry(50);
        slon1.setHungry(40);
        System.out.println(lion1);


        Enclosure enclosure1 = new Enclosure(1, Size.SMALL);
        enclosure1.add_animal(lion1);
        enclosure1.add_animal(slon1);

        enclosure1.add_animal(pingiun1);
        System.out.println(enclosure1);

        Warden warden1 = new Warden("Джон", Job.WARDEN);
        warden1.work(enclosure1);
        System.out.println(enclosure1);

        Vet vet1 = new Vet("Быков", Job.VET);
        vet1.work(enclosure1);


        Visitor visitor1 = new Visitor("Леша", 21);
        visitor1.watch_animals(enclosure1);

    }
}