public class HalfPyramid {
    public static void main(String[] args) {
        int row = 4;
        for(int line = 1; line<=row; line++){
            for(int num=1; num<=line; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
