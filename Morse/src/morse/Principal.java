
package morse;

/**
 *
 * @author JHON
 */
public class Principal extends javax.swing.JFrame {


    public Principal() {
        initComponents();
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_texto_morse = new javax.swing.JButton();
        panel_contenido = new javax.swing.JPanel();
        bienvenida = new javax.swing.JLabel();
        btn_morse_texto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_texto_morse.setBackground(new java.awt.Color(0, 153, 153));
        btn_texto_morse.setForeground(new java.awt.Color(255, 255, 255));
        btn_texto_morse.setText("De Texto a morse");
        btn_texto_morse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPanelTextoMorse(evt);
            }
        });

        bienvenida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bienvenida.setText("BIENVENID@ AL TRADUCTOR DE CODIGO MORSE");

        javax.swing.GroupLayout panel_contenidoLayout = new javax.swing.GroupLayout(panel_contenido);
        panel_contenido.setLayout(panel_contenidoLayout);
        panel_contenidoLayout.setHorizontalGroup(
            panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_contenidoLayout.createSequentialGroup()
                .addContainerGap(78, Short.MAX_VALUE)
                .addComponent(bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );
        panel_contenidoLayout.setVerticalGroup(
            panel_contenidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_contenidoLayout.createSequentialGroup()
                .addGap(149, 149, 149)
                .addComponent(bienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
        );

        btn_morse_texto.setBackground(new java.awt.Color(0, 153, 153));
        btn_morse_texto.setForeground(new java.awt.Color(255, 255, 255));
        btn_morse_texto.setText("De Morse a texto");
        btn_morse_texto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPanelMorse(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_texto_morse, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                    .addComponent(btn_morse_texto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_contenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btn_texto_morse, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_morse_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarPanelTextoMorse(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPanelTextoMorse
        panel_contenido.removeAll();
        panel_contenido.repaint();

        DeTexto contenedor = new DeTexto();
        contenedor.setSize(panel_contenido.getSize());
        panel_contenido.add(contenedor);

        revalidate();
    }//GEN-LAST:event_cargarPanelTextoMorse

    private void cargarPanelMorse(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPanelMorse
        panel_contenido.removeAll();
        panel_contenido.repaint();

        DeMorse contenedor = new DeMorse();
        contenedor.setSize(panel_contenido.getSize());
        panel_contenido.add(contenedor);

        revalidate();
    }//GEN-LAST:event_cargarPanelMorse

    //REALIZADO POR JHON ALEXIS ORTIZ ATEHORTUA


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bienvenida;
    private javax.swing.JButton btn_morse_texto;
    private javax.swing.JButton btn_texto_morse;
    private javax.swing.JPanel panel_contenido;
    // End of variables declaration//GEN-END:variables
}
