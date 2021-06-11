package model;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class User implements Serializable {
    //    public static final long serialVersionUID = 123455661L;
    private String login;
    private transient String password;
    private int year;
    private boolean admin;
    private Car car;
    private List<Phone> phones = new ArrayList<>();

    public User() {
    }

    public User(String login, String password, int year, boolean admin) {
        this.login = login;
        this.password = password;
        this.year = year;
        this.admin = admin;
    }

    public User(String login, String password, int year, boolean admin, Car car) {
        this.login = login;
        this.password = password;
        this.year = year;
        this.admin = admin;
        this.car = car;
    }

    public User(String login, String password, int year, boolean admin, Car car, List<Phone> phones) {
        this.login = login;
        this.password = password;
        this.year = year;
        this.admin = admin;
        this.car = car;
        this.phones = phones;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", year=" + year +
                ", admin=" + admin +
                ", car=" + car +
                ", phones=" + phones +
                '}';
    }
}
