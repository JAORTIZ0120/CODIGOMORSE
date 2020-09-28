
package morse;


public class DeMorse extends javax.swing.JPanel {
    // ARREGLO QUE CONTIENE EL ABECEDARIO EN CODIGO MORSE
    String cod_morse[] = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",//a - g
        "....", "..", ".---", "-.-", ".-..", "--", "-.",//h - n
        "---", ".--.", "--.-", ".-.", "...", "-", "..-",//o - u
        "...-", ".--", "-..-", "-.--", "--..", //v - z
        ".-", "-...", "-.-.", "-..", ".", "..-.", "--.",//A - G
        "....", "..", ".---", "-.-", ".-..", "--", "-.",//H - N
        "---", ".--.", "--.-", ".-.", "...", "-", "..-",//O - P
        "...-", ".--", "-..-", "-.--", "--..", " "};//V - Z
    //VARIABLE QUE CONTIENE TODO EL ABECEDARIO PARA COMPARA Y TRADUCIR
    String abc = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ";
    String morse_traducion = " ";
    public DeMorse() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiqueta_titulo = new javax.swing.JLabel();
        campo_morse = new javax.swing.JTextField();
        etiqueta_morse = new javax.swing.JLabel();
        campo_traduccion = new javax.swing.JTextField();
        etiqueta_traduccion = new javax.swing.JLabel();
        btn_traducir = new javax.swing.JButton();
        btn_limpiar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 153, 0)));

        etiqueta_titulo.setFont(new java.awt.Font("Constantia", 0, 24)); // NOI18N
        etiqueta_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etiqueta_titulo.setText("DE MORSE A TEXTO");

        campo_morse.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        campo_morse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_campo(evt);
            }
        });

        etiqueta_morse.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        etiqueta_morse.setText("Ingresa codigo morse:");

        etiqueta_traduccion.setFont(new java.awt.Font("Constantia", 0, 14)); // NOI18N
        etiqueta_traduccion.setText("Traduccion texto:");

        btn_traducir.setBackground(new java.awt.Color(51, 204, 0));
        btn_traducir.setFont(new java.awt.Font("Constantia", 0, 11)); // NOI18N
        btn_traducir.setForeground(new java.awt.Color(255, 255, 255));
        btn_traducir.setText("TRADUCIR");
        btn_traducir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicarTraduccion(evt);
            }
        });

        btn_limpiar.setBackground(new java.awt.Color(255, 0, 0));
        btn_limpiar.setFont(new java.awt.Font("Constantia", 0, 11)); // NOI18N
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("LIMPIAR");
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiar_todo(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiqueta_morse, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_morse, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_traducir, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta_traduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_traduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(etiqueta_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiqueta_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiqueta_morse, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiqueta_traduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_traduccion, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campo_morse, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_traducir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(91, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inicarTraduccion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicarTraduccion
       //METODO CON EL CUAL INICIAMOS LA TRADUCCION DE MORSE A ALFABETO
        morse_traducion=" ";
       String mensaje = campo_morse.getText();
       //CON EL SPLIT PARTIMOS LA CADENA ALMACENADA EN LA VARIABLE MENSAJE CADA QUE DETECTA UN ESPACIO EN BLANCO
       //Y SE ALAMCENA EN UN ARRAY
       String oracion[]= mensaje.split(" ");
       int iteraciones = oracion.length;
       
       //CON EL PRIMER CICLO RECOREMOS LA LONGITUD DE NUESTRA ORACION ESCRITA EN CODIGO MORSE
        for (int i = 0; i < iteraciones; i++) {
             morse_traducion = morse_traducion+" ";
            for (int j = 0; j < cod_morse.length; j++) {
               // CON EL SEGUNDO FOR RECORREMOS EL ARREGLO QUE CONTIENE TODO NUESTRO CODIGO MORSE PARA REALIZAR LA TRADUCCION
                if (oracion[i].equals(cod_morse[j])) {
                    morse_traducion = morse_traducion + abc.charAt(j);
                    break;
                    // CADA QUE SE ENCUENTRA UNA COINCIDENCIA QUE ROMPE PARA EVITAR QUE SE REPITAN LETRAS
                }
            }
        }
        //morse = morse.substring(1,morse.length());
        campo_traduccion.setText(morse_traducion);
    }//GEN-LAST:event_inicarTraduccion

    private void limpiar_todo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_todo
       //LIMPIA TODO EL CONTENIDO
       campo_morse.setText("");
       campo_traduccion.setText("");
       morse_traducion = " ";
    }//GEN-LAST:event_limpiar_todo

    private void limpiar_campo(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiar_campo
        campo_traduccion.setText(" ");
        morse_traducion=" ";
    }//GEN-LAST:event_limpiar_campo
    //REALIZADO POR JHON ALEXIS ORTIZ ATEHORTUA

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_traducir;
    private javax.swing.JTextField campo_morse;
    private javax.swing.JTextField campo_traduccion;
    private javax.swing.JLabel etiqueta_morse;
    private javax.swing.JLabel etiqueta_titulo;
    private javax.swing.JLabel etiqueta_traduccion;
    // End of variables declaration//GEN-END:variables
}
