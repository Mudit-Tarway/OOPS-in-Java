import java.util.*;
public class employee {
    private String name;
    private String eId;
    private double salary;
    private double bonus;

    // Constructor
    public employee(String name, String eId, double salary) {
        this.name = name;
        this.eId = eId;
        this.salary = salary;
        this.bonus = 0.0;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getEId() {
        return eId;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEId(String eId) {
        this.eId = eId;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    // Method to calculate bonus based on performance rating
    public void calculateBonus(String performanceRating) {
        performanceRating = performanceRating.toLowerCase();
        double percentage;

        switch (performanceRating) {
            case "excellent":
                percentage = 0.20; 
                break;
            case "good":
                percentage = 0.10; 
                break;
            case "average":
                percentage = 0.05; 
                break;
            default:
                percentage = 0.0;  
        }

        this.bonus = salary * percentage;
    }

    // Display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + eId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary (with bonus): " + (salary + bonus));
    }

// Main class to test
    public static void main(String[] args) {
        employee emp1 = new employee("Mohan", "ME101", 500000);

        emp1.calculateBonus("Excellent");
        emp1.displayEmployeeDetails();

        System.out.println();

        employee emp2 = new employee("Bob", "E102", 40000);
        emp2.calculateBonus("Good");
        emp2.displayEmployeeDetails();
    }
}
