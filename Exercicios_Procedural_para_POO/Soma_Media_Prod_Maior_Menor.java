package Exercicios_Aulas.Paradigmas;

public class Soma_Media_Prod_Maior_Menor {

    private int num1;
    private int num2;
    private int num3;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int getNum3() {
        return num3;
    }

    public void setNum3(int num3) {
        this.num3 = num3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Soma_Media_Prod_Maior_Menor that = (Soma_Media_Prod_Maior_Menor) o;

        if (num1 != that.num1) return false;
        if (num2 != that.num2) return false;
        return num3 == that.num3;
    }

    @Override
    public String toString() {
        return " Soma_Media_Prod_Maior_Menor{ " +
                " num1 = " + num1 +
                ", num2 = " + num2 +
                ", num3=" + num3 +
                " }";
    }

    public void Soma() {
        int soma;
        soma = this.num1 + this.num2 + this.num3;
        System.out.println("Soma: " + soma);
    }

    public void Media() {
        double media;
        media = (this.num1 + this.num2 + this.num3) / 3.0;
        System.out.println("Media: " + media);
    }

    public void Produto() {
        int produto;
        produto = this.num1 * this.num2 * this.num3;
        System.out.println("Produto: " + produto);
    }

    public void Maior() {
        if ((this.num1 > this.num2) && (this.num1 > this.num3)) {
            System.out.println("Maior: " + getNum1());
        }
        if ((this.num2 > this.num1) && (this.num2 > this.num3)) {
            System.out.println("Maior: " + getNum2());
        }
        if ((this.num3 > this.num1) && (this.num3 > this.num2)) {
            System.out.println("Maior: " + getNum3());
        }
    }

    public void Menor() {
        if ((this.num1 < this.num2) && (this.num1 < this.num3)) {
            System.out.println("Menor: " + getNum1());
        }
        if ((this.num2 < this.num1) && (this.num2 < this.num3)) {
            System.out.println("Menor: " + getNum2());
        }
        if ((this.num3 < this.num1) && (this.num3 < this.num2)) {
            System.out.println("Menor: " + getNum3());
        }
    }
}
