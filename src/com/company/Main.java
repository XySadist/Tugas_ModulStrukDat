package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        double alas,tinggi;
        int choice;
        Scanner input = new Scanner(System.in);


    do {
    System.out.println("==== HITUNG LUAS SEGITIGA ====");
    System.out.println("Pilih jenis Input: ");
    System.out.println("1. angka Bulat");
    System.out.println("2. angka pecahan");
    System.out.print("Masukan Pilihan  1/2: ");
    choice = input.nextInt();
    }while(choice !=1 && choice != 2);
        if (choice == 1) {
            System.out.print("Masukkan nilai alas (angka bulat): ");
            alas = input.nextInt();
            System.out.print("Masukkan nilai tinggi (angka bulat): ");
            tinggi = input.nextInt();
        } else {
            System.out.print("Masukkan nilai alas (angka pecahan): ");
            alas = input.nextDouble();
            System.out.print("Masukkan nilai tinggi (angka pecahan): ");
            tinggi = input.nextDouble();
        }


        Segitiga<? extends Number> segitiga = new Segitiga<>(alas, tinggi);

        do {
            System.out.println("mau menmpilakan dalam bentuk?: ");
            System.out.println("1. Integer");
            System.out.println("2. Double");
            System.out.print("Pilihan: ");
            choice = input.nextInt();
        } while (choice != 1 && choice != 2);

        if (choice == 1) {
            int luasAsInt = segitiga.getResultAsInt();
            System.out.println("Luas segitiga (dalam tipe int): " + luasAsInt);
        } else {
            double luasAsDouble = segitiga.getResultAsDouble();
            System.out.println("Luas segitiga (dalam tipe double): " + luasAsDouble);
        }




    }
}
