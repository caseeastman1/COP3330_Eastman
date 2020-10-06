public class Circle extends Shape2D {
    public double Area;
    public String Name;

    public Circle(double radiusCircle){
        Name = "circle";
        super.setName(Name);
        super.setRadiusCircle(radiusCircle);
        Area = Math.PI * (radiusCircle * radiusCircle);
        super.setArea(Area);

    }



}
