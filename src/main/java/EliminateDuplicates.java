import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class EliminateDuplicates {

    public static Integer[] eliminateDuplicates(Integer[] array) {

        // Convert array to LinkedHashSet to eliminate duplicates while preserving insertion order
        Set<Integer> setSinDuplicados = new LinkedHashSet<>(Arrays.asList(array)); 
        // Convert the set back to an array of Integer type
        Integer[] arregloSinDuplicados = setSinDuplicados.toArray(new Integer[0]);

        return arregloSinDuplicados;
    }

    public static Integer[] eliminateDuplicatesWithArray(Integer[] array) {
        // Validate that the input array is not null or empty
        if (array == null || array.length == 0) {
            return new Integer[0];
        }

        // Create a temporary array to store unique elements
        Integer[] temp = new Integer[array.length];
        int uniqueCount = 0;

        // Iterate through the input array
        for (int i = 0; i < array.length; i++) {
            // Check if the current element already exists in the temp array
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j].equals(array[i])) {
                    isDuplicate = true;
                    break;
                }
            }

            // If not a duplicate, add it to temp array
            if (!isDuplicate) {
                temp[uniqueCount] = array[i];
                uniqueCount++;
            }
        }

        // Create the final array with the correct size
        Integer[] result = new Integer[uniqueCount];
        System.arraycopy(temp, 0, result, 0, uniqueCount);

        return result;
    }

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 2, 4, 5, 1, 6, 3};

        System.out.println(Arrays.toString(eliminateDuplicatesWithArray(array)));
    }
}
