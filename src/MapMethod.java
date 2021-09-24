import java.util.HashMap;
import java.util.Map;

public class MapMethod {

    public static Map<Character, String> mapMethod(String[] array) {

        Map<Character, String> map = new HashMap<>();
        for (String s : array) {
            char key = s.charAt(0);
            if (!map.containsKey(key)) {
                map.put(key, s);
            } else {
                map.replace(key, map.get(key) + s);
            }
        }
        return map;

    }
}