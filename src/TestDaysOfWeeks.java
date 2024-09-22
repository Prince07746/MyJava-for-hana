import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * A class that demonstrates the use of HashSet and LinkedHashSet by storing
 * the days of the week and comparing the two sets for equality.
 */
public class TestDaysOfWeeks {

    /**
     * The main method where the test for HashSet and LinkedHashSet is performed.
     *
     * - Creates a HashSet with all the days of the week and prints the contents.
     * - Creates a LinkedHashSet that preserves the insertion order of the days and prints the contents.
     * - Compares the two sets for equality and prints the result.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        // Create a HashSet and add the days of the week
        Set<String> daysHashSet = new HashSet<>();
        daysHashSet.add("Monday");
        daysHashSet.add("Tuesday");
        daysHashSet.add("Wednesday");
        daysHashSet.add("Thursday");
        daysHashSet.add("Friday");
        daysHashSet.add("Saturday");
        daysHashSet.add("Sunday");

        // Print the content of the HashSet
        System.out.println("HashSet Days of the Week: " + daysHashSet);

        // Create a LinkedHashSet and add the days of the week, preserving insertion order
        Set<String> daysLinkedHashSet = new LinkedHashSet<>();
        daysLinkedHashSet.add("Monday");
        daysLinkedHashSet.add("Tuesday");
        daysLinkedHashSet.add("Wednesday");
        daysLinkedHashSet.add("Thursday");
        daysLinkedHashSet.add("Friday");
        daysLinkedHashSet.add("Saturday");
        daysLinkedHashSet.add("Sunday");

        // Print the content of the LinkedHashSet
        System.out.println("LinkedHashSet Days of the Week: " + daysLinkedHashSet);

        // Check if the two sets are equal
        boolean isEqual = daysHashSet.equals(daysLinkedHashSet);

        // Print the comparison result
        System.out.println("Is the HashSet equal to the LinkedHashSet? " + isEqual);
    }
}
