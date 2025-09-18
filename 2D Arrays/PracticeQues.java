/* Ans 1 */

// public class PracticeQues {
//     public static void main(String[] args) {
//         int[][] array = { {4, 7, 8}, {8, 8, 7} };
//         int count = 0;

//         // Loop through rows
//         for (int i = 0; i < array.length; i++) {
//             // Loop through columns
//             for (int j = 0; j < array[i].length; j++) {
//                 if (array[i][j] == 7) {
//                     count++;
//                 }
//             }
//         }

//         System.out.println("Number of 7's = " + count);
//     }
// }

/* Ans 2 */
 
// public class PracticeQues {

//     // Function to return sum of second row
//     public static int sumOfSecondRow(int[][] nums) {
//         int sum = 0;
//         for (int j = 0; j < nums[1].length; j++) {
//             sum += nums[1][j];
//         }
//         return sum;
//     }

//     public static void main(String[] args) {
//         int[][] nums = {
//             {1, 4, 9},
//             {11, 4, 3},
//             {2, 2, 3}
//         };

//         System.out.println("Sum of second row = " + sumOfSecondRow(nums));
//     }
// }

/* Ans 3 */

public class PracticeQues {
    public static void main(String[] args) {
        int row = 2, column = 3;

        int[][] matrix = {
            {2, 3, 7},
            {5, 6, 7}
        };

        // Display original matrix
        printMatrix(matrix);

        // Transpose the matrix
        int[][] transpose = new int[column][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the transposed matrix
        printMatrix(transpose);
    }

    public static void printMatrix(int[][] matrix) {
        System.out.println("The matrix is: ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
