import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import com.google.gson.Gson;
import model.*;
import test.UserSerializeToJsonOrXmlTest;


import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws JsonProcessingException {
        UserSerializeToJsonOrXmlTest.serializeToJson();
        UserSerializeToJsonOrXmlTest.deSerializeFromJson();
        UserSerializeToJsonOrXmlTest.serializeToXml();
        UserSerializeToJsonOrXmlTest.deSerializeFromXml();
    }
}
