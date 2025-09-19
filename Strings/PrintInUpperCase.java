/* Ques - For a given String convert each the first letter of each word to uppercase
 Example - "hi, i am avnish" Output - " Hi, I Am Avnish" 
 */

public class PrintInUpperCase {
    public static String toUpperCase(String str) {
        StringBuilder sb = new StringBuilder("");

         // Convert first character to uppercase

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        // Process the rest of the string

        for(int i = 1; i<str.length(); i++){
            if(str.charAt(i) == ' ' && i<str.length() - 1){
                sb.append(' ');  // keep the space
                i++; // move to the next character
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am avnish";
        System.out.println(toUpperCase(str));
    }
}


// Time Compexity : O(n); n = length of string