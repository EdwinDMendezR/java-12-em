package news.method.strings;

import org.junit.jupiter.api.Test;

public class IndentTest {

    @Test
    public void indenTest() {
        String originalString = "java 7 \njava 8 \njava 9 \njava 10 \njava 11 \njava 12 \n";
        String indentedString = originalString.indent(4);
        System.out.println("String Indent:\n" + indentedString);
        // "String Indent:
        //            java 7
        //            java 8
        //            java 9
        //            java 10
        //            java 11
        //            java 12
    }

}
