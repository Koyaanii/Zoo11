package Employees;

import Animals.Enclosure;

public abstract class Employee {
    private String name;
    private Job job;

    public Employee(String name, Job job) {
        this.name = name;
        this.job = job;
    }
    public void work(Enclosure enclosure){}
}
