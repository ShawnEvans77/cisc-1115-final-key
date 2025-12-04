import java.util.*;
import java.io.*;
public class Fall2020QuestionSeven {
    public static void main(String[] args) throws IOException {
        
        String[] names = new String[100];
        double[] averageTripLength = new double[100];

        int numSalesRep = readData(names, averageTripLength);

        PrintWriter writer = new PrintWriter("output.txt");

        computeTripLength(averageTripLength, writer, numSalesRep);

        sortArray(names, averageTripLength, numSalesRep);
    
        writer.println();

        for (int i = 0; i < numSalesRep; i++) {
            writer.printf("%10s %10.2f\n", names[i], averageTripLength[i]);
        }

        writer.close();

    }

    public static int readData(String[] names, double[] averageTripLength) throws IOException {
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);

        int numSalesRep = 0;

        while (sc.hasNext()) {
            names[numSalesRep] = sc.next();
            averageTripLength[numSalesRep] = (sc.nextDouble() + sc.nextDouble()) / 2.0;
            numSalesRep++;
        }

        sc.close();

        return numSalesRep;
    }

    public static void computeTripLength(double[] averageTripLength, PrintWriter pw, int numRecords) {

        double sum = 0;

        for (int i = 0; i < numRecords; i++) {
            sum += averageTripLength[i];
        }

        double average = ( sum / numRecords );

        int aboveAverage = 0;
        int belowAverage = 0;
        int equalAverage = 0;

        for (int i = 0; i < numRecords; i++) {
            if (averageTripLength[i] == average)
                equalAverage++;
            else if (averageTripLength[i] > average)
                aboveAverage++;
            else if (averageTripLength[i] < average)
                belowAverage++;
        }

        pw.println("Above Average: " + aboveAverage);
        pw.println("Below Average: " + belowAverage);
        pw.println("Equal to the Average: " + equalAverage);
    }

    public static void sortArray(String[] names, double[] averageTripLength, int numRecords) {

        for (int i = 0; i < numRecords; i++) {
            for (int j = 0; j < numRecords - i - 1; j++) {
                if (averageTripLength[j] < averageTripLength[j+1]) {
                    String temp = names[j+1];
                    names[j+1] = names[j];
                    names[j] = temp;

                    double temp2 = averageTripLength[j+1];
                    averageTripLength[j+1] = averageTripLength[j];
                    averageTripLength[j] = temp2;
                }
            }
        }
    }
}







