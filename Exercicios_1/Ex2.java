package Exercicios_Aulas.Exercicios_15_08;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat df = new DecimalFormat("0.00");
        String Nome;
        double Salario, Vendas, Total;
        System.out.print("Nome: ");
        Nome = bf.readLine();
        System.out.print("Salario: ");
        Salario = Double.parseDouble(bf.readLine());
        System.out.print("Vendas: ");
        Vendas = Double.parseDouble(bf.readLine());
        Total = (Vendas * (0.15)) + Salario;
        System.out.println("TOTAL = R$ " + df.format(Total));
    }
}
