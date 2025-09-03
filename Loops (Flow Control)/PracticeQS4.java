/* Question 1 : How many times 'Hello' is printed? */
// ans = 2 times

// public class PracticeQS4 {
//     public static void main (String[] args){
//         for(int i = 0; i < 5; i++) {
//             System.out.println("Hello");
//             i+=2;
//         }
//     }
// }

/* Question 2 : Write a program that reads a set of integers, and then prints the sum of the even and odd integers. */

// import java.util.*;
// public class PracticeQS4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int number;
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;

//         do {
//             System.out.print("Enter the number : ");
//             number = sc.nextInt();
//             if(number % 2 == 0){
//                 evenSum += number; 
//             } else {
//                 oddSum += number;
//             }
//             System.out.println("Do you want to continue? Press 1 for yes or 0 for no");
//             choice = sc.nextInt();
//         } while (choice==1);
//         System.out.println("Sum of even number: " +evenSum);
//         System.out.println("Sum of odd number: " +oddSum);

//         sc.close();
//     }
// }


/* Question 3 : Write a program to find the factorialof any number entered by the user. */

// import java.util.Scanner;

// public class PracticeQS4 {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int num;
//         int fact = 1;
//         System.out.print("Enetr any positive integer : ");
//         num = sc.nextInt();
//         for(int i =1; i<=num; i++){
//             fact *= i;
//         }
//         System.out.println("factorial : " +fact);

//         sc.close();
//     }
// }


/* Question 4 : Write a program to print the multiplication table of a number N,entered by the user. */

// import java.util.Scanner;

// public class PracticeQS4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//          System.out.print("Enter Number: ");
//          int n = sc.nextInt();
//          for(int i=1; i<=10; i++){
//             System.out.println(n+ "*" +i+ "=" +n*i);

//             sc.close();
//         }
//     }
// }


/* Question 5 :What is wrong in the following program ? */

public class PracticeQS4 {
    public static void main (String args[]) {
        int i;
        for(i=1; i<=5; i++ ) {
            System.out.println("i = "+i);
        }
        System.out.println("i after the loop = " +i );
    }
}