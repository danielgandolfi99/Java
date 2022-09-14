package Exercicios_Aulas.Exercicios_15_08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int A, B, C, MaiorAB, MaiorMax;
        System.out.print("Digite o primeiro valor: ");
        A = Integer.parseInt(bf.readLine());
        System.out.print("Digite o segundo valor: ");
        B = Integer.parseInt(bf.readLine());
        System.out.print("Digite o terceiro valor: ");
        C = Integer.parseInt(bf.readLine());
        MaiorAB = ((A + B + Math.abs(A - B)) / 2);
        MaiorMax = ((MaiorAB + C + Math.abs(MaiorAB - C)) /2 );
        System.out.println(MaiorMax + " eh o maior.");
    }
}
