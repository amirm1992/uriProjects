package academy.learnprogramming;

import java.util.Scanner;

public class Uri1011 {

    public static void main(String[] args) {

        double R, Pi, V;
        Scanner sc = new Scanner(System.in);
        R = sc.nextDouble();
        Pi = 3.14159;
        V = (4.0 / 3) * Pi * Math.pow(R, 3);

        System.out.printf("VOLUME = %.3f\na", V);

    }

}
