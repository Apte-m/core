package phone;

import java.util.*;

public class Phone {
    private HashMap<String, Set<Integer>> phone;

    public Phone() {
        this.phone = new HashMap<>();
    }


    public void add(String famille, Integer contacts) {
        if (!phone.containsKey(famille)) {
            phone.put(famille, new HashSet<>());
        }
        phone.get(famille).add(contacts);
    }


    public Set<Integer> get(String famille) {
        return phone.get(famille);
    }


}


