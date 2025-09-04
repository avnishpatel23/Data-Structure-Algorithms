public class InvertedStarPattern {
    public static void main(String[] args) {
        int row = 4;
        for(int line=1; line<=row; line++){
            for(int star=1; star<=row-line+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

