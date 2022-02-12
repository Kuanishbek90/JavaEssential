package homework3.task3;

public class Main {
    public static void main(String[] args) {
        Vehicle plane = new Plane(4,33);
        Vehicle ship = new Ship("PORT", 44);
       Vehicle car = new Car("red", 5);

        System.out.println("PLANE - "+ plane.toString() + "!");
        System.out.println("SHIP - "+ ship.toString() + "!");
        System.out.println("CAR - "+ car.toString() + "!");
     }
}
