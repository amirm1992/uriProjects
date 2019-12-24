package academy.learnprogramming;

import java.util.Scanner;

public class Uri1002 {

    public static void main(String[] args) {
        // write your code here

        double N, R, A;
        Scanner sc = new Scanner(System.in);
        N = 3.14159;                     //take input for N
        R = sc.nextDouble();             //take input for R
        A = N * Math.pow(R, 2);                  //Basic summation X = A + B

        System.out.printf("A=%.4f%n", A);


    }
}
