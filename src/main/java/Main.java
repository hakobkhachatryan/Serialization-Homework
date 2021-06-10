import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Arm",123));
        phones.add(new Phone("EN",223));
        phones.add(new Phone("Rus",323));
        phones.add(new Phone("FRANCE",423));
        User user = new User("login1","password",1,true,new Car("mers"),phones);
//        User user = new User("login1","password",1,true);
        Gson gson = new Gson();
        String jString = gson.toJson(user);
        System.out.println(jString);

        User user2 = gson.fromJson(jString,User.class);
        System.out.println(user2);

        XmlMapper xmlMapper = new XmlMapper();
        String xmlString = null;
        try {
            xmlString = xmlMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            System.out.println("exception in writeFile");
        }
        System.out.println(xmlString);


        User user1 = xmlMapper.readValue(xmlString,User.class);
        System.out.println(user1);
//        try {
//            User user1 = xmlMapper.readValue(xmlString,User.class);
//            System.out.println(user1);
//        } catch (JsonProcessingException e) {
//            System.out.println("exception in readFile");
//        }
//


    }
}
