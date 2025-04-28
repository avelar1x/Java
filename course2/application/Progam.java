package course2.application;

import course2.entities.Retangle;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Progam {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Retangle ret = new Retangle();

        System.out.println("Enter rectangle width and height");

        ret.Width = sc.nextDouble();
        ret.Height = sc.nextDouble();

        System.out.printf("Area = %.2f%n", ret.Area());
        System.out.printf("Perimeter = %.2f%n", ret.Perimeter());
        System.out.printf("Diagonal = %.2f%n", ret.Diagonal());

        sc.close();
    }

}
