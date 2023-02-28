package teeing.collector;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class TeeingCollectorTest {

    @Test
    public void teeingTest() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Map<String, Double> result = numbers.stream()
                .collect(teeing(
                        summingDouble(Integer::doubleValue),
                        averagingDouble(Integer::doubleValue),
                        (sum, avg) -> Map.of("sum", sum, "average", avg)
                ));
        System.out.println(result);
    }

}
