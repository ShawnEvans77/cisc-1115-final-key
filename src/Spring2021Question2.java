import java.util.Scanner;
public class Spring2021Question2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String mostVowelsString = "";
        int highestVowelCount = 0;

        while (sc.hasNext()) {

            String word = sc.next();
            int numVowels = 0;

            for (int i = 0; i < word.length(); i++) {
                char letter = word.charAt(i);

                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                    numVowels++;
                }
            }

            if (highestVowelCount < numVowels) {
                highestVowelCount = numVowels;
                mostVowelsString = word;
            }

        }

        System.out.println();
        System.out.printf("%s - %d vowels\n", mostVowelsString, highestVowelCount);

        sc.close();
    }

}
