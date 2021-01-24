package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner girdi = new Scanner(System.in);
        İnsan insan1 = new İnsan();
        System.out.println("İsim girin.\n");
        String İsim = girdi.nextLine();
        System.out.println("Doğum yılı girin.\n");
        int Yıl = girdi.nextInt();
        insan1.SetName(İsim);
        insan1.SetBirth(Yıl);
        System.out.println("İsim: " +insan1.GetName() +"\n" + "Yaş: " +insan1.GetBirth() );
        System.out.println("Maks Nabız: " + insan1.MaksNabız(Yıl) + "\n");
        System.out.println("İdeal Nabız  " + (insan1.MaksNabız(Yıl)*50)/100 + " İle " + (insan1.MaksNabız(Yıl)*85)/100 + " Arasındadır. ");
    }
}