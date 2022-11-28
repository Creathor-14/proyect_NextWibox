package vista;

import javax.swing.JOptionPane;

public class IngresarArriendo extends javax.swing.JPanel {

    public IngresarArriendo() {
        initComponents();  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresarUsuario = new javax.swing.JPanel();
        jLabel_Titulo = new javax.swing.JLabel();
        jLabel_rut1 = new javax.swing.JLabel();
        codigoArriendo_input = new javax.swing.JTextField();
        jSeparator_rut1 = new javax.swing.JSeparator();
        jLabel_rut = new javax.swing.JLabel();
        rutUsuario_input = new javax.swing.JTextField();
        jSeparator_rut = new javax.swing.JSeparator();
        jLabel_fechaA = new javax.swing.JLabel();
        codigoVideojuego_input = new javax.swing.JTextField();
        jSeparator_fechaA = new javax.swing.JSeparator();
        jPanel_menu = new javax.swing.JPanel();
        jLabel_menu = new javax.swing.JLabel();
        jPanel_registrar = new javax.swing.JPanel();
        jLabel_registrar = new javax.swing.JLabel();
        jLabel_nombre1 = new javax.swing.JLabel();
        fechaArriendo_input = new javax.swing.JTextField();
        jSeparator_nombre1 = new javax.swing.JSeparator();
        jLabel_fechaE = new javax.swing.JLabel();
        jSeparator_fechaE = new javax.swing.JSeparator();
        fechaEntrega_input = new javax.swing.JTextField();
        formato_txt = new javax.swing.JTextField();

        setMaximumSize(new java.awt.Dimension(138, 25));
        setMinimumSize(new java.awt.Dimension(138, 25));
        setPreferredSize(new java.awt.Dimension(610, 460));

        ingresarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        ingresarUsuario.setMinimumSize(new java.awt.Dimension(0, 0));
        ingresarUsuario.setPreferredSize(new java.awt.Dimension(610, 460));
        ingresarUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_Titulo.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Titulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Titulo.setText("INGRESAR ARRIENDO");
        ingresarUsuario.add(jLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 50, -1, -1));

        jLabel_rut1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_rut1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_rut1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_rut1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_rut1.setText("Codigo arriendo");
        ingresarUsuario.add(jLabel_rut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 150, -1));

        codigoArriendo_input.setBackground(new java.awt.Color(51, 51, 51));
        codigoArriendo_input.setForeground(new java.awt.Color(102, 102, 102));
        codigoArriendo_input.setText("1111");
        codigoArriendo_input.setBorder(null);
        ingresarUsuario.add(codigoArriendo_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, 270, -1));
        ingresarUsuario.add(jSeparator_rut1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 270, 10));

        jLabel_rut.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_rut.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_rut.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_rut.setText("Rut usuario");
        ingresarUsuario.add(jLabel_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 130, -1));

        rutUsuario_input.setBackground(new java.awt.Color(51, 51, 51));
        rutUsuario_input.setForeground(new java.awt.Color(102, 102, 102));
        rutUsuario_input.setText("00.000.000-0");
        rutUsuario_input.setBorder(null);
        rutUsuario_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rutUsuario_inputActionPerformed(evt);
            }
        });
        ingresarUsuario.add(rutUsuario_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 270, -1));
        ingresarUsuario.add(jSeparator_rut, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 270, 10));

        jLabel_fechaA.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_fechaA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_fechaA.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_fechaA.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_fechaA.setText("Fecha arriendo");
        ingresarUsuario.add(jLabel_fechaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 130, -1));

        codigoVideojuego_input.setBackground(new java.awt.Color(51, 51, 51));
        codigoVideojuego_input.setForeground(new java.awt.Color(102, 102, 102));
        codigoVideojuego_input.setText("00001");
        codigoVideojuego_input.setToolTipText("");
        codigoVideojuego_input.setBorder(null);
        ingresarUsuario.add(codigoVideojuego_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 260, -1));
        ingresarUsuario.add(jSeparator_fechaA, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 270, 10));

        jPanel_menu.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_menu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_menu.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_menu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_menu.setText("ATRAS");
        jLabel_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_menuMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_menuLayout = new javax.swing.GroupLayout(jPanel_menu);
        jPanel_menu.setLayout(jPanel_menuLayout);
        jPanel_menuLayout.setHorizontalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel_menuLayout.setVerticalGroup(
            jPanel_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_menuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_menu, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ingresarUsuario.add(jPanel_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 120, -1));

        jPanel_registrar.setBackground(new java.awt.Color(0, 153, 153));

        jLabel_registrar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_registrar.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_registrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_registrar.setText("REGISTRAR");
        jLabel_registrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_registrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_registrarLayout = new javax.swing.GroupLayout(jPanel_registrar);
        jPanel_registrar.setLayout(jPanel_registrarLayout);
        jPanel_registrarLayout.setHorizontalGroup(
            jPanel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_registrar, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        jPanel_registrarLayout.setVerticalGroup(
            jPanel_registrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_registrarLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ingresarUsuario.add(jPanel_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 120, -1));

        jLabel_nombre1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_nombre1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_nombre1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_nombre1.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_nombre1.setText("Codigo videojuego");
        ingresarUsuario.add(jLabel_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        fechaArriendo_input.setBackground(new java.awt.Color(51, 51, 51));
        fechaArriendo_input.setForeground(new java.awt.Color(102, 102, 102));
        fechaArriendo_input.setText("DD-MM-YY");
        fechaArriendo_input.setBorder(null);
        ingresarUsuario.add(fechaArriendo_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 270, -1));
        ingresarUsuario.add(jSeparator_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 220, 270, 10));

        jLabel_fechaE.setBackground(new java.awt.Color(255, 255, 255));
        jLabel_fechaE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel_fechaE.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_fechaE.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel_fechaE.setText("Fecha entrega");
        ingresarUsuario.add(jLabel_fechaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 130, -1));
        ingresarUsuario.add(jSeparator_fechaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 270, 10));

        fechaEntrega_input.setBackground(new java.awt.Color(51, 51, 51));
        fechaEntrega_input.setForeground(new java.awt.Color(102, 102, 102));
        fechaEntrega_input.setText("DD-MM-YY");
        fechaEntrega_input.setBorder(null);
        ingresarUsuario.add(fechaEntrega_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, 270, -1));

        formato_txt.setEditable(false);
        formato_txt.setBackground(new java.awt.Color(51, 51, 51));
        formato_txt.setForeground(new java.awt.Color(102, 102, 102));
        formato_txt.setToolTipText("");
        formato_txt.setBorder(null);
        ingresarUsuario.add(formato_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 10, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(ingresarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_menuMouseClicked
        Menu_vendedor Menu_vendedor = new Menu_vendedor();
        Menu_vendedor.setSize(660, 460);
        Menu_vendedor.setLocation(0,0);

        ingresarUsuario.removeAll();
        ingresarUsuario.add(Menu_vendedor,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        ingresarUsuario.revalidate();
        ingresarUsuario.repaint();
    }//GEN-LAST:event_jLabel_menuMouseClicked

    private void jLabel_registrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_registrarMouseClicked
        String codigo_arriendo = codigoArriendo_input.getText();
        String rutUsuario = rutUsuario_input.getText();
        String codigo_videojuego = codigoVideojuego_input.getText();

        String fechaA=fechaArriendo_input.getText();
        
        String fechaE=fechaEntrega_input.getText();
        ingresar_arriendo(codigo_arriendo, fechaA, fechaE, codigo_videojuego, rutUsuario);

        
    }//GEN-LAST:event_jLabel_registrarMouseClicked

    private void rutUsuario_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rutUsuario_inputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rutUsuario_inputActionPerformed
    
    public void ingresar_arriendo(String codigo_arriendo,String fechaA,String fechaE,String codigo_videojuego,String rutUsuario){
        if(codigo_arriendo.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese codigo_arriendo", "ERROR", 0);
        }else if(rutUsuario.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese rut usuario", "ERROR", 0);
        }else if(codigo_videojuego.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese codigo_videojuego", "ERROR", 0);
        }else if(fechaA.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese fecha arriendo", "ERROR", 0);
        }else if(fechaE.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese fecha entrega", "ERROR", 0);
        }else{
            try{
                Visualizador.sistema.ingresarArriendo(codigo_arriendo, fechaA, fechaE, "#"+codigo_videojuego, rutUsuario);
                JOptionPane.showMessageDialog(null,"Arriendo ingresado.");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage(),"Validación",0);
            
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField codigoArriendo_input;
    private javax.swing.JTextField codigoVideojuego_input;
    private javax.swing.JTextField fechaArriendo_input;
    private javax.swing.JTextField fechaEntrega_input;
    private javax.swing.JTextField formato_txt;
    private javax.swing.JPanel ingresarUsuario;
    private javax.swing.JLabel jLabel_Titulo;
    private javax.swing.JLabel jLabel_fechaA;
    private javax.swing.JLabel jLabel_fechaE;
    private javax.swing.JLabel jLabel_menu;
    private javax.swing.JLabel jLabel_nombre1;
    private javax.swing.JLabel jLabel_registrar;
    private javax.swing.JLabel jLabel_rut;
    private javax.swing.JLabel jLabel_rut1;
    private javax.swing.JPanel jPanel_menu;
    private javax.swing.JPanel jPanel_registrar;
    private javax.swing.JSeparator jSeparator_fechaA;
    private javax.swing.JSeparator jSeparator_fechaE;
    private javax.swing.JSeparator jSeparator_nombre1;
    private javax.swing.JSeparator jSeparator_rut;
    private javax.swing.JSeparator jSeparator_rut1;
    private javax.swing.JTextField rutUsuario_input;
    // End of variables declaration//GEN-END:variables
}
