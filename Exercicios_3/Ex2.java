package Exercicios_Aulas.Exercicios_29_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        Menu();
    }

    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void Menu() throws IOException {
        int opcao = 999;
        while (opcao != 0) {
            float temp = 0;
            System.out.print("Informe a temperatura: ");
            temp = Float.parseFloat(bf.readLine());
            System.out.println("0 - Encerrar o programa");
            System.out.println("1 - Celsius");
            System.out.println("2 - Fahrenheit");
            System.out.println("3 - Kelvin");
            System.out.println("Informe qual a escala de temperatura ou encerre o programa: ");
            opcao = Integer.parseInt(bf.readLine());
            switch (opcao) {
                case 0:
                    System.out.println("Finalizando o programa ...");
                    break;
                case 1:
                    Ex2_Corpo.Celsius(temp);
                    Ex2_Corpo.Proxima_Funcao();
                    break;
                case 2:
                    Ex2_Corpo.Fahrenheit(temp);
                    Ex2_Corpo.Proxima_Funcao();
                    break;
                case 3:
                    Ex2_Corpo.Kelvin(temp);
                    Ex2_Corpo.Proxima_Funcao();
                    break;
                default:
                    System.out.println("Opcao incorreta");
                    Ex2_Corpo.Proxima_Funcao();
                    break;
            }
        }
    }
}
