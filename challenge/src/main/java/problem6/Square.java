package problem6;

public class Square extends Forme{
    private double Side;
    public Square(double Side){
        this.Side = Side;
    }
    public double getSide(){
        return Side;
    }
    public double getSurface(){
        return Side * Side;
    }
    public String toString(){
        return "Square(Side "+Side+" cm)";
    }
}

