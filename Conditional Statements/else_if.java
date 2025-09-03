/* Income Tax Calculator */

// import java.util.Scanner;

// public class else_if {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;
//         if(income < 5000000) {
//             tax = 0;
//         }
//         else if (income >= 5000000 && income <= 1000000) {
//             tax = (int) (income * 0.2);
//         }
//         else {
//             tax = (int) (income * 0.3);
//         }
//         System.out.println("your tax : " +tax);

//         sc.close();
//     }
// }


/* Print the Largest of 3 number */

public class else_if {

    public static void main(String[] args) {
        int A = 1;
        int B = 3;
        int C = 6;
        if(A>=B && A>=C){
            System.out.println("A is largest");
        }
        else if (B >= C){
            System.out.println(" B is largest");
        }
        else {
            System.out.println("C is largest");
        }
    }
}
