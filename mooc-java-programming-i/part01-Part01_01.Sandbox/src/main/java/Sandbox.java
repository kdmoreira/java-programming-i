import java.util.ArrayList;
import java.util.Scanner;

public class Sandbox {

    public static void main(String[] args) {
        // Write your program here
        ArrayList<String> lines = new ArrayList<>();
        String searched = "tofu";
        lines.add("I");
        lines.add("tofu");
        if (lines.contains(searched)) {
            System.out.println("Yes!");
        } else {
            System.out.println("No");
        }

    }
}
