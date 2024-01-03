package easy;

public class P08_NthFibonacci {
    public static void main(String[] args) {
        System.out.println(NthFibonacciSolution.fib(3));
    }
}

class NthFibonacciSolution {
    public static int fib(int n) {
        if (n == 2) return 1;
        else if (n == 1) return 0;
        else return fib(n - 1) + fib(n - 2);
    }
}

