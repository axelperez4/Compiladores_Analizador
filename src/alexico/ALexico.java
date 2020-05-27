/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexico;

import java.awt.BorderLayout;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Diego López
 */
public class ALexico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        ////Ejecutar sólo si se hicieron cambios a lexema.jflex o Java Cup
        String ruta1 = "src\\alexico\\lexema.jflex";
        String ruta2 = "src\\alexico\\lexemacup.jflex";
        String[] rutaS = {"-parser", "Sintactico", "src\\alexico\\Sintactico.cup"};
        generar(ruta1, ruta2, rutaS);

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        InterfazGrafica frame = new InterfazGrafica();
        frame.setTitle("Compiladores");
        frame.setSize(1000, 900);
        frame.setLayout(new BorderLayout());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    /*Generador de jflex, jcup*/
    public static void generar(String ruta1, String ruta2, String[] rutaS) throws IOException, Exception {
        File archivo;
        archivo = new File(ruta1);
        jflex.Main.generate(archivo);
        archivo = new File(ruta2);
        jflex.Main.generate(archivo);
        java_cup.Main.main(rutaS);

        Path rutaSym = Paths.get("src\\alexico\\sym.java");
        if (Files.exists(rutaSym)) {
            Files.delete(rutaSym);
        }
        Files.move(
                Paths.get("sym.java"),
                Paths.get("src\\alexico\\sym.java")
        );
        Path rutaSin = Paths.get("src\\alexico\\Sintactico.java");
        if (Files.exists(rutaSin)) {
            Files.delete(rutaSin);
        }
        Files.move(
                Paths.get("Sintactico.java"),
                Paths.get("src\\alexico\\Sintactico.java")
        );
    }
}
/*termina generador de archivo*/
