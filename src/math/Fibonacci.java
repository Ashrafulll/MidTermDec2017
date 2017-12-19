package math;

public class Fibonacci {
    public static void main(String[] args) {
        int p = 0;
        int n = 1;
        for (int i = 0; i <= 40; i++){
            System.out.println(p);
            p = p +n;
            n = p - n;
        }

    }
}

