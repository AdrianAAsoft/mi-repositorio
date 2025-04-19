import java.util.Scanner;

public class Actividad5 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("=== Calculadora de Área y Perímetro ===");
            System.out.println("Figuras disponibles:");
            System.out.println("1. Círculo");
            System.out.println("2. Cuadrado");
            System.out.println("3. Triángulo");
            System.out.println("4. Rectángulo");
            System.out.println("5. Pentágono");
            System.out.print("Elige una figura (1-5): ");
            int figura = scanner.nextInt();

            System.out.println("¿Qué deseas calcular?");
            System.out.println("1. Área");
            System.out.println("2. Perímetro");
            System.out.print("Elige una opción (1-2): ");
            int operacion = scanner.nextInt();

            switch (figura) {
                case 1:
                    System.out.print("Ingresa el radio del círculo: ");
                    double radio = scanner.nextDouble();
                    if (operacion == 1) {
                        double area = Math.PI * Math.pow(radio, 2);
                        System.out.printf("Área del círculo: %.2f\n", area);
                    }
                    else if (operacion == 2){
                        double perimetro = 2 * Math.PI * radio;
                        System.out.printf("Perímetro del círculo: %.2f\n", perimetro);
                    }else{
                        System.out.println("Opción no válida.");

                    }
                    break;

                case 2:
                    System.out.print("Ingresa el lado del cuadrado: ");
                    double lado = scanner.nextDouble();
                    if (operacion == 1) {
                        double area = lado * lado;
                        System.out.printf("Área del cuadrado: %.2f\n", area);
                    }else if (operacion == 2){
                        double perimetro = 4 * lado;
                        System.out.printf("Perímetro del cuadrado: %.2f\n", perimetro);
                    }else{
                    System.out.println("Opción no válida.");

                }
                    break;

                case 3:
                    if (operacion == 1) {
                        System.out.print("Ingresa la base del triángulo: ");
                        double base = scanner.nextDouble();
                        System.out.print("Ingresa la altura del triángulo: ");
                        double altura = scanner.nextDouble();
                        double area = (base * altura) / 2;
                        System.out.printf("Área del triángulo: %.2f\n", area);
                    }else if (operacion == 2){
                        System.out.print("Ingresa el lado A: ");
                        double a = scanner.nextDouble();
                        System.out.print("Ingresa el lado B: ");
                        double b = scanner.nextDouble();
                        System.out.print("Ingresa el lado C: ");
                        double c = scanner.nextDouble();
                        double perimetro = a + b + c;
                        System.out.printf("Perímetro del triángulo: %.2f\n", perimetro);
                    }else{
                    System.out.println("Opción no válida.");

                }
                    break;

                case 4:
                    System.out.print("Ingresa la base: ");
                    double baseR = scanner.nextDouble();
                    System.out.print("Ingresa la altura: ");
                    double alturaR = scanner.nextDouble();
                    if (operacion == 1) {
                        double area = baseR * alturaR;
                        System.out.printf("Área del rectángulo: %.2f\n", area);
                    }else if (operacion == 2){
                        double perimetro = 2 * (baseR + alturaR);
                        System.out.printf("Perímetro del rectángulo: %.2f\n", perimetro);
                    }else{
                    System.out.println("Opción no válida.");

                }
                    break;

                case 5:
                    System.out.print("Ingresa el lado del pentágono: ");
                    double ladoP = scanner.nextDouble();
                    if (operacion == 1) {
                        System.out.print("Ingresa el apotema del pentágono: ");
                        double apotema = scanner.nextDouble();
                        double area = (5 * ladoP * apotema) / 2;
                        System.out.printf("Área del pentágono: %.2f\n", area);
                    }else if (operacion == 2){
                        double perimetro = 5 * ladoP;
                        System.out.printf("Perímetro del pentágono: %.2f\n", perimetro);
                    }else{
                    System.out.println("Opción no válida.");

                }
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            scanner.close();
        }



}
