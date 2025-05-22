package posttest;

import Employee;

public class Intern extends Employee {
    public Intern(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 100000;
    }

    @Override
    public void displayInfo() {
        System.out.println("Intern: " + name + " | Gaji: " + calculateSalary(true));
    }
}

