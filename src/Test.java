import java.util.HashMap;
import java.util.Stack;

public class Test {
    // ;

    public static boolean testMethod(String test) {
        if(test.contains("[") && test.contains("]")
        || test.contains("(") && test.contains(")")
        || test.contains("{") && test.contains("}")) {
        }
        return true;
    }

    public boolean checkBalance(String s) {
        HashMap <Character, Character> maps = new HashMap<Character, Character>();
        maps.put('(', ')');
        maps.put('{', '}');
        maps.put('[', ']');


    }
}