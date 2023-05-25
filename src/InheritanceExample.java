//Single Inheritance

class Animal{

    void name() {
        System.out.println("Animal Characters");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dog is barking");
    }
        }





public class InheritanceExample {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.bark();
        dog.name();
    }
}
