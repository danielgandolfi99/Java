package Exercicios_Aulas.Paradigmas;

public class Diametro_Circ_Area {

    private float raio;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Diametro_Circ_Area that = (Diametro_Circ_Area) o;

        return Float.compare(that.raio, raio) == 0;
    }

    @Override
    public String toString() {
        return " Diametro_Circ_Area{ " +
                "raio = " + raio +
                " }";
    }

    public void Diametro(){
        System.out.println("Diametro: " + this.raio * 2);
    }

    public void Circunferencia(double PI){
        System.out.println("Circunferencia: " + 2 * PI * this.raio);
    }

    public void Area(double PI){
        System.out.println("Area: " + PI * (this.raio * this.raio));
    }

}
