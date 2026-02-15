package postlab3;

public class Programmer {
    //data members
    int id;
    String name;
    String prefProgLang;
    int problemsSolved;

    //parameterized instructor
    Programmer(int ID, String username, String progLang, int probSolved){
        this.id = ID;
        this.name = username;
        this.prefProgLang = progLang;
        this.problemsSolved = probSolved;
    }

    //method to update problems
    void UpdateProblemsSolved(int updatedProbSolved){
        this.problemsSolved = updatedProbSolved;
    }

    //display method
    void display(){
        System.out.println("User's ID: " + id);
        System.out.println("User's Name: " + name);
        System.out.println("Preferred Programming Language: " + prefProgLang);
        System.out.println("Problems Solved: " + problemsSolved);
    }

    public static void main(String[] args){
        Programmer p1 = new Programmer(3241, "Paul Coelho", "Python", 72);
        System.out.println("\nProgrammer 1 - before update");
        p1.display();
        p1.UpdateProblemsSolved(85);
        System.out.println("\nProgrammer 1 - after update");
        p1.display();
        System.out.println("---------------------------");


        Programmer p2 = new Programmer(4001, "Sara Liam", "Java", 56);
        System.out.println("\nProgrammer 2 - before update");
        p2.display();
        p2.UpdateProblemsSolved(60);
        System.out.println("\nProgrammer 2 - after update");
        p2.display();
        System.out.println("---------------------------");


        Programmer p3 = new Programmer(7980, "Maya Croft", "Typescript", 98);
        System.out.println("\nProgrammer 3 - before update");
        p3.display();
        p3.UpdateProblemsSolved(46);
        System.out.println("\nProgrammer 3 - after update");
        p3.display();
        System.out.println("---------------------------");



    }

}
