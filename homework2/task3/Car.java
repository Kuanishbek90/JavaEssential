package homework2.task3;

public class Car {
    int year;
    double speed;
    int weight;
    String colour;

    Car() {
        this.year = 2021;
        this.speed = 200;
        this.weight = 1800;
        this.colour = "blue";
    }

    Car(int year) {
        this.year = year;
        this.speed = 200;
        this.weight = 1800;
        this.colour = "blue";
    }

    Car(int year, double speed) {
        this.year = year;
        this.speed = speed;
        this.weight = 1800;
        this.colour = "blue";
    }

    Car(int year, double speed, int weight) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = "blue";
    }

    Car(int year, double speed, int weight, String colour) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "year = " + year + ", speed = " + speed + ", weight = " + weight + ", colour = " + colour + '!';
    }
}
