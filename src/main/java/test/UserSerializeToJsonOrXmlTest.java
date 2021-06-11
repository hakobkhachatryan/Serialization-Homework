package test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import model.Phone;
import model.User;

import java.util.ArrayList;
import java.util.List;

public class UserSerializeToJsonOrXmlTest {
    private static String jString;
    static Gson gson = new Gson();
    public static void serializeToJson(){
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Arm",123));
        phones.add(new Phone("EN",223));
        phones.add(new Phone("Rus",323));
        phones.add(new Phone("FRANCE",423));
//        User user = new User("login1","password",1,true,new Car("mers"),phones);
//        User user = new User("login1","password",1,true,new Car("mers"));
        User user = new User("login1","password",1,true);
        jString = gson.toJson(user);
        System.out.println(jString);
    }
    public static void deSerializeFromJson(){
        User user = gson.fromJson(jString,User.class);
        System.out.println(user);

    }

    static XmlMapper xmlMapper = new XmlMapper();
    static String xmlString;

    public static void serializeToXml(){
        List<Phone> phones = new ArrayList<>();
        phones.add(new Phone("Arm",123));
        phones.add(new Phone("EN",223));
        phones.add(new Phone("Rus",323));
        phones.add(new Phone("FRANCE",423));
//        User user = new User("login1","password",1,true,new Car("mers"),phones);
//        User user = new User("login1","password",1,true,new Car("mers"));
        User user = new User("login1","password",1,true);
        try {
            xmlString = xmlMapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            System.out.println("exception in writeFile");
        }
        System.out.println(xmlString);
    }

    public static void deSerializeFromXml(){
        try {
            User user1 = xmlMapper.readValue(xmlString,User.class);
            System.out.println(user1);
        } catch (JsonProcessingException e) {
            System.out.println("exception in readFile");
        }
    }

}
