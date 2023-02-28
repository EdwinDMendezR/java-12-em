package compact.number.formatting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumberFormattingTest {

    @Test
    public void getCompactNumberInstanceTest() {
        NumberFormat formatter = NumberFormat.getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);
        String formatted = formatter.format(1000000);
        Assertions.assertEquals("1M", formatted);
    }

}
