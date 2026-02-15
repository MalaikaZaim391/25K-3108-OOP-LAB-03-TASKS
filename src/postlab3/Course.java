package postlab3;

public class Course {
    //data members
    String courseCode;
    String courseName;
    int creditHrs;

    //parameterized constructor only, default already exists (auto)
    Course(String code, String name, int hrs){
        this.courseCode = code;
        this.courseName = name;
        this.creditHrs = hrs;
    }

    //display method
    void display(){
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credit Hours: " + creditHrs);
        System.out.println("---------------------------");
    }

    public static void main(String[] args){

        Course c1 = new Course("MVC201","Multi-variable Calculus", 3);
        System.out.println("\nCourse 01");
        c1.display();

        Course c2 = new Course("OOP101","Object oriented Programming", 4);
        System.out.println("\nCourse 02");
        c2.display();

        Course c3 = new Course("PST201","Pakistan Studies", 2);
        System.out.println("\nCourse 03");
        c3.display();

    }

}
