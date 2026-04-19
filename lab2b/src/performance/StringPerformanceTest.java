 package performance;

public class StringPerformanceTest {
    public static void main(String[] args) {

        int iterations = 10000;

        // Test with StringBuffer
        StringBuffer stringBuffer = new StringBuffer();
        long startTimeBuffer = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("AIET");
        }

        long endTimeBuffer = System.nanoTime();
        long timeBuffer = endTimeBuffer - startTimeBuffer;

        // Test with StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        long startTimeBuilder = System.nanoTime();

        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("AIET");
        }

        long endTimeBuilder = System.nanoTime();
        long timeBuilder = endTimeBuilder - startTimeBuilder;

        // Output results
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

        // Compare performance
        if (timeBuffer > timeBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else if (timeBuffer < timeBuilder) {
            System.out.println("StringBuffer is faster than StringBuilder.");
        } else {
            System.out.println("Both have similar performance.");
        }
    }
}