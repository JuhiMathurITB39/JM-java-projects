class Vehicle{
    void run() {System.out.println("bike is running");}

}

class Bike2 extends Vehicle{
    void run() {System.out.println("bike safe");}
    public static void main(String args[]){
        Bike2 obj=new Bike2();
        obj.run();
    }

}