import java.io.*;
import java.util.*;

public class ModList {


    public static void ListModifier() {

        // Start scanning the input
        Scanner scan = new Scanner(System.in);

        // First value = list length
        int ListLength = scan.nextInt();

        // Create integer list
        LinkedList<Integer> list = new LinkedList<>();

        // foreach item in list...
        for (int i = 0; i < ListLength; i++) {
            // scan each item as an integer
            int value = scan.nextInt();
            // add to integer list
            list.add(value);
        }

        // Next integer = line of queries..
        int NumberOfQueries = scan.nextInt();
        // foreach query...
        for (int i = 0; i < NumberOfQueries; i++) {
            // Evaluate next line's string as an action
            String action = scan.next();
            // if the action says Insert..
            if (action.equals("Insert")) {
                // first value of next line is index
                int index = scan.nextInt();
                // second value is value to insert at that index
                int value = scan.nextInt();
                // add that value at that particular index of the list
                list.add(index, value);
            } else {
                // Otherwise, it's a delete statement, so analyze the value as the index to be deleted
                int index = scan.nextInt();
                // Delete the list's index item
                list.remove(index);
            }
        }
        // close the scanner
        scan.close();

        // for each item in the list
        for (Integer num : list) {
            // print out the value in the same line, separated by a space
            System.out.print(num + " ");
        }
    }


}
