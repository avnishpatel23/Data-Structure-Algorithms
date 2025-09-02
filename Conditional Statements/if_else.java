// public class if_else {

//     public static void main(String[] args) {
//         int age = 16;
//         if (age>=18) {
//             System.out.println("Adult : vote");
//         }
//         if (age > 13 && age < 18) {
//             System.out.println("Teenager");
//         }
//         else {
//             System.out.println("Not Adult");
//         }

//     }
// }



/* Print the largest of two numbers */

// import java.util.*;
// public class if_else {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);

//         System.out.print("Enter value of a: ");
//         int a = sc.nextInt();
//         System.out.print("Enter value of b: ");
//         int b = sc.nextInt();

//         if (a>=b) {
//             System.out.println("a :" +a);
//         }
//         else {
//             System.out.println("b :" +b);
//         }

//         sc.close();
//     }
// }

/*If number is odd or even */
import java.util.*;
public class if_else {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.err.print("Enter Number: ");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.err.println("Even Number");
        } else {
            System.err.println("Odd Number");
        }

        sc.close();
    }
}
