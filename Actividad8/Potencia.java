package Actividad8;

public class Potencia implements Operacion{
    public double calcular(double a, double b) {
        return potenciaRecursiva(a, (int)b);
    }

    private double potenciaRecursiva(double base, int exponente) {
        if (exponente == 0) return 1;
        return base * potenciaRecursiva(base, exponente - 1);
    }
}

