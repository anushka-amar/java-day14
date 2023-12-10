package algorithmproblems;

public class MergeSort {

    /* this merge method sorts two halves done
      after sorting the array recursively*/
    private static void merge(String[] word, int s, int mid, int e){

        int i=0, j=e, k=0;
        String[] temp = new String[word.length]; //temp array to store the sorted values of both halves

        /* iterates through both the halves and compare each
           element, the smallest one gets pushed to the
           temp array */
        while (i<=mid && j<=e){
            int comp = word[i].compareTo(word[j]);

            if(comp<0){
                temp[k++] = word[i++];
            } else{
                temp[k++] = word[j++];
            }
        }

        /* checks for any leftover element in any of
        * the halves*/
        for( ;i<=mid; i++){
            temp[k++] = word[i];
        }

        for( ;j<=e; j++){
            temp[k++] = word[j];
        }

        //copying the temp arr to the actual array
        for(int x=0; x<=e; x++){
            word[x] = temp[x];
        }
    }

    private static void merge_sort(String[] word, int s, int e){
        if(s>=e)
        {
            return;
        }

        int mid = s+(e-s)/2;

        //sorting first and second halves
        merge_sort(word, s, mid);
        merge_sort(word, mid+1, e);

        //merging the sorted halves
        merge(word, s, mid, e);
    }

    public static void main(String[] args) {
        String[] wordList = {"Banana", "Orange", "Pineapple", "Apple", "Peach"};

        System.out.println("Before sorting using Merge sort:- ");
        for(String word : wordList){
            System.out.println(word);
        }

        merge_sort(wordList, 0, wordList.length-1);

        System.out.println("\nAfter sorting using Merge sort:- ");
        for(String word : wordList){
            System.out.println(word);
        }
    }
}
