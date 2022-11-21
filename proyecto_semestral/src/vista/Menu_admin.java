/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thoma
 */
public class Menu_admin extends javax.swing.JFrame {

    private DefaultTableModel model;
    private boolean logo = true;
    
    public Menu_admin() {
        initComponents();
        this.setLocationRelativeTo(null);
        jPanel1.setVisible(false);
        /*
        rut_input.setVisible(false);
        rut_separador.setVisible(false);
        buscar_botton.setVisible(false);
        jScrollPane1.setVisible(false);
        jPanel1.setVisible(false);
        */
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        model = tabla;
    }
    private void eliminar_datos_tabla(){
        for(int i = jTable1.getRowCount()-1;i>=0;i--){
            model.removeRow(i);
        }
    }
    private void mostrarInfo(){
        if(logo){
            jPanel1.setVisible(true);
            /*
            rut_input.setVisible(true);
            rut_separador.setVisible(true);
            buscar_botton.setVisible(true);
            jScrollPane1.setVisible(true);
            jPanel1.setVisible(true);
            */
            logo = false;
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
        jPanel1 = new javax.swing.JPanel();
        titulo_texto = new javax.swing.JLabel();
        buscar_txt = new javax.swing.JLabel();
        buscar_input = new javax.swing.JTextField();
        rut_separador = new javax.swing.JSeparator();
        buscar_botton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ingresar_botton = new javax.swing.JButton();
        modificar_botton = new javax.swing.JButton();
        eliminar_botton = new javax.swing.JButton();
        barraTareas_menu = new javax.swing.JMenuBar();
        personas_menu = new javax.swing.JMenu();
        usuarios_menu = new javax.swing.JMenuItem();
        vendedores_menu = new javax.swing.JMenuItem();
        desarrolladores_menu = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        videojuegos_menu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Admin");
        setResizable(false);

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        titulo_texto.setBackground(new java.awt.Color(255, 255, 255));
        titulo_texto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo_texto.setForeground(new java.awt.Color(255, 255, 255));
        titulo_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        buscar_txt.setBackground(new java.awt.Color(255, 255, 255));
        buscar_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        buscar_txt.setForeground(new java.awt.Color(255, 255, 255));

        buscar_input.setBackground(new java.awt.Color(51, 51, 51));
        buscar_input.setForeground(new java.awt.Color(102, 102, 102));
        buscar_input.setBorder(null);

        buscar_botton.setText("Buscar");
        buscar_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscar_bottonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Rut", "Nombre", "Direccion", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        ingresar_botton.setText("Ingresar");
        ingresar_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresar_bottonActionPerformed(evt);
            }
        });

        modificar_botton.setText("Modificar");
        modificar_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificar_bottonActionPerformed(evt);
            }
        });

        eliminar_botton.setText("Eliminar");
        eliminar_botton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminar_bottonMouseClicked(evt);
            }
        });
        eliminar_botton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_bottonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(100, 100, 100)
                            .addComponent(titulo_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(buscar_txt))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(buscar_input, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(rut_separador, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(20, 20, 20)
                            .addComponent(buscar_botton))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(ingresar_botton)
                            .addGap(118, 118, 118)
                            .addComponent(modificar_botton)
                            .addGap(89, 89, 89)
                            .addComponent(eliminar_botton)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(titulo_texto)
                    .addGap(30, 30, 30)
                    .addComponent(buscar_txt)
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(buscar_input, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(rut_separador, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(buscar_botton))
                    .addGap(20, 20, 20)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ingresar_botton)
                        .addComponent(modificar_botton)
                        .addComponent(eliminar_botton))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        menu.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 0, 490, 420));

        personas_menu.setText("Registros");

        usuarios_menu.setText("Usuarios");
        usuarios_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarios_menuActionPerformed(evt);
            }
        });
        personas_menu.add(usuarios_menu);

        vendedores_menu.setText("Vendedor");
        vendedores_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendedores_menuActionPerformed(evt);
            }
        });
        personas_menu.add(vendedores_menu);

        desarrolladores_menu.setText("Desarrolladores");
        desarrolladores_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desarrolladores_menuActionPerformed(evt);
            }
        });
        personas_menu.add(desarrolladores_menu);

        jMenuItem1.setText("Videojuegos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        personas_menu.add(jMenuItem1);

        barraTareas_menu.add(personas_menu);

        videojuegos_menu.setText("Ayuda");
        videojuegos_menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                videojuegos_menuMouseClicked(evt);
            }
        });
        barraTareas_menu.add(videojuegos_menu);

        jMenu1.setText("Salir");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        barraTareas_menu.add(jMenu1);

        setJMenuBar(barraTareas_menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarios_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarios_menuActionPerformed
        titulo_texto.setText("Menu Usuario");
        mostrarInfo();
        buscar_txt.setText("Rut:");
        jTable1.getTableHeader().getColumnModel().getColumn(0).setHeaderValue("Rut");
        jTable1.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("Nombre");
        jTable1.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("Direccion");
        jTable1.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("Correo");
        eliminar_datos_tabla();
        
        
        List <String[]> matriz = Visualizador.sistema.obtenerUsuarios();
        for(int i = 0;i<matriz.size();i++){
            model.addRow(matriz.get(i));
        }
    }//GEN-LAST:event_usuarios_menuActionPerformed

    private void vendedores_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendedores_menuActionPerformed
        titulo_texto.setText("Menu Vendedor");
        mostrarInfo();
        buscar_txt.setText("Rut:");
        jTable1.getTableHeader().getColumnModel().getColumn(0).setHeaderValue("Rut");
        jTable1.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("Nombre");
        jTable1.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("Direccion");
        jTable1.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("Correo");
        eliminar_datos_tabla();
        List <String[]> matriz = Visualizador.sistema.obtenerVendedores();
        for(int i = 0;i<matriz.size();i++){
            model.addRow(matriz.get(i));
        }
    }//GEN-LAST:event_vendedores_menuActionPerformed

    private void desarrolladores_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desarrolladores_menuActionPerformed
        titulo_texto.setText("Menu Desarrollador");
        mostrarInfo();
        buscar_txt.setText("Rut:");
        jTable1.getTableHeader().getColumnModel().getColumn(0).setHeaderValue("Rut");
        jTable1.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("Nombre");
        jTable1.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("Direccion");
        jTable1.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("Correo");
        eliminar_datos_tabla();
        List <String[]> matriz = Visualizador.sistema.obtenerDesarrolladores();
        for(int i = 0;i<matriz.size();i++){
            model.addRow(matriz.get(i));
        }
    }//GEN-LAST:event_desarrolladores_menuActionPerformed

    private void videojuegos_menuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_videojuegos_menuMouseClicked

    }//GEN-LAST:event_videojuegos_menuMouseClicked

    private void eliminar_bottonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminar_bottonMouseClicked

    }//GEN-LAST:event_eliminar_bottonMouseClicked

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        titulo_texto.setText("Menu Videojuego");
        mostrarInfo();
        buscar_txt.setText("Codigo:");
        jTable1.getTableHeader().getColumnModel().getColumn(0).setHeaderValue("Codigo");
        jTable1.getTableHeader().getColumnModel().getColumn(1).setHeaderValue("Nombre");
        jTable1.getTableHeader().getColumnModel().getColumn(2).setHeaderValue("Precio");
        jTable1.getTableHeader().getColumnModel().getColumn(3).setHeaderValue("Rut desarrollador");
        eliminar_datos_tabla();
        //String titl = jTable1.getTableHeader().getColumnModel().getColumn(0).getHeaderValue().toString();
        //Headers
        
        List <String[]> matriz = Visualizador.sistema.obtenerVideojuegos();
        for(int i = 0;i<matriz.size();i++){
            model.addRow(matriz.get(i));
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        //new Visualizador().setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void eliminar_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_bottonActionPerformed
        int fila = jTable1.getSelectedRow();
        if(fila != -1){
            String titulo = titulo_texto.getText().replaceAll("Menu ", "");
            String rut = jTable1.getValueAt(fila, 0)+"";
            boolean eliminado = true;
            
            if(titulo.equals("Usuario")){
                try{
                    Visualizador.sistema.eliminar_usuario(rut);
                }catch(Exception e){
                    eliminado = false;
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Validación", 0);
                }
            }else if(titulo.equals("Vendedor")){
                Visualizador.sistema.eliminar_vendedor(rut);          
            }else if(titulo.equals("Desarrollador")){
                try{
                    Visualizador.sistema.eliminar_desarrollador(rut);
                }catch(Exception e){
                    eliminado = false;
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Validación", 0);
                }
            }else{
                try{
                    Visualizador.sistema.eliminar_videojuego(rut);
                }catch(Exception e){
                    eliminado = false;
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Validación", 0);
                } 
            }
            if(eliminado){
                JOptionPane.showMessageDialog(null, titulo+" eliminado", "Validación", 1);
                model.removeRow(fila);                
            } 
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un campo de la tabla", "Validación", 1);
        }
    }//GEN-LAST:event_eliminar_bottonActionPerformed

    private void ingresar_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresar_bottonActionPerformed
        String titulo = titulo_texto.getText().replaceAll("Menu ", "");
        new IngresarRegistros(titulo).setVisible(true);
    }//GEN-LAST:event_ingresar_bottonActionPerformed

    private void modificar_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificar_bottonActionPerformed
        int fila = jTable1.getSelectedRow();
        if(fila != -1){
            String titulo = titulo_texto.getText().replaceAll("Menu ", "");
            String identificador = jTable1.getValueAt(fila, 0)+"";
            if(titulo.equals("Usuario")){
                int posicion_usuario = Visualizador.sistema.buscarUsuario(identificador);
                new Modificar_registros(titulo,posicion_usuario).setVisible(true);     
            }else if(titulo.equals("Vendedor")){
                int posicion_usuario = Visualizador.sistema.buscarVendedor(identificador);
                new Modificar_registros(titulo,posicion_usuario).setVisible(true);     
            }else if(titulo.equals("Desarrollador")){
                int posicion_usuario = Visualizador.sistema.buscarDesarrollador(identificador);
                new Modificar_registros(titulo,posicion_usuario).setVisible(true);    
            }else{
                int posicion_usuario = Visualizador.sistema.buscarVideoJuego(identificador);
                new Modificar_registros(titulo,posicion_usuario).setVisible(true);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un campo de la tabla", "Validación", 1);
        }
        
    }//GEN-LAST:event_modificar_bottonActionPerformed

    private void buscar_bottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscar_bottonActionPerformed
        String dato = buscar_input.getText();
        String titulo = titulo_texto.getText().replaceAll("Menu ", "").toLowerCase();
        //String identificador = jTable1.getValueAt(fila, 0)+"";
        String identificador = buscar_txt.getText().replace(":", "");
        if(!dato.isBlank()){
            boolean encontrado=false;
            for(int fila=0;fila<jTable1.getRowCount();fila++){
                String tabla_dato =  model.getValueAt(fila, 0)+"";
                if(dato.equals(tabla_dato)){
                    jTable1.setRowSelectionInterval(fila,fila);
                    encontrado=true;
                    break;
                }
            }
            if(!encontrado){
                JOptionPane.showMessageDialog(null, identificador+" del "+titulo+" Inexistente", "Validación", 0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese el "+identificador.toLowerCase()+" del "+titulo, "Validación", 2);
        }
    }//GEN-LAST:event_buscar_bottonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar barraTareas_menu;
    private javax.swing.JButton buscar_botton;
    private javax.swing.JTextField buscar_input;
    private javax.swing.JLabel buscar_txt;
    private javax.swing.JMenuItem desarrolladores_menu;
    private javax.swing.JButton eliminar_botton;
    private javax.swing.JButton ingresar_botton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton modificar_botton;
    private javax.swing.JMenu personas_menu;
    private javax.swing.JSeparator rut_separador;
    private javax.swing.JLabel titulo_texto;
    private javax.swing.JMenuItem usuarios_menu;
    private javax.swing.JMenuItem vendedores_menu;
    private javax.swing.JMenu videojuegos_menu;
    // End of variables declaration//GEN-END:variables
}
