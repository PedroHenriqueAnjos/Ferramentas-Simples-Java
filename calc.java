import java.util.Scanner;

public class calc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Calculadora Simples ---");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtrair");
            System.out.println("3 - Multiplicar");
            System.out.println("4 - Dividir");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = input.nextInt();

            if (opcao >= 1 && opcao <= 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = input.nextDouble();

                System.out.print("Digite o segundo número: ");
                double num2 = input.nextDouble();

                double resultado;

                switch (opcao) {
                    case 1:
                        resultado = num1 + num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 2:
                        resultado = num1 - num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 3:
                        resultado = num1 * num2;
                        System.out.println("Resultado: " + resultado);
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Erro: Divisão por zero não é permitida.");
                        } else {
                            resultado = num1 / num2;
                            System.out.println("Resultado: " + resultado);
                        }
                        break;
                }
            } else if (opcao != 5) {
                System.out.println("Opção inválida! Tente novamente.");
            }

        } while (opcao != 5);

        System.out.println("Programa encerrado.");
        input.close();
    }
}