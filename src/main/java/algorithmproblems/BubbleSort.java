package algorithmproblems;

public class BubbleSort {

    private static void bubble_sort(int[] nums){

        for(int i=0; i<nums.length-1; i++){
            for(int j=0; j< nums.length-1-i; j++){

                if(nums[j]>nums[j+1]){
                    int temp = nums[j+1];
                    nums[j+1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] number_list = {40, 30, 20, 60, 10};

        System.out.println("Before sorting using Bubble sort:- ");
        for(int num : number_list){
            System.out.println(num);
        }

        bubble_sort(number_list);

        System.out.println("\nAfter sorting using Bubble sort:- ");
        for(int num : number_list){
            System.out.println(num);
        }
    }
}
