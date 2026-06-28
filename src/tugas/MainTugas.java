package tugas;

/*
 * Nama : Syahru Rahmadani
 * NPM  : 2410010259
 */

public class MainTugas {
    public static void main(String[] args) {
        String[] mataKuliah = {"Pemrograman Berbasis Objek", "Sistem Berkas", "Struktur Data"};
        System.out.println("== Daftar Mata Kuliah ==");
        for (String mk : mataKuliah) {
            System.out.println("- " + mk);
        }
        System.out.println();

        KelasKuliah kelas = new KelasKuliah();

        kelas.tambahMahasiswa(new Mahasiswa("Budi Santoso", "2410010101", 75.5));
        kelas.tambahMahasiswa(new Mahasiswa("Ayu Lestari", "2410010102", 55.0));
        kelas.tambahMahasiswa(new Mahasiswa("Citra Kirana", "2410010103", 88.0));
        kelas.tambahMahasiswa(new Mahasiswa("Doni Tata", "2410010104", 45.0));
        kelas.tambahMahasiswa(new Mahasiswa("Eka Putra", "2410010105", 92.5));

        kelas.tampilkanSemua();

        System.out.println("\nStatistik Kelas:");
        System.out.println("Rata-rata Nilai : " + kelas.hitungRataRata());
        System.out.println("Jumlah Lulus    : " + kelas.jumlahLulus());

        System.out.println("\n== Menambahkan Data Baru ==");
        kelas.tambahMahasiswa(new Mahasiswa("Fajar Siddiq", "2410010106", 80.0));
        System.out.println("Data mahasiswa baru berhasil ditambahkan.");
        System.out.println("Jumlah data mahasiswa saat ini: " + kelas.getJumlahData());
    }
}