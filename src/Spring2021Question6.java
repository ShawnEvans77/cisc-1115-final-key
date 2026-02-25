import java.util.Scanner;
public class Spring2021Question6 {

    public static void main(String[] args) {

        int[] histogram = new int[101];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter some numbers between 1 and 100. Enter -1 to terminate the program: ");
        
        int number = sc.nextInt();

        while (number != -1) {

            if (number < 1 || number > 100) {
                System.out.println("ERROR: Number must be between 1 and 100.");
            } else {
                histogram[number]++;
            }

            number = sc.nextInt();
        }

        System.out.println("The following numbers were not read in: ");

        for (int i = 1; i < histogram.length; i++) {
            if (histogram[i] == 0) {
                System.out.print(i + " ");
            }
        }

        sc.close();
    }

}
