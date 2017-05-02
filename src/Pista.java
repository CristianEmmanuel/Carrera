/**
 * Created by cristian on 02/05/17.
 */
public class Pista {
    private String circulo, recta, cruz;
    private int km;


    public void setNombre(String nombre){
        this.circulo = nombre;
    }

    public String getNombre(){
        return this.circulo;
    }

    public void setRecta(String recta) {
        this.recta = recta;
    }

    public String getRecta() {
        return recta;
    }

    public void setCruz(String cruz) {
        this.cruz = cruz;
    }

    public String getCruz() {
        return cruz;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public int getKm() {
        return km;
    }
}
