
package vista;


public class VentanaPrincipal extends javax.swing.JFrame {

    
    public VentanaPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Ingresos = new javax.swing.JMenuItem();
        Ingresos1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        Ingresos2 = new javax.swing.JMenuItem();
        Ingresos3 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        Ingresos4 = new javax.swing.JMenuItem();
        Ingresos5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 316, Short.MAX_VALUE)
        );

        jMenu1.setText("Ingresar");

        Ingresos.setText("polerones");
        Ingresos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresosActionPerformed(evt);
            }
        });
        jMenu1.add(Ingresos);

        Ingresos1.setText("zapatillas");
        Ingresos1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresos1ActionPerformed(evt);
            }
        });
        jMenu1.add(Ingresos1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Modificar Datos");

        jMenu4.setText("zapatillas");

        Ingresos2.setText("polerones");
        Ingresos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresos2ActionPerformed(evt);
            }
        });
        jMenu4.add(Ingresos2);

        Ingresos3.setText("zapatillas");
        Ingresos3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresos3ActionPerformed(evt);
            }
        });
        jMenu4.add(Ingresos3);

        jMenu2.add(jMenu4);

        jMenu5.setText("polerones");

        Ingresos4.setText("polerones");
        Ingresos4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresos4ActionPerformed(evt);
            }
        });
        jMenu5.add(Ingresos4);

        Ingresos5.setText("zapatillas");
        Ingresos5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ingresos5ActionPerformed(evt);
            }
        });
        jMenu5.add(Ingresos5);

        jMenu2.add(jMenu5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Salir");

        Salir.setText("Salir De La Tienda");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jMenu3.add(Salir);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

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

    private void IngresosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresosActionPerformed
       VentanaIngresoPolerones ventPrin=new VentanaIngresoPolerones();
       ventPrin.setLocationRelativeTo(null);
       ventPrin.setTitle("Ingresos");
       ventPrin.setResizable(false);
       ventPrin.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       ventPrin.setVisible(true);
    }//GEN-LAST:event_IngresosActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void Ingresos1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresos1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresos1ActionPerformed

    private void Ingresos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresos2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresos2ActionPerformed

    private void Ingresos3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresos3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresos3ActionPerformed

    private void Ingresos4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresos4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresos4ActionPerformed

    private void Ingresos5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ingresos5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ingresos5ActionPerformed

   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Ingresos;
    private javax.swing.JMenuItem Ingresos1;
    private javax.swing.JMenuItem Ingresos2;
    private javax.swing.JMenuItem Ingresos3;
    private javax.swing.JMenuItem Ingresos4;
    private javax.swing.JMenuItem Ingresos5;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
