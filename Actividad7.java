import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Actividad7 {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Double> resultados = new ArrayList<>();
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            mostrarMenu();

            try {
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> realizarSuma();
                    case 2 -> realizarResta();
                    case 3 -> realizarPotencia();
                    case 4 -> mostrarResultados();
                    case 0 -> {
                        System.out.println("Saliendo...");
                        continuar = false;
                    }
                    default -> System.out.println("Opción inválida.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine();
            }
        }

        scanner.close();
    }

    public static void realizarSuma() {
        double a = pedirNumero("Ingrese el primer número: ");
        double b = pedirNumero("Ingrese el segundo número: ");
        double resultado = a + b;
        resultados.add(resultado);
        System.out.println("Resultado de la suma: " + resultado);
    }

    public static void realizarResta() {
        double a = pedirNumero("Ingrese el primer número: ");
        double b = pedirNumero("Ingrese el segundo número: ");
        double resultado = a - b;
        resultados.add(resultado);
        System.out.println("Resultado de la resta: " + resultado);
    }

    public static void realizarPotencia() {
        int base = (int) pedirNumero("Ingrese la base (entero): ");
        int exp = (int) pedirNumero("Ingrese el exponente (entero): ");
        int resultado = potencia(base, exp);
        resultados.add((double)resultado);
        System.out.println("Resultado de la potencia: " + resultado);
    }

    public static void mostrarResultados() {
        System.out.println("\n*** Resultados almacenados ***");
        if (resultados.isEmpty()) {
            System.out.println("No hay resultados.");
        } else {
            for (int i = 0; i < resultados.size(); i++) {
                System.out.println((i + 1) + ": " + resultados.get(i));
            }
        }
    }

    public static double pedirNumero(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Intente de nuevo.");
                scanner.nextLine();
            }
        }
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) return 1;
        return base * potencia(base, exponente - 1);
    }

    public static void mostrarMenu() {
        System.out.println("\n=== Calculadora ===");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Potencia");
        System.out.println("4. Ver resultados anteriores");
        System.out.println("0. Salir");
        System.out.print("Seleccione una opción: ");
    }


}
