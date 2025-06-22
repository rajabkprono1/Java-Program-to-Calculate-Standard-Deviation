import java.util.Arrays;

public class StandardDeviation {
    public static void main(String[] args) {
        double[] numbers = {10, 12, 23, 23, 16, 23, 21, 16};
        double sum = Arrays.stream(numbers).sum();
        double mean = sum / numbers.length;

        double squaredDiffSum = Arrays.stream(numbers)
                                       .map(n -> Math.pow(n - mean, 2))
                                       .sum();
        double stdDev = Math.sqrt(squaredDiffSum / numbers.length);
        
        System.out.println("Standard Deviation: " + stdDev);
    }
}