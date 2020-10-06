public class Square extends Shape2D {
        public String Name;
        public double Area;


        public Square(double lengthSquare) {
            Name = "square";
            super.setName(Name);
            super.setLengthSquare(lengthSquare);
            Area = (lengthSquare * lengthSquare);
            super.setArea(Area);

        }




    }
