package homework3.task2;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
       ClassRoom [] classRooms = new ClassRoom[3];

       classRooms[0] = new ClassRoom(new ExcelentPupil());
        classRooms[1] = new ClassRoom(new GoodPupil());
        classRooms[2] = new ClassRoom(new BadPupil());
    }
}
