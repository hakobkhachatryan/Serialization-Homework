import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Arm",123));
        phones.add(new Phone("EN",223));
        phones.add(new Phone("Rus",323));
        phones.add(new Phone("FRANCE",423));
        User user = new User("login1","password",1,true,new Car("mers"),phones);
        user.setCar(new Car("BMW"));
        UserService.serializeUser(user);

        User user2 = UserService.deSerializeUser();
        System.out.println(user2);

    }
}
