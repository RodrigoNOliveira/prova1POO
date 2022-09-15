import java.util.Locale;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        int opcao, valor1 = 0, valor2 = 0;
        double result = 0;
 

        System.out.println();
        System.out.println(" ---------- MENU ---------- ");
        System.out.println(" | 1-SOMA                 | ");
        System.out.println(" | 2-SUBTRAÇÃO            | ");
        System.out.println(" | 3-MULTIPLICAÇÃO        | ");
        System.out.println(" | 4-DIVISÃO              | ");
        System.out.println(" -------------------------- ");
        System.out.println();
        System.out.print("INSIRA A OPÇÃO DESEJADA: ");
        opcao = scanner.nextInt();
        System.out.println();
        
        switch (opcao) {

            case 1:
                System.out.print("INSIRA O PRIMEIRO VALOR: ");
                valor1 = scanner.nextInt();
                System.out.println();
                System.out.print("INSIRA O SEGUNDO VALOR: ");
                valor2 = scanner.nextInt();
                System.out.println();
                result = valor1 + valor2;
                System.out.printf("OPÇÃO ESCOLHIDA : SOMA %n%nRESULTADO = %.0f", result);

                break;

            case 2:
                System.out.print("INSIRA O PRIMEIRO VALOR: ");
                valor1 = scanner.nextInt();
                System.out.println();
                System.out.print("INSIRA O SEGUNDO VALOR: ");
                valor2 = scanner.nextInt();
                System.out.println();
                result = valor1 - valor2;
                System.out.printf("OPÇÃO ESCOLHIDA : SUBTRAÇÃO %n%nRESULTADO = %.0f", result);
                break;

            case 3:
                System.out.print("INSIRA O PRIMEIRO VALOR: ");
                valor1 = scanner.nextInt();
                System.out.println();
                System.out.print("INSIRA O SEGUNDO VALOR: ");
                valor2 = scanner.nextInt();
                System.out.println();
                result = valor1 * valor2;
                System.out.printf("OPÇÃO ESCOLHIDA : MULTIPLICAÇÃO %n%nRESULTADO = %.0f", result);
                break;

            case 4:
                System.out.print("INSIRA O PRIMEIRO VALOR: ");
                valor1 = scanner.nextInt();
                System.out.println();
                System.out.print("INSIRA O SEGUNDO VALOR: ");
                valor2 = scanner.nextInt();
                System.out.println();
                result= (double) valor1 / valor2;
                System.out.printf("OPÇÃO ESCOLHIDA : DIVISÃO %n%nRESULTADO = %.2f", result);
                break;

            default:
                System.out.println("Opção invalida");
                break;

        }

        
        scanner.close();

    }
}
