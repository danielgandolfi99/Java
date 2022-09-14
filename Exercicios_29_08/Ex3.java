package Exercicios_Aulas.Exercicios_29_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex3 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Menu();
    }

    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void Menu() throws IOException, InterruptedException {
        int opcao = 999, qnt = 0;
        double preco_final = 0;
        ArrayList<String> pedido = new ArrayList<>();
        System.out.println("Bem vindo a NotFasting!!");
        System.out.println(".");
        while (opcao != 0){
            System.out.print("Informe quantos lanches deseja: ");
            qnt = Integer.parseInt(bf.readLine());
            System.out.println(" ");
            for (int i = 0; i < qnt; i++) {
                System.out.println("Cardapio:");
                System.out.println(" ");
                System.out.println("1 - Hamburguer (tradicional,vegano ou duplo) ");
                System.out.println("2 - Poke (salmao, atum ou vegetais) ");
                System.out.println("3 - Sanduiche (mortadela, copa ou parma) ");
                System.out.println("4 - Pizza (margherita, calabresa ou doce) ");
                System.out.println("5 - Frango frito (apimentado ou normal) ");
                System.out.println("6 - tacos (carne seca ou file) ");
                System.out.println("0 - Finalizar o programa ");
                System.out.print("Selecione uma opcao: ");
                opcao = Integer.parseInt(bf.readLine());
                switch (opcao) {
                    case 0:
                        qnt = 0;
                        System.out.println("Finalizando o Programa ...");
                        Thread.sleep(1500);
                        break;
                    case 1:
                        preco_final = Ex3_Corpo.Funcao1(preco_final, pedido);
                        break;
                    case 2:
                        preco_final = Ex3_Corpo.Funcao2(preco_final, pedido);
                        break;
                    case 3:
                        preco_final = Ex3_Corpo.Funcao3(preco_final, pedido);
                        break;
                    case 4:
                        preco_final = Ex3_Corpo.Funcao4(preco_final, pedido,i);
                        break;
                    case 5:
                        preco_final = Ex3_Corpo.Funcao5(preco_final, pedido);
                        break;
                    case 6:
                        preco_final = Ex3_Corpo.Funcao6(preco_final, pedido);
                        break;
                    default:
                        System.out.println("Opcao incorreta");
                        i--;
                        Thread.sleep(1500);
                        break;
                }
                Ex2_Corpo.Clear();
            }
            opcao = 0;
        }
        Ex3_Corpo.Encerramento(preco_final, pedido);
    }
}
