package shapes;

public class Circle {
    private int radius;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Circle(int radius){
        this.radius = radius;
    }

    public void calcArea(){
        System.out.println(3.14*(radius*radius));
    }

    public void calcPerimeter(){
        System.out.println(2*3.14*radius);
    }
}
