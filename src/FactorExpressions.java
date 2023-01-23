
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

public class FactorExpressions {

        public static void FactorList() throws IOException {

            //Buffered reader = fast stream reader
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            // Trim any whitespaces in string, convert it to an integer (Integer.parseInt)
            int N = Integer.parseInt(bufferedReader.readLine().trim());

            // Make sure to close the reader
            bufferedReader.close();

            // For integers 1 -10, create multiplication expression
            for (int i= 1; i < 11; i++) {
                int factoredVal = N * i;
                System.out.println(N + " x " + i + " = " + factoredVal);
            }

        }
}
