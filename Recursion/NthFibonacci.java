class NthFibonacci {

    //Recursion code for finding the nth fibonacci number

    public static void main(String[] args) {
        System.out.println(f(4));
    }

    public static int f(int n) {

        if (n <= 1) {
            return n;
        }

        int fFirst = f(n - 1);
        int fLast = f(n - 2);

        return fFirst + fLast;
    }
}