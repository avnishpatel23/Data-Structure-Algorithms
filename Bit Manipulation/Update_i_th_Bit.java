public class Update_i_th_Bit {

    public static int ClearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return n & bitMask;
    } 

     public static int SetIthBit(int n, int i){
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int UpdateIthBit(int n, int i, int newBit){
        if(newBit == 0) {
            return ClearIthBit(n, i);
        } else {
            return SetIthBit(n, i);
        }

        // n = clearIthBit(n, i);
        // int bitMask = newBit << i;
        // return n | bitMask;
    }

    public static void main(String[] args) {
        System.out.println(UpdateIthBit(10, 2, 1));
    }
}
