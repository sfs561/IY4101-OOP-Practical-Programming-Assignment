public class Square extends Shape{
    private int side;

    public Square(int side, Coordinates coord){
        super(4, coord);
        this.side = side;
    }

    public double getArea(){
        return side * side;
    }

    public double getPerimeter(){
        return 4 * side;
    }

    public void scale(int factor, boolean sign){
        super.scale(factor, sign);

        if(sign){
            side = side * factor;
        }
        else{
            side = side / factor;
        }
    }

    public String display(){
        return "Square at " + getCoordinates().display() + ", side: " + side + ", area: " + getArea() + ", perimeter: " + getPerimeter();
    }
}
