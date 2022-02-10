package homework2.task4;

public class Car {

    int year;
    double speed;
    int weight;
    String color;

    public Car() {
        this.year = 2012;
        this.speed = 180;
        this.weight = 1800;
        this.color = "red";
    }

    public Car(int year) {
        this.year = year;
        this.speed = 200;
        this.weight =1900;
        this.color = "blue";
    }

    public Car(int year, double speed) {

        this(year);
        this.speed =speed;
        this.weight = 2000;
        this.color = "green";
    }

    public Car(int year, double speed, int weight) {

        this(year, speed);
        this.weight = 2800;
        this.color = "purple";
    }

    public Car(int year, double speed, int weight, String color) {

        this(year, speed, weight);
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", speed=" + speed +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }
}
