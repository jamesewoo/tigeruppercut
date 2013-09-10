package epi.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Created with IntelliJ IDEA.
 * User: evadrone
 * Date: 9/10/13
 * Time: 1:56 AM
 */
public class HashTableUtils {

    public static boolean anonymousLetter(String letter, String magazine) {
        Map<Character, Integer> map = new HashMap<>();
        for (Character c : letter.toCharArray()) {
            map.put(c, map.get(c) == null ? 1 : map.get(c) + 1);
        }
        for (Character c : magazine.toCharArray()) {
            if (map.get(c) != null) {
                if (map.get(c) - 1 <= 0)
                    map.remove(c);
                else
                    map.put(c, map.get(c) - 1);
            }
        }
        return map.isEmpty();
    }
}
