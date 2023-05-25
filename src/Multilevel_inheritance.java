class Animals{
    void name(){
        System.out.println("Multilevel Example with Animal class");
    }
}
class Cat extends Animals{
    void meow(){
        System.out.println("cat sounds meow");
    }
}
class Kitten extends Cat{
    void baby(){
        System.out.println("cat's baby kitten");
    }
}

public class Multilevel_inheritance {
    public static void main(String[] args){
        Kitten kit = new Kitten();
        kit.name();
        kit.meow();
        kit.baby();
    }
}
