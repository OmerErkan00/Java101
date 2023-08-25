package com.company;

import java.util.Scanner;

public class KullanıcıGirisi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String id = "id555";
        String password = "12345";

        System.out.print("Kullanıcı adı:");
        String idCheck = sc.next();

        System.out.print("Şifre:");
        String passwordCheck = sc.next();

        if (idCheck.equals(id)  && passwordCheck.equals(password) ){
            System.out.println("Giriş yaptınız.");
        }else {
            System.out.println("Hatalı giriş.");
            System.out.print("Şifrenizi sıfırmalamak ister misiniz?(evet/hayır)");
        }
        String passwordReset = sc.next();
        if (passwordReset.equals("evet")){
            System.out.print("Yeni şifrenizi giriniz:");

        }else if (passwordReset.equals("hayır")){
            System.out.println("Programı tekrar çalıştırıp bilgilerinizi tekrar giriniz.");
            System.exit(0);
        }
        String newPassword = sc.next();
        if (newPassword.equals(password)){
            System.out.println("Şifre oluşturulamadı. Lütfen başka şifre deneyiniz.");
        }else {
            System.out.println("Şifre oluşturuldu.");
        }
    }
}
