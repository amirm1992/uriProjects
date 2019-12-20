package academy.learnprogramming;

import java.util.Scanner;

public class Uri1006 {

    public static void main(String[] args) {
        // write your code here

        float A,B,C;
        Scanner sc = new Scanner(System.in);
        A = sc.nextFloat();
        B = sc.nextFloat();
        C = sc.nextFloat();
        float MEDIA;
        MEDIA = (A * 2 + B * 3 + C * 5)/10;

        System.out.printf("MEDIA = %.1f\n",MEDIA);


    }
}
