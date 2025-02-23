import Animals.Bird.Pingiun;
import Animals.Mammals.Lion;
import Animals.Mammals.Slon;
import Cage.Enclosure;
import Cage.Size;
import Employees.Cleaner;
import Employees.Job;
import Employees.Vet;
import Employees.Warden;
import Visitors.Visitor;

public class Main {
    public static void main(String[] args) {
        Lion lion1 = new Lion("Лёва", 2);
        Lion lion2 = new Lion("Зуба", 3);
        Lion lion3 = new Lion("Коготь", 4);

        Slon slon1 = new Slon("Slonik", 5);
        Slon slon2 = new Slon("Лелик", 6);
        Slon slon3 = new Slon("Бобик", 7);

        Pingiun pingiun1 = new Pingiun("Pin", 8);
        Pingiun pingiun2 = new Pingiun("Bill", 9);
        Pingiun pingiun3 = new Pingiun("Йцукен", 10);

        Enclosure enclosure1 = new Enclosure(1, Size.SMALL);
        Enclosure enclosure2 = new Enclosure(2, Size.MEDIUM);
        Enclosure enclosure3 = new Enclosure(3, Size.LARGE);

        
        enclosure1.add_mammal(lion1);
        enclosure1.add_mammal(slon1);
        enclosure2.add_mammal(pingiun1);
        enclosure2.add_mammal(pingiun2);
        enclosure2.add_mammal(pingiun3);
        enclosure3.add_mammal(lion2);
        enclosure3.add_mammal(lion3);
        enclosure3.add_mammal(slon2);
        enclosure3.add_mammal(slon3);

        lion2.setHp(12);

        Warden warden1 = new Warden("Джон", Job.WARDEN);
        Vet vet1 = new Vet("Быков", Job.VET);
        Cleaner cleaner1 = new Cleaner("Витя", Job.CLEANER);

        Visitor visitor1 = new Visitor("Леша", 21);
        Visitor visitor2= new Visitor("Игорь", 12);

        Zoo zoo1 = new Zoo("Зоопарк1");
        zoo1.add_enclosure(enclosure1);
        zoo1.add_enclosure(enclosure2);
        zoo1.add_enclosure(enclosure3);

        zoo1.hire_employee(warden1);
        zoo1.hire_employee(vet1);
        zoo1.hire_employee(cleaner1);

        zoo1.accept_visitor(visitor1);
        zoo1.accept_visitor(visitor2);

        zoo1.day();

    }
}