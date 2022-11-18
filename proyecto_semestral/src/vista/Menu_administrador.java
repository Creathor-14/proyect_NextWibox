/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thoma
 */
public class Menu_administrador extends javax.swing.JPanel {

    private DefaultTableModel model;
    public Menu_administrador() {
        initComponents();
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        model = tabla;
        actualizar_tabla();
    }
    private void actualizar_tabla (){
        
        List <String[]> matriz = Visualizador.sistema.obtenerDatosTodos();
        for(int i = 0;i<matriz.size();i++){
            model.addRow(matriz.get(i));
        }
        
    }
    private void eliminar_datos_tabla(){
        for(int i = jTable1.getRowCount()-1;i>=0;i--){
            model.removeRow(i);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        titulo_texto = new javax.swing.JLabel();
        jPanel_cerrar_sesion = new javax.swing.JPanel();
        jLabel_Acceder3 = new javax.swing.JLabel();
        usuario_texto = new javax.swing.JLabel();
        dato_input = new javax.swing.JTextField();
        usuario_separador = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ingresar_button = new javax.swing.JButton();
        modificar_button = new javax.swing.JButton();
        actualizar_button = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(138, 25));
        setMinimumSize(new java.awt.Dimension(138, 25));

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_texto.setBackground(new java.awt.Color(255, 255, 255));
        titulo_texto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo_texto.setForeground(new java.awt.Color(255, 255, 255));
        titulo_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_texto.setText("Menu Administrador");
        menu.add(titulo_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, 200, -1));

        jPanel_cerrar_sesion.setBackground(new java.awt.Color(204, 0, 0));

        jLabel_Acceder3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel_Acceder3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Acceder3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_Acceder3.setText("Cerrar Sesión");
        jLabel_Acceder3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel_Acceder3MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_cerrar_sesionLayout = new javax.swing.GroupLayout(jPanel_cerrar_sesion);
        jPanel_cerrar_sesion.setLayout(jPanel_cerrar_sesionLayout);
        jPanel_cerrar_sesionLayout.setHorizontalGroup(
            jPanel_cerrar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_cerrar_sesionLayout.createSequentialGroup()
                .addComponent(jLabel_Acceder3, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        jPanel_cerrar_sesionLayout.setVerticalGroup(
            jPanel_cerrar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel_Acceder3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        menu.add(jPanel_cerrar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 392, 200, -1));

        usuario_texto.setBackground(new java.awt.Color(255, 255, 255));
        usuario_texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        usuario_texto.setForeground(new java.awt.Color(255, 255, 255));
        usuario_texto.setText("Rut o Codigo:");
        menu.add(usuario_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, -1, -1));

        dato_input.setBackground(new java.awt.Color(51, 51, 51));
        dato_input.setForeground(new java.awt.Color(102, 102, 102));
        dato_input.setBorder(null);
        menu.add(dato_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 270, 20));
        menu.add(usuario_separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 270, 10));

        jButton1.setText("Buscar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        menu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Rut - Codigo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        menu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 440, 180));

        ingresar_button.setText("Ingresar");
        ingresar_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresar_buttonMouseClicked(evt);
            }
        });
        menu.add(ingresar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, -1, -1));

        modificar_button.setText("Modificar");
        modificar_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificar_buttonMouseClicked(evt);
            }
        });
        menu.add(modificar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        actualizar_button.setText("Eliminar");
        actualizar_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizar_buttonMouseClicked(evt);
            }
        });
        menu.add(actualizar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel_Acceder3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel_Acceder3MouseClicked
        Login login = new Login();
        login.setSize(660, 460);
        login.setLocation(0,0);

        menu.removeAll();
        menu.add(login,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        menu.revalidate();
        menu.repaint();
    }//GEN-LAST:event_jLabel_Acceder3MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        //adsfndfjsñadsjfñ
        String dato = dato_input.getText();
        if(!dato.isBlank()){
            boolean encontrado=false;
            for(int fila=0;fila<jTable1.getRowCount();fila++){
                String tabla_dato =  model.getValueAt(fila, 1)+"";
                if(dato.equals(tabla_dato)){
                    jTable1.setRowSelectionInterval(fila,fila);
                    encontrado=true;
                    break;
                }
            }
            if(!encontrado){
                JOptionPane.showMessageDialog(null, "Rut - Codigo Inexistente", "Validación", 0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese Rut - Codigo", "Validación", 2);
        }
        
    }//GEN-LAST:event_jButton1MouseClicked

    private void ingresar_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresar_buttonMouseClicked
        //ingresar un objeto (MENU)
        //ingresar un objeto (MENU)
        //ingresar un objeto (MENU)
        //ingresar un objeto (MENU)
    }//GEN-LAST:event_ingresar_buttonMouseClicked

    private void modificar_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_buttonMouseClicked
        int fila = jTable1.getSelectedRow();
        if(fila != -1){
            String tipo = model.getValueAt(fila, 0)+"";
            String dato = model.getValueAt(fila, 1)+"";
            if(tipo.equalsIgnoreCase("usuario")){
                abrir_modificar_usuario(dato);
            }else if(tipo.equalsIgnoreCase("vendedor")){
                abrir_modificar_vendedor(dato);
            }else if(tipo.equalsIgnoreCase("desarrollador")){
                abrir_modificar_desarrollador(dato);
            }else{
                abrir_modificar_videojuego(dato);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un campo de la tabla", "Validación", 1);
        }
    }//GEN-LAST:event_modificar_buttonMouseClicked

    private void actualizar_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_buttonMouseClicked
        int fila = jTable1.getSelectedRow();
        if(fila != -1){
            String tipo = model.getValueAt(fila, 0)+"";
            String dato = model.getValueAt(fila, 1)+"";
            if(tipo.equalsIgnoreCase("usuario")){
                Visualizador.sistema.eliminar_usuario(dato);
            }else if(tipo.equalsIgnoreCase("vendedor")){
                Visualizador.sistema.eliminar_vendedor(dato);
            }else if(tipo.equalsIgnoreCase("desarrollador")){
                Visualizador.sistema.eliminar_desarrollador(dato);
            }else{
                Visualizador.sistema.eliminar_videojuego(dato);
            }
            model.removeRow(fila);
            JOptionPane.showMessageDialog(null, tipo+" eliminado", "Validación", 1);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un campo de la tabla", "Validación", 1);
        }
    }//GEN-LAST:event_actualizar_buttonMouseClicked
    private void abrir_ingresar(){
        
    }
    private void abrir_modificar_usuario(String rut){
        /*
        ActualizarUsuario actualizarUsuario = new ActualizarUsuario();
        actualizarUsuario.setSize(660, 460);
        actualizarUsuario.setLocation(0,0);

        usuario.removeAll();
        usuario.add(actualizarUsuario,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        usuario.revalidate();
        usuario.repaint();
        */
    }
    private void abrir_modificar_vendedor(String rut){
        /*
        ActualizarVendedor actualizarVendedor = new ActualizarVendedor();
        actualizarVendedor.setSize(660, 460);
        actualizarVendedor.setLocation(0,0);

        vendedor.removeAll();
        vendedor.add(actualizarVendedor,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        vendedor.revalidate();
        vendedor.repaint();
        */
    }
    private void abrir_modificar_desarrollador(String rut){
        /*
        ActualizarDesarrollador actualizarDesarrollador = new ActualizarDesarrollador();
        actualizarDesarrollador.setSize(660, 460);
        actualizarDesarrollador.setLocation(0,0);

        desarrollador.removeAll();
        desarrollador.add(actualizarDesarrollador,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        desarrollador.revalidate();
        desarrollador.repaint();
        */
    }
    private void abrir_modificar_videojuego(String codigo){
        /*
        ActualizarVideojuego actualizarVideoJuego = new ActualizarVideojuego();
        actualizarVideoJuego.setSize(660, 460);
        actualizarVideoJuego.setLocation(0,0);

        videojuego.removeAll();
        videojuego.add(actualizarVideoJuego,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        videojuego.revalidate();
        videojuego.repaint();
        */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_button;
    private javax.swing.JTextField dato_input;
    private javax.swing.JButton ingresar_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel_Acceder3;
    private javax.swing.JPanel jPanel_cerrar_sesion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton modificar_button;
    private javax.swing.JLabel titulo_texto;
    private javax.swing.JSeparator usuario_separador;
    private javax.swing.JLabel usuario_texto;
    // End of variables declaration//GEN-END:variables
}
