package modelo;

import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;

/**
 *
 * @author orlandobcrra
 */
public class Compilador extends Figura {

    private String fuente;
    private String objeto;
    private String implementacion;
    
    public Compilador() {
        posicion=new Point(0, 0);
        poligono=new Polygon();
        poligono.addPoint(0, 0);
        poligono.addPoint(120, 0);
        poligono.addPoint(120, 40);
        poligono.addPoint(80, 40);
        poligono.addPoint(80, 80);
        poligono.addPoint(40, 80);
        poligono.addPoint(40, 40);
        poligono.addPoint(0, 40);
    }
    
    @Override
    public void dibujar(Graphics g) {
        super.dibujar(g);
        g.drawString(fuente, posicion.x+20,posicion.y+5);
    }

    public void setDatos(String fuente, String objeto, String implementacion) {
        this.fuente = fuente;
        this.objeto = objeto;
        this.implementacion = implementacion;
    }
}
