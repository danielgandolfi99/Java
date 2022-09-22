package Exercicios_Aulas.Paradigmas;

public class Maior_Igual {

    private int num1;
    private int num2;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Maior_Igual that = (Maior_Igual) o;

        if (num1 != that.num1) return false;
        return num2 == that.num2;
    }

    @Override
    public String toString() {
        return " Maior_Igual { " +
                "num1 = " + num1 +
                ", num2 = " + num2 +
                " }";
    }

    public void maiorigual(){
        if (getNum1() > getNum2()) {
            System.out.printf("%d e o maior\n", getNum1());
        } else if (getNum2() > getNum1()) {
            System.out.printf("%d e o maior\n", getNum2());
        } else {
            System.out.println("Sao iguais");
        }
    }



}
