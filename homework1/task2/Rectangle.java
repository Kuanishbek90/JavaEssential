package homework1.task2;

import java.util.Scanner;

public class Rectangle {
    double side1;
    double side2;

    public double areaCalculator(double side1, double side2) {
        return  side1 * side2;
    }

    public double perimeterCalculator(double side1, double side2) {

        return  2 * (side1 + side2);

    }
}
