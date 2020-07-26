import practice.Calcarea;
import practice.Childarea;
import practice.Estmarea;

public class Area {
    public static void main(String[] args) {

        Calcarea triangle = new Calcarea();

        triangle.length = 5;
        triangle.breadth = 6;
        triangle.area = triangle.length * triangle.breadth;
        System.out.println("Area of Triangle is :" + triangle.area);


        Childarea square = new Childarea();

        square.setLength(10);
        square.setBreadth(10);
        System.out.println("Area of Square is :" + square.getLength() * square.getBreadth());

        square.area = square.getLength() * square.getBreadth();
        System.out.println("Area of Square is :" + square.area);



        // Calculate Area of Circle through Default Constructor.
        Estmarea circle = new Estmarea();
        System.out.println("Area of Circle is :"  + 3.14 * circle.getarea());


        // Calculate Area of Rectangle through  Constructor Overloading.
        Estmarea rectangle = new Estmarea(4.50, 5.50);
        System.out.println("Area of Rectangle is :" + 0.5 * rectangle.getarea());
    }

}