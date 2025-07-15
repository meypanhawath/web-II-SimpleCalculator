import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float val1, val2, val3;

        System.out.print("👉 Enter Value 1: ");
        val1 = input.nextFloat();
        System.out.print("👉 Enter Value 2: ");
        val2 = input.nextFloat();
        System.out.print("👉 Enter Value 3: ");
        val3 = input.nextFloat();
        System.out.println("=".repeat(30));
        float sum = val1 + val2 + val3;
        float sub = val1 - val2 - val3;
        float mul = val1 * val2 * val3;
        float div = val1 / val2 / val3;

        System.out.println("➕ The sum is: " + sum);
        System.out.println("➖ The sub is: " + sub);
        System.out.println("✖️ The mul is: " + mul);
        System.out.printf("➗ The div is: %.2f", div);
    }
}
