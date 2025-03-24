package top10calculadoras;

import top10calculadoras.factory.Factory;
import top10calculadoras.models.Operadores;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("===== CALCULADORA =====\n");

        while (true) {
            System.out.println("Insisra dois números para obter um novo resultado!");
        
            System.out.println("\nDigite o primeiro número: ");
            double a = s.nextDouble();
            System.out.println("Digite o segundo número: ");
            double b = s.nextDouble();

            s.nextLine(); // Consumir o \n

            System.out.println("\nAgora escolha uma operação:\n- Soma\n- Subtração\n- Multiplicação\n- Divisão\n- Sair\n: ");
            String op = s.nextLine();

            if (op.equals("Sair")) {
                System.out.println("Até mais!");
                break;
            }

            Operadores operacao = Factory.factory(op);

            if (operacao == null) {
                System.out.println("Operação inválida!");
                continue;
            } else {
                System.out.println("Resultado: " + operacao.calcular(a, b));
            }
        }
    }
}