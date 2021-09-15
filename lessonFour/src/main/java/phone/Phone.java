package phone;

import java.util.HashMap;
import java.util.Map;

public class Phone {
    private Map<String, String> stringLongMap = new HashMap<>();

    public String get(String a) {
        return stringLongMap.get(a);


    }

    public void add(String a, String b) {
        stringLongMap.put(a, b);

    }

    @Override
    public String toString() {
        return
                "Фамилия" + stringLongMap;
    }
}