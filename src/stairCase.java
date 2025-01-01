public class stairCase {
    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1; // Base cases
        }

        int prev2 = 1; // ways(0)
        int prev1 = 2; // ways(1)
        int current = 0;

        for (int i = 3; i <= n; i++) {
            current = prev1 + prev2; // ways(i) = ways(i-1) + ways(i-2)
            prev2 = prev1;
            prev1 = current;
        }

        return current;
    }

    public static void main(String[] args) {
        int n = 5; // Example input
        System.out.println("Distinct ways to climb to the top: " + climbStairs(n));
    }
}


