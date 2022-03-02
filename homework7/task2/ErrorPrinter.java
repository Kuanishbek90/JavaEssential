package homework7.task2;

/**
 * Создать функциональный интерфейс ErrorPrinter с абстрактным методом printError, принимающий строку error.
 * Создайте на базе интерфейса ErrorPrinter анонимный класс, реализующий метод printError.
 * printError принимает строку и выводит ее в консоль красным цветом
 */
public interface ErrorPrinter {
    String printError(String error);
}

class Main {
    public static void main(String[] args) {
        ErrorPrinter errorPrinter = new ErrorPrinter() {
            @Override
            public String printError(String error) {
                return (char) 27 + "[31m" + error;
            }
        };
        System.out.println(errorPrinter.printError("Текст на красном цвете ! "));
    }
}
