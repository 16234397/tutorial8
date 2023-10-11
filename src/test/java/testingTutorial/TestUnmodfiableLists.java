package testingTutorial;

import org.junit.Assert;
import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class TestUnmodfiableLists {

    private static List<String> unmodList;

    @BeforeEach
    public void variables() {
        List<String> normalList = new ArrayList<String>();
        normalList.add("red");
        normalList.add("green");
        normalList.add("blue");

        unmodList = Collections.unmodifiableList(normalList);
    }


    @Test
    public void add() {
        Assert.assertThrows(UnsupportedOperationException.class, () -> unmodList.add("test"));
    }

    @Test
    public void iterate(){
        StringBuilder iterationResult = new StringBuilder();
        for (String color : unmodList) {
            iterationResult.append(color.charAt(0));
        }
        assertEquals("rgb",iterationResult.toString());

    }


}
