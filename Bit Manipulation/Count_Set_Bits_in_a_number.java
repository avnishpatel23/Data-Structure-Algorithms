public class Count_Set_Bits_in_a_number {
      public static int CountSetBits(int n){
        int count = 0;
        while (n>0) {
            if((n&1) != 0){ // check our LSB
                count ++;
            }
            n = n>>1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(CountSetBits(10));
    }
}
