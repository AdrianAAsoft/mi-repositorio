import java.util.*;
import Actividad8.*;

public class Actividad8 {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Double> resultados = new ArrayList<>();

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {

            try {
                mostrarMenu();
                int opcion = scanner.nextInt();


                Operacion Operacion = null;

                switch (opcion) {
                    case 1:
                        Operacion = new Suma();
                        break;
                    case 2:
                        Operacion = new Resta();
                        break;
                    case 3:
                        Operacion = new Potencia();
                        break;
                    case 4:
                        mostrarResultados();
                        break;

                    case 0 : {
                        System.out.println("Saliendo...");
                        continuar = false;
                    }
                    default: System.out.println("Opción inválida.");
                        continue;

                }

                if( opcion >= 1 && opcion <= 3 ) {
                    System.out.print("Ingrese el primer número: ");
                    double a = scanner.nextDouble();
                    System.out.print("Ingrese el segundo número: ");
                    double b = scanner.nextDouble();


                    double resultado = Operacion.calcular(a, b);
                    resultados.add(resultado);
                    System.out.println("Resultado: " + resultado);

                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.nextLine();
            }
        }

        scanner.close();
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
