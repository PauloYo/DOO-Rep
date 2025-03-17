package top10calculadoras;

import top10calculadoras.factory.Factory;
import top10calculadoras.models.Operadores;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Operadores soma = Factory.factory("Soma");
        Operadores subt = Factory.factory("Subtracao");
        Operadores mult = Factory.factory("Multiplicacao");
        Operadores divi = Factory.factory("Divisao");

        System.out.println("Bem vindo a revolucionário dispositivo chamado calculadora!");

        while (true) {
            System.out.println("Insisra dois números para obter um novo resultado!");
        
            System.out.println("\nDigite o primeiro número: ");
            double a = s.nextDouble();
            System.out.println("Digite o segundo número: ");
            double b = s.nextDouble();

            System.out.println("\nAgora escolha uma operação:\n1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n5 - Sair\n: ");
            int op = s.nextInt();

            if (op == 1) {
                System.out.println("\nO resultado da soma é: " + soma.calcular(a, b));
            } else if (op == 2) {
                System.out.println("\nO resultado da subtração é: " + subt.calcular(a, b));
            } else if (op == 3) {
                System.out.println("\nO resultado da multiplicação é: " + mult.calcular(a, b));
            } else if (op == 4) {
                System.out.println("\nO resultado da divisão é: " + divi.calcular(a, b));
            } else if (op == 5) {
                System.out.println("\nAté mais!");
                break;
            } else {
                System.out.println("\nOpção inválida!");
                s.close();
            }
        }
    }
}