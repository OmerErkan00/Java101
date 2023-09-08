package com.company;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n";

        System.out.println(menu);
        int islem = sc.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Toplamak istediğiniz iki değeri giriniz: ");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(sum(a, b));
                break;
            case 2:
                System.out.println("Çıkarmak istediğiniz iki değeri giriniz: ");
                int c = sc.nextInt();
                int d = sc.nextInt();
                System.out.println(subtract(c, d));
                break;
            case 3:
                System.out.println("Çarpmak istediğiniz iki değeri giriniz: ");
                int e = sc.nextInt();
                int f = sc.nextInt();
                System.out.println(subtract(e, f));
                break;
            case 4:
                System.out.println("Bölmek istediğiniz iki değeri giriniz: ");
                int g = sc.nextInt();
                int h = sc.nextInt();
                System.out.println(subtract(g, h));
                break;
            case 5:
                System.out.println("Üslü sayı hesabı için taban giriniz: ");
                int base = sc.nextInt();
                System.out.println("Üslü sayı hesabı için üs giriniz: ");
                int power = sc.nextInt();
                powered(base, power);
                break;
            case 6:
                System.out.println("Faktoriyel hesabı için sayı giriniz: ");
                int factor = sc.nextInt();
                factorial(factor);
                break;
            case 7:
                System.out.println("Mod almak istediğiniz iki değeri giriniz: ");
                int k = sc.nextInt();
                int l = sc.nextInt();
                System.out.println(mod(k , l));
                break;
            case 8:
                System.out.println("Uzun kenar uzunluğunu giriniz: ");
                int longer = sc.nextInt();
                System.out.println("Kısa kenar uzunluğunu giriniz: ");
                int shorter = sc.nextInt();
                circleAreaPerimeter(longer , shorter);
                break;
            default:
                System.out.println("Yanlış değer girdiniz.");
        }

    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int subtract(int c, int d) {
        return c - d;
    }

    public static int times(int e, int f) {
        return e * f;
    }

    public static int divide(int g, int h) {
        return g / h;
    }

    public static void powered(int base, int power) {
        int result = 1;
        for (int i = 0 ; i < power ; i++){
            result *= base;
        }
        System.out.println("Sonuç : " +result);
    }

    public static void factorial(int factor) {
        int result = 1;

        for (int i = 1; i <= factor; i++) {
            result *= i;
        }
        System.out.println("Sonuç : " + result);
    }
    public static int mod (int k , int l){
        return k % l;
    }
    public static void circleAreaPerimeter (int longer , int shorter){
        System.out.println("Çevre : " + (longer + shorter) * 2);
        System.out.println("Alan : " + longer * shorter);
    }
}

