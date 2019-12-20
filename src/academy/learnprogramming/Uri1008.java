package academy.learnprogramming;

import java.util.Scanner;

public class Uri1008 {

    public static void main(String[] args) {
        // write your code here

        int ID,H,NUMBER;
        float PH,Salary;
        Scanner sc = new Scanner(System.in);
        ID = sc.nextInt();
        H = sc.nextInt();
        PH = sc.nextFloat();
        Salary = H * PH;

        System.out.println("NUMBER = "+ ID);
        System.out.printf("SALARY = U$ %.2f\n",Salary);

    }
}
