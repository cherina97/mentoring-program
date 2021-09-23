package modules.git.part2;

public class Operations {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(subtraction(1, 2));
        System.out.println(division(1, 2));
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int division(int a, int b) {
        return a / b;
    }
}
