package homework3.task4;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int proKey = 123;
        int expKey = 321;
        int defKey = 0;
        Scanner in = new Scanner(System.in);
        System.out.println(" Введите ключ ");
        defKey = in.nextInt();
        if (defKey == proKey) {
            System.out.println("Доступен про версия ! ");
            DocumentWorker proDoc = new ProDocumentWorker();
            proDoc.saveDocument();
        } else if (defKey == expKey) {
            System.out.println("Доступен exp версия ! ");
            DocumentWorker expDoc = new ExpertDocumentWorker();
            expDoc.saveDocument();
        } else {
            System.out.println("Доступен  версия default !");
            DocumentWorker defDoc = new DocumentWorker();
            defDoc.saveDocument();

        }
    }
}
