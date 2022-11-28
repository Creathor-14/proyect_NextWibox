package vista;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Menu_vendedor extends javax.swing.JPanel {

    private DefaultTableModel model;
    public Menu_vendedor() {
        initComponents();
        DefaultTableModel tabla = (DefaultTableModel) jTable1.getModel();
        model = tabla;
        actualizar_tabla();
    }
    private void actualizar_tabla (){
        List <String[]> matriz = Visualizador.sistema.obtenerArriendos();
        for(int i = 0;i<matriz.size();i++){
            model.addRow(matriz.get(i));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        titulo_texto = new javax.swing.JLabel();
        numArriendo_texto = new javax.swing.JLabel();
        numArriendo_input = new javax.swing.JTextField();
        numArriendo_separador = new javax.swing.JSeparator();
        buscar_button = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        ingresar_button = new javax.swing.JButton();
        modificar_button = new javax.swing.JButton();
        actualizar_button = new javax.swing.JButton();
        jPanel_cerrar_sesion = new javax.swing.JPanel();
        cerrarSesion_texto = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(138, 25));
        setMinimumSize(new java.awt.Dimension(138, 25));

        menu.setBackground(new java.awt.Color(51, 51, 51));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_texto.setBackground(new java.awt.Color(255, 255, 255));
        titulo_texto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo_texto.setForeground(new java.awt.Color(255, 255, 255));
        titulo_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo_texto.setText("Menu Vendedor");
        menu.add(titulo_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 200, -1));

        numArriendo_texto.setBackground(new java.awt.Color(255, 255, 255));
        numArriendo_texto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        numArriendo_texto.setForeground(new java.awt.Color(255, 255, 255));
        numArriendo_texto.setText("Numero de arriendo:");
        menu.add(numArriendo_texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        numArriendo_input.setBackground(new java.awt.Color(51, 51, 51));
        numArriendo_input.setForeground(new java.awt.Color(102, 102, 102));
        numArriendo_input.setBorder(null);
        menu.add(numArriendo_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 270, 20));
        menu.add(numArriendo_separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 460, 10));

        buscar_button.setText("Buscar");
        buscar_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buscar_buttonMouseClicked(evt);
            }
        });
        menu.add(buscar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Numero De Arriendo", "Rut Usuario", "Codigo Videojuego", "Fecha Arriendo", "Fecha Entrega"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.setShowGrid(false);
        jScrollPane1.setViewportView(jTable1);

        menu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 580, 180));

        ingresar_button.setText("Ingresar");
        ingresar_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresar_buttonMouseClicked(evt);
            }
        });
        menu.add(ingresar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        modificar_button.setText("Modificar");
        modificar_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificar_buttonMouseClicked(evt);
            }
        });
        menu.add(modificar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, -1, -1));

        actualizar_button.setText("Eliminar");
        actualizar_button.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizar_buttonMouseClicked(evt);
            }
        });
        menu.add(actualizar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 350, -1, -1));

        jPanel_cerrar_sesion.setBackground(new java.awt.Color(204, 0, 0));

        cerrarSesion_texto.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cerrarSesion_texto.setForeground(new java.awt.Color(255, 255, 255));
        cerrarSesion_texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarSesion_texto.setText("CERRAR SECION");
        cerrarSesion_texto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesion_textoMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel_cerrar_sesionLayout = new javax.swing.GroupLayout(jPanel_cerrar_sesion);
        jPanel_cerrar_sesion.setLayout(jPanel_cerrar_sesionLayout);
        jPanel_cerrar_sesionLayout.setHorizontalGroup(
            jPanel_cerrar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarSesion_texto, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        jPanel_cerrar_sesionLayout.setVerticalGroup(
            jPanel_cerrar_sesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel_cerrar_sesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(cerrarSesion_texto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        menu.add(jPanel_cerrar_sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 160, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cerrarSesion_textoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesion_textoMouseClicked
        Login login = new Login();
        login.setSize(660, 460);
        login.setLocation(0,0);
        
        menu.removeAll();
        menu.add(login,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        menu.revalidate();
        menu.repaint();
        
    }//GEN-LAST:event_cerrarSesion_textoMouseClicked

    private void buscar_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buscar_buttonMouseClicked
        String dato = numArriendo_input.getText();
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
                JOptionPane.showMessageDialog(null, "Numero de arriendo Inexistente", "Validación", 0);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese el numero del arriendo", "Validación", 2);
        }
    }//GEN-LAST:event_buscar_buttonMouseClicked

    private void ingresar_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresar_buttonMouseClicked
        abrir_ingresar_arriendo();
    }//GEN-LAST:event_ingresar_buttonMouseClicked

    private void modificar_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificar_buttonMouseClicked
        int fila = jTable1.getSelectedRow();
        if(fila != -1){
            String num_arriendo = model.getValueAt(fila, 0)+"";
            abrir_modificar_arriendo(num_arriendo);
        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un campo de la tabla", "Validación", 1);
        }
    }//GEN-LAST:event_modificar_buttonMouseClicked

    private void actualizar_buttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizar_buttonMouseClicked
        int fila = jTable1.getSelectedRow();
        if(fila != -1){
            String num_arriendo = model.getValueAt(fila, 0)+"";
            try{
                Visualizador.sistema.eliminar_arriendo(num_arriendo);
                model.removeRow(fila);
                JOptionPane.showMessageDialog(null, "Arriendo eliminado", "Validación", 1);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Validación", 1);
            }

        }else{
            JOptionPane.showMessageDialog(null, "Seleccione un campo de la tabla", "Validación", 1);
        }
    }//GEN-LAST:event_actualizar_buttonMouseClicked
    
    private void abrir_ingresar_arriendo(){
        IngresarArriendo ingresarArriendo = new IngresarArriendo();
        ingresarArriendo.setSize(660, 460);
        ingresarArriendo.setLocation(0,0);
        
        menu.removeAll();
        menu.add(ingresarArriendo,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        menu.revalidate();
        menu.repaint();
    }
    
    private void abrir_modificar_arriendo(String num_arriendo){
        int posicion_arriendo = Visualizador.sistema.buscarArriendo(num_arriendo);
        ActualizarArriendo actualizarArriendo = new ActualizarArriendo(posicion_arriendo);
        actualizarArriendo.setSize(660, 460);
        actualizarArriendo.setLocation(0,0);

        menu.removeAll();
        menu.add(actualizarArriendo,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        menu.revalidate();
        menu.repaint();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizar_button;
    private javax.swing.JButton buscar_button;
    private javax.swing.JLabel cerrarSesion_texto;
    private javax.swing.JButton ingresar_button;
    private javax.swing.JPanel jPanel_cerrar_sesion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel menu;
    private javax.swing.JButton modificar_button;
    private javax.swing.JTextField numArriendo_input;
    private javax.swing.JSeparator numArriendo_separador;
    private javax.swing.JLabel numArriendo_texto;
    private javax.swing.JLabel titulo_texto;
    // End of variables declaration//GEN-END:variables
}
