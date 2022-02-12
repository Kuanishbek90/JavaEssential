package homework3.task2;

/**
 * Создать класс, представляющий учебный класс ClassRoom.
 * Создайте класс ученик Pupil. В теле класса создайте методы void study(), void read(), void write(), void relax().
 * Создайте 3 производных класса ExcelentPupil, GoodPupil, BadPupil от класса базового класса Pupil и
 * переопределите каждый из методов, в зависимости от успеваемости ученика.
 * Конструктор класса ClassRoom принимает аргументы типа Pupil, класс должен состоять из 4 учеников.
 * Выведите информацию о том, как все ученики экземпляра класса ClassRoom умеют учиться, читать, писать,
 * отдыхать.
 */
public class Pupil {
    public void study() {
        System.out.println("I study");
    }

    public void read() {
        System.out.println("I read");
    }

    public void write() {
        System.out.println("I write");
    }

    public void relax() {
        System.out.println("I relax");
    }
}

class ExcelentPupil extends Pupil {
    @Override
    public void study() {
        System.out.println("I study excelent");
    }

    @Override
    public void read() {
        System.out.println(" I read excelent");
    }

    @Override
    public void write() {
        System.out.println(" I write excelent");
    }

    @Override
    public void relax() {
        System.out.println("I relax excelent");
    }
}
class GoodPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("I study good");
    }

    @Override
    public void read() {
        System.out.println("I read good");
    }

    @Override
    public void write() {
        System.out.println("I write good");
    }

    @Override
    public void relax() {
        System.out.println("I relax good");
    }
}
class BadPupil extends Pupil{
    @Override
    public void study() {
        System.out.println("I study bad");
    }

    @Override
    public void read() {
        System.out.println("I read bad");
    }

    @Override
    public void write() {
        System.out.println("I write bad");
    }

    @Override
    public void relax() {
        System.out.println("I relax bad");
    }
}
