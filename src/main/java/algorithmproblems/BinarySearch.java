package algorithmproblems;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        try{
            //reading the words from the file
            String[] wordList = readWords("text1.txt");

            //sorting the word list
            Arrays.sort(wordList);

            String key = getInput();

            boolean result = my_binary_search(wordList, key);

            if (result){
                System.out.println("The word "+ key + " is found in the file");
            }else {
                System.out.println("Word not found");
            }

        }catch (IOException e){
            System.out.println("Error reading the word list file:  "+e.getMessage());
        }
    }

    /* method to read a sentence from a file
       and spliting it into words */
    private static String[] readWords(String filename)throws IOException{
        /* BufferReader reads from file and
           FileReader connects Buffe to the file */
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        String line = reader.readLine();
        reader.close();
        return line.split(" ");
    }

    /* method to get user input to search for a word in
       the file */
    private static String getInput() throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter word to search");

        String input = scanner.nextLine();

        return input;
    }

    /* performs binary search on the sorted wordList
       that checks for the key String based on lexicographical order */
    private static boolean my_binary_search(String[] wordList, String searchWord){
        int l = 0;
        int r = wordList.length - 1;

        while (l<=r){
            int mid = l + (r-l)/2;
            int result = searchWord.compareTo(wordList[mid]);

            if (result == 0){
                return true;
            }

            if(result>0){
                l = mid+1;
            }
            else {
                r = mid-1;
            }
        }
        return false;
    }
}
