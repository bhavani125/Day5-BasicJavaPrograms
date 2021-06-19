package Programs;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a: ");
        double a= sc.nextDouble();
        System.out.println("enter b: ");
        double b = sc.nextDouble();
        System.out.println("enter c: ");
        double c = sc.nextDouble();
        // call the delta function
        double deltaValue = delta(a,b,c);
        System.out.println("delta value is:" + deltaValue );

        double root11 = root1(deltaValue, a,b);
        System.out.println("root 1 :" + root11);

        double root21 = root2(deltaValue, a,b);
        System.out.println("root 2 :" + root21);

    }
    private static double delta(double a,double b,double c) {
        double delta = (b*b)-(4*a*c);
        return delta;
    }

    private static double root1(double deltaVal, double a, double b) {
        double root1 = (-b + Math.sqrt(deltaVal))/(2*a);
        return root1;
    }
    private static double root2(double deltaVal, double a, double b) {
        double root2 = (-b + Math.sqrt(deltaVal)) / (2*a);
        return root2;
    }
}
