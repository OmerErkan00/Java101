package com.company;

import java.util.Scanner;

public class BurcProgramı {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Doğduğunuz ayı giriniz :");
        int month = sc.nextInt();

        System.out.print("Doğduğunuz günü giriniz :");
        int day = sc.nextInt();



        if (month == 1){
            if ( day > 0 && day < 22 ){
                System.out.println("Oğlak");
            }else if (day > 21 && day < 32){
                System.out.println("Kova");
            }else System.out.println("Yanlış gün girdiniz");
        }
        if (month == 2){
            if ( day > 0 && day < 20 ){
                System.out.println("Kova");
            }else if (day > 19 && day < 29){
                System.out.println("Balık");
            }else System.out.println("Yanlış gün girdiniz");
        }
        if (month == 3){
            if ( day > 0  && day < 21 ){
                System.out.println("Balık");
            }else if (day > 20 && day < 32){
                System.out.println("Koç");
            }else System.out.println("Yanlış gün girdiniz");
        }
        if (month == 4){
            if ( day > 0 && day < 21 ){
                System.out.println("Koç");
            }else if (day > 20 && day < 31){
                System.out.println("Boğa");
            }else System.out.println("Yanlış gün girdiniz");
        }
        if (month == 5){
            if ( day > 0 && day < 22 ){
                System.out.println("Boğa");
            }else if (day > 21 && day < 32){
                System.out.println("İkizler");
            }else System.out.println("Yanlış gün girdiniz");
        }
        if (month == 6){
            if ( day > 0 && day < 23 ){
                System.out.println("İkizler");
            }else if (day > 22 && day < 31){
                System.out.println("Yengeç");
            }else System.out.println("Yanlış gün girdiniz");
        }
        if (month == 7){
            if ( day > 0 && day < 23 ){
                System.out.println("Yengeç");
            }else if (day > 22 && day < 32){
                System.out.println("Aslan");
            }else System.out.println("Yanlış gün girdiniz");
        }
        if (month == 8){
            if ( day > 0 && day < 23 ){
                System.out.println("Aslan");
            }else if (day > 22 && day < 32){
                System.out.println("Başak");
            }else System.out.println("Yanlış gün girdiniz");
        }
        if (month == 9){
            if ( day > 0 && day < 23 ){
                System.out.println("Başak");
            }else if (day > 22 && day < 31){
                System.out.println("Terazi");
            }else System.out.println("Yanlış gün girdiniz");
        }
        if (month == 10){
            if ( day > 0 && day < 23 ){
                System.out.println("Terazi");
            }else if (day > 22 && day < 32){
                System.out.println("Akrep");
            }else System.out.println("Yanlış gün girdiniz");
        }
        if (month == 11){
            if ( day > 0 && day < 22 ){
                System.out.println("Akrep");
            }else if (day > 21 && day < 31){
                System.out.println("Yay");
            }else System.out.println("Yanlış gün girdiniz");
        }
        if (month == 12){
            if ( day > 0 && day < 22 ){
                System.out.println("Yay");
            }else if (day > 21 && day < 32){
                System.out.println("Oğlak");
            }else System.out.println("Yanlış gün girdiniz");
        }
    }
}
