

public class BodyMassIndex {
    public static double bmi;
    public double average;


    public BodyMassIndex(double height, double weight){

        bmi = (703 * weight) / (height * height);

        if(bmi <= 18.5)
            System.out.println("Underweight");
        else if (bmi > 18.5 && bmi <= 24.9)
            System.out.println("Normal weight");
        else if(bmi >= 25.0 && bmi <= 29.9)
            System.out.println("Overweight");
        else if(bmi >= 30.0)
            System.out.println("Obesity");

    }
}
