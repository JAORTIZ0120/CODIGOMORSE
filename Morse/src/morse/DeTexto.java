
package morse;


public class DeTexto extends javax.swing.JPanel {
    // ARREGLO QUE CONTIENE EL ABECEDARIO EN CODIGO MORSE 
    String cod_morse[] = {".-","-...","-.-.","-..",".","..-.","--.",//a - g
                      "....","..",".---","-.-",".-..","--","-.",//h - n
                      "---",".--.","--.-",".-.","...","-","..-",//o - u
                      "...-",".--","-..-","-.--","--..",       //v - z
                      ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",//A - G
                      "....", "..", ".---", "-.-", ".-..", "--", "-.",//H - N
                      "---", ".--.", "--.-", ".-.", "...", "-", "..-",//O - P
                       "...-", ".--", "-..-", "-.--", "--.."," "};//V - Z
    String abc= "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    int pos = 0;
    String traduccion = "";
    public DeTexto() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiqueta_titulo = new javax.swing.JLabel();
        campo_texto = new javax.swing.JTextField();
        campo_morse = new javax.swing.JTextField();
        etiqueta_texto = new javax.swing.JLabel();
        etiqueta_traduccion = new javax.swing.JLabel();
        btn_traducir = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));

        etiqueta_titulo.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        etiqueta_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_titulo.setText("DE TEXTO A MORSE");

        campo_texto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                limpiar_morse(evt);
            }
        });

        campo_morse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        etiqueta_texto.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        etiqueta_texto.setText("Ingrese el texto:");

        etiqueta_traduccion.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        etiqueta_traduccion.setText("Traduccion morse:");

        btn_traducir.setBackground(new java.awt.Color(0, 204, 0));
        btn_traducir.setFont(new java.awt.Font("Constantia", 0, 11)); // NOI18N
        btn_traducir.setForeground(new java.awt.Color(255, 255, 255));
        btn_traducir.setText("TRADUCIR");
        btn_traducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicar_traduccion(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(255, 0, 0));
        btn_cancelar.setFont(new java.awt.Font("Constantia", 0, 11)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("CANCELAR");
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_todos_campos(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etiqueta_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_morse, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta_traduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_traducir, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etiqueta_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(117, 117, 117))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta_traduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_morse, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_traducir, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inicar_traduccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicar_traduccion
        traduccion="";
        String texto = campo_texto.getText();
        //INICAMOS UN FOR QUE RECORRA LA LOGITUD DE LA PALABRA INGRESADA Y CON EL INDEXOF TOMAMOS LA POSCISION
        for (int i = 0; i < texto.length(); i++) {
          pos =  abc.indexOf(texto.charAt(i));
          //BUSCAMOS ESA MISMA POSCION EN EL ARREGLO DEL ABECEDARIO EN MORSE Y LO AGREGAMOS A LA NUEVA CADENA
          traduccion = traduccion + cod_morse[pos]+" ";
        }
        campo_morse.setText(traduccion);
    }//GEN-LAST:event_inicar_traduccion

    private void limpiar_morse(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_limpiar_morse
        //LIMPIA EL CAMPO DE LA TRADUCCION Y LA VARIABLE PARA REALIZAR UNA NUEVA TRADUCCION
        campo_morse.setText("");
        traduccion = "";
    }//GEN-LAST:event_limpiar_morse

    private void limpiar_todos_campos(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_todos_campos
        //LIMPIA TODO EL CONTENIDO
        campo_morse.setText("");
        campo_texto.setText("");
        traduccion = ""; 
    }//GEN-LAST:event_limpiar_todos_campos
    //REALIZADO POR JHON ALEXIS ORTIZ ATEHORTUA
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_traducir;
    private javax.swing.JTextField campo_morse;
    private javax.swing.JTextField campo_texto;
    private javax.swing.JLabel etiqueta_texto;
    private javax.swing.JLabel etiqueta_titulo;
    private javax.swing.JLabel etiqueta_traduccion;
    // End of variables declaration//GEN-END:variables
}
