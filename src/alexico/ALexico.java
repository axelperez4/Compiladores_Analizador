/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexico;

import java.awt.BorderLayout;
import java.io.File;
import javax.swing.JFrame;

/**
 *
 * @author Diego López
 */
public class ALexico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejecutar sólo si se hicieron cambios a lexema.jflex
        //String archivo = "src\\alexico\\lexema.jflex";
        //generar(archivo);
        
        InterfazGrafica frame = new InterfazGrafica();
        frame.setTitle("Compiladores");
        frame.setSize(600,600);
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // as per your requirement.
        //InterfazGrafica mainP = new InterfazGrafica();
        //frame.add(mainP, BorderLayout.CENTER);
        frame.setVisible(true);
    }
       public static void generar(String archivo)
       {
           File arc = new File(archivo);
           jflex.Main.generate(arc);
       }
    
}
