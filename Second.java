import java.util.HashMap;
import java.util.Map;

public class Second {

    public static void main(String[] args) {
        String str = "{a}[+]{(d*3)";
        Map<Character, Integer> db = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (db.containsKey(str.charAt(i))) {
                db.put(str.charAt(i), 1+db.get(str.charAt(i)));
            } else {
                db.put(str.charAt(i), 1);
            }
            
        }
        if (db.get('{') == db.get('}') && db.get('[') == db.get(']')) {
            System.out.println("Good");
        } else {
            System.out.println("Bad");
        }

    }
}
