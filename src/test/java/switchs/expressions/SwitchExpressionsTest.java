package switchs.expressions;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

public class SwitchExpressionsTest {

    @Test
    public void switchTest() {
        int dia = 2;
        String nombreDia = switch (dia) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            default -> "Fin de semana";
        };
        Assertions.assertEquals("Martes", nombreDia);
    }

    public Function<Integer, String> getDia() {
        return s ->  switch (s) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miércoles";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            default -> "Fin de semana";
        };
    }

}
