package Exercicios_Aulas.Exercicios_29_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Ex1_Corpo {
    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static final Random num = new Random();

    public static int Function1(int saldo) throws IOException {
        int opcao = 999, valor = 0;
        if (saldo != 0) {
            System.out.println(".");
            System.out.println("1 - R$   50 ");
            System.out.println("2 - R$  100 ");
            System.out.println("3 - R$  500 ");
            System.out.println("4 - R$ 1000 ");
            System.out.println("5 - Digitar a quantidade");
            System.out.print("Selecione uma das opcoes para fazer o saque: ");
            opcao = Integer.parseInt(bf.readLine());
            switch (opcao) {
                case 1:
                    saldo = Saque_Set(saldo, valor = 50);
                    break;
                case 2:
                    saldo = Saque_Set(saldo, valor = 100);
                    break;
                case 3:
                    saldo = Saque_Set(saldo, valor = 500);
                    break;
                case 4:
                    saldo = Saque_Set(saldo, valor = 1000);
                    break;
                case 5:
                    saldo = Saque(saldo);
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        } else {
            Saldo_Insuficiente();
        }
        return saldo;
    }

    public static int Function2(int saldo) throws IOException {
        System.out.print("Informe a quantidade que deseja depositar: ");
        int valor = Integer.parseInt(bf.readLine());
        if (valor <= 0) {
            System.out.println("O valor tem que ser maior do que 0");
        } else {
            saldo = saldo + valor;
        }
        return saldo;
    }

    public static void Function3(int saldo, ArrayList cadastro) {
        System.out.println(" ");
        System.out.println(cadastro);
        System.out.println("Saldo: " + saldo);
    }

    public static int Function4(ArrayList cadastro, int saldo, int conta) throws IOException {
        int num_conta;
        if (conta == 0) {
            System.out.print("Digite o nome: ");
            String nome = bf.readLine();
            num_conta = num.nextInt(1000, 9999);
            cadastro.add("Nome: " + nome);
            cadastro.add("Conta: " + num_conta);
            System.out.println("O seu numero da conta e: " + num_conta);
            System.out.println("Faca um primeiro deposito");
            saldo = Function2(saldo);
        } else {
            System.out.println("Ja temos um cliente cadastadro");
        }
        return saldo;
    }

    public static void Function5(ArrayList cadastro) throws IOException {
        int opcao = 999;
        String nome;
        int num_conta;
        System.out.println("Funcao - ALTERACAO DE DADOS");
        System.out.println("1 - Nome");
        System.out.println("2 - Conta");
        System.out.print("Selecione a opcao que deseja alterar: ");
        opcao = Integer.parseInt(bf.readLine());
        switch (opcao){
            case 1:
                System.out.print("Digite o nome: ");
                nome = bf.readLine();
                cadastro.set(0, "Nome: " + nome);
                System.out.println(cadastro);
                break;
            case 2:
                num_conta = num.nextInt(1000, 9999);
                cadastro.set(1, "Conta: " + num_conta);
                System.out.println(cadastro);
                break;
            default:
                System.out.println("Opcao invalida");
                break;
        }
    }

    public static int Saque_Set(int saldo, int valor) {
        if (saldo < valor) {
            Saldo_Insuficiente();
        } else {
            saldo = saldo - valor;
        }
        return saldo;
    }

    public static void Saldo_Insuficiente() {
        System.out.println("Saldo insuficiente, faca um deposito antes");
    }

    public static int Saque(int saldo) throws IOException {
        int valor;
        System.out.print("Digite o valor que deseja sacar: ");
        valor = Integer.parseInt(bf.readLine());
        if (valor <= saldo) {
            saldo = saldo - valor;
            //saldo = Saque_Diario(saldo, limite_saque, saque_diario);
        } else {
            System.out.println("Voce nao pode sacar mais que o seu saldo");
        }
        return saldo;
    }

    public static int Verif_Conta(int limite_saque, int saldo, int conta) {
        if (conta == 0) {
            if (saldo < 50000) {
                limite_saque = 2500;
                System.out.println("Conta padrao");
                System.out.println("Limite de saque diario: R$ 2.500");
            }
            if (saldo >= 50000 && saldo < 100000) {
                limite_saque = 5000;
                System.out.println("Conta executiva");
                System.out.println("Limite de saque diario: R$ 5.000");
            }
            if (saldo >= 100000) {
                System.out.println("Conta premium, sem limites de saque");
                limite_saque = saldo;
            }
        }
        return limite_saque;
    }

    public static int Saque_Diario(int saldo, int limite_saque, int limite_diario, int valor) {
        System.out.println("O valor passou do limite de saque diario");
        if (limite_diario < limite_saque){
            System.out.println("Voce pode sacar ainda R$ " + (limite_saque - limite_diario) + " hoje");
        } else {
            System.out.println("Voce pode sacar ainda R$ " + (limite_diario - limite_saque) + " hoje");
        }
        saldo = saldo + valor;
        return  saldo;
    }

}
