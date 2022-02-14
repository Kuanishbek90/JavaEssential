package homework3.task3;

public class Car extends Vehicle{
    String colour;
    int amount;
    Car(String colour, int amount){
        this.colour = colour;
        this.amount = amount;
    }
    @Override
    public String toString() {
        return " Цена = " + cost + " Скорость = " + speed + " Год выпуска = " + year + " Colour = "
                + colour + " Количество пассажиров = " + amount;
    }
}
