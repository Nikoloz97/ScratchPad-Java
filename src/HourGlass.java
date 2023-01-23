import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class HourGlass {


    // Create HourGlass function that takes in a list of integer lists (of the 6 x 6 grid)
    public static void HourGlass(List<List<Integer>> arr) {

        // initialize max value
        int max = Integer.MIN_VALUE;

        // from 2 to 5... (4 iterations - Y-axis)
        for (int j = 2; j < 6; j++) {

            // from 2 to 5... (4 iterations - X-axis)
            for (int i = 2; i < 6; i++) {

                // index 0, and index 0 of that
                int a = arr.get(j-2).get(i-2) +
                        // index 0 -> index 1
                        arr.get(j-2).get(i-1) +
                        // index 0 -> index 2
                        arr.get(j-2).get(i) +
                        // index 1 -> index 1
                        arr.get(j-1).get(i-1) +
                        // index 2 -> index 0
                        arr.get(j).get(i-2) +
                        // index 2 -> index 1
                        arr.get(j).get(i-1) +
                        // index 2 -> index 2
                        arr.get(j).get(i);

                // If this value is greater than the last, replace it
                if (a > max) {
                    max = a;
                }

            }
        }
        // Print out the max value
        System.out.println(max);
    }

    public static void main(String[] args) throws IOException {

        // Create bufferReader that takes in system input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        // Create a list
        List<List<Integer>> arr = new ArrayList<>();

        // For each of the six lines (i) ...
        IntStream.range(0, 6).forEach(i -> {
            try {
                // add to the array...
                arr.add(
                        // For each line, make sure to get rid of whitespace (\\s) at the very end of the line ($), and split whole line based on rest of whitespaces
                        // Then, for each item, convert it to an integer (map) ... Integer::parseInt = x -> Integer.parseInt(x)
                        // Collect these integers, and create a list out of them ... collect(toList)
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();

        // Call Hourglass function
        HourGlass(arr);
    }


}
