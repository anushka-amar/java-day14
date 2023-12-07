package algorithmprograms;

public class Permutations {

 /*   static method to calculate the number of
  permutations of a given string and printing each of them. */
    public static void iterativePerm(String str){
        int len = str.length();
        int fact = factorial(len);

        for (int itr = 0; itr<fact; itr++){
            StringBuilder tempstr = new StringBuilder(str);
            int dividend = itr;

            for(int divisor=len; divisor>=1; divisor--){
                int q = dividend/divisor;
                int r = dividend%divisor;
                System.out.println(tempstr.charAt(r));
                tempstr.deleteCharAt(r);
                dividend = q;
            }
            System.out.println();
        }
    }

    /* method to calculate
factorial of the length of string */
    public static int factorial(int len){
        int fact = 1;
        for (int i=2; i<=len; i++){
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        String str1 = "abc";
        iterativePerm(str1);
    }
}