public class ClearLastIBits {
    public static int clearlastIBit(int n, int i){
        int bitMask = (~0)<< i;
        return n & bitMask;
    }

    public static void main(String[] args) {
        System.out.println(clearlastIBit(15, 2));
    }
}
