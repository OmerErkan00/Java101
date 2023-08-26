package com.company;

import java.util.Scanner;

public class LoopOdev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        System.out.print("Bir sayı giriniz :");
        double x = sc.nextInt();

        for (int i = 1; i <= x; i++){
            if ((i % 3 == 0) && (i % 4 == 0)){
                total++;
            }
        }
        double rate = total / x;
        System.out.println("Tüm sayıların 3 ve 4e bölünenlerin oranı " + rate);
    }
}
