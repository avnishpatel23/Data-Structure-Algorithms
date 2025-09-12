public class PracticeQS6 {

    // BUBBLE SORT

    public static void bubbleSort(int arr1[]){
        for(int turn=0; turn<arr1.length; turn++){
            for(int j=0; j<arr1.length-1-turn; j++ ){
                if(arr1[j] > arr1[j+1]){
                    // swap
                    int temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
    }

    public static void printArr1(int arr1[]){
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ " ");
        }
        System.out.println();
    }

    // SELECTION SORT

    public static void selectionSort(int arr2[]) {
        for (int i = 0; i < arr2.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[minPos] > arr2[j]) {
                    minPos = j;
                }
            }
            // swap
            int temp = arr2[minPos];
            arr2[minPos] = arr2[i];
            arr2[i] = temp;
        }
    }

    public static void printArr2(int arr2[]){
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+ " ");
        }
        System.out.println();
    }

    // INSERTION SORT

    public static void insertionSort(int arr3[]) {
        for (int i = 1; i < arr3.length; i++) {
            int curr = arr3[i]; // current element and storing into temporary memomry
            int prev = i-1; // previous element for current
            
            // finding out to correct position to insert
            while (prev >= 0 && arr3[prev] > curr) {
                arr3[prev+1] = arr3[prev]; // agar current se bada hai to piche ki aur push karege 
                prev--;
            }

            // insertion
            arr3[prev+1] = curr;
        }
    }

    public static void printArr3(int arr3[]){
        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i]+ " ");
        }
        System.out.println();
    }

    //COUNTING SORT

    public static void countingSort (int arr4[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<arr4.length; i++){
            largest = Math.max(largest, arr4[i]);
        }
        
        int count[] = new int[largest + 1];
        for(int i=0; i<arr4.length; i++){
            count[arr4[i]]++;
        }
        //sorting
        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                arr4[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void printArr4(int arr4[]){
        for(int i=0; i<arr4.length; i++){
            System.out.print(arr4[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Bubble Sort
        int arr1[] = {3,6,2,1,8,7,4,5,3,1};
        bubbleSort(arr1);
        System.out.print("Bubble Sort : ");
        printArr1(arr1);

        // Selection Sort
        int arr2[] = {3,6,2,1,8,7,4,5,3,1};
        selectionSort(arr2);
        System.out.print("Selection Sort : ");
        printArr2(arr2);

        // Insertion Sort
        int arr3[] = {3,6,2,1,8,7,4,5,3,1};
        insertionSort(arr3);
        System.out.print("Insertion Sort : ");
        printArr2(arr2);

        // Counting Sort
        int arr4[] = {3,6,2,1,8,7,4,5,3,1};
        insertionSort(arr4);
        System.out.print("Counting Sort : ");
        printArr2(arr4);

    }
}
