package vista;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JPanel {
    public Login() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        login = new javax.swing.JPanel();
        titulo_texto = new javax.swing.JLabel();
        usuario_texto = new javax.swing.JLabel();
        usuario_input = new javax.swing.JTextField();
        usuario_separador = new javax.swing.JSeparator();
        contraseña_texto = new javax.swing.JLabel();
        contraseña_input = new javax.swing.JPasswordField();
        contraseña_separador = new javax.swing.JSeparator();
        acceder_boton = new javax.swing.JLabel();
        infoAdmin_boton = new javax.swing.JButton();
        infoVendedor_boton = new javax.swing.JButton();

        login.setBackground(new java.awt.Color(51, 51, 51));
        login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_texto.setBackground(new java.awt.Color(255, 255, 255));
        titulo_texto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo_texto.setForeground(new java.awt.Color(255, 255, 255));
        titulo_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_texto.setText("INICIAR SESIÓN");
        login.add(titulo_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 102, -1, -1));

        usuario_texto.setBackground(new java.awt.Color(255, 255, 255));
        usuario_texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario_texto.setForeground(new java.awt.Color(255, 255, 255));
        usuario_texto.setText("USUARIO");
        login.add(usuario_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 145, -1, -1));

        usuario_input.setBackground(new java.awt.Color(51, 51, 51));
        usuario_input.setForeground(new java.awt.Color(102, 102, 102));
        usuario_input.setBorder(null);
        login.add(usuario_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 170, 270, 20));
        login.add(usuario_separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 270, 10));

        contraseña_texto.setBackground(new java.awt.Color(51, 51, 51));
        contraseña_texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        contraseña_texto.setForeground(new java.awt.Color(255, 255, 255));
        contraseña_texto.setText("CONTRASEÑA");
        login.add(contraseña_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, -1, -1));

        contraseña_input.setBackground(new java.awt.Color(51, 51, 51));
        contraseña_input.setForeground(new java.awt.Color(102, 102, 102));
        contraseña_input.setBorder(null);
        login.add(contraseña_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 229, 270, -1));
        login.add(contraseña_separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 270, 10));

        acceder_boton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        acceder_boton.setForeground(new java.awt.Color(255, 255, 255));
        acceder_boton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        acceder_boton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/acceder.png"))); // NOI18N
        acceder_boton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51), 0));
        acceder_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                acceder_botonMouseClicked(evt);
            }
        });
        login.add(acceder_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, 140, 50));

        infoAdmin_boton.setText("Admin");
        infoAdmin_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoAdmin_botonMouseClicked(evt);
            }
        });
        login.add(infoAdmin_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 80, -1));

        infoVendedor_boton.setText("Vendedor");
        infoVendedor_boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoVendedor_botonMouseClicked(evt);
            }
        });
        login.add(infoVendedor_boton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 410, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(login, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void abrir_menu_vendedor(){
        Menu_vendedor menu = new Menu_vendedor();
        menu.setSize(660, 460);
        menu.setLocation(0,0);

        login.removeAll();
        login.add(menu,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        login.revalidate();
        login.repaint();
    }
    private void acceder_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acceder_botonMouseClicked
        String usuario = usuario_input.getText();
        String contraseña = contraseña_input.getText();
        if(usuario.equals("adm") && contraseña.equals("admin")){
            new Menu_admin().setVisible(true);
        }else{
            if(usuario.isBlank()){
                JOptionPane.showMessageDialog(null,"Ingrese un usuario");
            }else if(contraseña.isBlank()){
                JOptionPane.showMessageDialog(null,"Ingrese una contraseña");
            }else if(usuario.contains(" ")){
                JOptionPane.showMessageDialog(null,"El usuario no debe contener espacios");
            }else{
                try{
                    boolean existeUsuario = Visualizador.sistema.login(usuario, contraseña);
                    if(existeUsuario){
                        abrir_menu_vendedor();
                    }else{
                        JOptionPane.showMessageDialog(null,"El usuario no existe en el sistema");
                    }
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null,e.getMessage());
                }   
            }
        }
    }//GEN-LAST:event_acceder_botonMouseClicked

    private void infoAdmin_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoAdmin_botonMouseClicked
        JOptionPane.showMessageDialog(null,"Menu admin\n---> Usuario: adm\n---> Contraseña:admin");
    }//GEN-LAST:event_infoAdmin_botonMouseClicked

    private void infoVendedor_botonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoVendedor_botonMouseClicked
        JOptionPane.showMessageDialog(null,"Menu vendedor\n---> Usuario: correo\n---> Contraseña:rut(sin puntos ni guion)");
    }//GEN-LAST:event_infoVendedor_botonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel acceder_boton;
    private javax.swing.JPasswordField contraseña_input;
    private javax.swing.JSeparator contraseña_separador;
    private javax.swing.JLabel contraseña_texto;
    private javax.swing.JButton infoAdmin_boton;
    private javax.swing.JButton infoVendedor_boton;
    private javax.swing.JPanel login;
    private javax.swing.JLabel titulo_texto;
    private javax.swing.JTextField usuario_input;
    private javax.swing.JSeparator usuario_separador;
    private javax.swing.JLabel usuario_texto;
    // End of variables declaration//GEN-END:variables
}
