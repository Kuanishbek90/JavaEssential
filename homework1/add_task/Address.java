package homework1.add_task;

public class Address {

    int index;
    String country;
    String city;
    String street;
    int house;
    int apartment;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouse() {
        return house;
    }

    public void setHouse(int house) {
        this.house = house;
    }

    public int getApartment() {
        return apartment;
    }

    public void setApartment(int apartment) {
        this.apartment = apartment;
    }


    public String toString() {
        return "Address{" +
                "\nindex = " + index +
                ", \ncountry ='" + country + '\'' +
                ", \ncity ='" + city + '\'' +
                ", \nstreet ='" + street + '\'' +
                ", \nhause ='" + house + '\'' +
                ", \napartment ='" + apartment + '\'' +
                '}';
    }
}
