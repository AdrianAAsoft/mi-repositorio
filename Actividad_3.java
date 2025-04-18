import java.util.Scanner;
import java.util.InputMismatchException;

public class Actividad_3 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {

            System.out.println("=== Registro de Visitantas semanal ===");

            System.out.print("Ingrese la cedula del visitante: ");
            String id = scanner.next();

            System.out.print("Ingrese la edad del visitante: ");
            int edad = scanner.nextInt();

            System.out.print("Ingrese el género del visitante (M/F): ");
            char genero = scanner.next().charAt(0);

            System.out.print("¿Cuántas visitas hizo esta semana? ");
            int cantidadVisitas = scanner.nextInt();

                double duracion;
                byte piso;
                short departamento;
                double sumaDuraciones = 0;

            for (int i = 1; i <= cantidadVisitas; i++) {
                System.out.println("\n--- Visita #" + i + " ---");

                System.out.print("Ingrese la duración estimada de la visita en horas: ");
                 duracion = scanner.nextDouble();

                System.out.print("Ingrese el piso a visitar (1 a 10): ");
                 piso = scanner.nextByte();

                System.out.print("Ingrese el número del departamento (1-5): ");
                 departamento = scanner.nextShort();
                sumaDuraciones += duracion;

            }

            double promedioDuracion = sumaDuraciones / cantidadVisitas;

                // Mostrar la información del visitante
            System.out.println("\n=== Información del Visitante ===");
            System.out.println("ID: " + id);
            System.out.println("Edad: " + edad + " (" + (edad >= 18 ? "Mayor de edad" : "Menor de edad") + ")");
            System.out.println("Género: " + genero);
            System.out.println("Cantidad total de visitas: " + cantidadVisitas);
            System.out.printf("Tiempo promedio de estadía: %.2f horas%n", promedioDuracion);

    } catch (InputMismatchException e) {
                System.out.println("\nError: Entrada inválida. Asegúrese de ingresar los datos correctamente.");
        } catch (Exception e) {
                System.out.println("\nHa ocurrido un error inesperado: " + e.getMessage());
        } finally {
                scanner.close();
        }
    }
}


