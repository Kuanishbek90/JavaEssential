package homework2.task4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(2013);
        Car car3 = new Car(2014, 200);
        Car car4 = new Car(2015, 220, 2000);
        Car car5 = new Car(2016, 240, 2200, "white");


        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
