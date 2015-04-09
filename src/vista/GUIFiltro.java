package vista;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;

/**
 *
 * @author michaelr
 */
public class GUIFiltro extends javax.swing.JFrame {

    /**
     * Creates new form GUIFiltro
     */
    public GUIFiltro() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtDatos = new javax.swing.JTable();
        jlTitulo = new javax.swing.JLabel();
        cBoxFiltro = new javax.swing.JComboBox();
        jlFiltro = new javax.swing.JLabel();
        jlBusqueda = new javax.swing.JLabel();
        jtextBusqueda = new javax.swing.JTextField();
        btnBusqueda = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jtDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Carné", "Nombre", "Edad"
            }
        ));
        jScrollPane1.setViewportView(jtDatos);

        jlTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jlTitulo.setText("Reporte");

        cBoxFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Nombre", "Edad", "Carné" }));
        cBoxFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxFiltroActionPerformed(evt);
            }
        });

        jlFiltro.setText("Filtro: ");

        jlBusqueda.setText("...");

        btnBusqueda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1426204169_xmag.png"))); // NOI18N

        btnAtras.setText("Atrás");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jlTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAtras)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jlFiltro)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(jlBusqueda)
                                    .addGap(6, 6, 6)
                                    .addComponent(jtextBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnBusqueda))))))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jlTitulo)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cBoxFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlFiltro)
                    .addComponent(jlBusqueda)
                    .addComponent(btnBusqueda)
                    .addComponent(jtextBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(btnAtras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void cBoxFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxFiltroActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBusqueda;
    private javax.swing.JComboBox cBoxFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlBusqueda;
    private javax.swing.JLabel jlFiltro;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JTable jtDatos;
    private javax.swing.JTextField jtextBusqueda;
    // End of variables declaration//GEN-END:variables

    public void escucharBusqueda(ActionListener controlador) {
        this.btnBusqueda.addActionListener(controlador);
    }

    public void escucharTabla(MouseListener controlador) {
        this.jtDatos.addMouseListener(controlador);
    }

    public void escucharItem(ItemListener control) {
        this.cBoxFiltro.addItemListener(control);
    }

    public String getTxtBusqueda() {
        return this.jtextBusqueda.getText().trim();
    }

    public void setTxtBusqueda(String carnet) {
        this.jtextBusqueda.setText(carnet);
    }

    public static final String BTN_BUSCAR = "buscar";

}
