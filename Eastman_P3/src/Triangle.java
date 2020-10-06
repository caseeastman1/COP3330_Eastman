public class Triangle extends Shape2D {
    public String Name;
    public double Area;

    public Triangle(double lengthTriangle, double heightTriangle) {

        Name = "triangle";
        super.setName(Name);
        super.setLengthTriangle(lengthTriangle);
        super.setHeightTriangle(heightTriangle);
        Area = (lengthTriangle * heightTriangle) / 2;
        super.setArea(Area);


    }






}
