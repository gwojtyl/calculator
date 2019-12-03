public class Calculator {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        Calculator calculator = new Calculator();

        System.out.println(calculator.add(a, b));
        System.out.println(calculator.subtract(a, b));
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
