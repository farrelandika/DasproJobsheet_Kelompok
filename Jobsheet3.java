import java.util.Scanner;

public class Jobsheet3 {

    static String[][] dataPrestasi = new String[10][5]; 
    static int jmlData = 0; 
    // Fungsi main
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--- Menu ---");
            System.out.println("1. Tambah Prestasi");
            System.out.println("2. Lihat Semua Prestasi");
            System.out.println("3. Analisis Prestasi Berdasarkan Jenis");
            System.out.print("Pilih menu (1-3): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            if (pilihan == 1) {
                tambahPrestasi();
            } else if (pilihan == 2) {
                tampilPrestasi();
            } else if (pilihan == 3) {
                analisisPrestasi();
            } else {
                System.out.println("Pilihan tidak valid!.");
                return;
            }
        }
    }
    // Fungsi untuk menambah data prestasi

    // Fungsi untuk menampilkan semua data prestasi
    static void tampilPrestasi() {
        if (jmlData == 0) {
            System.out.println("Tidak ada data yang tercatat!");
            return;
        }
        System.out.println("=== DAFTAR SEMUA PRESTASI ===");
        for (int i = 0; i < jmlData; i++) {
            System.out.println("Nama: " + dataPrestasi[i][0] + " | NIM: " + dataPrestasi[i][1] + " | Jenis: " + dataPrestasi[i][2] + " | Tingkat: " + dataPrestasi[i][3] + " | Tahun: " + dataPrestasi[i][4]);
        }
    }
    // Fungsi untuk menambah analisis prestasi
    }
