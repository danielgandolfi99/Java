package Exercicios_Aulas.Exercicios_29_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.ArrayList;

public class Ex3_Corpo {
    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static double Funcao1(double preco_final, ArrayList pedido) throws IOException {
        int opcao = 999;
        System.out.println(" ");
        System.out.println("1 - Tradicional     -  R$  28,00  ");
        System.out.println("2 - Vegano          -  R$  26,90  ");
        System.out.println("3 - Duplo           -  R$  35,90  ");
        System.out.print("Escolha uma das opcoes: ");
        opcao = Integer.parseInt(bf.readLine());
        opcao = Opcao_incorreta(opcao);
        switch (opcao){
            case 1:
                pedido.add("Hamburguer Tradicional");
                preco_final = preco_final + 28.00;
                break;
            case 2:
                pedido.add("Hamburguer Vegano");
                preco_final = preco_final + 26.90;
                break;
            case 3:
                pedido.add("Hamburguer Duplo");
                preco_final = preco_final + 35.90;
                break;
        }
        return preco_final;
    }

    public static double Funcao2(double preco_final, ArrayList pedido) throws IOException {
        int opcao = 999;
        System.out.println(" ");
        System.out.println("1 - Salmao          -  R$  52,00  ");
        System.out.println("2 - Atum            -  R$  47,90  ");
        System.out.println("3 - Vegetais        -  R$  40,00  ");
        System.out.print("Escolha uma das opcoes: ");
        opcao = Integer.parseInt(bf.readLine());
        opcao = Opcao_incorreta(opcao);
        switch (opcao){
            case 1:
                pedido.add("Poke Salmao");
                preco_final = preco_final + 52.00;
                break;
            case 2:
                pedido.add("Poke Atum");
                preco_final = preco_final + 47.90;
                break;
            case 3:
                pedido.add("Poke Vegetais");
                preco_final = preco_final + 40.00;
                break;
        }
        return preco_final;
    }

    public static double Funcao3(double preco_final, ArrayList pedido) throws IOException {
        int opcao = 999;
        System.out.println(" ");
        System.out.println("1 - Mortadela       -  R$  17,00  ");
        System.out.println("2 - Copa            -  R$  17,90  ");
        System.out.println("3 - Parma           -  R$  17,90  ");
        System.out.print("Escolha uma das opcoes: ");
        opcao = Integer.parseInt(bf.readLine());
        opcao = Opcao_incorreta(opcao);
        switch (opcao){
            case 1:
                pedido.add("Sanduiche de Mortadela");
                preco_final = preco_final + 17.00;
                break;
            case 2:
                pedido.add("Sanduiche de Copa");
                preco_final = preco_final + 17.90;
                break;
            case 3:
                pedido.add("Sanduiche de Parma");
                preco_final = preco_final + 17.90;
                break;
        }
        return preco_final;
    }

    public static double Funcao4(double preco_final, ArrayList pedido, int i) throws IOException {
        int opcao = 999;
        System.out.println(" ");
        System.out.println("1 - Margherita          -  R$  32,90  ");
        System.out.println("2 - Calabresa           -  R$  34,90  ");
        System.out.println("3 - Doce                -  R$  29,90  ");
        System.out.print("Escolha uma das opcoes: ");
        opcao = Integer.parseInt(bf.readLine());
        opcao = Opcao_incorreta(opcao);
        switch (opcao){
            case 1:
                pedido.add("Pizza de Margherita");
                preco_final = preco_final + 32.90;
                break;
            case 2:
                pedido.add("Pizza de Calabresa");
                preco_final = preco_final + 34.90;
                break;
            case 3:
                pedido.add("Pizza Doce");
                preco_final = preco_final + 29.90;
                break;
        }
        return preco_final;
    }

    public static double Funcao5(double preco_final, ArrayList pedido) throws IOException {
        int opcao = 999;
        System.out.println(" ");
        System.out.println("1 - Apimentado          -  R$  30,00  ");
        System.out.println("2 - Normal              -  R$  28,90  ");
        System.out.print("Escolha uma das opcoes: ");
        opcao = Integer.parseInt(bf.readLine());
        opcao = Opcao_incorreta(opcao);
        switch (opcao){
            case 1:
                pedido.add("Frango Frito Apimentado");
                preco_final = preco_final + 30.00;
                break;
            case 2:
                pedido.add("Frango Frito Normal");
                preco_final = preco_final + 28.90;
                break;
        }
        return preco_final;
    }

    public static double Funcao6(double preco_final, ArrayList pedido) throws IOException {
        int opcao = 999;
        System.out.println(" ");
        System.out.println("1 - Carne Seca          -  R$  28,00  ");
        System.out.println("2 - File                -  R$  33,90  ");
        System.out.print("Escolha uma das opcoes: ");
        opcao = Integer.parseInt(bf.readLine());
        opcao = Opcao_incorreta(opcao);
        switch (opcao){
            case 1:
                pedido.add("Tacos de Carne Seca");
                preco_final = preco_final + 28.00;
                break;
            case 2:
                pedido.add("Tacos de File");
                preco_final = preco_final + 33.90;
                break;
        }
        return preco_final;
    }

    public static int Opcao_incorreta(int opcao) throws IOException {
        while (opcao != 1 && opcao != 2 && opcao != 3) {
            System.out.print("Opcao incorreta, digite novamente: ");
            opcao = Integer.parseInt(bf.readLine());
        }
        return opcao;
    }

    public static void Encerramento(double preco_final, ArrayList pedido){
        DecimalFormat df = new DecimalFormat("0.00");
        if (preco_final != 0){
            System.out.println("Seu pedido foi: ");
            for (int i = 0; i < pedido.size(); i++) {
                System.out.println(pedido.get(i));
            }
            System.out.println(".");
            System.out.println("Sua conta foi de R$ " + df.format(preco_final));
        }
        else {
            System.out.println("Voce nao teve nenhum pedido");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
            System.out.println("Programa encerrado");
        }
    }
}
