public class PencarianNilaiMahasiswa {
    public static void main(String[] args) {
        // Array nilai mahasiswa (sudah terurut)
        int[] nilai = {50, 60, 65, 70, 75, 80, 85, 90, 95, 100};

        // Nilai yang ingin dicari
        int target = 85;

        // Panggil metode binary search
        hasilPencarian(nilai, target);
    }

    public static void hasilPencarian(int[] arr, int target) {
        int langkah = 0;
        int left = 0;
        int right = arr.length - 1;
        int indeks = -1; // default jika tidak ditemukan

        while (left <= right) {
            langkah++;
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                indeks = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        // Output hasil pencarian
        if (indeks != -1) {
            System.out.println("Nilai " + target + " ditemukan.");
            System.out.println("Indeks: " + indeks);
            System.out.println("Jumlah langkah pencarian: " + langkah);
            System.out.println("Status: Ditemukan");
        } else {
            System.out.println("Nilai " + target + " tidak ditemukan.");
            System.out.println("Jumlah langkah pencarian: " + langkah);
            System.out.println("Status: Tidak ditemukan");
        }
    }
}