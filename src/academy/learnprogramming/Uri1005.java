package academy.learnprogramming;

import java.util.Scanner;

public class Uri1005 {
    public static void main(String[] args) {
        // write your code here

        double A,B;
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        double MEDIA;
        MEDIA = (A * 3.5 + B * 7.5)/11;

        System.out.printf("MEDIA = %.5f\n",MEDIA);


    }
}
