<<<<<<< HEAD
public class Sphere extends Shape3D {
    public double Volume;
    public double Area;
    public String Name;


    public Sphere(double radiusSphere) {

        Name = "sphere";
        super.setName(Name);
        super.setRadiusSphere(radiusSphere);
        Area = 4 * Math.PI * (radiusSphere * radiusSphere);
        super.setArea(Area);
        Volume = (4.0 / 3.0) * Math.PI * (radiusSphere * radiusSphere * radiusSphere);
        super.setVolume(Volume);

    }









}
=======
public class Sphere extends Shape3D {
    public double Volume;
    public double Area;
    public String Name;


    public Sphere(double radiusSphere) {

        Name = "sphere";
        super.setName(Name);
        super.setRadiusSphere(radiusSphere);
        Area = 4 * Math.PI * (radiusSphere * radiusSphere);
        super.setArea(Area);
        Volume = (4.0 / 3.0) * Math.PI * (radiusSphere * radiusSphere * radiusSphere);
        super.setVolume(Volume);

    }









}
>>>>>>> f5ca1c0bdbd51d3ecd7d85edf75bbc60488c9ac3
