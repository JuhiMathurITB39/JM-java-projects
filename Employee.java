class Animal {
    void eat() {System.out.println("eating.....");}
    void hit() {System.out.println("hitting.....");}
}
class Dog extends Animal {
    void bark() {System.out.println("barking.....");} //command and property
}
class TestInheritance{ //main method class 
    public static void main (String args[]){
        Dog d=new Dog();
        Animal a=new Animal();
        d.bark();
        d.eat();
        a.eat();
        a.hit();

    }
} 