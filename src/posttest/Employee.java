package posttest;

public class Employee {
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return 0.0;
    }

    public double calculateSalary(boolean withBonus) {
        double base = calculateSalary();
        if (withBonus) {
            return base + 0.1 * base;
        }
        return base;
    }

    public void displayInfo() {
        System.out.println("Employee: " + name);
    }
}

