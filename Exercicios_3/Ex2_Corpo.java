package Exercicios_Aulas.Exercicios_29_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2_Corpo {
    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void Celsius(float temp) throws IOException {
        int converte = 999;
        float Tf = 0, Tk = 0, Tc = 0;
        Tc = temp;
        System.out.println("Escolha uma temperatura para converter");
        System.out.println("1 - Fahrenheit");
        System.out.println("2 - Kelvin");
        System.out.print("Digite a opcao: ");
        converte = Integer.parseInt(bf.readLine());
        switch (converte){
            case 1:
                Tf = ((Tc * 9 / 5) + 32);
                System.out.println("Temperatura: " + Tf + " F");
                break;
            case 2:
                Tk = (Tc + 273);
                System.out.println("Temperatura: " + Tk + " K");
                break;
            default:
                System.out.println("Opcao incorreta");
                break;
        }
    }

    public static void Fahrenheit(float temp) throws IOException {
        int converte = 999;
        float Tf = 0, Tk = 0, Tc = 0;
        Tf = temp;
        System.out.println("Escolha uma temperatura para converter");
        System.out.println("1 - Celsius");
        System.out.println("2 - Kelvin");
        System.out.print("Digite a opcao: ");
        converte = Integer.parseInt(bf.readLine());
        switch (converte){
            case 1:
                Tc = (float) ((Tf - 32) * (5/9.0));
                System.out.println("Temperatura: " + Tc + " C");
                break;
            case 2:
                Tk = (float) ((Tf - 32) * (5.0 / 9) + 273);
                System.out.println("Temperatura: " + Tk + " K");
                break;
            default:
                System.out.println("Opcao incorreta");
                break;
        }
    }

    public static void Kelvin(float temp) throws IOException {
        int converte = 999;
        double Tf = 0, Tk = 0, Tc = 0;
        Tk = temp;
        System.out.println("Escolha uma temperatura para converter");
        System.out.println("1 - Celsius");
        System.out.println("2 - Fahrenheit");
        System.out.print("Digite a opcao: ");
        converte = Integer.parseInt(bf.readLine());
        switch (converte){
            case 1:
                Tc = (Tk - 273);
                System.out.println("Temperatura: " + Tc + " C");
                break;
            case 2:
                Tf = ((Tk - 273) * (9.0/5) + 32);
                System.out.println("Temperatura: " + Tf + " F");
                break;
            default:
                System.out.println("Opcao incorreta");
                break;
        }
    }

    public static void Proxima_Funcao() throws IOException {
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
        System.out.print("Aperte alguma tecla para continuar: ");
        String dig = bf.readLine();
        Clear();
    }

    public static void Clear() {
        for(int i = 0; i < 50; i++)
            System.out.println("");
    }
}
