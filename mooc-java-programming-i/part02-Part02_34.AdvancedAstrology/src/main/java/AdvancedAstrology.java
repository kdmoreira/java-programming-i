
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        int count = 0;
        while (count < number) {
            System.out.print("*");
            count++;
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        int count = 0;
        while (count < number) {
            System.out.print(" ");
            count++;
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int countspace = size - 1;
        int countstar = 1;
        while (countstar < size + 1) {
            printSpaces(countspace);
            printStars(countstar);
            countstar++;
            countspace--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int countspace = height - 1;
        int countstar = 1;
        while (countstar < height + 1) {
            printSpaces(countspace);
            printStars(countstar * 2 - 1);
            countstar++;
            countspace--;
        }
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
