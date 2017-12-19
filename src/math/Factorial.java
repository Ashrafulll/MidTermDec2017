package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

    }
    public class factorial{
    public stasic void main (String[] args){
    int n = 10;
    System.out.println(fact(n));{

   public static int fact(int num) {
        int result;
        if (num == 0) {
        return 1;
        }
        result = num * fact(num - 1);
        return result;
        }
        }
