package Exercicios_Aulas.Exercicios_29_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) throws IOException, InterruptedException {
        Menu();
    }

    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void Menu() throws IOException, InterruptedException {
        int opcao = 999, conta = 0, saldo = 0, limite_saque = 0, saque_diario = 0, limite_diario = 0, valor = 0;
        ArrayList<String> cadastro = new ArrayList<>();
        System.out.println("Bem vindo ao Banco Infomatics!");
        System.out.println(".");
        while (opcao != 0){
            System.out.println(" ");
            System.out.println("1 - Saque");
            System.out.println("2 - Deposito");
            System.out.println("3 - Verificar Saldo");
            System.out.println("4 - Cadastrar cliente");
            System.out.println("5 - Alterar dados");
            System.out.println("0 - Finalizar o programa");
            System.out.print("Informe a opcao desejada: ");
            opcao = Integer.parseInt(bf.readLine());
            switch (opcao){
                case 0:
                    System.out.println("Finalizando o Programa ...");
                    Thread.sleep(1000);
                    break;
                case 1:
                    if (conta == 0){
                        System.out.println("Voce nao possui nenhuma conta cadastrada");
                    } else {
                        saque_diario = saldo;
                        saldo = Ex1_Corpo.Function1(saldo);
                        limite_diario = limite_diario + (saque_diario - saldo);
                        valor = saque_diario - saldo;
                        if (limite_saque < limite_diario){
                            limite_diario = limite_diario - (saque_diario - saldo);
                            saldo = Ex1_Corpo.Saque_Diario(saldo, limite_saque, limite_diario, valor);

                        }
                        saque_diario = saldo;
                    }
                    break;
                case 2:
                    if (conta == 0){
                        System.out.println("Voce nao possui nenhuma conta cadastrada");
                    } else {
                        saldo = Ex1_Corpo.Function2(saldo);
                        saque_diario = saldo;
                    }
                    break;
                case 3:
                    if (conta == 0){
                        System.out.println("Voce nao possui nenhuma conta cadastrada");
                    } else {
                        Ex1_Corpo.Function3(saldo, cadastro);
                    }
                    break;
                case 4:
                    saldo = Ex1_Corpo.Function4(cadastro, saldo, conta);
                    saque_diario = saldo;
                    limite_saque = Ex1_Corpo.Verif_Conta(limite_saque, saldo, conta);
                    conta = 1;
                    break;
                case 5:
                    if (conta == 0){
                        System.out.println("Voce nao possui nenhuma conta cadastrada");
                    } else {
                        Ex1_Corpo.Function5(cadastro);
                    }
                    break;
                default:
                    System.out.println("Opcao Invalida");
            }
        }
    }
}
