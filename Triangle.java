public class Triangle extends Shape{

    private Coordinates p1;
    private Coordinates p2;
    private Coordinates p3;

    public Triangle(Coordinates p1, Coordinates p2, Coordinates p3){
        super(3, p1);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double getPerimeter(){
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);

        return a + b + c;
    }

    public double getArea(){
        double a = p1.distance(p2);
        double b = p2.distance(p3);
        double c = p3.distance(p1);
        double s = (a+b+c)/2.0;

        return Math.sqrt(s*(s-a)*(s-b)*(s-c));
    }

    public void translate(int dx, int dy){
        p1.translate(dx, dy);
        p2.translate(dx, dy);
        p3.translate(dx, dy);

        setCoordinates(p1);
    }
    public void scale(int factor, boolean sign){
        p1.scale(factor, sign);
        p2.scale(factor, sign);
        p3.scale(factor, sign);

        setCoordinates(p1);
    }

    public String display(){
        return "Triangle with vertices: " + p1.display() + " and " + p2.display() + " and " + p3.display() + ", area is " + getArea() + ", perimeter is " + getPerimeter();
    }

}
