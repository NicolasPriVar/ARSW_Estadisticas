package ARSWEstadistias;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class App {
    public static void main( String[] args) throws IOException {
        String file = "data/column2.txt";
        ListaEnlazada<Double> numeros = new ListaEnlazada<>();

        Files.lines(Paths.get(file))
                .map(Double::parseDouble)
                .forEach(numeros::add);
        double mean = Calculadora.mean(numeros, x -> x);
        double stdDev = Calculadora.stdDev(numeros, x -> x);

        System.out.println("Media: " + mean);
        System.out.println("Desviación estándar: " + stdDev);
    }
}
