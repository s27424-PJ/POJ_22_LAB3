public class TestCircle {
    public static void main(String[] args){
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(5, "red");
        Circle circle4 = new Circle();
        circle4.setRadius(3.0);
        circle4.setColor("blue");

        System.out.println("The circle c1 has radius of " + circle1.getRadius() + " and area of " + circle1.getArea()+" and color of "+circle1.getColor());
        System.out.println(circle1);
        System.out.println("The circle c2 has radius of " + circle2.getRadius() + " and area of " + circle2.getArea()+" and color of "+circle2.getColor());
        System.out.println(circle2);
        System.out.println("The circle c3 has radius of " + circle3.getRadius() + " and area of " + circle3.getArea()+" and color of "+circle3.getColor());
        System.out.println(circle3);
        System.out.println("The circle c4 has radius of " + circle4.getRadius() + " and area of " + circle4.getArea()+" and color of "+circle4.getColor());
        System.out.println(circle4);
    }
}
