public class MergSortDescending {
    // Fungsi untuk menggabungkan dua subarray
    void merge(int arr[], int l, int m, int r) {
        // Ukuran subarray kiri dan kanan
        int n1 = m - l + 1;
        int n2 = r - m;
        
        // Array temporer
        int L[] = new int[n1];
        int R[] = new int[n2];
        
        // Salin data ke array temporer
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];
            
        // Gabungkan dengan urutan descending
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] >= R[j]) {  // Perubahan utama: '>=' untuk descending
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        
        // Salin sisa elemen L[] jika ada
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        
        // Salin sisa elemen R[] jika ada
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    
    // Fungsi rekursif untuk merge sort
    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
    
    // Fungsi utilitas untuk mencetak array
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    
    // Main method
    public static void main(String args[]) {
        // Inisialisasi data (bisa diganti dengan input user)
        int nilai1 = 45;
        int nilai2 = 23;
        int nilai3 = 78;
        int nilai4 = 12;
        int nilai5 = 56;
        int nilai6 = 89;
        
        int arr[] = {nilai1, nilai2, nilai3, nilai4, nilai5, nilai6};
        
        System.out.println("Array sebelum diurutkan:");
        printArray(arr);
        
        MergSortDescending ob = new MergSortDescending();
        ob.sort(arr, 0, arr.length - 1);
        
        System.out.println("\nArray setelah diurutkan (descending):");
        printArray(arr);
    }
}

