package bagian2.arraylist;

import java.util.ArrayList;

public class LatihanMandiri2 {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Daftar Belanja ===");
        ArrayList<String> daftarBelanja = new ArrayList<>();
        daftarBelanja.add("Sabun");
        daftarBelanja.add("Shampo");
        daftarBelanja.add("Pasta Gigi");
        daftarBelanja.add("Sikat Gigi");
        daftarBelanja.remove(1);
        System.out.println("Daftar akhir: " + daftarBelanja);
        System.out.println("Jumlah item : " + daftarBelanja.size() + "\n");

        System.out.println("=== 2. Pencarian Nilai Terbesar ===");
        ArrayList<Integer> angka = new ArrayList<>();
        angka.add(25);
        angka.add(89);
        angka.add(14);
        angka.add(76);
        angka.add(42);
        
        int terbesar = angka.get(0);
        for (int n : angka) {
            if (n > terbesar) terbesar = n;
        }
        System.out.println("Isi list       : " + angka);
        System.out.println("Nilai terbesar : " + terbesar + "\n");

        System.out.println("=== 3. Filter Nama Huruf A ===");
        ArrayList<String> daftarNama = new ArrayList<>();
        daftarNama.add("Ahmad");
        daftarNama.add("Budi");
        daftarNama.add("Andi");
        daftarNama.add("Citra");
        daftarNama.add("Aulia");
        daftarNama.add("Deni");
        
        System.out.println("Nama yang diawali huruf A:");
        for (String nama : daftarNama) {
            if (nama.startsWith("A")) {
                System.out.println("- " + nama);
            }
        }
    }
}