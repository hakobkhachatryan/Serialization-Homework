import model.*;
import service.UserService;
import test.UserSerializeTest;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        UserSerializeTest.doSerialize();
        UserSerializeTest.doDeSerialize();
    }
}
