package polymorphism;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class MethodOverloadingDemo {

    public static void main(String[] args) {
        Calculator obj = new Calculator();

        System.out.println("add(int, int) -> " + obj.add(10, 20));
        System.out.println("add(double, double) -> " + obj.add(5.5, 6.7));
        System.out.println("add(int, int, int) -> " + obj.add(3, 4, 5));
    }
}
