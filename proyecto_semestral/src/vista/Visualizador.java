package vista;

import controlador.Sistema_impl;
import java.awt.Color;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Visualizador extends javax.swing.JFrame {

    public static Sistema_impl sistema = new Sistema_impl();
    public Visualizador() {
        initComponents();
        ImageIcon imagen = new ImageIcon("src/imagenes/LogoNegro.png");
        Icon icono = new ImageIcon (imagen.getImage(). getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT));
        jLabel1.setIcon(icono);
        this.repaint();
        
        
        this.setLocationRelativeTo(null);//hace que la pestaña se vea al centro
        cargar_login();
        
        if(sistema.isConected()){
            JOptionPane.showMessageDialog(null, "Conectado a la base de datos", "Funcionamiento Aplicación", 1); 
            sistema.cargar_datos_BD();
        }else{
            JOptionPane.showMessageDialog(null, "Modo sin conexión", "Funcionamiento Aplicación", 1);
            sistema.ingresarDatosPrueba();
            JOptionPane.showMessageDialog(null, sistema.como_entrar_menu_vendedor(), "Funcionamiento Aplicación", 1);
        }     
    }
    private void cargar_login(){
        Login login = new Login();
        login.setSize(660, 460);
        login.setLocation(0,0);

        contenido.removeAll();
        contenido.add(login,new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,-1,-1));
        contenido.revalidate();
        contenido.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        header = new javax.swing.JPanel();
        cerrar = new javax.swing.JPanel();
        cerrar_text = new javax.swing.JLabel();
        diseño = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        contenido = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(900, 500));
        setUndecorated(true);
        setResizable(false);

        header.setBackground(new java.awt.Color(0, 0, 0));
        header.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrar.setBackground(new java.awt.Color(0, 0, 0));

        cerrar_text.setBackground(new java.awt.Color(255, 0, 0));
        cerrar_text.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        cerrar_text.setForeground(new java.awt.Color(102, 102, 255));
        cerrar_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrar_text.setText("X");
        cerrar_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrar_textMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrar_textMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrar_textMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarLayout = new javax.swing.GroupLayout(cerrar);
        cerrar.setLayout(cerrarLayout);
        cerrarLayout.setHorizontalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrar_text, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
        cerrarLayout.setVerticalGroup(
            cerrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cerrarLayout.createSequentialGroup()
                .addComponent(cerrar_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        header.add(cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 40, 40));

        diseño.setBackground(new java.awt.Color(0, 0, 0));
        diseño.setMaximumSize(new java.awt.Dimension(900, 500));
        diseño.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        diseño.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 240, 160));

        contenido.setBackground(new java.awt.Color(51, 51, 51));
        contenido.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenido, javax.swing.GroupLayout.DEFAULT_SIZE, 648, Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(diseño, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(diseño, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(contenido, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cerrar_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_textMouseClicked
        System.exit(0);
    }//GEN-LAST:event_cerrar_textMouseClicked

    private void cerrar_textMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_textMouseEntered
        cerrar.setBackground(Color.red);
    }//GEN-LAST:event_cerrar_textMouseEntered

    private void cerrar_textMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrar_textMouseExited
        cerrar.setBackground(Color.black);
    }//GEN-LAST:event_cerrar_textMouseExited
    
                                    

    
    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Visualizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Visualizador().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel cerrar;
    private javax.swing.JLabel cerrar_text;
    private javax.swing.JPanel contenido;
    private javax.swing.JPanel diseño;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
