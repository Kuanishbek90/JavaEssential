package homework7.addTask;

/**
 * Создайте перечислительный тип (enum) Vehicles, содержащий конструктор, который должен принимать целочисленное
 * значение (стоимость автомобиля). Энум должен содержать метод getColor(), который возвращает строку с цветом автомобиля,
 * и  перегруженный метод toString(), который должен возвращать строку с названием экземпляра, цветом и стоимостью автомобиля.
 */
public enum Vehicles {
    BMW(10_000, (char) 27 + "[01;31m"), LADA(5_000, (char) 27 + "[01;32m"),
    KIA(7_000, (char) 27 + "[01;33m");
    int price;
    private String color;

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return getColor() + this.name() + ": Car price = " + price + ":  this car in this color";
    }
}
class Main{
    public static void main(String[] args) {
        //Vehicles vehicles = null;
        System.out.println(Vehicles.BMW);
        System.out.println(Vehicles.LADA);
        System.out.println(Vehicles.KIA);
    }
}
