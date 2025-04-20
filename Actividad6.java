import java.util.Scanner;
import java.util.InputMismatchException;

public class Actividad6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] resultados = new double[100];
        int contadorResultados = 0;

        System.out.println("=== Calculadora de Área y Perímetro ===");

        boolean continuar = true;

        while (continuar) {
            try {
                System.out.println("\nFiguras disponibles:");
                System.out.println("1. Círculo");
                System.out.println("2. Cuadrado");
                System.out.println("3. Triángulo");
                System.out.println("4. Rectángulo");
                System.out.println("5. Pentágono");
                System.out.println("6. Ver resultados almacenados");
                System.out.println("0. Salir");

                System.out.print("Elige una figura (0-6): ");
                int figura = scanner.nextInt();

                if (figura == 0) {
                    continuar = false;
                    break;
                }

                if (figura == 6) {
                    System.out.println("\n=== Resultados Almacenados ===");
                    if(contadorResultados==0){
                        System.out.println("No hay resultados");
                        System.out.println("------------------------");

                    }else{
                    for (int i = 0; i < contadorResultados; i++) {
                        System.out.printf("%d. Resultado: %.2f\n", i + 1, resultados[i]);
                    }
                    continue;}

                }

                System.out.println("¿Qué deseas calcular?");
                System.out.println("1. Área");
                System.out.println("2. Perímetro");
                System.out.print("Elige una opción (1-2): ");
                int operacion = scanner.nextInt();

                double resultado = 0;

                switch (figura) {
                    case 1:
                        System.out.print("Ingresa el radio: ");
                        double radio = scanner.nextDouble();
                        resultado = (operacion == 1) ?
                                Math.PI * Math.pow(radio, 2) :
                                2 * Math.PI * radio;
                        break;

                    case 2:
                        System.out.print("Ingresa el lado: ");
                        double lado = scanner.nextDouble();
                        resultado = (operacion == 1) ?
                                lado * lado :
                                4 * lado;
                        break;

                    case 3:
                        if (operacion == 1) {
                            System.out.print("Ingresa la base: ");
                            double base = scanner.nextDouble();
                            System.out.print("Ingresa la altura: ");
                            double altura = scanner.nextDouble();
                            resultado = (base * altura) / 2;
                        } else {
                            System.out.print("Ingresa el lado A: ");
                            double a = scanner.nextDouble();
                            System.out.print("Ingresa el lado B: ");
                            double b = scanner.nextDouble();
                            System.out.print("Ingresa el lado C: ");
                            double c = scanner.nextDouble();
                            resultado = a + b + c;
                        }
                        break;

                    case 4:
                        System.out.print("Ingresa la base: ");
                        double baseR = scanner.nextDouble();
                        System.out.print("Ingresa la altura: ");
                        double alturaR = scanner.nextDouble();
                        resultado = (operacion == 1) ?
                                baseR * alturaR :
                                2 * (baseR + alturaR);
                        break;

                    case 5:
                        System.out.print("Ingresa el lado: ");
                        double ladoP = scanner.nextDouble();
                        if (operacion == 1) {
                            System.out.print("Ingresa el apotema: ");
                            double apotema = scanner.nextDouble();
                            resultado = (5 * ladoP * apotema) / 2;
                        } else {
                            resultado = 5 * ladoP;
                        }
                        break;

                    default:
                        System.out.println("Figura no válida.");
                        continue;
                }

                System.out.printf("Resultado: %.2f\n", resultado);

                if (contadorResultados < resultados.length) {
                    resultados[contadorResultados] = resultado;
                    contadorResultados++;
                } else {
                    System.out.println("Límite de resultados.");
                }

            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Intenta de nuevo.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
