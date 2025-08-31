class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Constructor
    public Member(String name, int age, String phoneNumber, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
    }

    // Method to print salary
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
    }
}

// Employee class inheriting Member
class Employee extends Member {
    String specialization;

    public Employee(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        super(name, age, phoneNumber, address, salary);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }
}

// Manager class inheriting Member
class Manager extends Member {
    String department;

    public Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        super(name, age, phoneNumber, address, salary);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

// Test class with main method
public class Salary {
    public static void main(String[] args) {
        // Creating Employee object
        Employee emp = new Employee("Mohan", 28, "9876543215", "Delhi", 50000.0, "Software Development");

        // Creating Manager object
        Manager mgr = new Manager("Shyam", 35, "9123456719", "Pune", 90000.0, "IT");

        // Display Employee details
        System.out.println("Employee Details:");
        emp.displayDetails();

        System.out.println("\nManager Details:");
        mgr.displayDetails();
    }
}