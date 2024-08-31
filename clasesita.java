
package nose;

import java.text.DecimalFormat;
import javax.swing.table.DefaultTableModel;

public class clasesita {
    double velocidad=0.0;
    //esta primera variable sera para guardar la velocidad segun los segundos
    
    DecimalFormat df=new DecimalFormat("#.00");
    //se usara esto para limitar los decimales a solo 2
            
    
    
    public DefaultTableModel calculoTabla(double coeficienteArrastre, double masa) {
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
            velocidad+=((9.81-((coeficienteArrastre/masa)*velocidad))*2);
            dtm.addRow(new Object[]{
                tiempo,
                df.format(velocidad)
            });
        }
        //el cliclo for anterior es para ir guardando en la tabla cada velocidad cada 2 segundos
        //los intervalos de segundos pueden ser camhiados facilmente
        return dtm;
    }
    
}
