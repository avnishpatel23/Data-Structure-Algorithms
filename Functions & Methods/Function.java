/* Find Product of a & b */


// public class Function {

//     public static int multiply(int a, int b){
//         int product = a*b;
//         return product;
//     }

//     public static void main(String[] args) {
//         int a = 3;
//         int b = 5;
//         int prod = multiply(a,b);
//         System.out.println("a * b = " +prod);
//         prod = multiply(10,20);
//         System.out.println("a * b = " +prod);
//     }
// }


/* Find factorial of a number, n */

// public class Function {

//     public static int factorial(int n){
//         int f = 1;
//         for(int i=1; i<=n; i++){
//             f = f * i;
//         }
//         return f; // factorial of n
//     }

//     public static void main(String[] args) {
//         System.out.println(factorial(4));
//     }
// }


///* Find Binomial Coefficient */

public class Function {

    public static int factorial(int n){
        int f = 1;
        for(int i=1; i<=n; i++){
            f = f * i;
        }
        return f; // factorial of n
    }

    public static int binomailCoefficient(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int binomailCoefficient =  fact_n/(fact_r*fact_nmr);
        return binomailCoefficient;
    }

    public static void main(String[] args) {
        System.out.println(binomailCoefficient(5,2));
    }
}

