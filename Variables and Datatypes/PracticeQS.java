/* Question 1: In a program, input 3 numbers: A,B and C.
   You have to output the average of these 3 numbers.
  (Hint : Average of N numbers is sum of those numbers divided by N) 
*/


// import java.util.*;
// public class PracticeQS {

//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc. nextInt();
//         float avg = (a+b+c)/3;
//         System.out.println(avg);

//         sc.close();
//     }
// }


/* Question 2: In a program, input the side of a square.
   You have to output the area of the square. 
   (Hint : area of a square is (side x side))
*/

// import java.util.*;
// public class PracticeQS {

//     public static void main(String[] args) {
//         Scanner sc =  new Scanner (System.in);
//         float a = sc.nextFloat();
//         float A = a * a;
//         System.out.println(A);

//         sc.close();
//     }
// }




/* Question 3: Enter cost of 3 items from the user (using float data type) -a pencil, a pen and an eraser.
    You have to output the total cost of the items back to the user as their bill.
    (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem).
*/


// import java.util.*;

// public class PracticeQS {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//             float pencil = sc.nextFloat();
//             float pen = sc.nextFloat();
//             float eraser = sc.nextFloat();
//             float total = pencil + pen + eraser;
//             System.out.println("Bills is:" + total);

//             // Add on - with 18% tax

//             float newTotal = total + (0.18f*total);
//             System.out.println("Bill with 18% tax:" +newTotal);

//             sc.close();
//     }
// }



/* Question 5:(Advanced)Will the following statementgive any error in Java?
   int $ = 24;
*/

public class PracticeQS {

    public static void main(String[] args) {
        int $ = 24;
        System.out.print($);
    }
}