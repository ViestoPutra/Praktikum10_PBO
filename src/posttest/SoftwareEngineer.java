package posttest;

import Employee;

public class SoftwareEngineer extends Employee {
    public SoftwareEngineer(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 100000; 
    }

    @Override
    public void displayInfo() {
        System.out.println("Software Engineer: " + name + " | Gaji: " + calculateSalary(true));
    }
}

