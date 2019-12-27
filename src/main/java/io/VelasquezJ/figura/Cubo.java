package io.VelasquezJ.figura;
import io.VelasquezJ.punto.P3;

/**
 * Crea un objeto tipo cubo
 * @author jsvelasquez
 */
public class Cubo {
    //Atributos
    private String colorFondo;
    private String ColorArista;
    private P3[] vertices = new P3[8];

    public String getColorFondo() {
        return colorFondo;
    }

    public void setColorFondo(String colorFondo) {
        this.colorFondo = colorFondo;
    }

    public String getColorArista() {
        return ColorArista;
    }

    public void setColorArista(String colorArista) {
        ColorArista = colorArista;
    }

    public P3[] getVertices() {
        return vertices;
    }

    public void setVertices(P3[] vertices) {
        this.vertices = vertices;
    }

    public void Dibujar(){
        System.out.println("dibujando un cubo");
    }
}
