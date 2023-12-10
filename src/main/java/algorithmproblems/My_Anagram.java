package algorithmproblems;

import java.util.Arrays;

public class My_Anagram {

    private static boolean isAnagram(String str1, String str2){

        //converting the strings to char arrays
        char[] char1 = str1.toCharArray();
        char[] char2 = str2.toCharArray();

        //sorting the arrays to compare them
        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }

    public static void main(String[] args) {
        String st1 = "abcd";
        String str2 = "bcad";

        if(isAnagram(st1, str2)){
            System.out.println("The two strings are anagrams");
        }
        else {
            System.out.println("The two strings are not anagrams");
        }
    }
}
