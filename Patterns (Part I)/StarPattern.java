public class StarPattern{
    public static void main(String[] args) {
        int rows = 4;
        for(int line=1; line<=rows; line++){
            for(int star = 1; star<=line; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
