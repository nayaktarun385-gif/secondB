 package secondB; 
public class PerformanceTest {

    public static void main(String[] args) {

        int iterations = 10000;

        // Test StringBuffer
        long startBuffer = System.nanoTime();
        StringBuffer sbuf = new StringBuffer();

        for (int i = 0; i < iterations; i++) {
            sbuf.append("AIET");
        }

        long endBuffer = System.nanoTime();
        long timeBuffer = endBuffer - startBuffer;

        // Test StringBuilder
        long startBuilder = System.nanoTime();
        StringBuilder sbuilder = new StringBuilder();

        for (int i = 0; i < iterations; i++) {
            sbuilder.append("AIET");
        }

        long endBuilder = System.nanoTime();
        long timeBuilder = endBuilder - startBuilder;

        // Output Results
        System.out.println("Time taken by StringBuffer: " + timeBuffer + " ns");
        System.out.println("Time taken by StringBuilder: " + timeBuilder + " ns");

        // Comparison
        if (timeBuffer > timeBuilder) {
            System.out.println("StringBuilder is faster than StringBuffer.");
        } else {
            System.out.println("StringBuffer is faster than StringBuilder.");
        }
    }
}