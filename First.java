import java.util.*;

public class First {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(123456, "Иванов");
        db.put(321456, "Васильев");
        db.put(234561, "Петров");
        db.put(234432, "Иванов");
        db.put(654321, "Петрова");
        db.put(345678, "Иванов");

        for (var i : db.entrySet()) {
            if (i.getValue().equals("Иванов")) {
                System.out.println(i.getKey());
            }
           
        }

    }
}
