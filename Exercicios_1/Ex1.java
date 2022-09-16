package Exercicios_Aulas.Exercicios_15_08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.0");
        double A, B, C, media;
        System.out.println("Informe as 3 notas: ");
        System.out.print("A = ");
        A = Double.parseDouble(bf.readLine());
        System.out.print("B = ");
        B = Double.parseDouble(bf.readLine());
        System.out.print("C = ");
        C = Double.parseDouble(bf.readLine());
        media = ((A*2) + (B*3) + (C*5)) / 10;
        System.out.println("MEDIA = " + df.format(media));

    }
}