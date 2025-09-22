/* Question 1 : Count how many times lowercase vowels occurred in a String entered by the
user. */

// import java.util.Scanner;

// public class PracticeProblems {
//     public static boolean isVowel ( char ch){
//         return (ch == 'a' ||ch == 'e' || ch == 'i' ||ch == 'o' ||ch == 'u' ||ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
//     }

//     public static int CountVowels(String input){
//         int count = 0;
//         for(int i = 0; i<input.length(); i++){
//             char ch = input.charAt(i);
//             if(isVowel(ch)){
//                 count++;
//             }
//         }
//         return count;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner (System.in);
//         System.err.print("Enter a String : ");
//         String input = sc.nextLine();

//         int VowelCount = CountVowels(input);
//         System.out.println("Total vowels in our input is : " +VowelCount);

//         sc.close();
//     }
// }


// Time Complexity : O(n) , Space Complexity : O(1)


/* Question 4 : Determine if 2 Strings are anagrams of each other. */

public class PracticeProblems {

    public static boolean areAnagrams(String s, String t) {
         
        int[] count = new int[26];
        int n1 = s.length();
        int n2 = t.length();

        // If lengths differ, not anagrams
        if (s.length() != t.length()) {
            return false;
        }

        // Increment for s and decrement for t
        for (int i = 0; i < n1; i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        // Check if all values are zero
        for (int i=0; i<26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "listen";
        String t = "silent";

        if (areAnagrams(s, t)) {
            System.out.println(s + " and " + t + " are Anagrams.");
        } else {
            System.out.println(s + " and " + t + " are NOT Anagrams.");
        }
    }
}

// Time Complexity : O(n), Space Complexity : O(26)