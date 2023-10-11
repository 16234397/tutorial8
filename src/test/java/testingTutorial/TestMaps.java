package testingTutorial;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class TestMaps {

    @Test
    public void IdentityHashMapTest(){
        Map<String, String> identityMap = new IdentityHashMap<>();

        String key1 = "k";
        String key2 = new String("k");

        identityMap.put(key1, "99");
        String value = identityMap.get(key2);
        assertNotNull(value);

    }

    @Test
    public void HashMapTest(){
        Map<String, Integer> map = new HashMap<>();

        String key1 = "k";
        String key2 = new String("k");

        map.put(key1, 99);
        int value = map.get(key2);

        assertNotNull(value);

    }


}
