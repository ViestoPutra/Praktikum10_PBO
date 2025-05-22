package posttest;

import Employee;

public class DataScientist extends Employee {
    public DataScientist(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 100000;
    }

    @Override
    public void displayInfo() {
        System.out.println("Data Scientist: " + name + " | Gaji: " + calculateSalary(true));
    }
}


