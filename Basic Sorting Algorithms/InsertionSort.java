public class InsertionSort {
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i]; // current element and storing into temporary memomry
            int prev = i-1; // previous element for current
            
            // finding out to correct position to insert
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev+1] = arr[prev]; // agar current se bada hai to piche ki aur push karege 
                prev--;
            }

            // insertion
            arr[prev+1] = curr;
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        insertionSort(arr);
        printArr(arr);
    }
}

// Time Complexity : 0(n^2)