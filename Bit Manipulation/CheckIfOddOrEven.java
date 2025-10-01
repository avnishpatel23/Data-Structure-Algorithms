public class CheckIfOddOrEven {
    public static void OddOrEven(int n){
        int bitMask = 1;
        if((n & bitMask) == 0){
            //even number
            System.out.println("even number");
        }
        else {
            System.out.println("odd number");
        }
    }
    public static void main(String[] args) {
        OddOrEven(3);
        OddOrEven(11);
        OddOrEven(14);
    }
}
