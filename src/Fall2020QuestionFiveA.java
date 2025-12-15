public class Fall2020QuestionFiveA {
    public static void main(String[] args) {

        // we do not need to initialize i, j, k, l, m, and n in the exam, but it is necessary for the program to compile.
        
        int i = 1;
        int j = 2;
        int k = 45;
        int l = 4;
        int m = 5;
        int n = 6;

        int max = Math.max(Math.max( Math.max(i, j), Math.max(k, l)), Math.max(m, n));

        System.out.printf("The max is: %d\n", max);
    }
    
}
