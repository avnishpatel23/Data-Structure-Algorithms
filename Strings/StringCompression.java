// public class StringCompression {
//     public static String compress(String str){
//         String newStr = "";
//         for(int i=0; i<str.length(); i++){
//             Integer count = 1;
//             while(i<str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
//                 count++;
//                 i++;
//             }
//             newStr += str.charAt(i); /*newStr += ... creates a new String every time (slow for big inputs).Use StringBuilder instead. */
//             if(count > 1){
//                 newStr += count.toString();
//             }
//         }
//         return newStr;
//     }
//     public static void main(String[] args) {
//         String str = "aaabbcccdd";
//         System.out.println(compress(str));
//     }
// }


public class StringCompression {
    public static String compress(String str) {
        StringBuilder newStr = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            // Count consecutive same characters
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            newStr.append(str.charAt(i));
            if (count > 1) {
                newStr.append(count);
            }
        }

        return newStr.toString();
    }

    public static void main(String[] args) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));  // Output: a3b2c3d2
    }
}
