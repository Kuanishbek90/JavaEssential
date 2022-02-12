package homework3.task3;

public class Plane extends Vehicle {
    int height;
    int amount;

    Plane(int height, int amount) {
        this.height = height;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return " Цена = " + cost + " Скорость = " + speed + " Год выпуска = " + year + " Высота = "
                + height + " Количество пассажиров = " + amount;
    }
}
