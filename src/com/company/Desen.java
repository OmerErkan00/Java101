package com.company;

import java.util.Scanner;

public class Desen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("N sayısı: ");
        int i = sc.nextInt();
        add(sub(i) + 5 , i);

    }
    public static int sub (int i){
        System.out.print(i + " ");
        if (i > 0){
            return sub(i - 5);
        }
        return i;
    }
    public static int add (int j , int i){
        System.out.print(j + " ");
        if (j < i) {
            return add(j + 5 , i);
        }
        return j;
    }
}
