/* Print Hello World! */

// public class forLoop {
//     public static void main(String[] args) {
//         for(int i=1; i<=10; i++){
//             System.out.println("Hello World");
//         }
//     }
// }



/* Print Square Pattern using * */

// public class forLoop {
//     public static void main(String[] args) {
//         for(int i=1; i<=4; i++){
//             System.out.println("* * * *");
//         }
//     }
// }


/* Print Reverse of a number n = 10899 */

// public class forLoop {

//     public static void main(String[] args) {
//         int n = 10899;
//         while(n>0){
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n = n / 10;
//         }
//         System.out.println();
//     }
// }


/* Reverse the given number n = 10899 */

public class forLoop {

    public static void main(String[] args) {
        int rev = 0;
        int n = 10899;
        while(n>0){
            int lastDigit = n % 10;
            rev = (rev*10) + lastDigit;
            n = n / 10;
        }
        System.out.println(rev);
    }
}