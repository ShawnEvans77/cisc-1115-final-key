public class Spring2025Question3 {

    public static void main(String[] args) {

        String x = "(718)567-8971(345)675-0987(865)912-9090";

        int i = 0;

        System.out.printf("%13s %7s %13s\n", "area code", "prefix", "subscriber #");

        while (i < x.length()) {
            String phoneNumber = x.substring(i, i+13);

            String areaCode = phoneNumber.substring(1, 4);
            String prefix = phoneNumber.substring(5, 8);
            String subscriberNumber = phoneNumber.substring(9, 13);

            System.out.printf("%13s %7s %13s\n", areaCode, prefix, subscriberNumber);

            i += 13;
        }
    }
    
}
