import java.util.Scanner;

public class Encrypter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int d1 = number / 1000 % 10;
        int d2 = number / 100 % 10;
        int d3 = number / 10 % 10;
        int d4 = number % 10;

        int d5 = 0;
        int d6 = 0;
        int d7 = 0;
        int d8 = 0;

        if(d1 + 7 < 10) {
            d5 = d1 + 7;
        }
        else
        {
            d5 = (d1 + 7) % 10;
        }

        if(d2 + 7 < 10){
            d6 = (d2 + 7) % 10;
        }
        else
        {
            d6 = (d2 + 7) % 10;
        }

        if(d3 + 7 < 10)
        {
            d7 = d3 + 7;
        }
        else
        {
            d7 = (d3 + 7) % 10;
        }

        if(d4 + 7 < 10)
        {
            d8 = d4 + 7;
        }
        else
        {
            d8 = (d4 + 7) % 10;
        }



        System.out.println(d7 + "" + d8 + "" + d5 + "" + d6);
        System.out.println(d5 + "" + d6 + "" + d7 + "" + d8);
    }
}

