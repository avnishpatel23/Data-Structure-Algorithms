// Break: to exit the loop

// public class Break {
//     public static void main(String[] args) {
//         for(int i=1; i<=5; i++){
//             if(i == 3){
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I am out of the loop");
//     }
// }


/* Keep Entering numbers till user enters a multiple of 10 */

import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter your number : ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while(true);

        sc.close();
    }
}
