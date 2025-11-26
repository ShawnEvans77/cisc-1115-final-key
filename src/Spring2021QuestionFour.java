import java.util.Arrays;
public class Spring2021QuestionFour {
    public static void main(String[] args) {
        int[] array1 = {10,20,30,40,50};
        int[] array2 = {5,4,3,2,1};
        int[] array3 = new int[5];

        array3 = doIt(array1, array2);

        System.out.println("array3 in main after doIt: " + Arrays.toString(array3)); 
    }

    public static int[] doIt(int[] arr1, int[] arr2) {
        int[] arr3 = new int[5];

        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i] + arr2[arr2.length - 1 - i];
        }

        return arr3;
    }
}
