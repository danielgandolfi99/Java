package Exercicios_Aulas.Paradigmas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        le_dados();
        maior_igual();
        soma_media_prod_maior_menor();
        diametro_circ_area();
        desenho();
    }

    public static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

    public static void le_dados() throws IOException {
        Le_Escreve_Tipos_Dados dados = new Le_Escreve_Tipos_Dados();
        System.out.println("Funcao: Leitura e Escrita de Dados");
        System.out.print("Digite um numero: ");
        dados.setInteiro(Integer.parseInt(bf.readLine()));
        System.out.print("Digite um numero decimal: ");
        dados.setDecimal(Float.parseFloat(bf.readLine()));
        System.out.print("Digite um caractere: ");
        dados.setCaracter(bf.readLine().charAt(0));
        System.out.println(dados.toString());
        System.out.println(" ");
    }

    public static void maior_igual() throws IOException {
        Maior_Igual maior = new Maior_Igual();
        System.out.println("Funcao: Maior e Igual");
        System.out.print("Escreva o primeiro numero: ");
        maior.setNum1(Integer.parseInt(bf.readLine()));
        System.out.print("Escreva o segundo numero: ");
        maior.setNum2(Integer.parseInt(bf.readLine()));
        maior.maiorigual();
        System.out.println(" ");
    }

    public static void soma_media_prod_maior_menor() throws IOException {
        Soma_Media_Prod_Maior_Menor numeros = new Soma_Media_Prod_Maior_Menor();
        System.out.println("Funcao: Soma, Media, Produto, Maior e Menor");
        System.out.print("Digite o primeiro numero: ");
        numeros.setNum1(Integer.parseInt(bf.readLine()));
        System.out.print("Digite o segundo numero: ");
        numeros.setNum2(Integer.parseInt(bf.readLine()));
        System.out.print("Digite o terceiro numero: ");
        numeros.setNum3(Integer.parseInt(bf.readLine()));
        numeros.Soma();
        numeros.Media();
        numeros.Produto();
        numeros.Maior();
        numeros.Menor();
        System.out.println(" ");
    }

    public static void diametro_circ_area() throws IOException {
        Diametro_Circ_Area valores = new Diametro_Circ_Area();
        double PI = 3.14;
        System.out.println("Funcao: Diametro, Circunferencia e Area");
        System.out.print("Digite o valor do raio: ");
        valores.setRaio(Float.parseFloat(bf.readLine()));
        valores.Diametro();
        valores.Circunferencia(PI);
        valores.Area(PI);
        System.out.println(" ");
    }

    public static void desenho(){
        Desenho desenhar = new Desenho();
        System.out.println("Funcao: Desenho");
        desenhar.desenho();
    }

}