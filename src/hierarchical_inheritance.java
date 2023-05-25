class Shape{
    void name(){
        System.out.println("Shapes Drawing");
    }
}
class Circle extends Shape{
    void draw(){
        System.out.println("draw a circle");
    }
}
class Rectangle extends Shape{
    void draw(){
        System.out.println("draw a Rectangle");
    }
}



public class hierarchical_inheritance {
    public static void main(String[] args){
        Circle c = new Circle();
        c.draw();
        Rectangle r = new Rectangle();
        r.draw();
    }
}
