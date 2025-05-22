package posttest;

import DataScientist;
import Employee;
import Intern;
import SoftwareEngineer;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new SoftwareEngineer("Ardya"),
            new DataScientist("Viesto"),
            new Intern("Vallery")
        };

        System.out.println("=== Data Karyawan ===");
        for (Employee emp : employees) {
            emp.displayInfo();
        }
    }
}

