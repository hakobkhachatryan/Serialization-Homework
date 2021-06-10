import java.io.Serializable;

public class Phone implements Serializable {
    private String country;
    private int number;

    public Phone(String country, int number) {
        this.country = country;
        this.number = number;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "country='" + country + '\'' +
                ", number=" + number +
                '}';
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
