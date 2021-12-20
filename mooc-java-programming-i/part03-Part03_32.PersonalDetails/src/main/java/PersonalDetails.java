
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        int ageCount = 0;
        String longestName = "";
        int countLongest = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }
            String[] parts = input.split(",");
            if (parts[0].length() > countLongest) {
                countLongest = parts[0].length();
                longestName = parts[0];
            }
            sum += Integer.valueOf(parts[1]);
            ageCount++;
        }
        System.out.println("Longest name: " + longestName);
        double average = (double) sum / ageCount;
        System.out.println("Average of the birth years: " + average);
    }
}
