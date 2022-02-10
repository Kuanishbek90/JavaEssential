package homework2.task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        Car car1 = new Car(2018);

        Car car2 = new Car(2021, "white");


        System.out.println(car.year + " " + car.colour);
        System.out.println(car1.year + " " + car1.colour);
        System.out.println(car2.year + " " + car2.colour);

    }
}