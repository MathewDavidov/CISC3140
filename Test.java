import java.util.*;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        ConcurrentSkipListMap<String, String> map = new ConcurrentSkipListMap<>();
	map.put("Word", "Definition");
    }
}
