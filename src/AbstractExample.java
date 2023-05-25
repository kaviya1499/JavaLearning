/*
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

**********************
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.
*/


abstract class  AnimalAbstract{

        String Name;
          abstract void sound();
          public void setName(String Name){
              this.Name=Name;
          }

          public void Dispaly(){
              System.out.println("Name : "+Name);
          }

 }
 class Dogs extends AnimalAbstract{
    public void sound(){
        System.out.println("Dog barks");
    }
 }
class Cats extends AnimalAbstract{
    public void sound(){
        System.out.println("Cat Meows");
    }
}

public class AbstractExample {
    public static void main(String[] args){
        Dogs d= new Dogs();
        d.setName("Tommy");
        d.Dispaly();
        d.sound();

        Cats c = new Cats();
        c.setName("Jo");
        c.Dispaly();
        c.sound();
    }
}
