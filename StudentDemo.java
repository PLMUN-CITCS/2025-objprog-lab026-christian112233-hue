class Student {
    int id;
    String name;
    double gpa;
    static int count = 0; // Static variable to track total students

    // Constructor
    Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        this.gpa = gpa;
        count++; // Increment count when a student is created
    }

    void display() {
        System.out.println("Student ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", 3.8);
        Student student2 = new Student(102, "Bob", 3.5);
        Student student3 = new Student(103, "Charlie", 3.9);

        student1.display();
        student2.display();
        student3.display();

        System.out.println("Total students: " + Student.count);
    }
}

