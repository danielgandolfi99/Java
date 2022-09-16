package Exercicios_Aulas.Exercicios_22_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    public static void main(String[] args) throws IOException, InterruptedException {
        Menu1();
    }
    public static void Menu1() throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int dig;
        dig = 999;
        while (dig != 0){
            System.out.println("Escolha uma das opcoes abaixo: ");
            System.out.println(" 1 - Exercicio 1: ");
            System.out.println(" 2 - Exercicio 2: ");
            System.out.println(" 3 - Exercicio 3: ");
            System.out.println(" 4 - Exercicio 4: ");
            System.out.println(" 5 - Exercicio 5: ");
            System.out.println(" 6 - Exercicio 6: ");
            System.out.println(" 7 - Exercicio 7: ");
            System.out.println(" 8 - Exercicio 8: ");
            System.out.println(" 9 - Exercicio 9: ");
            System.out.println("10 - Exercicio 10: ");
            System.out.println("11 - Exercicio 11: ");
            System.out.println("12 - Exercicio 12: ");
            System.out.println("13 - Exercicio 13: ");
            System.out.println("14 - Exercicio 14: ");
            System.out.println("15 - Exercicio 15: ");
            System.out.print("Digite a opcao desejada: ");
            dig = Integer.parseInt(bf.readLine());
            switch (dig){
                case 0:
                    System.out.println("Finalizando o Programa ...");
                    System.out.println(".");
                    System.out.println(".");
                    System.out.println(".");
                    break;
                case 1:
                    Corpo_Menu.Funcao1();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 2:
                    Corpo_Menu.Funcao2();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 3:
                    Corpo_Menu.Funcao3();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 4:
                    Corpo_Menu.Funcao4();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 5:
                    Corpo_Menu.Funcao5();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 6:
                    Corpo_Menu.Funcao6();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 7:
                    Corpo_Menu.Funcao7();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 8:
                    Corpo_Menu.Funcao8();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 9:
                    Corpo_Menu.Funcao9();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 10:
                    Corpo_Menu.Funcao10();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 11:
                    Corpo_Menu.Funcao11();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 12:
                    Corpo_Menu.Funcao12();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 13:
                    Corpo_Menu.Funcao13();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 14:
                    Corpo_Menu.Funcao14();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                case 15:
                    Corpo_Menu.Funcao15();
                    Corpo_Menu.Proxima_Funcao();
                    break;
                default:
                    System.out.println("Opcao incorreta");
                    Corpo_Menu.Proxima_Funcao();
                    break;
            }
        }
    }
}
