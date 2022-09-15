import java.util.Locale;
import java.util.Scanner;

public class Questao4 {

    public static void glicose(int valor){

        if(valor <= 100){
            System.out.println("Classificação = NORMAL");
        }
        else if(valor > 100 && valor <=140){
            System.out.println("Classificação = ELEVADA");
        }
        else {
            System.out.println("Classificação = DIABETES");
        }


    }


    public static void main(String[] args) throws Exception {
     
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        int valor;

        System.out.println();
        System.out.print("Insira o valor da glicose presente em seu sangue: ");
        valor = scanner.nextInt();
        System.out.println();
        glicose(valor);

        scanner.close();

    }


 

    }

