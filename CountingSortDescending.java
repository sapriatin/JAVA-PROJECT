public class CountingSortDescending {
    // Fungsi counting sort descending
    public static void countingSortDescending(int[] arr) {
        if (arr.length == 0) return;
        
        // Cari nilai maksimum
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        
        // Inisialisasi array count
        int[] count = new int[max + 1];
        
        // Hitung frekuensi
        for (int num : arr) {
            count[num]++;
        }
        
        // Modifikasi count array untuk descending
        for (int i = max - 1; i >= 0; i--) {
            count[i] += count[i + 1];
        }
        
        // Bangun output array
        int[] output = new int[arr.length];
        for (int num : arr) {
            output[count[num] - 1] = num;
            count[num]--;
        }
        
        // Salin ke array asli
        System.arraycopy(output, 0, arr, 0, arr.length);
    }
    
    // Fungsi utilitas untuk print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    // Method main YANG BENAR
    public static void main(String[] args) {
        int nilai1 = 45;
        int nilai2 = 23;
        int nilai3 = 78;
        int nilai4 = 12;
        int nilai5 = 56;
        int nilai6 = 89;
        
        int[] data = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6};
        
        System.out.println("Data sebelum diurutkan:");
        printArray(data);
        
        countingSortDescending(data);
        
        System.out.println("\nData setelah diurutkan (descending):");
        printArray(data);
    }
}