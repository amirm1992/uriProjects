package academy.learnprogramming;

import java.util.Scanner;

public class Uri1015 {

    public static void main(String[] args) {


        //Point 1
        double x1, y1;

        //Point 2
        double x2, y2;

        //Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        //Point 1 Input
        x1 = sc.nextDouble();
        y1 = sc.nextDouble();

        //Point 2 Input
        x2 = sc.nextDouble();
        y2 = sc.nextDouble();

        //Calculating Distance between 2 Points
        double Dist;
        Dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        //Print Distance 4th Decimal
        System.out.printf("%.4f\n", Dist);

    }









    }
