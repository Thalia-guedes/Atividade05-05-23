import java.util.Scanner;

public class Exercicio{
    /*
               *** Televisao ***
        Seguintes funcionalidaes
        Aumentar ou diminuir o volume do som de cada funcao por vez.
        trocar o canal da tv
        Consultar o volume do som e o canal selecionado.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Bem vindo ao Mais Voce !!! ");
        for ( int volume = 1; volume <= 18; volume++){
            for ( int canal = 1; canal <= 18; canal++){
                if ( volume > canal ){
                    break;
                }
                System.out.println(" O volume da Tv  é " + volume + " e o canal e " + canal + "!!!");
                }

            }


        }
}

