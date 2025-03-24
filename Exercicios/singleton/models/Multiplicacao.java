package singleton.models;

public class Multiplicacao implements Operadores {
    private static Multiplicacao instance;

    private Multiplicacao() { /* Construtor privado para impedir instâncias */ }

    public static Multiplicacao getInstance() {
        if (instance == null) {
            instance = new Multiplicacao();
        }

        return instance;
    }
    
    @Override
    public double calcular(double a, double b) {
        return a * b;
    }
}