public class Ex1 {
    /**
     * Calculate the sum of an arithmetic progression.
     *
     * @param start The first term of the progression
     * @param step The common difference between consecutive terms
     * @param count The number of terms to sum
     * @return The sum of the arithmetic progression
     */
    public static long calculateGaussSum(long start, long step, int count) {
        if (count <= 0) {
            return 0; // If count is zero or negative, the sum is zero.
        }
        // Using the arithmetic series sum formula
        long lastTerm = start + (count - 1) * step;
        return (count * (start + lastTerm)) / 2;
    }

    public static void main(String[] args) {
        // Example usage of the method
        long sum = calculateGaussSum(81297, 198, 100);
        System.out.println(sum); // Should output the sum for the given parameters
    }
}

    
