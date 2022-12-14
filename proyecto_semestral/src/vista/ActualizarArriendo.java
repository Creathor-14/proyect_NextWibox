package vista;

import javax.swing.JOptionPane;

public class ActualizarArriendo extends javax.swing.JPanel {
    
    int posicion_arriendo;
    public ActualizarArriendo(int posicion) {
        initComponents();
        posicion_arriendo = posicion;
        String [] datos = Visualizador.sistema.obtener_arriendo(posicion_arriendo);
        nroArriendo_input.setText(datos[0]);
        rutUsuario_input.setText(datos[1]);
        codigoVideojuego_input1.setText(datos[2]);
        fechaArriendo_input.setText(datos[3]);
        fechaEntrega_input.setText(datos[4]);
        

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actualizarArriendo = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_rut = new javax.swing.JLabel();
        rutUsuario_input = new javax.swing.JTextField();
        jSeparator_rut = new javax.swing.JSeparator();
        jLabel_fechaA = new javax.swing.JLabel();
        jSeparator_fechaA = new javax.swing.JSeparator();
        jLabel_nombre1 = new javax.swing.JLabel();
        fechaArriendo_input = new javax.swing.JTextField();
        jSeparator_nombre1 = new javax.swing.JSeparator();
        jLabel_fechaE = new javax.swing.JLabel();
        jSeparator_fechaE = new javax.swing.JSeparator();
        fechaEntrega_input = new javax.swing.JTextField();
        jSeparator_nombre3 = new javax.swing.JSeparator();
        jLabel_rut1 = new javax.swing.JLabel();
        nroArriendo_input = new javax.swing.JTextField();
        jSeparator_rut1 = new javax.swing.JSeparator();
        codigoVideojuego_input1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        registrar_button = new javax.swing.JButton();

        actualizarArriendo.setBackground(new java.awt.Color(51, 51, 51));
        actualizarArriendo.setPreferredSize(new java.awt.Dimension(610, 460));
        actualizarArriendo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("Actualizar arriendo");
        actualizarArriendo.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        jLabel_rut.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_rut.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_rut.setText("Rut usuario");
        actualizarArriendo.add(jLabel_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 130, -1));

        rutUsuario_input.setEditable(false);
        rutUsuario_input.setBackground(new java.awt.Color(51, 51, 51));
        rutUsuario_input.setForeground(new java.awt.Color(102, 102, 102));
        rutUsuario_input.setBorder(null);
        actualizarArriendo.add(rutUsuario_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 270, -1));
        actualizarArriendo.add(jSeparator_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 270, 10));

        jLabel_fechaA.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_fechaA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_fechaA.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_fechaA.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_fechaA.setText("Fecha arriendo");
        actualizarArriendo.add(jLabel_fechaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 130, -1));
        actualizarArriendo.add(jSeparator_fechaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 270, 10));

        jLabel_nombre1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_nombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_nombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_nombre1.setText("Codigo videojuego");
        actualizarArriendo.add(jLabel_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        fechaArriendo_input.setBackground(new java.awt.Color(51, 51, 51));
        fechaArriendo_input.setForeground(new java.awt.Color(102, 102, 102));
        fechaArriendo_input.setBorder(null);
        actualizarArriendo.add(fechaArriendo_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 270, -1));
        actualizarArriendo.add(jSeparator_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 270, 10));

        jLabel_fechaE.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_fechaE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_fechaE.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_fechaE.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_fechaE.setText("Fecha entrega");
        actualizarArriendo.add(jLabel_fechaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 130, -1));
        actualizarArriendo.add(jSeparator_fechaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 280, 270, 10));

        fechaEntrega_input.setBackground(new java.awt.Color(51, 51, 51));
        fechaEntrega_input.setForeground(new java.awt.Color(102, 102, 102));
        fechaEntrega_input.setBorder(null);
        actualizarArriendo.add(fechaEntrega_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 270, -1));
        actualizarArriendo.add(jSeparator_nombre3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 270, 10));

        jLabel_rut1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_rut1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_rut1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_rut1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_rut1.setText("Codigo arriendo");
        actualizarArriendo.add(jLabel_rut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, 150, -1));

        nroArriendo_input.setEditable(false);
        nroArriendo_input.setBackground(new java.awt.Color(51, 51, 51));
        nroArriendo_input.setForeground(new java.awt.Color(102, 102, 102));
        nroArriendo_input.setBorder(null);
        actualizarArriendo.add(nroArriendo_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 270, -1));
        actualizarArriendo.add(jSeparator_rut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 270, 10));

        codigoVideojuego_input1.setEditable(false);
        codigoVideojuego_input1.setBackground(new java.awt.Color(51, 51, 51));
        codigoVideojuego_input1.setForeground(new java.awt.Color(102, 102, 102));
        codigoVideojuego_input1.setToolTipText("");
        codigoVideojuego_input1.setBorder(null);
        actualizarArriendo.add(codigoVideojuego_input1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 270, -1));

        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        actualizarArriendo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 90, -1));

        registrar_button.setText("REGISTRAR");
        registrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_buttonActionPerformed(evt);
            }
        });
        actualizarArriendo.add(registrar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actualizarArriendo, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(actualizarArriendo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Menu_vendedor menu_admin = new Menu_vendedor();
        menu_admin.setSize(660, 460);
        menu_admin.setLocation(0,0);

        actualizarArriendo.removeAll();
        actualizarArriendo.add(menu_admin,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        actualizarArriendo.revalidate();
        actualizarArriendo.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void registrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_buttonActionPerformed
        String fechaA = fechaArriendo_input.getText();
        String fechaE = fechaEntrega_input.getText();
        actualizar_arriendo(fechaA, fechaE);
    }//GEN-LAST:event_registrar_buttonActionPerformed
 
    public void actualizar_arriendo(String fechaA,String fechaE){
        if(fechaA.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese fecha arriendo", "ERROR", 0);
        }else if(fechaE.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese fecha entrega", "ERROR", 0);
        }else{
            try{
                Visualizador.sistema.actualizarArriendo(posicion_arriendo, fechaA, fechaE);
                JOptionPane.showMessageDialog(null,"Arriendo modificado");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage(),"Validaci??n",0);
            
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actualizarArriendo;
    private javax.swing.JTextField codigoVideojuego_input1;
    private javax.swing.JTextField fechaArriendo_input;
    private javax.swing.JTextField fechaEntrega_input;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_fechaA;
    private javax.swing.JLabel jLabel_fechaE;
    private javax.swing.JLabel jLabel_nombre1;
    private javax.swing.JLabel jLabel_rut;
    private javax.swing.JLabel jLabel_rut1;
    private javax.swing.JSeparator jSeparator_fechaA;
    private javax.swing.JSeparator jSeparator_fechaE;
    private javax.swing.JSeparator jSeparator_nombre1;
    private javax.swing.JSeparator jSeparator_nombre3;
    private javax.swing.JSeparator jSeparator_rut;
    private javax.swing.JSeparator jSeparator_rut1;
    private javax.swing.JTextField nroArriendo_input;
    private javax.swing.JButton registrar_button;
    private javax.swing.JTextField rutUsuario_input;
    // End of variables declaration//GEN-END:variables
}
