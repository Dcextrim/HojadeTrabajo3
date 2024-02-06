import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

public class Randnum {
    public static int [] rand(){
        Random rand = new Random();

        int[] numerosAleatorios = new int[10];
        for (int i = 0; i < 10; i++) {
            numerosAleatorios[i] = rand.nextInt(10) + 1;
            System.out.println("Número aleatorio " + (i+1) + ": " + numerosAleatorios[i]);
        }

        try {
            PrintWriter writer = new PrintWriter("numerosprueba.csv", "UTF-8");
            for (int i = 0; i < 10; i++) {
                writer.println(numerosAleatorios[i]);
            }
            writer.close();
            System.out.println("Los números aleatorios se han guardado en el archivo 'numerosprueba.csv'.");
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error al escribir en el archivo.");
            e.printStackTrace();
        }
        return numerosAleatorios;
    }
    
}


