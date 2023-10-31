import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creamos el diccionario
        Map<String, String> diccionario = new HashMap<>();
        //Le introducimos 20 palabras
        diccionario.put("Dog", "Perro");
        diccionario.put("Cat", "Gato");
        diccionario.put("House", "Casa");
        diccionario.put("Car", "Coche");
        diccionario.put("Book", "Libro");
        diccionario.put("Friend", "Amigo");
        diccionario.put("Family", "Familia");
        diccionario.put("Tree", "Árbol");
        diccionario.put("Sun", "Sol");
        diccionario.put("Moon", "Luna");
        diccionario.put("Water", "Agua");
        diccionario.put("Food", "Comida");
        diccionario.put("Love", "Amor");
        diccionario.put("Time", "Tiempo");
        diccionario.put("Day", "Día");
        diccionario.put("Night", "Noche");
        diccionario.put("Money", "Dinero");
        diccionario.put("Job", "Trabajo");
        diccionario.put("School", "Escuela");
        diccionario.put("Heart", "Corazón");
        //El sistema va a elegir 5 palabras en español
        String[] clavesArray = diccionario.keySet().toArray(new String[0]);
        Random random = new Random();
        String[] palabrasParaTraducir = new String[5];
        for (int i = 0; i < 5; i++) {
            palabrasParaTraducir[i] = clavesArray[random.nextInt(clavesArray.length)];
        }

        Scanner scanner = new Scanner(System.in);
        int errores = 0;
        for (String palabra : palabrasParaTraducir) {
            System.out.print("Traduce la palabra '" + palabra + "': ");
            String respuestaUsuario = scanner.nextLine();
            String traduccionCorrecta = diccionario.get(palabra);
            if (respuestaUsuario.equalsIgnoreCase(traduccionCorrecta)) {
                System.out.println("✅¡Correcto!✅");
            } else {
                System.out.println("⛔¡Incorrecto!⛔. La respuesta correcta es: " + traduccionCorrecta);
                errores++;
            }
        }

        // Mostrar el resultado del juego
        System.out.println("Juego terminado. Has tenido " + errores + " errores.");


    }
}