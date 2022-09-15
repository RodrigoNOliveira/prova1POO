import java.util.Locale;
import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        int opcao, valor1, valor2, result = 0;
        double resultDiv = 0;
        String escolha = "";

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
        System.out.print("INSIRA O PRIMEIRO VALOR: ");
        valor1 = scanner.nextInt();
        System.out.println();
        System.out.print("INSIRA O SEGUNDO VALOR: ");
        valor2 = scanner.nextInt();
        System.out.println();
        switch (opcao) {

            case 1:
                result = valor1 + valor2;
                escolha = "SOMA";
                break;

            case 2:
                result = valor1 - valor2;
                escolha = "SUBTRAÇÃO";
                break;

            case 3:
                result = valor1 * valor2;
                escolha = "MULTIPLICAÇÃO";
                break;

            case 4:
                resultDiv = (double)valor1 / valor2;
                escolha = "DIVISÃO";
                break;

            default:
                System.out.println("Opção invalida");
                break;

        }

        System.out.println("OPÇÃO ESCOLHIDA: " + escolha);
        System.out.println();

        
        if (escolha == "DIVISÃO") {
            System.out.println("O RESULTADO É DE: " + resultDiv);
        } else {
            System.out.println("O RESULTADO É DE: " + result);
        }

        scanner.close();

    }
}
