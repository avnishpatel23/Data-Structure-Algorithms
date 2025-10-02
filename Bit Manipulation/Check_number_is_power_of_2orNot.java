public class Check_number_is_power_of_2orNot {
    public static boolean isPowerOfTwo(int n){
        return (n & (n-1)) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(8));
    }
}
