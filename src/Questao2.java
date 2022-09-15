import java.util.Locale;
import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) throws Exception {
     
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        int valor;
        int fatorial = 1;

        System.out.println();
        System.out.print("Insira um numero para ser calculado o fatorial (valor maximo 15): ");
        valor = scanner.nextInt();
        System.out.println();
        if (valor < 0 || valor > 15){
            System.out.println("Valor inserido invalido");
        }
        else {
        for (int i = 1; i < valor+1; i++) {
            fatorial = fatorial * i;
        }
        System.out.println("O fatorial de " + valor + " é " + fatorial);
        }
        
        

        scanner.close();

    }
}
