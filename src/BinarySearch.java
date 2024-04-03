public class BinarySearch {

    // RECURSIVE IMPLEMENTATION
    public static int recursiveBinarySearch(int[] elements, int lowPosition, int highPosition, int target) {
        if (lowPosition > highPosition) {
            return -1;  // base case: target was not found, return -1
        } else {
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                lowPosition = midPosition + 1;
                recursiveBinarySearch(elements, lowPosition, highPosition, target);
            } else if (elements[midPosition] > target) {
                highPosition = midPosition - 1;
                recursiveBinarySearch(elements, lowPosition, highPosition, target);
            } else {
                // otherwise, target found, return that index
                return midPosition;
            }
        }
        return recursiveBinarySearch(elements, lowPosition, highPosition, target);
    }

    // ITERATIVE, NON-RECURSIVE IMPLEMENTATION -- FOR COMPARISON
    public static int iterativeNonRecursiveBinarySearch(int[] elements, int target) {
        int lowPosition = 0;
        int highPosition = elements.length - 1;

        while (lowPosition <= highPosition) {
            int midPosition = (lowPosition + highPosition) / 2;

            if (elements[midPosition] < target) {
                lowPosition = midPosition + 1;
            } else if (elements[midPosition] > target) {
                highPosition = midPosition - 1;
            } else {
                // else, target found, return its index
                return midPosition;
            }
        }
        // target was not found, return -1
        return -1;
    }
}