package academy.learnprogramming;

import java.util.Scanner;

public class Uri1012 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double A, B, C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        // Area of triangle
        double Tri;

        Tri = (.5 * A) * (C);

        // Area of Circle
        double Circ;

        Circ = 3.14159 * Math.pow(C, 2);

        // Area of a Trapezium
        double Trap;

        Trap = (A + B) / 2 * (C);

        // Area of Square
        double Square;

        Square = Math.pow(B, 2);

        //Area of Rectangle
        double Rec;

        Rec = A * B;

        System.out.printf("TRIANGULO: %.3f\nCIRCULO: %.3f\nTRAPEZIO: %.3f\nQUADRADO: %.3f\nRETANGULO: %.3f\n", Tri, Circ, Trap, Square, Rec);


    }
}
