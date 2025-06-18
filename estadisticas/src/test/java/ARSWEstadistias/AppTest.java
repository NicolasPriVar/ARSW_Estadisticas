package ARSWEstadistias;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testColumn3() {
        ListaEnlazada<Double> column3 = new ListaEnlazada<>();
        double[] data = {160, 591, 114, 229, 230, 270, 128, 1657, 624, 1503};
        for (double d : data) column3.add(d);

        assertEquals(550.6, Calculadora.mean(column3, x -> x), 0.1);
        assertEquals(542.672, Calculadora.stdDev(column3, x -> x), 0.001);
    }

    @Test
    public void testColumn2() {
        ListaEnlazada<Double> column2 = new ListaEnlazada<>();
        double[] data = {15.0, 69.9, 6.5, 22.4, 28.4, 65.9, 19.4, 198.7, 38.8, 138.2};
        for (double d : data) column2.add(d);

        assertEquals(60.32, Calculadora.mean(column2, x -> x), 0.01);
        assertEquals(59.061, Calculadora.stdDev(column2, x -> x), 0.001);
    }
}
