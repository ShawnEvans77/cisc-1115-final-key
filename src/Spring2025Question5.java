public class Spring2025Question5 {
    public static void main(String[] args) {
        
        int num = 99;

        if (num % 2 == 0)
            if (num%3==0) System.out.println(num + ": " + 1);
            else System.out.println(num + ": " + 2);

        if (num % 5 == 0) System.out.println(num + ": " + 3);
        else;

        if (num%7==0) System.out.println(num + ": " + 4);
        else {
            if (num%3==0) System.out.println(num + ": " + 5);
            else System.out.println(num + ": " + 6);


        }
    }
    
}
