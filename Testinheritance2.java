class Animal {
    void eat() {System.out.println("eating.....");}
    
}
class Dog extends Animal {
    void bark() {System.out.println("barking.....");} //command and property
}
class BabyDog extends Dog{
    void weep() {System.out.println("weeping.....");}
}
class Testinheritance2 { //main method class 
    public static void main (String args[]){
        BabyDog b = new BabyDog();
        b.eat();
        b.bark();
        b.weep();
             

    }
} 