public class Shape {
    private Coordinates position;
    private int sides;

    public Shape(int noOfSides, Coordinates coord) {
        this.position = coord;
        this.sides = noOfSides;
    }

    public Coordinates getCoordinates(){
        return position;
    }

    public int getSide(){
        return sides;
    }

    public void setCoordinates(Coordinates newcoord){
        this.position = newcoord;
    }

    public void translate(int dx, int dy){
        position.translate(dx, dy);
    }

    public void scale(int factor, boolean sign){
        position.scale(factor, sign);
    }

    public double getArea(){
        return 0.0;
    }

    public double getPerimeter(){
        return 0.0;
    }

    public String display(){
        return "Shape with " + sides + " sides, Position: " + position.display();
    }



}