package singleton.models;

public class Soma implements Operadores {
    private static Soma instance;

    private Soma() { /* Construtor privado para impedir instâncias */ }

    public static Soma getInstance() {
        if (instance == null) {
            instance = new Soma();
        }

        return instance;
    }

    @Override
    public double calcular(double a, double b) {
        return a + b;
    }
}