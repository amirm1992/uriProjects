package academy.learnprogramming;

import java.util.Scanner;

public class Uri1009 {

    public static void main(String[] args) {
        // write your code here


        double S,C,T,Total,Prc;
        String ID;
        Scanner sc = new Scanner(System.in);
        ID = sc.next();
        S = sc.nextDouble();
        T = sc.nextDouble();
        Prc =0.15;                             //  <--- Constant %
        Total = S+ (Prc * T);

        System.out.printf("TOTAL = R$ %.2f\n",Total);

    }
}
