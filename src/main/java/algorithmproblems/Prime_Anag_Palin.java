package algorithmproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prime_Anag_Palin {

    public static void main(String[] args) {

        ArrayList<Integer> primes_list = new ArrayList<>();

        for(int i=0; i<1000; i++){
            if(isPrime(i)){
                primes_list.add(i);
            }
        }
        System.out.println(primes_list);

        ArrayList<Integer> anagrams_list = anagrams(primes_list);
        System.out.println(anagrams_list);


        ArrayList<Integer> palindrome_list = palindromes(primes_list);
        System.out.println(palindrome_list);
    }


    private static boolean isPrime(int num){
        if(num<=1){
            return false;
        }

        for(int i=2; i<= Math.sqrt(num); i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    private static ArrayList<Integer> anagrams(ArrayList<Integer> primes){
        ArrayList<Integer> anagrams = new ArrayList<>();

        for(int i=0; i<primes.size(); i++){
            if(isAnagram(i, i+1)){
                anagrams.add(i);
                anagrams.add(i+1);
            }
        }
        return anagrams;
    }

    private static boolean isAnagram(int num1, int num2){
        char[] char1 = Integer.toString(num1).toCharArray();
        char[] char2 = Integer.toString(num2).toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        return Arrays.equals(char1, char2);
    }

    private static ArrayList<Integer> palindromes(ArrayList<Integer> anagrams){
        ArrayList<Integer> palindromes = new ArrayList<>();

        for(int anagram : anagrams){
            if(isPalindrome(anagram)){
                palindromes.add(anagram);
            }
        }
        return palindromes;
    }

    private static boolean isPalindrome(int anagram){
        String str = Integer.toString(anagram);
        String revStr = new StringBuilder(str).reverse().toString();

        return str.equals(revStr);
    }

}
