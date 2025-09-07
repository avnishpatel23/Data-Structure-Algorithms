/* method 1 = n --> prime --> divisible by 1, n
   for (int i = 2 to i=n-1) 
     ( n % i == 0) NotPrime
    Prime
 */

// public class Prime {
//     public static boolean isPrime(int n) {
//     // boolean isPrime = true;
//         for(int i=2; i<=n-1; i++){ // completely divisible
//             if(n % i == 0){
                 // isPrime = false;
                 // break;
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         System.out.println(isPrime(7));
//     }
// }


/* Method 2 (optimized)=  6 --> 1 x 6
                                2 x 6
                                3 x 6
                                4 x 6
            n = sqrt n  * sqrt n

        for( int i =2 to i <= sqrt n)
 */

//  public class Prime {
//        public static boolean isPrime(int n) {

//         if(n==2){
//             return true;
//         }
  
//         for(int i=2; i<=Math.sqrt(n); i++){
//             if(n % i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String[] args) {
//         System.out.println(isPrime(23));
//     }
//  }


/* Print all Prime in a Range = 2 to n*/


public class Prime {
    public static boolean isPrime(int n) {
        if(n==2){
            return true;
        }
  
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void PrimesinRange(int n) {
        for(int i=2; i <= n; i++){
            if(isPrime(i)) { //true
                System.out.print(i+ " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        PrimesinRange(20); // 2 to 20
    }
}
