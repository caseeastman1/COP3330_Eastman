public abstract class Shape{
    public String Name;
    public double Volume;
    public double lengthSquare;
    public double lengthTriangle;
    public double heightTriangle;
    public double radiusCircle;
    public double lengthCube;
    public double lengthPyramid;
    public double widthPyramid;
    public double heightPyramid;
    public double radiusSphere;

    public void setName(String Name){
        this.Name = Name;
    }


    public String getName() {
        return this.Name;
    }

    public void setVolume(double Volume) {
        this.Volume = Volume;
    }

    public double getVolume() {
        return this.Volume;
    }

    public void setLengthSquare(double lengthSquare) {
        this.lengthSquare = lengthSquare;
    }



    public void setLengthTriangle(double lengthTriangle) {
        this.lengthTriangle = lengthTriangle;
    }

    public void setHeightTriangle(double heightTriangle) {
        this.heightTriangle = heightTriangle;
    }



    public void setRadiusCircle(double radiusCircle) {
        this.radiusCircle = radiusCircle;
    }



    public void setLengthCube(double lengthCube) {
        this.lengthCube = lengthCube;
    }


    public void setLengthPyramid(double lengthPyramid) {
        this.lengthPyramid = lengthPyramid;
    }

    public void setWidthPyramid(double widthPyramid) {
        this.widthPyramid = widthPyramid;
    }

    public void setHeightPyramid(double heightPyramid) {
        this.heightPyramid = heightPyramid;
    }

    public void setRadiusSphere(double radiusSphere) {
        this.radiusSphere = radiusSphere;
    }


}
