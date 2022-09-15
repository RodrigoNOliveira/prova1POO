import java.util.Locale;
import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) throws Exception {
     
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        String nome;
        double valor, salario;
        int horas;

        System.out.println();
        System.out.print("Insira seu nome: ");
        nome = scanner.nextLine();
        System.out.println();
        System.out.print("Insira o valor recebido por hora: ");
        valor = scanner.nextDouble();
        System.out.println();
        System.out.print("Insira a quantidade de horas trabalhadas: ");
        horas = scanner.nextInt();
        salario = valor * horas;
        System.out.println();
        System.out.println("O pagamento para " + nome + " deve ser " + salario);


        scanner.close();

    }
}
