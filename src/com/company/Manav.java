package com.company;

import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        int patlıcan = 5;

        double a;
        double e;
        double d;
        double m;
        int p;

        System.out.print("Armut kaç kilo ? :");
        a = input.nextInt();
        System.out.print("Elma kaç kilo ? :");
        e = input.nextInt();
        System.out.print("Domates kaç kilo ? :");
        d = input.nextInt();
        System.out.print("Muz kaç kilo ? :");
        m = input.nextInt();
        System.out.print("Patlıcan kaç kilo ? :");
        p = input.nextInt();

        System.out.println("Toplam Tutar :"+ (a*armut + e*elma + d*domates + m*muz + p*patlıcan));
    }
}
