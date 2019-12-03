import java.util.*;

public class Program {
        public static void main(String[] args) {
                HashMap<String, Integer> map = new HashMap<>();
                map.put("John", 4);
                map.put("Linda", 2);
                for (Map.Entry<String, Integer> entry: map.entrySet()) {
                        System.out.println(entry.getKey() + " " + entry.getValue());
                }
		TreeMap<String, Integer> map2 = new TreeMap<>(map);
		System.out.println(map2);
        }
}
