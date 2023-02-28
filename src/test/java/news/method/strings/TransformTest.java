package news.method.strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TransformTest {

    @Test
    public void methodTest() {
        String originalString = "java 12";
        String transformedString = originalString.transform(s -> s.toUpperCase());
        Assertions.assertEquals("JAVA 12", transformedString);
    }

}
