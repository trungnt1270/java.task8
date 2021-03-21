package task8;

public class Circle {
    private double radius;

    public Circle(){
        radius = 1.0;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return radius*radius*Math.PI;
    }

    public String toString(){
        return "Circle[radius=" + radius + "]";
    }
}
