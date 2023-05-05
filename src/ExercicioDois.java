import java.util.Scanner;

public class ExercicioDois {
    /*
    1- metodo para nome
    2- metodo para idade
    3- metodo para peso e altura
    4- ler todas as informacoes.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome ");
        String nome = scanner.next();

        System.out.println(" Digite sua idade ");
        int idade = scanner.nextInt();

        System.out.println(" Digite seu peso ");
        double peso = scanner.nextDouble();

        System.out.println(" Digite sua altura ");
        double altura = scanner.nextDouble();

        System.out.println( " Meu e " + nome + " Tenho " + idade + " anos, meu peso e " + peso +" kg, tenho " + altura + " altura " );

    }

        /*
        Nao consegui usar os metodos,
         ainda nao entendi como funcionam
         */
}
