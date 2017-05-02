/**
 * Created by cristian on 02/05/17.
 */
public class Auto {
    private String nombre;
    private int kmxh=0;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setKmxh(int kmxh) {
        this.kmxh = kmxh;
    }

    public int getKmxh() {
        return kmxh;
    }

    public void tocarTurbo(){
        this.kmxh=this.kmxh+10;
    }

    public void pisarBarro(){
        this.kmxh=this.kmxh-15;
    }

}
