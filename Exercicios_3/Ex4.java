package Exercicios_Aulas.Exercicios_29_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex4 {
    public static void main(String[] args) throws IOException {
        Menu();
    }

    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void Menu() throws IOException {
        int stop = 999, n1, n2, chances = 20, num = 0, cont = 0, valor;
        System.out.println("Ola bem vindo ao GuessingGame!");
        while (stop != 0) {
            System.out.println("Voce tem " + chances + " chances");
            System.out.print("Informe o numero inicial: ");
            n1 = Integer.parseInt(bf.readLine());
            System.out.print("Informe o numero final: ");
            n2 = Integer.parseInt(bf.readLine());
            valor = Ex4_Corpo.Teste_intervalo(n1, n2, num);
            cont = Ex4_Corpo.Acerto_Erro(num, valor, cont, chances);
            chances--;
            stop = Ex4_Corpo.Verif_Chance(chances, stop, cont);
            stop = Ex4_Corpo.Stop(cont, stop);
        }
    }
}
