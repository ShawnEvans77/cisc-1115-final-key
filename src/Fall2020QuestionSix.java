public class Fall2020QuestionSix {
    public static void main(String[] args) {
        String str = "11230-1234 11011-3489 07261-8845";

        while (str.indexOf("-") != - 1) {
            String firstFive = str.substring(0, 5);
            str = str.substring(str.indexOf("-") + 1);

            String secondFour = str.substring(0, 4);
            System.out.println(firstFive + " " + secondFour);

            str = str.substring(str.indexOf(" ") + 1);
        }

    }
}
