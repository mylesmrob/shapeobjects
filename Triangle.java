package shapes;

public class Triangle {
    private int height;
    private int base;
    private int sideA;
    private int sideB;
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Triangle(int height, int base, int sideA, int sideB){
        this.height = height;
        this.base = base;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public void calcArea(){
        System.out.println((0.5*base)*height);
    }

    public void calcPerimeter(){
        System.out.println(base+sideA+sideB);
    }
}
