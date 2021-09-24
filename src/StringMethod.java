import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringMethod {

    public static boolean stringCheck(String userString) {
        userString = userString.toLowerCase();
        Pattern p = Pattern.compile("cat");
        Matcher m = p.matcher(userString);
        int catCounter = 0;
        while (m.find()) {
            catCounter++;
        }
        p = Pattern.compile("dog");
        m = p.matcher(userString);
        int dogCounter = 0;
        while (m.find()) {
            dogCounter++;
        }
        return catCounter == dogCounter;
    }

    public static String withoutRemove(String base, String remove) {
        base = base.replaceAll(remove, "");
        return base;
    }
}