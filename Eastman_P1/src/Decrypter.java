import java .util.Scanner;
public class Decrypter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        int d1 = number / 1000 % 10;
        int d2 = number / 100 % 10;
        int d3 = number / 10 % 10;
        int d4 = number % 10;

        int d5;
        int d6;
        int d7;
        int d8;

        if(d1 - 7 > 0) {
            d5 = d1 - 7;
        }
        else
        {
            d5 = (d1 - 7) + 8;
        }

        if(d2 - 7 > 0){
            d6 = (d2 - 7);
        }
        else
        {
            d6 = (d2 - 7) + 8;
        }

        if(d3 - 5 > 0)
        {
            d7 = d3 - 5;
        }
        else
        {
            d7 = (d3 -7) + 8;
        }

        if(d4 - 5 > 0)
        {
            d8 = d4 - 5;
        }
        else
        {
            d8 = (d4 - 7) + 8;
        }


        System.out.println(d5 + "" + d6 + "" + d7 + "" + d8);
    }
}
