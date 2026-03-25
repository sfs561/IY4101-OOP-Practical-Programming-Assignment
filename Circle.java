public class Circle extends Shape{

    private int radius;

    public Circle(int radius, Coordinates coord){
        super(0,coord);
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public void scale(int factor, boolean sign){
        super.scale(factor, sign);

        if(sign){
            radius = radius * factor;
        }
        else{
            radius = radius / factor;
        }
    }

    public String display(){
        return "Circle at " + getCoordinates().display() + ", radius: " + radius + ", area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
