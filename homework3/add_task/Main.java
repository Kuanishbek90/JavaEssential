package homework3.add_task;

public class Main extends Printer {
    public static void main(String[] args) {
        Printer main = new Main();
        Printer printer = new Printer();

        main.print("Только жёлтый цвет");
        printer.print("Зелёный ", "\nКрасный");
    }
}
