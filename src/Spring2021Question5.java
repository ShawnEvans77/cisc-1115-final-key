public class Spring2021Question5 {
    public static void main(String[] args) {
        final int NUM_ROLLS = 1000;
        final int MAX_ROLL = 14;

        int[] histogram = new int[MAX_ROLL + 1];

        for (int i = 0; i < NUM_ROLLS; i++) {
            int dieOneRoll = (int) (Math.random() * (6 - 1 + 1) + 1);
            int dieTwoRoll = (int) (Math.random() * (8 - 1 + 1) + 1);

            int roll = dieOneRoll + dieTwoRoll;

            histogram[roll]++;
        }

        System.out.printf("%8s%8s\n", "Dice Sum", "Count");

        for (int i = 2; i < histogram.length; i++) {
            System.out.printf("%8d%8d\n", i, histogram[i]);
        }
    }
}