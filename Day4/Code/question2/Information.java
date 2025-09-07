package Day4.Code.question2;
import java.util.Scanner;

class Student {
    public String name;
    private long id;
    private int marks;

    // Constructor sets base ID and default marks
    public Student() {
        this.id = 211001000000L;
        this.marks = 0;
    }

    // Setter for last 4 digits of ID
    public void setId(int last4Digits) {
        this.id += last4Digits;
    }

    // Getter for full ID
    public long getId() {
        return this.id;
    }

    // Setter for marks
    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Getter for marks
    public int getMarks() {
        return this.marks;
    }
}

public class Information {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student[] students = new Student[2];

        for (int i = 0; i < 2; i++) {
            students[i] = new Student();

            System.out.println("Enter name for student " + (i + 1) + ": ");
            students[i].name = sc.nextLine();

            System.out.println("Enter last 4 digits of ID for student " + (i + 1) + ": ");
            int last4 = Integer.parseInt(sc.nextLine());
            students[i].setId(last4);

            System.out.println("Enter marks for student " + (i + 1) + ": ");
            int marks = Integer.parseInt(sc.nextLine());
            students[i].setMarks(marks);

            System.out.println(); // Just for spacing
        }

        System.out.println("=== Student Details ===");
        for (int i = 0; i < 2; i++) {
            System.out.println("Student " + (i + 1));
            System.out.println("Name : " + students[i].name);
            System.out.println("ID   : " + students[i].getId());
            System.out.println("Marks: " + students[i].getMarks());
            System.out.println();
        }

        sc.close();
    }
}
