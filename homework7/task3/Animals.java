package homework7.task3;

import static homework7.task3.Animals.*;

/**
 * Создайте перечислительный тип (enum) Animals, содержащий конструктор,
 * который должен принимать целочисленное значение (возраст животного).
 * Энум должен содержать перегруженный метод toString(), который должен
 * возвращать название экземпляра и возраст животного.
 */
public enum Animals {
    CAT(3), DOG(4), COW(6);
     int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name() + ": age = " + age;
    }
}
class Main{
    public static void main(String[] args) {
      //  Animals animal = null;
        System.out.println(CAT);
        System.out.println(DOG);
        System.out.println(COW);

    }
}
