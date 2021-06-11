package test;

import model.Car;
import model.Phone;
import model.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserSerializeTest {
    public static void doSerialize() {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Arm", 123));
        phones.add(new Phone("EN", 223));
        phones.add(new Phone("Rus", 323));
        phones.add(new Phone("FRANCE", 423));
        User user = new User("login1", "password", 1, true, new Car("mers"), phones);
        user.setCar(new Car("BMW"));
        UserService.serializeUser(user);
    }

    public static void doDeSerialize() {
        User user = UserService.deSerializeUser();
        System.out.println(user);
    }
}