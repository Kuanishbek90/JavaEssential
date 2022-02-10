package homework2.task3;

public class Main {
    public static void main(String[] args) {
        Car bmw = new Car();
        Car kia = new Car(2013);
        Car lada = new Car(2010, 180.0);
        Car opel = new Car(2017, 200.0, 2100);
        Car renault = new Car(2020, 240.0, 2000, "red");
        System.out.println("BMW - " + bmw);
        System.out.println("KIA - " + kia);
        System.out.println("LADA - " + lada);
        System.out.println("OPEL - " + opel);
        System.out.println("RENAULT - " + renault);
    }
}
