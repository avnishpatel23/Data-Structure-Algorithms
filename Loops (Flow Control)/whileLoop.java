/* Print Hello World! 10 times */

// public class whileLoop {
//     public static void main(String[] args) {
//         int counter = 0;
//         while (counter <= 10){
//             System.out.println("Hello World!");
//             counter ++;
//         }
//         System.out.println("Printed Hello World! 10x");
//     }
// }


/* Print number from 1 to 10 */

// public class whileLoop {

//     public static void main(String[] args) {
//         int counter = 1;
//         while (counter <= 10) {
//             System.out.println(counter);
//             counter ++;
//         }
//     }
// }



/* Print number from 1 to n */

// import java.util.Scanner;

// public class whileLoop {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter number : ");
//         int n = sc.nextInt();
//         int counter = 1;
//         while (counter <= n) {
//             System.out.println(counter);
//             counter ++;
//         }
//         sc.close();
//     }
// }


/* Print sum of first n natural numbers */

import java.util.Scanner;

public class whileLoop {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= n) {
            sum = sum + i;
            i++;
        }

        System.out.println("Sum is : "+sum);

        sc.close();
    }
}