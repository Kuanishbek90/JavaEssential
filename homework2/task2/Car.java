package homework2.task2;

public class Car {
    int year;
    String colour;


    public Car() {
        year = 2022;
        colour = "black";
    }

    public Car(int year, String colour) {
        this.year = year;
        this.colour = colour;
    }

    public Car(int year) {
        this.year = year;
        colour = "red";
    }

}