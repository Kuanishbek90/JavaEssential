package homework3.task3;

public class Ship extends Vehicle {
    int count;
    String port;


    Ship(String port, int count) {
        this.count = count;
        this.port = port;
    }

    @Override
    public String toString() {
        return " Цена = " + cost + " Скорость = " + speed + " Год выпуска = " + year + " Количество пассажиров = "
                + count + " порт приписки = " + port;
    }
}
