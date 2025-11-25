public class Fall2020QuestionOne {
    public static void main(String[] args) {
        /* 1a.*/

            /**
             * 5 10 
             * 6 9 
             * 8 6
             * 9 5
             * 10 4
            */

        int x = 5;
        int y = 10;

        do {
            x++;
            y--;
            System.out.println(x + " " + y);
            while (y > 8) {
                x = x + 2;
                y = y - 3;
                System.out.println(x + " " + y);
            }
        } while (x < 10);

        System.out.println("------------------------------------------------");

        /* 2a. */

        /**
         * 2 2
           2 1
           4 4
           4 3
           4 2
           4 1
         */

        for (int i=0; i<5; i=i+2) {
            for (int j=i; j>0; j--) { 
                //System.out.println(i + " " + j);
            }
        }
    }
}