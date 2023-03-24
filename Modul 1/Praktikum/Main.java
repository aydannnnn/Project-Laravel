package Praktikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("\n===== HITUNG LUAS SEGITIGA =====\n");
        System.out.println("1. Hasil to Integer\n");
        System.out.println("2. Hasil to Double\n");
        System.out.print("Pilih (1 atau 2): ");
        int pilih = input.nextInt();
        
        switch (pilih) {
            case 1:
                System.out.println("\nMasukkan nilai alas dan tinggi secara berurutan: ");
                Segitiga<Integer, Integer> luasTipeInt = new Segitiga<>(input.nextInt(), input.nextInt());
                System.out.println("\nHasil: "+ luasTipeInt.getResultAsInt());
                break;
            case 2:
                System.out.println("\nMasukkan nilai alas dan tinggi secara berurutan: ");
                Segitiga<Double, Double> luasTipeDouble = new Segitiga<>(input.nextDouble(), input.nextDouble());
                System.out.println("\nHasil: "+luasTipeDouble.getResultAsDouble());
                break;

            default:
                System.out.println("\nSALAH INPUT");
                break;
        }
    }
}
