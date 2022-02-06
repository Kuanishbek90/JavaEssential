package homework1.task4;

public class Computer {
    String kompyuter;

    public static void main(String[] args) {
        Computer[] computers = new Computer[5];
        computers[0] = new Computer();
        computers[1] = new Computer();
        computers[2] = new Computer();
        computers[3] = new Computer();
        computers[4] = new Computer();

        for (int i = 0; i < computers.length; i++) {

            computers[i].kompyuter = "kompyuter " + i;
        }

        for (Computer comp : computers) {
            System.out.println( comp.kompyuter);
        }
    }
}
