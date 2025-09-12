public class BubbleSort {

    public static void bubbleSort(int arr[]){
        for(int turn=0; turn<arr.length; turn++){
            for(int j=0; j<arr.length-1-turn; j++ ){
                if(arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void printArr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        bubbleSort(arr);
        printArr(arr);
    }
}

// Time Comlexity : 0(n^2)


/* If Array is Already Sorted then */

// public class BubbleSort {

//     public static void bubbleSort(int arr[]) {
//         for (int turn = 0; turn < arr.length; turn++) {
//             int swap = 0; // counter for swaps in this pass

//             for (int j = 0; j < arr.length - 1 - turn; j++) {
//                 if (arr[j] > arr[j + 1]) {
//                     // swap
//                     int temp = arr[j];
//                     arr[j] = arr[j + 1];
//                     arr[j + 1] = temp;
//                     swap++; // count swap
//                 }
//             }

//             // if no swap happened → array is already sorted
//             if (swap == 0) {
//                 break;
//             }
//         }
//     }

//     public static void printArr(int arr[]) {
//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String[] args) {
//         int arr[] = {5, 4, 1, 3, 2}; // try {1,2,3,4,5} too
//         bubbleSort(arr);
//         printArr(arr);
//     }
// }


// Time Comlexity : 0(n) when array is already sorted
