package shapes;

public class Rectangle {

    //ivars (global variables)
    public String color;
    public int width;
    public int height;
    private String name;

    //Getter
    public String getName(){
        return name;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }

    //Constructor
    public Rectangle(String color, int width, int height){
        this.color = color;
        this.width = width;
        this.height = height;
    }

    //Another Constructor
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    //Default Constructor (A different constructor is chosen based on the type and amount of input)
    public Rectangle(){
        this(40,50);
    }

    //Method
    public void calcArea(){
        System.out.println(this.width * this.height);
    }

    public static void addObject(String color, int xAxis, int yAxis){
        System.out.println("Added a "+color+" rectangle to position "+xAxis+" (x axis) on "+yAxis+" (y axis)");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
