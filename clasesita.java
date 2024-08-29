/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nose;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yahir
 */
public class clasesita {
    double velocidad=0.0;
    //esta primera variable sera para guardar la velocidad segun los segundos
    double c;
    //esta variable es para el coeficiente de arrastre
    double m;
    //esta varaible sera para la masa del objeto


    public void setC(double c) {
        this.c = c;
    }

    public void setM(double m) {
        this.m = m;
    }
    
    //los anteriores set serviran para la clase donde se pone las tablas inicializarlas segun el usuario
    
    
    public DefaultTableModel calculoTabla() {
        DefaultTableModel dtm = new DefaultTableModel();
      
        dtm.addColumn("T");
        dtm.addColumn("VELOCIDAD");
        //añadimos las columnas t de tiempo y velocidad
        dtm.addRow(new Object[]{
            "0",
            "0"
        });
        //lo anterior fue asi ya que la primer velocidad debe de ser cero
        
        for (double tiempo = 2.0; tiempo <=16.0; tiempo+=2.0) {
            velocidad+=((9.81-((c/m)*velocidad))*2);
            dtm.addRow(new Object[]{
                tiempo,
                velocidad
            });
        }
        //el cliclo for anterior es para ir guardando en la tabla cada velocidad cada 2 segundos
        //los intervalos de segundos pueden ser camhiados facilmente
        return dtm;
    }
    
}
