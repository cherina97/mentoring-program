package modules.git.part2;

public class Operations {
    public static void main(String[] args) {
        System.out.println(add(1, 2));
        System.out.println(subtraction(1, 2));
        System.out.println(division(1, 2));
        System.out.println(multiplication(1, 2));
    }

    public static int add(int a, int b) {
        System.out.println("This is add method for 2 params");
        System.out.println("This is add method");
        return a + b;
    }

    public static int add(int a, int b, int c) {
        System.out.println("This is add method for 3 params");
        return a + b + c;
    }

    public static int add(int a, int b, int c, int d) {
        System.out.println("This is add method for 4 params");
        return a + b + c + d;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int sqrt(int a) {
        return a * a;
    }
}
