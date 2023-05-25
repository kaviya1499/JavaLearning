/*Singleton Pattern says that just"define a class that has only one instance and provides a global point of access to it".
        In other words, a class must ensure that only single instance should be created and single object can be used by all other classes.*/


class Singleton{
    static Singleton sin ;
    private Singleton(){

    }

    public static Singleton getInstances() {
        if(sin == null){
            sin = new Singleton();

        }
        return sin;
    }
}


public class SingletonExample {
    public static void main(String[] args){
        Singleton s= Singleton.getInstances();
        Singleton s1= Singleton.getInstances();
        System.out.println("First object"+s);
        System.out.println("Second object"+s1);
    }
}
