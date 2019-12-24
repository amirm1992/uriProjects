package academy.learnprogramming;

import java.util.Scanner;

public class Uri1007 {

    public static void main(String[] args) {
        // write your code here

        int A, B, C, D;
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int DIFERENCA;
        DIFERENCA = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + DIFERENCA);
    }
}
