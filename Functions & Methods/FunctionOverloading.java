/* Function Overloading using Parameters */

// public class FunctionOverloading {
//     public static int sum (int a, int b){
//         return a+b;
//     }

//     public static int sum(int a, int b, int c) {
//         return a+b+c;
//     }

//     public static void main(String[] args) {
//         System.out.println(sum(3, 5));
//         System.out.println(sum(2,3,3));
//     }
// }

/* Function Overloading using Data Types */

public class FunctionOverloading {
    public static int sum (int a, int b){
        return a+b;
    }

    public static float sum(float a, float b, float c) {
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(2.5f,2.3f,3.2f));
    }
}