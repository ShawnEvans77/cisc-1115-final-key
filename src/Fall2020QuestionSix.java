public class Fall2020QuestionSix {
    public static void main(String[] args) {
        String str;
        str = "11230-1234 11011-3489 07261-8845";

        // using substring. 
        while (str.indexOf("-") != - 1) {
            String firstFive = str.substring(0, 5);
            str = str.substring(str.indexOf("-") + 1);

            String secondFour = str.substring(0, 4);
            System.out.println(firstFive + " " + secondFour);

            str = str.substring(str.indexOf(" ") + 1);
        }

        System.out.println("-------------------------------------------------------");
        str = "11230-1234 11011-3489 07261-8845";

        // using split.
        String[] codes = str.split(" ");

        for (int i = 0; i < codes.length; i++) {
            String[] parts = codes[i].split("-");

            System.out.println(parts[0] + " " + parts[1]);
        }

    }
}
