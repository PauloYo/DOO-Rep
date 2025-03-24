package singleton.models;

public class Divisao implements Operadores {
    private static Divisao instance;

    private Divisao() { /* Construtor privado para impedir instâncias */ }

    public static Divisao getInstance() {
        if (instance == null) {
            instance = new Divisao();
        }

        return instance;
    }

    @Override
    public double calcular(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        return a / b;
    }
}