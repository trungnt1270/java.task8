public class Cylinder extends task8.Circle {
    private double height;

    public Cylinder(double radius, double height){
        super();
        this.height = height;
    }

    public double getHeight(){
        return this.height;
    }

    public double getVolumne(){
        return super.getArea()*height;
    }

    @Override
    public double getArea(){
        return 2.0*Math.PI*getRadius()*height;
    }

    @Override
    public String toString(){
        return "Cylinder[height=" + height + "," + super.toString() + "]";
    }
}
