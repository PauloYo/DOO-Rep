package singleton;

import java.util.Scanner;
import singleton.factory.Factory;
import singleton.models.Operadores;
import java.util.InputMismatchException;

public class Calculadora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Factory factory = Factory.getInstance();

        System.out.println("===== CALCULADORA =====\n");

        while (true) {        
            try {
                System.out.print("\nEscolha uma operação:\n- Soma\n- Subtracao\n- Multiplicacao\n- Divisao\n- Sair\n: ");
                String op = s.nextLine();

                if (op.equals("Sair")) {
                    System.out.println("\nAté mais!");
                    break;
                }

                Operadores operacao = factory.factory(op);

                if (operacao == null) {
                    System.out.println("\nOperação inválida!");
                    continue;
                } else {
                    System.out.println("Insisra dois números para obter um novo resultado!");
                    System.out.print("\nDigite o primeiro número: ");
                    double a = s.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double b = s.nextDouble();
                    s.nextLine(); // Limpar buffer
                    System.out.println("\nResultado: " + operacao.calcular(a, b));
                }

            } catch (InputMismatchException e) {
                System.out.println("\nEntrada inválida! Certifique-se de digitar números válidos.");
                s.nextLine(); // Limpar buffer
            } catch (ArithmeticException e) {
                System.out.println("\n" + e.getMessage());
            }
        }
    }
}