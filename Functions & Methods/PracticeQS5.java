/* Question 1 :Write a Java method to compute the averageof three numbers */

// public class PracticeQS5 {
//     public static int avg (int a, int b, int c){
//         return (a+b+c)/3;
//     }

//     public static void main(String[] args) {
//         System.out.println(avg(4, 3, 5));
//         System.out.println(avg(7, 8, 6));
//     }
// }

/* Question 2 : Write a method named isEven that accepts an int argument. The method should return true if the argument is even, or false otherwise. Also write a program to test your method */

// import java.util.Scanner;

// public class PracticeQS5 {

//     public static boolean isEven(int num) {
//         return num % 2 == 0;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.out.print("Enter a Number : ");
//         int num = sc.nextInt();

//         if(isEven(num)){
//             System.out.println(num+ " is Even ");
//         } else {
//             System.out.println(num+ " is Odd ");

//             sc.close();
//         }
//     }
// }


/* Question 3 : Write a Java program to check if a number is a palindrome in Java? (121 is a palindrome, 321 is not)
   A number is called a palindrome if the number is equal to the reverse of a number e.g.,121 is a palindrome because the reverse of 121 is 121 itself. On the other hand, 321 is not a palindrome because the reverse of 321 is 123, which is not equal to 321 
*/

// import java.util.Scanner;

// public class PracticeQS5 {

//     public static boolean isPalindrome (int num){
//         int original = num;
//         int reversed = 0;

//         while (num>0) {
//             int digit = num % 10;
//             reversed = reversed *10 + digit;
//             num = num / 10;
//         }
//         return original == reversed;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enetr a number : ");
//         int num = sc.nextInt();
//         if(isPalindrome(num)){
//             System.out.println(num+ " is a plaindrome");
//         } else{
//             System.out.println((num+ " is not a palindrome "));
//         }
//         sc.close();
//     }
// }


/* Question 5 : Write a Java method to compute the sum of the digits in an integer.

    (Hint: Approach this question in the following way:
    a. Take a variable sum = 0
    b. Find the last digit of the number
    c. Add it to the sum
    d. Repeat a & b until the number becomes 0 

*/

import java.util.Scanner;

public class PracticeQS5 {
  
    public static int SumOfDigit(int num){
        int sum = 0;

        while (num > 0) {
            int digit = num % 10; // get last digit
            sum += digit; 
            num = num / 10; // remove last digit
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num = sc.nextInt();
        System.out.println("The Sum of Digit is : " +SumOfDigit(num));
        
        sc.close();
    }
  }
