import Animals.Animal;
import Animals.Enclosure;
import Employees.Employee;
import Visitors.Visitor;

import java.util.LinkedList;

public class Zoo {
    private String name;
    private LinkedList<Enclosure> listEnclosure;
    private LinkedList<Employee> listEmployee;
    private LinkedList<Visitor> listVisitor;

    public Zoo(String name) {
        this.name = name;
        this.listEnclosure = new LinkedList<Enclosure>();
        this.listEmployee = new LinkedList<Employee>();
        this.listVisitor = new LinkedList<Visitor>();
    }

    public void add_enclosure(Enclosure enclosure){
        listEnclosure.add(enclosure);
    }

    public void hire_employee(Employee employee){
        listEmployee.add(employee);
    }
    public void accept_visitor(Visitor visitor){
        visitor.setTiket(true);
        listVisitor.add(visitor);
    }
}

