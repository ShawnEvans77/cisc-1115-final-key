import java.util.Arrays;
public class Spring2023Question1 {
    public static void main(String[] args) {
        /**
         * Write the Java code for a method named maxChar that receives two char
         * arrays of the same size as arguments and returns a newly created array of
         * type
         * char. Each element of the new array that is returned is the larger (based on
         * the
         * ASCII code) of the corresponding elements of the two arrays received.
         * For example if [‘x', '3', '?'] and ['7', '4', 'e'] were passed to maxChar, it
         * would
         * return the array: [‘x’, ’4’, ‘e’]. Or, if ['6', 'f', 'n'] and ['S', 'u', ',']
         * were passed to
         * maxChar, then [‘S’, ’u’, ’n’] would be returned
         */

        char[] A = {'x', '3', '?'};
        char[] B = {'7', '4', 'e'};

        char[] C = maxChar(A, B);

        System.out.println(Arrays.toString(C));
    }

    public static char[] maxChar(char[] A, char[] B) {
        int n = A.length;
        char[] C = new char[n];

        for (int i = 0; i < n; i++) {
            C[i] = A[i] > B[i] ? A[i] : B[i];
        }

        return C;
    }

}