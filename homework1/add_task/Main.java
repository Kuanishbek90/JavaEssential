package homework1.add_task;

public class Main {
    public static void main(String[] args) {

        Address address = new Address();
        address.setIndex(1234);
        address.setCountry("Uzbekistan");
        address.setCity("Tashkent");
        address.setStreet("Nurli yol");
        address.setHouse(6);
        address.setApartment(5);

        System.out.println(address);
    }
}
