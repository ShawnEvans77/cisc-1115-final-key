public class Spring2025Question7 {
    public static void main(String[] args) {

        int[] histogram = new int[100];

        for (int i = 0; i < 100; i++) {
            int random = (int) (Math.random() * (90 - 65 + 1) + 65);
            histogram[random]++;
        }

        for (int i = 65; i <= 90; i++) {
            char character = (char) i;
            System.out.println(character + ": " + histogram[i]);
        }
    }
    
}
