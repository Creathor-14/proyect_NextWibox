package vista;

import javax.swing.JOptionPane;

public class IngresarRegistros extends javax.swing.JFrame {
    private String tipo_registro;
    public IngresarRegistros(String nombre_registro) {
        initComponents();
        tipo_registro = nombre_registro;
        if(nombre_registro.equals("Usuario")){
            tipo_registro = "persona";
            titulo_txt.setText("Ingresar Usuario");
            
            ingresarVideoJuego.removeAll();
            ingresarVideoJuego.setVisible(false);

        }else if(nombre_registro.equals("Vendedor") || nombre_registro.equals("Desarrollador")){
            tipo_registro = "persona";
            titulo_txt.setText(titulo_txt.getText()+nombre_registro);
            
            ingresarVideoJuego.removeAll();
            ingresarVideoJuego.setVisible(false);
            
            telefono_txt.setText("Fono");
            comuna_input.setVisible(false);
            comuna_txt.setVisible(false);
            jSeparator_direccion2.setVisible(false);
            if(nombre_registro.equals("Vendedor")){
                fechaNacimiento_input.setText("");
                fechaNacimiento_txt.setText("Clave");
            }else{
                fechaNacimiento_input.setVisible(false);
                fechaNacimiento_txt.setVisible(false);
                jSeparator_fNac.setVisible(false);

            }
            
        }else if(nombre_registro.equalsIgnoreCase("videojuego")){
            tipo_registro = "videojuego";
            titulo_txt.setText(titulo_txt.getText()+nombre_registro);
            ingresarPersona.removeAll();
            ingresarPersona.setVisible(false);
        }else{
                
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ingresar = new javax.swing.JPanel();
        titulo_txt = new javax.swing.JLabel();
        registrar_button = new javax.swing.JButton();
        Remplazar = new javax.swing.JPanel();
        ingresarPersona = new javax.swing.JPanel();
        rut_txt = new javax.swing.JLabel();
        rut_input = new javax.swing.JTextField();
        jSeparator_rut2 = new javax.swing.JSeparator();
        nombre_txt = new javax.swing.JLabel();
        nombre_input = new javax.swing.JTextField();
        jSeparator_nombre2 = new javax.swing.JSeparator();
        correo_txt = new javax.swing.JLabel();
        correo_input = new javax.swing.JTextField();
        jSeparator_correo2 = new javax.swing.JSeparator();
        direccion_txt = new javax.swing.JLabel();
        direccion_input = new javax.swing.JTextField();
        jSeparator_comuna1 = new javax.swing.JSeparator();
        comuna_txt = new javax.swing.JLabel();
        comuna_input = new javax.swing.JTextField();
        jSeparator_direccion2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        ingresarUsuario = new javax.swing.JPanel();
        telefono_txt = new javax.swing.JLabel();
        telefono_input = new javax.swing.JTextField();
        jSeparator_telefono = new javax.swing.JSeparator();
        fechaNacimiento_txt = new javax.swing.JLabel();
        fechaNacimiento_input = new javax.swing.JTextField();
        jSeparator_fNac = new javax.swing.JSeparator();
        ingresarVideoJuego = new javax.swing.JPanel();
        codigo_txt = new javax.swing.JLabel();
        codigo_input = new javax.swing.JTextField();
        jSeparator_codigo = new javax.swing.JSeparator();
        nombreJ_txt = new javax.swing.JLabel();
        nombreJ_input = new javax.swing.JTextField();
        jSeparator_nombre = new javax.swing.JSeparator();
        version_txt = new javax.swing.JLabel();
        version_input = new javax.swing.JTextField();
        jSeparator_version = new javax.swing.JSeparator();
        fechaDesarrollo_txt = new javax.swing.JLabel();
        fechaDesarrollo_input = new javax.swing.JTextField();
        jSeparator_fecha = new javax.swing.JSeparator();
        categoria_txt = new javax.swing.JLabel();
        categoria_input = new javax.swing.JTextField();
        jSeparator_categoria = new javax.swing.JSeparator();
        genero_txt = new javax.swing.JLabel();
        genero_input = new javax.swing.JTextField();
        jSeparator_genero = new javax.swing.JSeparator();
        precio_txt = new javax.swing.JLabel();
        precio_input = new javax.swing.JTextField();
        jSeparator_desarrollador = new javax.swing.JSeparator();
        rutDesarrollador_txt = new javax.swing.JLabel();
        rutDesarrollador_input = new javax.swing.JTextField();
        jSeparator_precio = new javax.swing.JSeparator();
        formato_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(660, 460));

        ingresar.setBackground(new java.awt.Color(51, 51, 51));
        ingresar.setMaximumSize(new java.awt.Dimension(660, 460));
        ingresar.setMinimumSize(new java.awt.Dimension(660, 460));
        ingresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titulo_txt.setBackground(new java.awt.Color(255, 255, 255));
        titulo_txt.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulo_txt.setForeground(new java.awt.Color(255, 255, 255));
        titulo_txt.setText("Ingresar");
        ingresar.add(titulo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, -1, -1));

        registrar_button.setText("REGISTRAR");
        registrar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_buttonActionPerformed(evt);
            }
        });
        ingresar.add(registrar_button, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        Remplazar.setMaximumSize(new java.awt.Dimension(440, 250));
        Remplazar.setMinimumSize(new java.awt.Dimension(440, 250));
        Remplazar.setPreferredSize(new java.awt.Dimension(440, 250));
        Remplazar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ingresarPersona.setBackground(new java.awt.Color(51, 51, 51));
        ingresarPersona.setMaximumSize(new java.awt.Dimension(440, 250));
        ingresarPersona.setMinimumSize(new java.awt.Dimension(440, 250));
        ingresarPersona.setPreferredSize(new java.awt.Dimension(440, 250));
        ingresarPersona.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rut_txt.setBackground(new java.awt.Color(255, 255, 255));
        rut_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rut_txt.setForeground(new java.awt.Color(255, 255, 255));
        rut_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rut_txt.setText("Rut");
        ingresarPersona.add(rut_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 130, -1));

        rut_input.setBackground(new java.awt.Color(51, 51, 51));
        rut_input.setForeground(new java.awt.Color(102, 102, 102));
        rut_input.setText("00.000.000-K");
        rut_input.setBorder(null);
        ingresarPersona.add(rut_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 190, 20));
        ingresarPersona.add(jSeparator_rut2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 250, 10));

        nombre_txt.setBackground(new java.awt.Color(255, 255, 255));
        nombre_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombre_txt.setForeground(new java.awt.Color(255, 255, 255));
        nombre_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nombre_txt.setText("Nombre");
        ingresarPersona.add(nombre_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 130, 20));

        nombre_input.setBackground(new java.awt.Color(51, 51, 51));
        nombre_input.setForeground(new java.awt.Color(102, 102, 102));
        nombre_input.setText("Juan Navarro");
        nombre_input.setBorder(null);
        ingresarPersona.add(nombre_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 190, 20));
        ingresarPersona.add(jSeparator_nombre2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 250, 10));

        correo_txt.setBackground(new java.awt.Color(255, 255, 255));
        correo_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        correo_txt.setForeground(new java.awt.Color(255, 255, 255));
        correo_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        correo_txt.setText("Correo");
        ingresarPersona.add(correo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 130, 20));

        correo_input.setBackground(new java.awt.Color(51, 51, 51));
        correo_input.setForeground(new java.awt.Color(102, 102, 102));
        correo_input.setText("correoFalso@dominioFalso.cl");
        correo_input.setBorder(null);
        ingresarPersona.add(correo_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 190, 20));
        ingresarPersona.add(jSeparator_correo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 250, 10));

        direccion_txt.setBackground(new java.awt.Color(255, 255, 255));
        direccion_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        direccion_txt.setForeground(new java.awt.Color(255, 255, 255));
        direccion_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        direccion_txt.setText("Direccion");
        ingresarPersona.add(direccion_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 130, 20));

        direccion_input.setBackground(new java.awt.Color(51, 51, 51));
        direccion_input.setForeground(new java.awt.Color(102, 102, 102));
        direccion_input.setText("Industrias 111");
        direccion_input.setBorder(null);
        ingresarPersona.add(direccion_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 190, 20));
        ingresarPersona.add(jSeparator_comuna1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 250, 10));

        comuna_txt.setBackground(new java.awt.Color(255, 255, 255));
        comuna_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        comuna_txt.setForeground(new java.awt.Color(255, 255, 255));
        comuna_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        comuna_txt.setText("Comuna");
        ingresarPersona.add(comuna_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 130, 20));

        comuna_input.setBackground(new java.awt.Color(51, 51, 51));
        comuna_input.setForeground(new java.awt.Color(102, 102, 102));
        comuna_input.setText("San Joaquin");
        comuna_input.setBorder(null);
        ingresarPersona.add(comuna_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 190, 20));
        ingresarPersona.add(jSeparator_direccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 250, 10));

        ingresarUsuario.setBackground(new java.awt.Color(51, 51, 51));
        ingresarUsuario.setMaximumSize(new java.awt.Dimension(660, 460));
        ingresarUsuario.setMinimumSize(new java.awt.Dimension(660, 460));
        ingresarUsuario.setPreferredSize(new java.awt.Dimension(660, 460));
        ingresarUsuario.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        telefono_txt.setBackground(new java.awt.Color(255, 255, 255));
        telefono_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        telefono_txt.setForeground(new java.awt.Color(255, 255, 255));
        telefono_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        telefono_txt.setText("Telefono");
        ingresarUsuario.add(telefono_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        telefono_input.setBackground(new java.awt.Color(51, 51, 51));
        telefono_input.setForeground(new java.awt.Color(102, 102, 102));
        telefono_input.setText("+56 9 0000 0000");
        telefono_input.setBorder(null);
        ingresarUsuario.add(telefono_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 250, -1));
        ingresarUsuario.add(jSeparator_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 250, 10));

        fechaNacimiento_txt.setBackground(new java.awt.Color(255, 255, 255));
        fechaNacimiento_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fechaNacimiento_txt.setForeground(new java.awt.Color(255, 255, 255));
        fechaNacimiento_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        fechaNacimiento_txt.setText("Fecha nacimiento");
        ingresarUsuario.add(fechaNacimiento_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 130, 20));

        fechaNacimiento_input.setBackground(new java.awt.Color(51, 51, 51));
        fechaNacimiento_input.setForeground(new java.awt.Color(102, 102, 102));
        fechaNacimiento_input.setText("dd-MM-yy");
        fechaNacimiento_input.setBorder(null);
        ingresarUsuario.add(fechaNacimiento_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 250, -1));
        ingresarUsuario.add(jSeparator_fNac, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 250, 10));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 401, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(ingresarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        ingresarPersona.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 390, 60));

        Remplazar.add(ingresarPersona, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ingresarVideoJuego.setBackground(new java.awt.Color(51, 51, 51));
        ingresarVideoJuego.setPreferredSize(new java.awt.Dimension(610, 460));
        ingresarVideoJuego.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigo_txt.setBackground(new java.awt.Color(255, 255, 255));
        codigo_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        codigo_txt.setForeground(new java.awt.Color(255, 255, 255));
        codigo_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        codigo_txt.setText("Codigo:");
        ingresarVideoJuego.add(codigo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, -1));

        codigo_input.setBackground(new java.awt.Color(51, 51, 51));
        codigo_input.setForeground(new java.awt.Color(102, 102, 102));
        codigo_input.setText("0001");
        codigo_input.setBorder(null);
        ingresarVideoJuego.add(codigo_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 260, -1));
        ingresarVideoJuego.add(jSeparator_codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 270, 10));

        nombreJ_txt.setBackground(new java.awt.Color(255, 255, 255));
        nombreJ_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        nombreJ_txt.setForeground(new java.awt.Color(255, 255, 255));
        nombreJ_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        nombreJ_txt.setText("Nombre:");
        ingresarVideoJuego.add(nombreJ_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 130, -1));

        nombreJ_input.setBackground(new java.awt.Color(51, 51, 51));
        nombreJ_input.setForeground(new java.awt.Color(102, 102, 102));
        nombreJ_input.setText("Pepe y los globos");
        nombreJ_input.setBorder(null);
        ingresarVideoJuego.add(nombreJ_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 270, -1));
        ingresarVideoJuego.add(jSeparator_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 270, 10));

        version_txt.setBackground(new java.awt.Color(255, 255, 255));
        version_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        version_txt.setForeground(new java.awt.Color(255, 255, 255));
        version_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        version_txt.setText("Version:");
        ingresarVideoJuego.add(version_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 130, -1));

        version_input.setBackground(new java.awt.Color(51, 51, 51));
        version_input.setForeground(new java.awt.Color(102, 102, 102));
        version_input.setText("1.0A");
        version_input.setBorder(null);
        ingresarVideoJuego.add(version_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 270, -1));
        ingresarVideoJuego.add(jSeparator_version, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 270, 10));

        fechaDesarrollo_txt.setBackground(new java.awt.Color(255, 255, 255));
        fechaDesarrollo_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fechaDesarrollo_txt.setForeground(new java.awt.Color(255, 255, 255));
        fechaDesarrollo_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        fechaDesarrollo_txt.setText("Fecha:");
        ingresarVideoJuego.add(fechaDesarrollo_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 130, -1));

        fechaDesarrollo_input.setBackground(new java.awt.Color(51, 51, 51));
        fechaDesarrollo_input.setForeground(new java.awt.Color(102, 102, 102));
        fechaDesarrollo_input.setText("dd/MM/yy");
        fechaDesarrollo_input.setBorder(null);
        ingresarVideoJuego.add(fechaDesarrollo_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 270, -1));
        ingresarVideoJuego.add(jSeparator_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 270, 10));

        categoria_txt.setBackground(new java.awt.Color(255, 255, 255));
        categoria_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        categoria_txt.setForeground(new java.awt.Color(255, 255, 255));
        categoria_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        categoria_txt.setText("Categoria:");
        ingresarVideoJuego.add(categoria_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 130, -1));

        categoria_input.setBackground(new java.awt.Color(51, 51, 51));
        categoria_input.setForeground(new java.awt.Color(102, 102, 102));
        categoria_input.setText("shooting");
        categoria_input.setBorder(null);
        ingresarVideoJuego.add(categoria_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, -1));
        ingresarVideoJuego.add(jSeparator_categoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 140, 270, 10));

        genero_txt.setBackground(new java.awt.Color(255, 255, 255));
        genero_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        genero_txt.setForeground(new java.awt.Color(255, 255, 255));
        genero_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        genero_txt.setText("Genero:");
        ingresarVideoJuego.add(genero_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 130, -1));

        genero_input.setBackground(new java.awt.Color(51, 51, 51));
        genero_input.setForeground(new java.awt.Color(102, 102, 102));
        genero_input.setText("acci??n");
        genero_input.setBorder(null);
        ingresarVideoJuego.add(genero_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 270, -1));
        ingresarVideoJuego.add(jSeparator_genero, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 270, 10));

        precio_txt.setBackground(new java.awt.Color(255, 255, 255));
        precio_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        precio_txt.setForeground(new java.awt.Color(255, 255, 255));
        precio_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        precio_txt.setText("Precio:");
        ingresarVideoJuego.add(precio_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 130, -1));

        precio_input.setBackground(new java.awt.Color(51, 51, 51));
        precio_input.setForeground(new java.awt.Color(102, 102, 102));
        precio_input.setText("10000");
        precio_input.setBorder(null);
        ingresarVideoJuego.add(precio_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 270, -1));
        ingresarVideoJuego.add(jSeparator_desarrollador, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 230, 270, 10));

        rutDesarrollador_txt.setBackground(new java.awt.Color(255, 255, 255));
        rutDesarrollador_txt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        rutDesarrollador_txt.setForeground(new java.awt.Color(255, 255, 255));
        rutDesarrollador_txt.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        rutDesarrollador_txt.setText("Rut desarrollador:");
        ingresarVideoJuego.add(rutDesarrollador_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 130, -1));

        rutDesarrollador_input.setBackground(new java.awt.Color(51, 51, 51));
        rutDesarrollador_input.setForeground(new java.awt.Color(102, 102, 102));
        rutDesarrollador_input.setText("11.111.111-1");
        rutDesarrollador_input.setBorder(null);
        ingresarVideoJuego.add(rutDesarrollador_input, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, 270, -1));
        ingresarVideoJuego.add(jSeparator_precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 270, 10));

        formato_txt.setEditable(false);
        formato_txt.setBackground(new java.awt.Color(51, 51, 51));
        formato_txt.setForeground(new java.awt.Color(102, 102, 102));
        formato_txt.setText("#");
        formato_txt.setToolTipText("");
        formato_txt.setBorder(null);
        ingresarVideoJuego.add(formato_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, 10, -1));

        Remplazar.add(ingresarVideoJuego, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 250));

        ingresar.add(Remplazar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 440, 250));

        jButton1.setText("ATRAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ingresar.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ingresar, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_buttonActionPerformed
        if(tipo_registro.equalsIgnoreCase("persona")){
            String rut = rut_input.getText();
            String nombre = nombre_input.getText();
            String correo = correo_input.getText();
            String direccion = direccion_input.getText();
            String tipo_persona = titulo_txt.getText().replace("Ingresar ", "");
            if(tipo_persona.equals("Usuario")){
                String comuna= comuna_input.getText();
                String telefono = telefono_input.getText();
                String fecha_de_nacimiento = fechaNacimiento_input.getText();
                ingresar_usuario(rut, nombre, direccion, correo, fecha_de_nacimiento, comuna, telefono);
                
                
            }else{
                String fono = telefono_input.getText();
                //String titulo = titulo_txt.getText().replaceAll("Menu ", "");
                
                if(tipo_persona.equals("Vendedor")){
                    String clave = fechaNacimiento_input.getText();
                    ingresar_vendedor(rut, nombre, direccion, correo, fono, clave);
                }else{
                    ingresar_desarrollador(rut, nombre, direccion, correo, fono);  
                }   
            }
        }else if(tipo_registro.equals("videojuego")){
            String codigo = codigo_input.getText();
            String nombre = nombreJ_input.getText();
            String version = version_input.getText();
            String fechaD = fechaDesarrollo_input.getText();
            String categoria = categoria_input.getText();
            String genero = genero_input.getText();
            String precio = precio_input.getText();
            String rutDesarrollador = rutDesarrollador_input.getText();
            ingresar_videojuego(codigo, nombre, version, fechaD, categoria, genero, precio, rutDesarrollador);
        }else{
                
        }
    }//GEN-LAST:event_registrar_buttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ingresar_usuario(String rut, String nombre, String direccion, String correo, String fecha_de_nacimiento, String comuna, String telefono){
        if(rut.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su rut", "ERROR", 0);
        }else if(nombre.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su nombre", "ERROR", 0);
        }else if(correo.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su correo", "ERROR", 0);
        }else if(correo.contains(" ")){
            JOptionPane.showMessageDialog(null, "El correo no puede tener espacios en blanco", "ERROR", 0);
        }else if(direccion.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su direcci??n", "ERROR", 0);
        }else if(comuna.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su comuna", "ERROR", 0);
        }else if(telefono.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su telefono", "ERROR", 0);
        }else if(fecha_de_nacimiento.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su fecha de nacimiento", "ERROR", 0);
        }else{
            try{
                Visualizador.sistema.ingresarUsuario(rut, nombre, direccion, correo, fecha_de_nacimiento, comuna, telefono);
                JOptionPane.showMessageDialog(null, "Usuario ingresado", "Validaci??n", 1);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Validaci??n", 2);
            } 
        }
    }
    private void ingresar_vendedor(String rut, String nombre, String direccion, String correo, String fono, String clave){
        if(rut.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su rut", "ERROR", 0);
        }else if(nombre.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su nombre", "ERROR", 0);
        }else if(correo.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su correo", "ERROR", 0);
        }else if(correo.contains(" ")){
            JOptionPane.showMessageDialog(null, "El correo no puede tener espacios en blanco", "ERROR", 0);
        }else if(direccion.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su direcci??n", "ERROR", 0);
        }else if(fono.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su fono", "ERROR", 0);
        }else if(clave.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su clave", "ERROR", 0);
        }else{
            try{
                Visualizador.sistema.ingresarVendedor(rut, nombre, direccion, correo, fono, clave);
                JOptionPane.showMessageDialog(null, "Vendedor ingresado", "Validaci??n", 1);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Validaci??n", 2);
            } 
        }
    }
    private void ingresar_desarrollador(String rut, String nombre, String direccion, String correo, String fono){
        if(rut.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su rut", "ERROR", 0);
        }else if(nombre.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su nombre", "ERROR", 0);
        }else if(correo.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su correo", "ERROR", 0);
        }else if(correo.contains(" ")){
            JOptionPane.showMessageDialog(null, "El correo no puede tener espacios en blanco", "ERROR", 0);
        }else if(direccion.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su direcci??n", "ERROR", 0);
        }else if(fono.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese su fono", "ERROR", 0);
        }else{
            try{
                Visualizador.sistema.ingresarDesarrollador(rut, nombre, direccion, correo, fono);
                JOptionPane.showMessageDialog(null, "Desarrollador ingresado", "Validaci??n", 1);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Validaci??n", 2);
            } 
        }
    }
    private void ingresar_videojuego(String codigo, String nombre, String version, String fechaD, String categoria, String genero, String precio, String rutDesarrollador){
        
        if(codigo.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese el codigo", "ERROR", 0);
        }else if(nombre.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese el nombre", "ERROR", 0);
        }else if(version.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese la version", "ERROR", 0);
        }else if(fechaD.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese la fecha de desarrollo", "ERROR", 0);
        }else if(categoria.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese la categoria", "ERROR", 0);
        }else if(genero.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese el genero", "ERROR", 0);
        }else if(precio.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese el precio", "ERROR", 0);
        }else if(rutDesarrollador.isBlank()){
            JOptionPane.showMessageDialog(null, "Ingrese el rut del desarrollador", "ERROR", 0);
        }else{
            try{
                Visualizador.sistema.ingresarVideojuego("#"+codigo, nombre, version, fechaD, categoria, genero, precio, rutDesarrollador);
                JOptionPane.showMessageDialog(null, "Videojuego ingresado", "Validaci??n", 1);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage(), "Validaci??n", 2);
            } 
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Remplazar;
    private javax.swing.JTextField categoria_input;
    private javax.swing.JLabel categoria_txt;
    private javax.swing.JTextField codigo_input;
    private javax.swing.JLabel codigo_txt;
    private javax.swing.JTextField comuna_input;
    private javax.swing.JLabel comuna_txt;
    private javax.swing.JTextField correo_input;
    private javax.swing.JLabel correo_txt;
    private javax.swing.JTextField direccion_input;
    private javax.swing.JLabel direccion_txt;
    private javax.swing.JTextField fechaDesarrollo_input;
    private javax.swing.JLabel fechaDesarrollo_txt;
    private javax.swing.JTextField fechaNacimiento_input;
    private javax.swing.JLabel fechaNacimiento_txt;
    private javax.swing.JTextField formato_txt;
    private javax.swing.JTextField genero_input;
    private javax.swing.JLabel genero_txt;
    private javax.swing.JPanel ingresar;
    private javax.swing.JPanel ingresarPersona;
    private javax.swing.JPanel ingresarUsuario;
    private javax.swing.JPanel ingresarVideoJuego;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator_categoria;
    private javax.swing.JSeparator jSeparator_codigo;
    private javax.swing.JSeparator jSeparator_comuna1;
    private javax.swing.JSeparator jSeparator_correo2;
    private javax.swing.JSeparator jSeparator_desarrollador;
    private javax.swing.JSeparator jSeparator_direccion2;
    private javax.swing.JSeparator jSeparator_fNac;
    private javax.swing.JSeparator jSeparator_fecha;
    private javax.swing.JSeparator jSeparator_genero;
    private javax.swing.JSeparator jSeparator_nombre;
    private javax.swing.JSeparator jSeparator_nombre2;
    private javax.swing.JSeparator jSeparator_precio;
    private javax.swing.JSeparator jSeparator_rut2;
    private javax.swing.JSeparator jSeparator_telefono;
    private javax.swing.JSeparator jSeparator_version;
    private javax.swing.JTextField nombreJ_input;
    private javax.swing.JLabel nombreJ_txt;
    private javax.swing.JTextField nombre_input;
    private javax.swing.JLabel nombre_txt;
    private javax.swing.JTextField precio_input;
    private javax.swing.JLabel precio_txt;
    private javax.swing.JButton registrar_button;
    private javax.swing.JTextField rutDesarrollador_input;
    private javax.swing.JLabel rutDesarrollador_txt;
    private javax.swing.JTextField rut_input;
    private javax.swing.JLabel rut_txt;
    private javax.swing.JTextField telefono_input;
    private javax.swing.JLabel telefono_txt;
    private javax.swing.JLabel titulo_txt;
    private javax.swing.JTextField version_input;
    private javax.swing.JLabel version_txt;
    // End of variables declaration//GEN-END:variables
}
