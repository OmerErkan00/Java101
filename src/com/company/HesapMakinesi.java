package com.company;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;

        System.out.print("Birinci sayıyı girin:");
        int number1 = sc.nextInt();

        System.out.print("İkinci sayıyı girin:");
        int number2 = sc.nextInt();

        System.out.print("işlem işareti seçin (+,-,*,/):");
        String sign = sc.next();

        switch (sign){
            case "+": total = number1 + number2;
            break;
            case "-": total = number1 - number2;
            break;
            case "*": total = number1 * number2;
            break;
            case "/": total = number1 / number2;
            break;
        }
        System.out.println("Sonuç:" + total);

    }
}
