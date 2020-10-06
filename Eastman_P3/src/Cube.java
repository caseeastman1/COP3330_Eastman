public class Cube extends Shape3D {
    public double Area;
    public String Name;
    public double Volume;

    public Cube (double lengthCube) {
        Name = "cube";
        super.setName(Name);
        super.setLengthCube(lengthCube);
        Area = 6 * (lengthCube * lengthCube);
        super.setArea(Area);
        Volume = (lengthCube * lengthCube * lengthCube);
        super.setVolume(Volume);
    }








}
