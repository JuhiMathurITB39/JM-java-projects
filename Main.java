class Student {
    String name;
    int rollNumber;
    
    Student(String name, int rollNumber) {
    this.name = name;
    this.rollNumber = rollNumber;
    }
    
    public void displayDetails() {
    System.out.println("Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
    }
    }
    public class Main {
    public static void main(String[] args) {
    Student student = new Student("Juhi", 39);
    student.displayDetails();
    }
    }