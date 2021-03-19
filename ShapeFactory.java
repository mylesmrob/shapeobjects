package shapes;

public class ShapeFactory {

    public static void main(String[] args) {
        Rectangle defaultRect = new Rectangle();
        defaultRect.color = "gray"; //Would be null otherwise
        System.out.println(defaultRect);
        defaultRect.calcArea();
        Rectangle colorfulRectangle = new Rectangle("red",100,200);
        colorfulRectangle.color = "pink";
        System.out.println(colorfulRectangle);
        colorfulRectangle.setName("pink rectangle");
        System.out.println(colorfulRectangle.getName());
        colorfulRectangle.calcArea();
        Rectangle.addObject("blue",300,100);

        Triangle newTri = new Triangle(50,100,25,20);
        newTri.setName("Weird Triangle");
        System.out.println(newTri.getName());
        newTri.calcArea();
        newTri.calcPerimeter();

        Circle newCircle = new Circle(50);
        newCircle.setName("Round Circle");
        System.out.println(newCircle.getName());
        newCircle.calcArea();
        newCircle.calcPerimeter();
    }
}
