package bagian1.array;


public class LatihanMandiri1 {
    public static void main(String[] args) {
        
        System.out.println("=== 1. Suhu Harian ===");
        double[] suhu = {32.5, 31.0, 33.2, 30.5, 34.1, 32.8};
        double suhuTertinggi = suhu[0];
        double suhuTerendah = suhu[0];
        
        for (double s : suhu) {
            if (s > suhuTertinggi) {
                suhuTertinggi = s;
            }
            if (s < suhuTerendah) {
                suhuTerendah = s;
            }
        }
        System.out.println("Suhu tertinggi : " + suhuTertinggi);
        System.out.println("Suhu terendah  : " + suhuTerendah);

        System.out.println("\n=== 2. Filter Nama Hari ===");
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        System.out.println("Hari dengan lebih dari 5 huruf:");
        
        for (String h : hari) {
            if (h.length() > 5) {
                System.out.println("- " + h);
            }
        }

        System.out.println("\n=== 3. Hitung Angka Genap ===");
        int[] angka = {4, 8, 15, 16, 23, 42};
        int jumlahGenap = 0;
        
        for (int a : angka) {
            if (a % 2 == 0) {
                jumlahGenap++;
            }
        }
        System.out.println("Banyak angka genap: " + jumlahGenap);
    }
}