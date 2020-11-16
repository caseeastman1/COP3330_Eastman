<<<<<<< HEAD
public class Pyramid extends Shape3D {
    public double Volume;
    public double Area;
    public String Name;


    public Pyramid(double lengthPyramid, double widthPyramid, double heightPyramid){
        Name = "pyramid";
        super.setName(Name);
        super.setLengthPyramid(lengthPyramid);
        super.setWidthPyramid(widthPyramid);
        super.setHeightPyramid(heightPyramid);
        Area = (lengthPyramid * widthPyramid) + (lengthPyramid * Math.sqrt(Math.pow(widthPyramid / 2, 2) + Math.pow(heightPyramid, 2))) + (widthPyramid * Math.sqrt(Math.pow(lengthPyramid / 2, 2) + Math.pow(heightPyramid, 2)));
        super.setArea(Area);
        Volume = (lengthPyramid * widthPyramid * heightPyramid) / 3;
        super.setVolume(Volume);
    }










}
=======
public class Pyramid extends Shape3D {
    public double Volume;
    public double Area;
    public String Name;


    public Pyramid(double lengthPyramid, double widthPyramid, double heightPyramid){
        Name = "pyramid";
        super.setName(Name);
        super.setLengthPyramid(lengthPyramid);
        super.setWidthPyramid(widthPyramid);
        super.setHeightPyramid(heightPyramid);
        Area = (lengthPyramid * widthPyramid) + (lengthPyramid * Math.sqrt(Math.pow(widthPyramid / 2, 2) + Math.pow(heightPyramid, 2))) + (widthPyramid * Math.sqrt(Math.pow(lengthPyramid / 2, 2) + Math.pow(heightPyramid, 2)));
        super.setArea(Area);
        Volume = (lengthPyramid * widthPyramid * heightPyramid) / 3;
        super.setVolume(Volume);
    }










}
>>>>>>> f5ca1c0bdbd51d3ecd7d85edf75bbc60488c9ac3
