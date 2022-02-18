package homework6.task3;

import java.util.concurrent.Callable;

/**
 * Создать класс Distance с полем distance типа double и методом print. В классе Distance, создайте вложенный класс
 * Converter со статическими методами, которые будут конвертировать расстояние в разные единицы измерения
 * (к примеру, из метров в километры, из километров в мили, и так далее).
 */
public class Distance {
    double distance;

    public void print() {
        System.out.println(distance);

    }

    public static void main(String[] args) {

        Converter.fromMeterToKm(1000);
        Converter.fromKmToMile(100);
        //Какой метод считается норм  верхний или нижный
        System.out.println(Converter.fromSmToMeter(200) + " meter");
        System.out.println(Converter.fromSmToDm(100) + " dm");


    }

    class  Converter {
        static double fromMeterToKm(double meter) {
            double result = meter / 1000;
            System.out.println(result + " km");
            return result;
        }

        static double fromKmToMile(double km) {
            double result = km * 0.6214;
            System.out.println(result + " mile");
            return result;
        }

        static double fromSmToMeter(double sm) {
            return sm / 100;
        }

        static double fromSmToDm(double sm) {
            return sm / 10;
        }
    }

}
