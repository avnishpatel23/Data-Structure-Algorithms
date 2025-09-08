import java.util.Scanner;

public class InputOutputUpdate {
    public static void main(String[] args) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Physics Marks : ");
        marks[0] = sc.nextInt();

        System.out.print("Enter Chemistry Marks : ");
        marks[1] = sc.nextInt();

        System.out.print("Enter Math Marks : ");
        marks[2] = sc.nextInt();

        System.out.println("phy : " +marks[0]);
        System.out.println("chem : " +marks[1]);
        System.out.println("math : " +marks[2]);

        //if math marks is wromng then update it

        marks[2] = 100; // marks[2] = marks[2] + 1;
        System.out.println("updated math marks : " +marks[2]);

        sc.close();
    }
}
