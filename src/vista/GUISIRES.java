/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ControlSIRES;
import java.awt.event.ActionListener;

/**
 *
 * @author aaron
 */
public class GUISIRES extends javax.swing.JFrame {

    /**
     * Creates new form GUISIRES
     */
    public GUISIRES() {
        initComponents();
        ControlSIRES control = new ControlSIRES();
        this.escucharMenuItem(control);
    }

//    public void paintComponent(Graphics g) {
//        Dimension tam = getSize();
//        ImageIcon imagen = new ImageIcon(getClass().getResource("/gui/ardillatierna.jpg"));
//        g.drawImage(imagen.getImage(), 0, 0, tam.width, tam.height, null);
//        this.jPanel1.setOpaque(false);
//        this.paintComponent(g);
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        mbSIRES = new javax.swing.JMenuBar();
        mnArchivo = new javax.swing.JMenu();
        mniSalir = new javax.swing.JMenuItem();
        mnRegistro = new javax.swing.JMenu();
        mniRegistroEstudiante = new javax.swing.JMenuItem();
        mniRegistroCursos = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Registro de Estudiantes (SIRES)");
        setIconImage(getIconImage());
        setIconImages(null);
        setName(""); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
        );

        mnArchivo.setText("Archivo");

        mniSalir.setText("Salir");
        mnArchivo.add(mniSalir);

        mbSIRES.add(mnArchivo);

        mnRegistro.setText("Registro");

        mniRegistroEstudiante.setText("Registro Estudiantes");
        mnRegistro.add(mniRegistroEstudiante);

        mniRegistroCursos.setText("Registro Cursos");
        mnRegistro.add(mniRegistroCursos);

        jMenuItem1.setText("jMenuItem1");
        mnRegistro.add(jMenuItem1);

        mbSIRES.add(mnRegistro);

        setJMenuBar(mbSIRES);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GUISIRES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUISIRES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUISIRES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUISIRES.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUISIRES().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuBar mbSIRES;
    private javax.swing.JMenu mnArchivo;
    private javax.swing.JMenu mnRegistro;
    private javax.swing.JMenuItem mniRegistroCursos;
    private javax.swing.JMenuItem mniRegistroEstudiante;
    private javax.swing.JMenuItem mniSalir;
    // End of variables declaration//GEN-END:variables

    public static final String MNI_SALIR = "Salir";
    public static final String MNI_REGISTRO_ESTUDIANTES = "Registro Estudiantes";
    public static final String MNI_REGISTRO_CURSOS = "Registro Cursos";

    public void escucharMenuItem(ActionListener control) {
        this.mniSalir.addActionListener(control);
        this.mniRegistroEstudiante.addActionListener(control);
        this.mniRegistroCursos.addActionListener(control);
    }
}
