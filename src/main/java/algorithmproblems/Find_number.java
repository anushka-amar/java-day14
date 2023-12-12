package algorithmproblems;

import java.util.ArrayList;
import java.util.Scanner;

public class Find_number {

    private static void find_number(int l, int N, Scanner scanner){

        int mid = l+(N-l)/2;

        System.out.println("Is your number "+mid+"?");

        int guess = scanner.nextInt();


        switch (guess){
            case 0:
                System.out.println("\n\nThe final answer is "+mid);
                break;
            case 1:
                System.out.println("Searching in the lower half...");
                find_number(l, mid-1, scanner);
                break;
            case 2:
                System.out.println("Searching in the upper half...");
                find_number(mid+1, N, scanner);
                break;
            default:
                System.out.println("Number not found");
                break;
        }

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the upper-limit of the range: ");
        int N = scanner.nextInt();

        System.out.println("Think of a number between 0 and "+N);
        System.out.println("\nEnter 0 if the guessed number is yours,\n" +
                "1 if your number is less than the guessed number,\n" +
                "2 if your number is greater than the guessed number");
        find_number(0, N, scanner);
    }
}
