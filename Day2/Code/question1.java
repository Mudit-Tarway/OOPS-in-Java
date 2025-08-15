package Day2.Code;
class Student {
    private String name;
    private int roll_no;
    private int year;
    private String course;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int roll_no) {
        this.roll_no = roll_no;
    }

    public int getRollNo() {
        return roll_no;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getCourse() {
        return course;
    }
}

public class question1 {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Shivam Kumar");
        student.setRollNo(562);
        student.setYear(2025);
        student.setCourse("Computer Science");

        // Printing values using getters
        System.out.println("Name: " + student.getName());
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Year: " + student.getYear());
        System.out.println("Course: " + student.getCourse());
    }
}
