public class Fall2020Question2 {
    public static void main(String[] args) {
        int inches = 245897;
        int miles = inches / (5280*12);

        int remainingYards = inches % (5280*12);
        int yards = remainingYards / 36;

        int remainingFeet = inches % 36;
        int feet = remainingFeet / 12;
        
        int remainingInches = inches % 12;

        System.out.printf("%d inches equals %d miles %d yards %d foot and %d inches\n", 
        inches, miles, yards, feet, remainingInches);
    }
    
}
