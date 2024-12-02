import java.util.Scanner;

public class PrestasiMahasiswa {

    // Fungsi untuk memvalidasi input tingkat prestasi
    public static String inputTingkatPrestasi() {
        Scanner sc = new Scanner(System.in);
        String tingkatPrestasi;
        
        while (true) { // Loop luar untuk memvalidasi tingkat prestasi
            System.out.print("Masukkan tingkat prestasi (Lokal/Nasional/Internasional): ");
            tingkatPrestasi = sc.nextLine().toLowerCase(); // Mengubah input menjadi huruf kecil
            
            // Nested loop untuk memeriksa apakah input valid
            if (tingkatPrestasi.equals("lokal") || tingkatPrestasi.equals("nasional") || tingkatPrestasi.equals("internasional")) {
                // Jika valid, mengubah huruf pertama menjadi kapital
                return tingkatPrestasi.substring(0, 1).toUpperCase() + tingkatPrestasi.substring(1);
            } else {
                System.out.println("Tingkat prestasi tidak valid! Pilihan yang diterima: Lokal, Nasional, atau Internasional.");
            }
        }
    }

    // Fungsi untuk memvalidasi input tahun prestasi
    public static int inputTahunPrestasi() {
        Scanner sc = new Scanner(System.in);
        int tahunPrestasi;
        int currentYear = java.time.Year.now().getValue(); // Mendapatkan tahun saat ini
        
        while (true) { // Loop luar untuk memvalidasi tahun prestasi
            System.out.print("Masukkan tahun prestasi (2010 - " + currentYear + "): ");
            
            if (sc.hasNextInt()) {  // Memeriksa apakah input adalah angka
                tahunPrestasi = sc.nextInt();
                
                // Nested loop untuk memeriksa apakah tahun berada dalam rentang yang valid
                if (tahunPrestasi >= 2010 && tahunPrestasi <= currentYear) {
                    return tahunPrestasi; // Jika tahun valid, kembalikan tahun
                } else {
                    System.out.println("Tahun prestasi tidak valid! Tahun harus antara 2010 hingga " + currentYear + ".");
                }
            } else {
                System.out.println("Input tahun harus berupa angka.");
                sc.next(); // Membersihkan buffer input yang salah
            }
        }
    }

    // Fungsi untuk menambahkan prestasi mahasiswa
    public static void tambahPrestasi() {
        Scanner sc = new Scanner(System.in);
        
        // Input data mahasiswa
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan NIM Mahasiswa: ");
        String nim = sc.nextLine();
        
        System.out.print("Masukkan Jenis Prestasi: ");
        String jenisPrestasi = sc.nextLine();
        
        System.out.println("=== Menambahkan Prestasi Mahasiswa ===");
        
        // Memanggil fungsi untuk mendapatkan input yang valid
        String tingkatPrestasi = inputTingkatPrestasi();
        int tahunPrestasi = inputTahunPrestasi();
        
        // Menampilkan hasil prestasi yang berhasil ditambahkan
        System.out.println("\nData prestasi berhasil ditambahkan!");
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("NIM Mahasiswa: " + nim);
        System.out.println("Jenis Prestasi: " + jenisPrestasi);
        System.out.println("Tingkat Prestasi: " + tingkatPrestasi);
        System.out.println("Tahun Prestasi: " + tahunPrestasi);
    }

    // Fungsi untuk menampilkan menu dan mengarahkan ke fungsi tambah prestasi
    public static void menu() {
        Scanner sc = new Scanner(System.in);
        
        while (true) {
            // Menampilkan menu
            System.out.println("\nPilih menu:");
            System.out.println("1. Tambah Prestasi Mahasiswa");
            System.out.println("2. Keluar");
            System.out.print("Pilihan: ");
            
            int pilihan = sc.nextInt();
            
            switch (pilihan) {
                case 1:
                    tambahPrestasi(); // Menambahkan prestasi mahasiswa
                    break;
                case 2:
                    System.out.println("Terima kasih! Program selesai.");
                    return; // Keluar dari program
                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih menu yang benar.");
            }
        }
    }

    public static void main(String[] args) {
        // Menampilkan menu utama
        menu();
    }
}
