package top10calculadoras.models;

public class Divisao implements Operadores {
    @Override
    public double calcular(double a, double b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
            return 0;
        }
    }
}