public class Set_i_th_Bit {
    public static int SetIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(SetIthBit(10, 2));
    }
}
