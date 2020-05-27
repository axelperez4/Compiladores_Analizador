/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alexico;

import com.sun.corba.se.spi.ior.iiop.GIOPVersion;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author axelp
 */
public class InterfazGrafica extends javax.swing.JFrame {

    String lectura_archivo = "";
    /**
     * Creates new form InterfazGrafica
     */
    public InterfazGrafica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_textoRresultado = new javax.swing.JScrollPane();
        texto_resultado = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado2 = new javax.swing.JTextArea();
        boton_SeleccionarFile = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        boton_procesar = new javax.swing.JButton();
        label_PathDeFile = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtSintactico = new javax.swing.JTextArea();
        btnSintactico = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(0, 0, 0));
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("INGENIERIA EN SISTEMAS")));

        panel_textoRresultado.setBackground(new java.awt.Color(51, 51, 51));

        texto_resultado.setBackground(new java.awt.Color(204, 204, 204));
        texto_resultado.setColumns(20);
        texto_resultado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        texto_resultado.setRows(5);
        panel_textoRresultado.setViewportView(texto_resultado);

        resultado2.setBackground(new java.awt.Color(204, 204, 204));
        resultado2.setColumns(20);
        resultado2.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        resultado2.setRows(5);
        jScrollPane1.setViewportView(resultado2);

        boton_SeleccionarFile.setBackground(new java.awt.Color(255, 255, 255));
        boton_SeleccionarFile.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boton_SeleccionarFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_SeleccionarFileActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("UNIVERSIDAD MARIANO GALVEZ");

        boton_procesar.setBackground(new java.awt.Color(255, 255, 255));
        boton_procesar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        boton_procesar.setText("Analizar");
        boton_procesar.setHideActionText(true);
        boton_procesar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        boton_procesar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_procesarActionPerformed(evt);
            }
        });

        label_PathDeFile.setText("No ha seleccionado un archivo");

        jLabel2.setBorder(javax.swing.BorderFactory.createCompoundBorder());

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Borrar");
        jButton1.setHideActionText(true);
        jButton1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("DATOS ARCHIVO");
        jLabel3.setToolTipText("");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("ANALISIS LEXICO");

        txtSintactico.setColumns(20);
        txtSintactico.setRows(5);
        jScrollPane2.setViewportView(txtSintactico);

        btnSintactico.setText("Analizar");
        btnSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSintacticoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(jLabel1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(322, 322, 322)
                                .addComponent(jLabel4)
                                .addGap(59, 59, 59)
                                .addComponent(boton_procesar)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSintactico)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(60, 60, 60)
                                    .addComponent(panel_textoRresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(boton_SeleccionarFile, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(label_PathDeFile, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2)))))
                .addContainerGap(649, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(11, 11, 11))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(boton_procesar)
                            .addComponent(jButton1))
                        .addGap(7, 7, 7)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_textoRresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_SeleccionarFile, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(label_PathDeFile, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSintactico)
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 1590, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        texto_resultado.setText("");
        resultado2.setText("");
        txtSintactico.setText("");

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boton_procesarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_procesarActionPerformed
        try {
            /* if (this.label_PathDeFile.getText() == "No ha seleccionado un archivo") {
            JOptionPane.showMessageDialog(this, "Debe seleccionar un archivo antes para analizar.", "AVISO", JOptionPane.WARNING_MESSAGE);
            } else {
            try {
            String path = this.label_PathDeFile.getText();
            Filereader(path);
            Analizar();
            
            } catch (Exception e) {

            }
            }*/
            Analizar();
        } catch (IOException ex) {
            Logger.getLogger(InterfazGrafica.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_boton_procesarActionPerformed

    private void boton_SeleccionarFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_SeleccionarFileActionPerformed
        // create an object of JFileChooser class
        JFileChooser j = new JFileChooser();
        j.showOpenDialog(null);
        File archivo = new File(j.getSelectedFile().getAbsolutePath());
        
        try {
            String ST = new String(Files.readAllBytes(archivo.toPath()));
            resultado2.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(InterfazGrafica.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InterfazGrafica.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       /* // invoke the showsOpenDialog function to show the save dialog
        int r = j.showOpenDialog(null);

        // if the user selects a file
        if (r == JFileChooser.APPROVE_OPTION) {
            // set the label to the path of the selected file
            label_PathDeFile.setText(j.getSelectedFile().getAbsolutePath());
        } // if the user cancelled the operation
        else {
            label_PathDeFile.setText("No ha seleccionado un archivo");
        }*/
    }//GEN-LAST:event_boton_SeleccionarFileActionPerformed

    private void btnSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSintacticoActionPerformed
        // TODO add your handling code here:
         String ST = resultado2.getText();
         Sintactico s = new Sintactico(new alexico.LexemaCup(new StringReader(ST)));
         
        try {
            s.parse();
            txtSintactico.setText("Analisis Realizado Correctamente");
            txtSintactico.setForeground(new Color(25, 111, 6));
        } catch (Exception ex) {
            
            Symbol sym = s.getS();
            txtSintactico.setText("Error de Sintaxis. Linea: " + (sym.right + 1) +  " Columna: "+ (sym.left + 1) + " ,Texto: \"" + sym.value +"\"");
            txtSintactico.setForeground(Color.red);
            //Logger.getLogger(InterfazGrafica.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_btnSintacticoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_SeleccionarFile;
    private javax.swing.JButton boton_procesar;
    private javax.swing.JButton btnSintactico;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label_PathDeFile;
    private javax.swing.JScrollPane panel_textoRresultado;
    private javax.swing.JTextArea resultado2;
    private javax.swing.JTextArea texto_resultado;
    private javax.swing.JTextArea txtSintactico;
    // End of variables declaration//GEN-END:variables

   private void Analizar() throws IOException{
        int cont = 1;
        
        String expr = (String) resultado2.getText();
        Lexema analizador = new Lexema(new StringReader(expr));
        String resultado = "LINEA " + cont + "\t\tSIMBOLO\n";
        while (true) {
            tokens token = analizador.yylex();
            if (token == null) {
                texto_resultado.setText(resultado);
                return;
            }
            switch (token) {
                    case Linea:
                    cont++;
                    resultado += "LINEA " + cont + "\n";
                    break;
                    case Suma:
                    resultado += "  <Operador Aritmetico>\t" + analizador.lexemas + "\n";
                    break;
                    case Menos:
                    resultado += "  <Operador Aritmetico>\t" + analizador.lexemas + "\n";
                    break;
                    case Por:
                    resultado += "  <Operador Aritmetico>\t" + analizador.lexemas + "\n";
                    break;
                    case Operador_Relacional:
                    resultado += "  <Operador RELACIONAL>\t" + analizador.lexemas + "\n";
                    break;
                    case Operador_Asignacion:
                    resultado += "  <Operador de asignacion>\t" + analizador.lexemas + "\n";
                    break;
                    case Parentesis_A:
                    resultado += "  <RESERVADA>\t" + analizador.lexemas + "\n";
                    break;
                    case Parentesis_C:
                    resultado += "  <RESERVADA>\t" + analizador.lexemas + "\n";
                    break;
                    case Proceso:
                    resultado += "  <RESERVADA>\t" + analizador.lexemas + "\n";
                    break;
                    case FinProceso:
                    resultado += "  <RESERVADA>\t" + analizador.lexemas + "\n";
                    break;
                    case Escribir:
                    resultado += "  <RESERVADA>\t" + analizador.lexemas + "\n";
                    break;
                    case Leer:
                    resultado += "  <RESERVADA>\t" + analizador.lexemas + "\n";
                    break;
                    case Repetir:
                    resultado += "  <RESERVADA>\t" + analizador.lexemas + "\n";
                    break;
                    case Hasta:
                    resultado += "  <RESERVADA>\t" + analizador.lexemas + "\n";
                    break;
                    case Que:
                    resultado += "  <RESERVADA>\t" + analizador.lexemas + "\n";
                    break;
                    case Mientras:
                    resultado += "  <RESERVADA>\t" + analizador.lexemas + "\n";
                    break;
                    case Hacer:
                    resultado += "  <RESERVADA>\t" + analizador.lexemas + "\n";
                    break;
                    case FinMientras:
                    resultado += "  <ORESERVADA>\t" + analizador.lexemas + "\n";
                    break;
                    case Kilogramo:
                    resultado += "  <CONSTANTE>\t" + analizador.lexemas + "\n";
                    break;
                    case Metro:
                    resultado += "  <CONSTANTE>\t" + analizador.lexemas + "\n";
                    break;
                    case Numero:
                    resultado += "  <NUMERO>\t\t" + analizador.lexemas + "\n";
                    break;
                    case Identificador:
                    resultado += "  <INDENTIFICADOR>\t" + analizador.lexemas + "\n";
                    break;
                    case Cadena:
                    resultado += "  <CADENA>\t\t" + analizador.lexemas + "\n";
                    break;
                    case error:
                    resultado += "  <Simbolo no definido>\t" + analizador.lexemas + "\n";
                    break;
                    default:
                    resultado += "  < " + analizador.lexemas + " >\n";
                    break;
            }
        }

  }  

private void Filereader() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
