import java.util.Scanner;
import java.util.InputMismatchException;

public class Actividad_3 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            try {

            System.out.println("=== Registro de Visitantes ===");

            System.out.print("Ingrese el piso a visitar (1 a 10): ");
            byte piso = scanner.nextByte();

            System.out.print("Ingrese el número del departamento (1-5): ");
            short departamento = scanner.nextShort();

            System.out.print("Ingrese la cedula del visitante: ");
            String id = scanner.next();

            System.out.print("Ingrese la duración estimada de la visita en horas: ");
            double duracion = scanner.nextDouble();

            System.out.print("Ingrese el género del visitante (M/F): ");
            char genero = scanner.next().charAt(0);

            System.out.print("¿Visita frecuentemente? (true/false): ");
            boolean Habitual = scanner.nextBoolean();

            // Mostrar la información del visitante
            System.out.println("\n=== Información del Visitante ===");
            System.out.println("ID: " + id);
            System.out.println("Piso a visitar: " + piso);
            System.out.println("Departamento: " + departamento);
            System.out.println("Duración estimada de la visita: " + duracion + " horas");
            System.out.println("Género: " + genero);
            System.out.println("¿Es residente habitual?: " + Habitual);

    } catch (InputMismatchException e) {
                System.out.println("\nError: Entrada inválida. Asegúrese de ingresar los datos correctamente.");
        } catch (Exception e) {
                System.out.println("\nHa ocurrido un error inesperado: " + e.getMessage());
        } finally {
                scanner.close();
        }
    }
}


