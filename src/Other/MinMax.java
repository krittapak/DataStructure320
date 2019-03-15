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
public class MinMax {
    public static void main(String[] args) {
        System.out.println("Welcome to Max Min Program \n -------------------------------------");
        Scanner sc = new Scanner(System.in);
        NumberFormat formatter = new DecimalFormat("#0");
        int randomNumber= (int) (Math.random()*100);
        System.out.println(randomNumber);

        int myNum;
        String key = "";

        do {
            System.out.print("Input the Num : ");
            myNum = sc.nextInt();
            
            
            if (myNum==randomNumber) {
                System.out.println("True");
                break;
            }else if (myNum>randomNumber) {
                System.out.println("False - More");
            }else if (myNum<randomNumber) {
                System.out.println("False - Less");
            }else if(key.equals("R")){
                break;
            }

            
        } while (key.equalsIgnoreCase("R"));
        System.out.println("--------------------------\n Thank you");
    }
}
