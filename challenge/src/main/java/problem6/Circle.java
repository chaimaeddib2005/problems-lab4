package problem6;
import java.math.*;
public class Circle extends Forme{
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public double getSurface(){
        return Math.PI * radius * radius;
    }
    public String toString(){
        return "Circle(radius "+radius+" cm)";
    }
}
