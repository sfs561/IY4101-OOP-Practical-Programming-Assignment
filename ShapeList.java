import java.util.ArrayList;

public class ShapeList {

    private ArrayList<Shape> listOfShapes;

    public ShapeList() {
        listOfShapes = new ArrayList<Shape>();
    }

    public void addShape(Shape s) {
        listOfShapes.add(s);
    }

    public void translateShapes(int dx, int dy) {
        for (int i = 0; i < listOfShapes.size(); i++) {
            listOfShapes.get(i).translate(dx, dy);
        }
    }

    public Shape getShape(int pos) {
        if (pos >= 0 && pos < listOfShapes.size()) {
            return listOfShapes.get(pos);
        }
        return null;
    }

    public Shape removeShape(int pos) {
        if (pos >= 0 && pos < listOfShapes.size()) {
            return listOfShapes.remove(pos);
        }
        return null;
    }

    public double area(int pos) {
        if (pos >= 0 && pos < listOfShapes.size()) {
            return listOfShapes.get(pos).getArea();
        }
        return -1;
    }

    public void scale(int factor, boolean sign) {
        for (int i = 0; i < listOfShapes.size(); i++) {
            listOfShapes.get(i).scale(factor, sign);
        }
    }

    public double perimeter(int pos) {
        if (pos >= 0 && pos < listOfShapes.size()) {
            return listOfShapes.get(pos).getPerimeter();
        }
        return -1;
    }

    public int getNumberOfShapes() {
        return listOfShapes.size();
    }

    public String display() {
        String result = "";

        for (int i = 0; i < listOfShapes.size(); i++) {
            result = result + "Position " + i + ": " + listOfShapes.get(i).display() + "\n";
        }

        return result;
    }
}