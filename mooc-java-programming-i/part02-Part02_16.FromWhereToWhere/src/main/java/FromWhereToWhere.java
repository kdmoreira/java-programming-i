
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Where to?");
        int limit = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int base = Integer.valueOf(scanner.nextLine());
        
        if (base <= limit) {
            for (int i = base; i <= limit; i++) {
                System.out.println(i);
            }
        }
        
    }
}
