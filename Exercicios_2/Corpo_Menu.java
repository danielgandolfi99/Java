package Exercicios_Aulas.Exercicios_22_08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;
import java.util.ArrayList;

public class Corpo_Menu {
    public static void main(String[] args) {}

    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void Funcao1() throws IOException {
        String texto;
        System.out.print("Digite uma palavra: ");
        texto = bf.readLine();
        texto = texto.toUpperCase();
        System.out.println(texto);
    }

    public static void Funcao2() throws IOException {
        int A, B;
        System.out.println("Informe 2 numeros para verificar se o segundo e multiplo do primeiro");
        System.out.print("Informe o primeiro numero: ");
        A = Integer.parseInt(bf.readLine());
        System.out.print("Informe o segundo numero: ");
        B = Integer.parseInt(bf.readLine());
        if (B % A == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void Funcao3() throws IOException {
        System.out.print("Escreva um numero para verificar se e par, senao impar: ");
        int numero = Integer.parseInt(bf.readLine());
        if (numero % 2 == 0) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    public static void Funcao4() throws IOException {
        double area, pi, raio;
        System.out.print("Informe o valor do raio: ");
        raio = Double.parseDouble(bf.readLine());
        pi = 3.1416;
        area = (pi * (raio * raio));
        System.out.println("O valor da area e: " + area);
    }

    public static void Funcao5() {
        int num;
        num = (int) Math.floor(Math.random() * 7);
        System.out.println("Lado: "+num);
    }

    public static void Funcao6() throws IOException {
        int mes;
        System.out.print("Digite de 1 a 12 para selecionar o mes: ");
        mes = Integer.parseInt(bf.readLine());
        switch (mes) {
            case 1:
                System.out.println("Janeiro");
                break;
            case 2:
                System.out.println("Fevereiro");
                break;
            case 3:
                System.out.println("Marco");
                break;
            case 4:
                System.out.println("Abril");
                break;
            case 5:
                System.out.println("Maio");
                break;
            case 6:
                System.out.println("Junho");
                break;
            case 7:
                System.out.println("Julho");
                break;
            case 8:
                System.out.println("Agosto");
                break;
            case 9:
                System.out.println("Setembro");
                break;
            case 10:
                System.out.println("Outubro");
                break;
            case 11:
                System.out.println("Novembro");
                break;
            case 12:
                System.out.println("Dezembro");
                break;
            default:
                System.out.println("Erro");
        }
    }

    public static void Funcao7() throws IOException {
        int A, B, C;
        System.out.print("Digite o primeiro numero: ");
        A = Integer.parseInt(bf.readLine());
        System.out.print("Digite o segundo numero: ");
        B = Integer.parseInt(bf.readLine());
        System.out.print("Digite o terceiro numero: ");
        C = Integer.parseInt(bf.readLine());
        if ((A < B) && (A < C)) {
            System.out.println("O menor numero e: " + A);
        }
        if ((B < A) && (B < C)) {
            System.out.println("O menor numero e: " + B);
        }
        if ((C < A) && (C < B)) {
            System.out.println("O menor numero e: " + C);
        }
    }

    public static void Funcao8() throws IOException {
        double A, B, C, D, P;
        System.out.print("Informe o primeiro numero: ");
        A = Double.parseDouble(bf.readLine());
        System.out.print("Informe o segundo numero: ");
        B = Double.parseDouble(bf.readLine());
        System.out.print("Informe o terceiro numero: ");
        C = Double.parseDouble(bf.readLine());
        System.out.print("Informe o quarto numero: ");
        D = Double.parseDouble(bf.readLine());
        P = (A * B * C * D);
        System.out.println("O produto e: " + P);
    }

    public static void Funcao9() throws IOException {
        int nota;
        System.out.print("Informe a nota de 0 a 100: ");
        nota = Integer.parseInt(bf.readLine());
        if ((nota >= 91) && (nota <= 100)) {
            System.out.println("Nota: AA");
        }
        if ((nota >= 81) && (nota <= 90)) {
            System.out.println("Nota: AB");
        }
        if ((nota >= 71) && (nota <= 80)) {
            System.out.println("Nota: BB");
        }
        if ((nota >= 61) && (nota <= 70)) {
            System.out.println("Nota: BC");
        }
        if ((nota >= 51) && (nota <= 60)) {
            System.out.println("Nota: CD");
        }
        if ((nota >= 41) && (nota <= 50)) {
            System.out.println("Nota: DD");
        }
        if (nota <= 40) {
            System.out.println("Nota: Fail");
        }
    }

    public static void Funcao10() throws IOException {
        System.out.print("Digite um numero float: ");
        float num = Float.parseFloat(bf.readLine());
        int n = Integer.valueOf((int) num);
        System.out.println("Numero = " + n);
    }

    public static void Funcao11() throws IOException {
        System.out.print("Escreva um numero: ");
        double num = Double.parseDouble(bf.readLine());
        if (num < 0) {
            System.out.println("NEGATIVO");
        }
        if (num > 0) {
            System.out.println("POSITIVO");
        }
        if (num == 0) {
            System.out.println("ZERO");
        }
    }

    public static void Funcao12() throws IOException {
        enum turnos{
            MANHA, TARDE, NOITE;
        }
        System.out.println("Escolha um turno");
        System.out.println("1 - MANHA");
        System.out.println("2 - TARDE");
        System.out.println("3 - NOITE");
        System.out.print("Digite o turno desejado: ");
        int turno = Integer.parseInt(bf.readLine());
        switch (turno){
            case 1:
                System.out.println(turnos.MANHA);
                break;
            case 2:
                System.out.println(turnos.TARDE);
                break;
            case 3:
                System.out.println(turnos.NOITE);
                break;
            default:
                System.out.println("OPCAO INCORRETA");
                break;
        }
    }

    public static void Funcao13() throws IOException {
        String palavra, posicao;
        int n = 0, pos = 0;
        System.out.print("Digite uma palavra: ");
        palavra = bf.readLine();
        char[] chars = palavra.toCharArray();
        n = palavra.length();
        pos = (n - 1) / 2;
        if (n % 2 == 0){
            posicao = palavra.substring(pos,pos + 1);
            System.out.println(posicao);
        }
        else{
            posicao = palavra.substring(pos,pos + 2);
            System.out.println(posicao);
        }

    }

    public static void Funcao14() throws IOException {
        ArrayList<Character> lista = new ArrayList<Character>();
        String str;
        System.out.print("Digite uma palavra: ");
        str = bf.readLine();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    lista.add(str.charAt(i));
                    break;
                case 'e':
                    lista.add(str.charAt(i));
                    break;
                case 'i':
                    lista.add(str.charAt(i));
                    break;
                case 'o':
                    lista.add(str.charAt(i));
                    break;
                case 'u':
                    lista.add(str.charAt(i));
                    break;
                default:
                    break;
            }
        }
        System.out.println("Vogais: " + lista);
    }

    public static void Funcao15() throws IOException {
        String str;
        int cont = 0;
        System.out.print("Digite uma palavra: ");
        str = bf.readLine();
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'a':
                    break;
                case 'e':
                    break;
                case 'i':
                    break;
                case 'o':
                    break;
                case 'u':
                    break;
                case ' ':
                    break;
                default:
                    cont++;
                    break;
            }
        }
        System.out.println("Consoantes: " + cont);
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

