
import Cage.Enclosure;
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

    public void add_enclosure(Enclosure enclosure) {
        listEnclosure.add(enclosure);
    }

    public void hire_employee(Employee employee) {
        listEmployee.add(employee);
    }

    public void accept_visitor(Visitor visitor) {
        visitor.setTiket(true);
        listVisitor.add(visitor);
    }

    public void day() {
        System.out.println("День начиниается, пора проверить животных перед приходом посетителей.");
        LinkedList<Visitor> listVisit = getListVisitor();
        LinkedList<Enclosure> listEnclose = getListEnclosure();
        for (Enclosure enclosure : listEnclose) {
            for (Visitor visitor : listVisit) {
                visitor.watch_animals(enclosure);
            }
        }

    }


    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", listEnclosure=" + listEnclosure +
                ", listEmployee=" + listEmployee +
                ", listVisitor=" + listVisitor +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Enclosure> getListEnclosure() {
        return listEnclosure;
    }

    public void setListEnclosure(LinkedList<Enclosure> listEnclosure) {
        this.listEnclosure = listEnclosure;
    }

    public LinkedList<Employee> getListEmployee() {
        return listEmployee;
    }

    public void setListEmployee(LinkedList<Employee> listEmployee) {
        this.listEmployee = listEmployee;
    }

    public LinkedList<Visitor> getListVisitor() {
        return listVisitor;
    }

    public void setListVisitor(LinkedList<Visitor> listVisitor) {
        this.listVisitor = listVisitor;
    }
}

