public class Rectangle extends Shape {

    private int width;
    private int length;

    public Rectangle(int width, int length, Coordinates coord) {
        super(4, coord);
        this.width = width;
        this.length = length;
    }
    public double getArea() {
        return width * length;
    }
    public double getPerimeter() {
        return 2 * (width + length);
    }

    public void scale(int factor, boolean sign){
        super.scale(factor, sign);
        if(sign){
            width *= factor;
            length *= factor;
        }
        else{
            width = width / factor;
            length = length / factor;
        }
    }
    public String display(){
        return "Rectangle at " +getCoordinates().display() + ", width: " + width + ", length: " + length + ", area: " + getArea()  + ", perimeter: " + getPerimeter();
    }

}
