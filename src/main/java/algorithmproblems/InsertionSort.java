package algorithmproblems;

public class InsertionSort {

    /* method that implements insertion sort on our array of
       words. uses compareTo method to check for smaller word
       lexicographically*/
    private static void insertion_sort(String[] word){
        int n = word.length;

        for(int i = 1; i<n; i++){
            int j = i-1;
            String temp_word = word[i];

            while (j>=0 && temp_word.compareTo(word[j])<0){
                    word[j+1] = word[j];
                    j--;
            }
            word[j+1] = temp_word;
        }
    }

    public static void main(String[] args) {

        String[] words = {"banana", "peach", "pineapple", "apple", "orange"};

        System.out.println("Before Swapping:- ");
        for (String word: words){
            System.out.println(word);
        }

        insertion_sort(words);

        System.out.println("\nAfter Swapping:- ");
        for (String word: words){
            System.out.println(word);
        }


    }
}
