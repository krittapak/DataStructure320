/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Other;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 *
 * @author KRITTAPAK
 */
public class star {

    public static void main(String[] args) {
        System.out.println("Welcome to Calculated Weight on Star \n -------------------------------------");
        Scanner sc = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0.00");

        String p;

        do {
            System.out.print("Input the star that you want to calculate : ");
            String starName = "";
            double gc = 0;
            double starWeight;

            starName = sc.next();
            System.out.print("");

            switch (starName.toLowerCase()) {
                case "mercury":
                    gc = 0.4;
                    break;
                case "saturn":
                    gc = 1.1;
                    break;
                    case "venus":
                    gc = 0.9;
                    break;
                case "jupiter":
                    gc = 2.5;
                    break;
            }
            double starMass;
            System.out.print("Input the star Mass : ");
            starMass = sc.nextDouble();
            starWeight = gc * starMass;
            System.out.println("Mass : " + formatter.format(starWeight));

            System.out.print("Type R to Restart or Other to close : ");
            p = sc.next();
        } while (p.equals("R"));
        System.out.println("--------------------------\n Thank you");
    }
}
