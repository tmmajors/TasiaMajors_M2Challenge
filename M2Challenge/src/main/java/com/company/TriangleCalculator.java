package com.company;

import java.util.Scanner;

public class TriangleCalculator {

        public static void main(String[] args) {

            Scanner myScanner = new Scanner(System.in);

            System.out.println("Triangle Calculator App" + "\n");
            System.out.println("Please enter the length of the adjacent side of the right triangle here: ");
            int adj = Integer.parseInt(myScanner.nextLine());

            System.out.println("Please enter the length of the opposite side of the right triangle here: ");
            int opp = Integer.parseInt(myScanner.nextLine());

            //calculate the hypotenuse (a^2 + b^2 = c^2)
            double hyp = Math.sqrt((adj * adj) + (opp * opp));
            System.out.println("The length of the hypotenuse is: " + hyp);

            //calculate the sine (SOH)
            double sin = opp / hyp;
            System.out.println("Sine: " + sin);

            //calculate the cosine (CAH)
            double cos = adj / hyp;
            System.out.println("Cosine: " + cos);

            //calculate the tangent (TOA)
            double tan = opp / adj;
            System.out.println("Tangent: " + tan);
        }
}
