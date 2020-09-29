import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class App {
    public static Scanner sc;
    public static String answer;
    public static double getUserHeight() {

        Scanner inches = new Scanner(System.in);
        System.out.println("How tall are you? (In inches): \n");

        double height = inches.nextDouble();

        return(height);


    }






    public static double getUserWeight(){

        Scanner pounds = new Scanner(System.in);
        System.out.println("Enter your weight in pounds : \n");

        double weight = pounds.nextDouble();
        if(weight <= 0){
            System.out.println("You must enter a positive value.");
            return 0;
        }
        return(weight);
    }
    

  public static boolean moreInput(){
        sc =  new Scanner(System.in);
        System.out.println("Enter Y to start the program.\nEnter N to exit the program.");
        answer = sc.nextLine();
        if(answer.equals("y"))
            return true;
        else
            return false;
  }

    public static void main(String[] args) {
        ArrayList<BodyMassIndex> bmiData = new ArrayList<BodyMassIndex>();

        while (moreInput()) {
            double height = getUserHeight();
            double weight = getUserWeight();

            BodyMassIndex bmi = new BodyMassIndex(height, weight);
            bmiData.add(bmi);

            displayBmiInfo(bmi);
        }

        displayBmiStatistics(bmiData);


    }

    public static void displayBmiInfo(BodyMassIndex bmi){
        System.out.println("Your BMI is: " + BodyMassIndex.bmi);


    }

    public static void displayBmiStatistics(ArrayList<BodyMassIndex> bmiData){
        for(BodyMassIndex x: bmiData){
            System.out.println(BodyMassIndex.bmi);
        }
    }



}
