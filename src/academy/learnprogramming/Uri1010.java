package academy.learnprogramming;

import java.util.Scanner;

public class Uri1010 {

    public static void main(String[] args) {
        // write your code here

        //Product 1
        int Prod1_ID,Prod1_Q;
        double Prod1_Price;
        //Product 2
        int Prod2_ID,Prod2_Q;
        double Prod2_Price;
        //Value To Pay
        double Valor;

        Scanner sc = new Scanner(System.in);

        //Start of Product 1
        Prod1_ID = sc.nextInt();
        Prod1_Q = sc.nextInt();
        Prod1_Price = sc.nextDouble();

        //Start of Product 2
        Prod2_ID = sc.nextInt();
        Prod2_Q = sc.nextInt();
        Prod2_Price = sc.nextDouble();

        // Caluclating Value to Pay (Product of Price & Quantity)
        Valor = (Prod1_Price * Prod1_Q) +(Prod2_Price * Prod2_Q);

        //Printing Valor
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",Valor);

    }

}
