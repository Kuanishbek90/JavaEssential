package homework6.add_task;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.add(12, 23);
        calculator.sub(73, 34);
        calculator.div(45, 5);
        calculator.mul(5, 7);
    }
}
