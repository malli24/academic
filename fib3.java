class fib3{
    public static void main(String args[]) {
        int n = 10; // Number of terms
        int a = 0, b = 1; // Initialize first two terms of Fibonacci

        System.out.println("0 -> " + a); // Print the first term
        System.out.println("1 -> " + b); // Print the second term

        for (int i = 2; i < n; i++) { // Corrected loop condition
            int c = a + b; // Calculate next term
            System.out.println(i + " -> " + c); // Print the term
            a = b; // Update a
            b = c; // Update b
        }
    }
}
