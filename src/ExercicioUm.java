import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        /*
               *** Televisao ***
        Seguintes funcionalidaes
        Aumentar ou diminuir o volume do som de cada funcao por vez.
        trocar o canal da tv
        Consultar o volume do som e o canal selecionado.
     */
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Seja bem vindo, Digite um numero de 1 a 5 para escolher o canal que deseja assistir ");
        int canais = scanner.nextInt();

        String resultado1 = Tvaberta(canais);
        System.out.println(resultado1);

    }
    public static String Tvaberta (int canais) {
        Scanner scanner = new Scanner(System.in);
        String canal1 = " Caldeirao do Huck";
        String canal2 = " Mais voce ";
        String canal3 = " Encontro ";
        String canal4 = " Big brother Brasil ";
        String canal5 = " Jornal Nacional ";

        switch (canais) {
            case 1:
                return canal1;
            case 2:
                return canal2;
            case 3:
                return canal3;
            case 4:
                return canal4;
            case 5:
                return canal5;

        }
        return null;
        /*
        Nao consegui colocar algo que fizesse sentido para
        usar a funcao volume.

        no arquivo exercicio, fiz um rascunho para tentar usar o for,
        mas nao consegui juntar nessa atividade aqui.
                     :/
         */
    }

}
