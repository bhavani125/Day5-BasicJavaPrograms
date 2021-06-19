package Programs;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit: ");
        double t = sc.nextDouble();
        System.out.println("Enter a wind speed in miles per her: ");
        double v = sc.nextDouble();
        double windchill = 35.74 + (0.6215 * t) +((0.4275 * t - 35.75) * (Math.pow(v,0.16)));
        System.out.printf("Wind chill is : %.2f", windchill);
        }
    }

