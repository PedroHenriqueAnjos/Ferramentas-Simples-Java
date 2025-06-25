import java.util.Scanner;

public class veriprimo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int num = input.nextInt();

        if (num <= 1) {
            System.out.println(num + " não é primo.");
        } else {
            boolean isPrimo = true;

            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                System.out.println(num + " é primo.");
            } else {
                System.out.println(num + " não é primo.");
            }
        }

        input.close();
    }
} 
    

