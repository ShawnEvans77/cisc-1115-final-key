public class Spring2025Question1 {
    public static void main(String[] args) {

        int[] A = {1,8,11,5};
        int[] B = {6, 5, 11, 3};
        int[] C = {0,0,0,0};

        computeArray(A, B, C);

        for (int i = 0; i < A.length; i++) {
            System.out.print(C[i] + " ");
        }   
    }

    public static void computeArray(int[] A, int[] B, int[] C) {

        int n = A.length;

        for (int i = 0; i < n; i++) {
            if (A[i] > B[i]) {
                C[i] = A[i] - B[i];
            } else if (A[i] < B[i]) {
                C[i] = B[i] - A[i];
            } else {
                C[i] = 0;
            }
        }

    }
    
}
