package ARSWEstadistias;

import java.util.function.ToDoubleFunction;

public class Calculadora {
    public static <T> double mean(ListaEnlazada<T> list, ToDoubleFunction<T> mapper) {
        double sum = 0;
        int count = 0;
        for (T val : list) {
            sum += mapper.applyAsDouble(val);
            count++;
        }

        return count == 0 ? 0 : sum/count;
    }

    public static <T> double stdDev(ListaEnlazada<T> list, ToDoubleFunction<T> mapper) {
        double mean = mean(list, mapper);
        double sumSq = 0;
        int count = 0;
        for (T val : list) {
            double x = mapper.applyAsDouble(val);
            sumSq += Math.pow(x - mean, 2);
            count ++;
        }
        return count == 0 ? 0 : Math.sqrt(sumSq / count);
    }
}
