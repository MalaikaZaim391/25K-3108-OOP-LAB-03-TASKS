package postlab3;

public class Mobile {
    String brandName;
    String model;
    double price;

    //default constructor
    Mobile(){
        brandName = "None";
        model = "None";
        price = 0.00;
    }

    //parameterized constructor
    Mobile(String name, String mod, double pr){
        this.brandName = name;
        this.model = mod;
        this.price = pr;
    }

    //display func
    void display(){
        System.out.println("Brand Name: " + brandName);
        System.out.println("Mobile Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("---------------------------");
    }

    //main method
    public static void main(String[] args){
        Mobile m1 = new Mobile();
        //obj using default constructor, displayed
        System.out.println("\nWith no-argument Constructor");
        m1.display();
        Mobile m2 = new Mobile("Iphone","16 pro max",3680.25);
        //obj using parameterized constructor, displayed
        System.out.println("\nWith parameterized Constructor");
        m2.display();
    }

}



