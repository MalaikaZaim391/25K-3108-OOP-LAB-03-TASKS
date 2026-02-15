package postlab3;

public class Computer {
    //data members
    int systemId;
    String processorType;
    double ramSize;
    String operatingSystem;

    //default constructor automatically created by system
    //parameterized constructor below
    Computer (int id, String type, double ram, String opSys){
        this.operatingSystem = opSys;
        this.systemId = id;
        this.processorType = type;
        this.ramSize = ram;
    }

    //display method
    void display(){
        System.out.println("System ID: " + systemId);
        System.out.println("Processor Type: " + processorType);
        System.out.println("Ram Size: " + ramSize + " GB");
        System.out.println("Operating System: " + operatingSystem);
        System.out.println("---------------------------");
    }

    public static void main(String[] args){

        Computer c1 = new Computer(324151, "Intel i7", 64.5, "Windows");
        System.out.println("\nComputer 01");
        c1.display();

        Computer c2 = new Computer(324153, "Apple M2", 16.0, "macOS");
        System.out.println("\nComputer 02");
        c2.display();

        Computer c3 = new Computer(324154, "Intel i5", 8.0, "Ubuntu Linux");
        System.out.println("\nComputer 03");
        c3.display();

        Computer c4 = new Computer(324155, "AMD Ryzen 5", 16.0, "Windows 10");
        System.out.println("\nComputer 04");
        c4.display();


    }


}
