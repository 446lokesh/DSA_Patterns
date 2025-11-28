class Fibonacci {

    // Recursion to print the fibonacci series up to n
    public static void main(String[] args) {

        int n = 5;
        int[] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        
        fibonacci(arr, 2);

        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    public static void fibonacci(int[] arr, int i) {
        if (i > arr.length - 1) {
            return;
        }

        arr[i] = arr[i - 2] + arr[i - 1];
        fibonacci(arr, i + 1);
    }
}
