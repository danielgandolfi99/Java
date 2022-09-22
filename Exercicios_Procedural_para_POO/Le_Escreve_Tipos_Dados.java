package Exercicios_Aulas.Paradigmas;

import java.io.IOException;

public class Le_Escreve_Tipos_Dados {

        private int inteiro;
        private float decimal;
        private char caracter;

    public int getInteiro() {
        return inteiro;
    }

    public void setInteiro(int inteiro) {
        this.inteiro = inteiro;
    }

    public float getDecimal() {
        return decimal;
    }

    public void setDecimal(float decimal) {
        this.decimal = decimal;
    }

    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    @Override
    public String toString() {
        return "le_escreve_tipos_dados { " +
                "inteiro = " + inteiro +
                ", decimal = " + decimal +
                ", caracter = " + caracter +
                " }";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Le_Escreve_Tipos_Dados that = (Le_Escreve_Tipos_Dados) o;

        if (inteiro != that.inteiro) return false;
        if (Float.compare(that.decimal, decimal) != 0) return false;
        return caracter == that.caracter;
    }
}
