public class string {

    /* Function for print all Character of String */
        public static void printLetters(String str){
            for(int i=0; i<str.length(); i++){
                System.out.print(str.charAt(i) + " ");
            }
            System.out.println();
        }
    public static void main(String[] args) {

        // char arr[] = {'a','b','c','d'};
        // String str = "abcd";
        // String str2 = new String("xyz");

        // // Strings are IMMUTABLE i.e  not changeable


        // /* Input/Output in String */ 

        // Scanner sc = new Scanner(System.in);
        // String name;
        // // name = sc.next();
        // name = sc.nextLine();
        // System.out.println(name);

        /* Calculate String Length */

        // String fullName = "Avnish Patel";
        // System.out.println(fullName.length());

        /* String Concatenation */

        String firstName = "Avnish";
        String lastName = "Patel";
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        /* String charAt Method */
        // System.out.println(fullName.charAt(0));

        printLetters(fullName);
    }
}
