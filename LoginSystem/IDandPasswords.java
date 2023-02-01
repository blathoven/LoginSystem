package LoginSystem;

import java.util.HashMap;
import java.util.Map;

public class IDandPasswords {

    Map<String, String> loginData = new HashMap<>();

    IDandPasswords() {

        loginData.put("blathoven", "123456");
        loginData.put("slavey123", "hohoboho");
        loginData.put("darklady", "darklady12");

    }

    protected Map<String, String> getLoginData() {
        return loginData;
    }
}
