package Exercicios_Aulas.Exercicios_29_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ex4_Corpo {

    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static int Teste_intervalo(int n1, int n2, int valor) throws IOException {
        int num;
        Random num_aleatorio = new Random();
        while ((n2 < n1) || (n1 == n2)){
            System.out.println("Voce digitou um intervalo invalido ");
            System.out.print("Informe o numero inicial: ");
            n1 = Integer.parseInt(bf.readLine());
            System.out.print("Informe o numero final: ");
            n2 = Integer.parseInt(bf.readLine());
        }
        System.out.print("Escolha um numero entre o intervalo: ");
        num = Integer.parseInt(bf.readLine());
        while ((num > n2) || (num < n1)){
            System.out.println("Voce digitou um numero fora do intervalo");
            System.out.print("Tente novamente: ");
            num = Integer.parseInt(bf.readLine());
        }
        valor = num_aleatorio.nextInt(n1, n2);
        return valor;
    }

    public static int Verif_Chance(int chances,int stop,int cont) {
        if (chances == 0) {
            System.out.println("Voce somou " + cont + " pontos");
            stop = 0;
        }
        return stop;
    }

    public static int Acerto_Erro(int num, int valor, int cont, int chances) {
        if (num == valor) {
            System.out.println("Voce acertou!! Ganhou 1 ponto!");
            cont++;
        }
        else {
            System.out.println("Voce errou! Perdeu 1 ponto!");
            if (cont > 0){
                cont--;
            }
        }
        return cont;
    }

    public static int Stop(int cont, int stop) throws IOException {
        if (stop != 0) {
            System.out.println("Voce quer parar? ");
            System.out.println("0 - Sim, quero parar ");
            System.out.println("1 - Nao, quero continuar");
            stop = Integer.parseInt(bf.readLine());
            switch (stop) {
                case 0:
                    System.out.println("Voce somou " + cont + " pontos");
                    break;
                case 1:
                    break;
                default:
                    while (stop != 0 && stop != 1) {
                        System.out.print("Opcao invalida, digite novamente: ");
                        stop = Integer.parseInt(bf.readLine());
                    }
                    break;
            }
        }
        return stop;
    }
}
