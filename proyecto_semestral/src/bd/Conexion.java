package bd;
import controlador.Sistema_impl;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import modelo.Arriendo;
import modelo.Desarrollador;
import modelo.Usuario;
import modelo.Vendedor;
import modelo.VideoJuego;
   
public class Conexion {
    Connection connection = null;

    public boolean conectar (){
        try {
        //jdbc = es el puerto
        //mysql = motor de base de datos
        // ubicacion del elemento = localhost
        // puerto de coneccion = 3306
        //
        String url = "jdbc:mysql://localhost:3306/libreria"; 
        String user = "root";
        String password = "";    
        connection = DriverManager.getConnection(url, user, password);
        System.out.println("Concxion correcta");
        return true;
        } catch (Exception e) {
            System.out.println("No se pudo conectar a la base de datos");
            return false;
        }
    }
//-------------------------------------TABLAS-------------------------------------  FUNCIONA
    public void borrar_tablas(){
        try{
            String borrar_arriendo = "DROP TABLE arriendo";
            PreparedStatement ps = connection.prepareStatement(borrar_arriendo);
            ps.execute();
            System.out.println("Tabla arriendo borrada");
            ps.close();
            
            String borrar_videojuego = "DROP TABLE videojuego";
            ps = connection.prepareStatement(borrar_videojuego);
            ps.execute();
            System.out.println("Tabla videojuego borrada");
            ps.close();        
            
            String borrar_usuario = "DROP TABLE usuario";
            ps = connection.prepareStatement(borrar_usuario);
            ps.execute();
            System.out.println("Tabla usuario borrada");
            
            String borrar_vendedor = "DROP TABLE vendedor";
            ps = connection.prepareStatement(borrar_vendedor);
            ps.execute();
            System.out.println("Tabla vendedor borrada");
            
            String borrar_desarrollador = "DROP TABLE desarrollador";
            ps = connection.prepareStatement(borrar_desarrollador);
            ps.execute();
            System.out.println("Tabla desarrollador borrada");
            

        }catch(Exception e){
           System.out.println("Error al borrar las tablas"); 
        }
    }
    public void crear_tablas(){
        crear_tabla_usuario();
        crear_tabla_vendedor();
        crear_tabla_desarrollador();
        crear_tabla_videojuego();
        crear_tabla_arriendo();
        
        fk_videojuego_desarrollador();
        fk_arriendo_videojuego();
        fk_arriendo_usuario(); 
    }
    private void crear_tabla_usuario(){
        try{
            String SQL = "CREATE TABLE usuario(rut VARCHAR(12) PRIMARY KEY,nombre VARCHAR(60) NOT NULL,direccion VARCHAR(45) NOT NULL,";
            SQL += "correo VARCHAR(45) NOT NULL,fecha_de_nacimiento DATE NOT NULL,comuna VARCHAR(35) NOT NULL,telefono VARCHAR(20) NOT NULL,UNIQUE(correo))";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.execute();
            System.out.println("Tabla usuario creada");
            ps.close();
        }catch(Exception e){
           System.out.println("Error al crear la tabla usuario, o ya existia"); 
        }
    }
    private void crear_tabla_vendedor(){//agregar clave
        try{
            String SQL = "CREATE TABLE vendedor(rut VARCHAR(12) PRIMARY KEY,nombre VARCHAR(60) NOT NULL,direccion VARCHAR(45) NOT NULL,correo VARCHAR(45) NOT NULL,";
            SQL+="fono VARCHAR(20) NOT NULL,UNIQUE(correo), clave VARCHAR(20) NOT NULL)";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.execute();
            System.out.println("Tabla vendedor creada");
        }catch(Exception e){
           System.out.println("Error al crear la tabla vendedor, o ya existia"); 
        }
    }
    private void crear_tabla_desarrollador(){
        try{
            String SQL = "CREATE TABLE desarrollador(rut VARCHAR(12) PRIMARY KEY,nombre VARCHAR(60) NOT NULL,direccion VARCHAR(45) NOT NULL,correo VARCHAR(45) NOT NULL,";
            SQL+="fono VARCHAR(20) NOT NULL,UNIQUE(correo))";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.execute();
            System.out.println("Tabla desarrollador creada");
        }catch(Exception e){
           System.out.println("Error al crear la tabla desarrollador, o ya existia"); 
        }
        
    }
    private void crear_tabla_videojuego(){
        try{
            String SQL = "CREATE TABLE videojuego(codigo VARCHAR(12) PRIMARY KEY,nombre VARCHAR(60) NOT NULL,version VARCHAR(45) NOT NULL,fecha_de_desarrollo DATE NOT NULL,";
            SQL+="categoria VARCHAR(20) NOT NULL, genero VARCHAR(20) NOT NULL, precio INT(20) NOT NULL, rut VARCHAR (12)NOT NULL, arrendado BIT NOT NULL)";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.execute();
            System.out.println("Tabla videojuego creada");
        }catch(Exception e){
           System.out.println("Error al crear la tabla videojuego, o ya existia"); 
        }
        
    }
    private void crear_tabla_arriendo(){
        try{
            String SQL = "CREATE TABLE arriendo(codigo_arriendo VARCHAR(12) PRIMARY KEY,fecha_arriendo DATE NOT NULL, fecha_entrega DATE NOT NULL,";
            SQL+="codigo VARCHAR(12) NOT NULL, rut VARCHAR(12) NOT NULL)";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.execute();
            System.out.println("Tabla arriendo creada");
        }catch(Exception e){
           System.out.println("Error al crear la tabla arriendo, o ya existia"); 
        }
        
    }
    public void fk_videojuego_desarrollador(){
        try{
            String SQL = "ALTER TABLE videojuego ADD CONSTRAINT fk_videojuego_desarrollador FOREIGN KEY (rut)REFERENCES desarrollador (rut)";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.execute();
            System.out.println("fk creada");
            ps.close();
        }catch(Exception e){
           System.out.println("Error al ingresar fk, o ya existia"); 
        }
    }
    public void fk_arriendo_usuario(){
        try{
            String SQL = "ALTER TABLE arriendo ADD CONSTRAINT fk_arriendo_usuario FOREIGN KEY (rut) REFERENCES usuario (rut)";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.execute();
            System.out.println("fk creada");
            ps.close();
        }catch(Exception e){
           System.out.println("Error al ingresar fk, o ya existia"); 
        }
    }
    public void fk_arriendo_videojuego(){
        try{
            String SQL = "ALTER TABLE arriendo ADD CONSTRAINT fk_arriendo_videojuego FOREIGN KEY (codigo) REFERENCES videojuego (codigo)";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.execute();
            System.out.println("fk creada");
            ps.close();
        }catch(Exception e){
           System.out.println("Error al ingresar fk, o ya existia"); 
        }
    }
//-------------------------------------INGRESAR-------------------------------------    FUNCIONA
    public boolean agregar_usuario_BD(Usuario usuario){
        try{
            String SQL = "INSERT INTO usuario (rut, nombre, direccion, correo, fecha_de_nacimiento, comuna, telefono) VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(SQL);

            ps.setString(1, usuario.getRut());
            ps.setString(2,usuario.getNombre());
            ps.setString(3,usuario.getDireccion());
            ps.setString(4,usuario.getCorreo());
            java.sql.Date sqlDate = new java.sql.Date(usuario.getFecha_de_nacimiento().getTime());
            ps.setDate(5, sqlDate);
            ps.setString(6,usuario.getComuna());
            ps.setString(7,usuario.getTelefono());

            ps.executeUpdate();

            ps.close();
            System.out.println("Usuario agregado a la base de datos");
            return true;
        }catch (Exception e) {
            System.out.println("Error al agregar usuario en la base de datos");
        }
        return false;
    }
    public boolean agregar_vendedor_BD(Vendedor vendedor){
        try {
            String SQL = "INSERT INTO vendedor (rut, nombre, direccion, correo, fono, clave) VALUES (?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(SQL);

            ps.setString(1, vendedor.getRut());
            ps.setString(2,vendedor.getNombre());
            ps.setString(3,vendedor.getDireccion());
            ps.setString(4,vendedor.getCorreo());
            ps.setString(5,vendedor.getFono());
            ps.setString(6,vendedor.getClave());

            ps.executeUpdate();

            ps.close();
            System.out.println("Vendedor agregado a la base de datos");
            return true;
        } catch (Exception e) {
            System.out.println("Error al agregar vendedor en la base de datos");
        }
        return false;
    }
    public boolean agregar_desarrollador_BD(Desarrollador desarrollador){
        try {
            String SQL = "INSERT INTO desarrollador (rut, nombre, direccion, correo, fono) VALUES (?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(SQL);

            ps.setString(1, desarrollador.getRut());
            ps.setString(2,desarrollador.getNombre());
            ps.setString(3,desarrollador.getDireccion());
            ps.setString(4,desarrollador.getCorreo());
            ps.setString(5,desarrollador.getFono());

            ps.executeUpdate();

            ps.close();
            System.out.println("desarrollador agregado a la base de datos");
            return true;
        } catch (Exception e) {
            System.out.println("Error al agregar desarrollador en la base de datos");
        }
        return false;
    }
    public boolean agregar_videojuego_BD(VideoJuego videojuego){
        try {
            String SQL = "INSERT INTO videojuego (codigo, nombre, version, fecha_de_desarrollo, categoria, genero, precio, rut, arrendado) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(SQL);

            ps.setString(1, videojuego.getCodigo());
            ps.setString(2,videojuego.getNombre());
            ps.setString(3,videojuego.getVersion());
            java.sql.Date sqlDate = new java.sql.Date(videojuego.getFecha_de_desarrollo().getTime());
            ps.setDate(4,sqlDate);
            ps.setString(5,videojuego.getCategoria());
            ps.setString(6,videojuego.getGenero());
            ps.setInt(7,videojuego.getPrecio());
            ps.setString(8,videojuego.getDesarrollador().getRut());
            ps.setBoolean(9, videojuego.isArrendado());

            ps.executeUpdate();

            ps.close();
            System.out.println("videojuego agregado a la base de datos");
            return true;
        } catch (Exception e) {
            System.out.println("Error al agregar videojuego en la base de datos");
        }
        return false;
    }
    public boolean agregar_arriendo_BD(Arriendo arriendo){
        try {
            String SQL = "INSERT INTO arriendo (codigo_arriendo, fecha_arriendo, fecha_entrega, codigo, rut) VALUES (?,?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(SQL);

            ps.setString(1, arriendo.getCodigo_arriendo());
            java.sql.Date sqlDate1 = new java.sql.Date(arriendo.getFecha_arriendo().getTime());
            ps.setDate(2,sqlDate1);
            java.sql.Date sqlDate2 = new java.sql.Date(arriendo.getFecha_entrega().getTime());
            ps.setDate(3,sqlDate2);
            ps.setString(4,arriendo.getVideoJuego().getCodigo());
            ps.setString(5,arriendo.getUsuario().getRut());


            ps.executeUpdate();

            ps.close();
            System.out.println("arriendo agregado a la base de datos");
            return true;
        } catch (Exception e) {
            System.out.println("Error al agregar arriendo en la base de datos");
        }
        return false;        
    }
//-------------------------------------OBTENER------------------------------------- FUNCIONA
    public List <Usuario> obtener_usuarios_BD(){//(String rut){
        try {
        String SQL = "SELECT * From usuario"; //WHERE rut = ?";
        PreparedStatement ps = connection.prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        
        String rut, nombre, direccion, correo, comuna, telefono;
        Date fecha_de_nacimiento = null;
        
        List <Usuario> lista = new ArrayList<>();
        while(rs.next()){

            rut = rs.getString("rut");
            nombre = rs.getString("nombre");
            direccion = rs.getString("direccion");
            correo = rs.getString("correo");
            
            fecha_de_nacimiento = rs.getDate("fecha_de_nacimiento");
            
            
            comuna = rs.getString("comuna");
            telefono = rs.getString("telefono");
         
            Usuario usuario = new Usuario(rut, nombre, direccion, correo, fecha_de_nacimiento, comuna, telefono);
            lista.add(usuario);
        }
        
        
        ps.close();
            System.out.println("Datos de los usuarios cargados correctamente");
            return lista;
        } catch (Exception e) {
            System.out.println("Error al cargar los datos de los usuarios");
        }
        return null;
    }    
    public List <Vendedor> obtener_vendedores_BD(){//(String rut){
        try {
        String SQL = "SELECT * From vendedor"; //WHERE rut = ?";
        PreparedStatement ps = connection.prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        
        String rut, nombre, direccion, correo, fono, clave;
        
        List <Vendedor> lista = new ArrayList<>();
        while(rs.next()){

            rut = rs.getString("rut");
            nombre = rs.getString("nombre");
            direccion = rs.getString("direccion");
            correo = rs.getString("correo");
            fono = rs.getString("fono");
            clave = rs.getString("clave");
         
            Vendedor vendedor = new Vendedor(rut, nombre, direccion, correo, fono, clave);
            lista.add(vendedor);
        }
     
        ps.close();
        System.out.println("Datos de los vendedores cargados correctamente");
        return lista;
        } catch (Exception e) {
            System.out.println("Error al cargar los datos de los vendedores");
        }
        return null;
    }   
    public List <Desarrollador> obtener_desarrolladores_BD(){//(String rut){
        try {
        String SQL = "SELECT * From desarrollador"; //WHERE rut = ?";
        PreparedStatement ps = connection.prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        
        String rut, nombre, direccion, correo, fono;
        
        List <Desarrollador> lista = new ArrayList<>();
        while(rs.next()){

            rut = rs.getString("rut");
            nombre = rs.getString("nombre");
            direccion = rs.getString("direccion");
            correo = rs.getString("correo");
                                    
            fono = rs.getString("fono");
         
            Desarrollador desarrollador = new Desarrollador(rut, nombre, direccion, correo, fono);
            lista.add(desarrollador);
        }
     
        ps.close();
        System.out.println("Datos de los desarrolladores cargados correctamente");
        return lista;
        } catch (Exception e) {
            System.out.println("Error al cargar los datos de los desarrolladores");
        }
        return null;
    }  
    public List <String[]> obtener_videojuegos_BD(){
        try {
        String SQL = "SELECT * From videojuego"; //WHERE rut = ?";
        PreparedStatement ps = connection.prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();
        String codigo, nombre, version, categoria, genero, rut, arrendado;
        Date fecha_de_desarrollo = null;
        int precio;
        
        List <String[]> matriz = new ArrayList<>();
        SimpleDateFormat a = new SimpleDateFormat("dd-MM-yy");
        while(rs.next()){
            String [] lista = new String [9];
            codigo = rs.getString("codigo");
            nombre = rs.getString("nombre");
            version = rs.getString("version");
            fecha_de_desarrollo = rs.getDate("fecha_de_desarrollo");
            categoria = rs.getString("categoria");
            genero = rs.getString("genero");
            precio = rs.getInt("precio");
            rut = rs.getString("rut");
            arrendado = rs.getBoolean("arrendado")+"";

            lista[0] = codigo;
            lista[1] = nombre;
            lista[2] = version;
            lista[3] = a.format(fecha_de_desarrollo);
            lista[4] = categoria;
            lista[5] = genero;
            lista[6] = precio+"";
            lista[7] = rut;
            lista[8] = arrendado;
            
            matriz.add(lista);
        }
     
        ps.close();
        System.out.println("Datos de los videojuegos cargados correctamente");
        return matriz;
        } catch (Exception e) {
            System.out.println("Error al cargar los datos de los videojuegos");
        }
        return null;
    }  
    public List <String[]> obtener_arriendos_BD(){
        try {
        String SQL = "SELECT * From arriendo"; //WHERE rut = ?";
        PreparedStatement ps = connection.prepareStatement(SQL);
        ResultSet rs = ps.executeQuery();


        Date fecha_arriendo = null;
        Date fecha_entrega = null;
        String codigo_arriendo, codigo, rut;
        
        
        List <String[]> matriz = new ArrayList<>();
        SimpleDateFormat a = new SimpleDateFormat("dd-MM-yy");
        while(rs.next()){
            String [] lista = new String [5];
            codigo_arriendo = rs.getString("codigo_arriendo");
            fecha_arriendo = rs.getDate("fecha_arriendo");
            fecha_entrega = rs.getDate("fecha_entrega");
            
            codigo = rs.getString("codigo");            
            rut = rs.getString("rut");

            lista[0] = codigo_arriendo;
            lista[1] = a.format(fecha_arriendo);
            lista[2] = a.format(fecha_entrega);
            lista[3] = codigo;
            lista[4] = rut;
            
            matriz.add(lista);
        }
     
        ps.close();
        System.out.println("Datos de los arriendos cargados correctamente");
        return matriz;
        } catch (Exception e) {
            System.out.println("Error al cargar los datos de los arriendos");
        }
        return null;
    }  
//-------------------------------------ACTUALIZAR-------------------------------------  FUNCIONA
    public boolean actualizar_usuario_BD(Usuario usuario){
        try{
            //nombre, direccion, correo, fecha_de_nacimiento, comuna, telefono
            String SQL = "UPDATE usuario SET nombre=?, direccion=?, fecha_de_nacimiento=?, comuna=?, telefono=? WHERE rut=?";
            PreparedStatement ps = connection.prepareStatement(SQL);

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getDireccion());
            java.sql.Date sqlDate = new java.sql.Date(usuario.getFecha_de_nacimiento().getTime());
            ps.setDate(3, sqlDate);
            ps.setString(4, usuario.getComuna());
            
            ps.setString(5, usuario.getTelefono());
            ps.setString(6, usuario.getRut());
            ps.executeUpdate();        
            ps.close();
            System.out.println("Usuario Actualizado en la base de datos.");
            return true;
        }catch(Exception e ){
            System.out.println("Error al actualizar el usuario en la base de datos\n"+e.getMessage());
        } 
        return false;
    } 
    public boolean actualizar_vendedor_BD(Vendedor vendedor){//cambiar la clave
        try{
            //nombre, direccion, correo, fecha_de_nacimiento, comuna, telefono
            String SQL = "UPDATE vendedor SET nombre=?, direccion=?, fono=?, clave=? WHERE rut=?";
            PreparedStatement ps = connection.prepareStatement(SQL);
            
            ps.setString(1, vendedor.getNombre());       
            ps.setString(2, vendedor.getDireccion());            
            ps.setString(3, vendedor.getFono());
            ps.setString(4, vendedor.getClave());
            
            ps.setString(5, vendedor.getRut());
            ps.executeUpdate();        
            ps.close();
            System.out.println("Vendedor Actualizado en la base de datos.");
            return true;
        }catch(Exception e ){
            System.out.println("Error al actualizar el vendedor en la base de dato");
        } 
        return false;
    }
    public boolean actualizar_desarrollador_BD(Desarrollador desarrollador){//cambiar la clave
        try{
            //nombre, direccion, correo, fecha_de_nacimiento, comuna, telefono
            String SQL = "UPDATE desarrollador SET nombre=?, direccion=?, fono=? WHERE rut=?";
            PreparedStatement ps = connection.prepareStatement(SQL);
            
            ps.setString(1, desarrollador.getNombre());       
            ps.setString(2, desarrollador.getDireccion());            
            ps.setString(3, desarrollador.getFono());
            
            ps.setString(4, desarrollador.getRut());
            ps.executeUpdate();        
            ps.close();
            System.out.println("Desarrollador Actualizado en la base de datos.");
            return true;
        }catch(Exception e ){
            System.out.println("Error al actualizar el vendedor en la base de datos");
        } 
        return false;
    }
    public boolean actualizar_videojuego_BD(VideoJuego videojuego){
        try{
            //nombre, version, fecha_de_desarrollo, categoria, genero, precio, arrendado
            String SQL = "UPDATE videojuego SET nombre = ?, version = ?, fecha_de_desarrollo = ?, categoria = ?, genero = ?, precio = ?, arrendado = ? WHERE codigo = ?";
            PreparedStatement ps = connection.prepareStatement(SQL);

            ps.setString(1, videojuego.getNombre());
            ps.setString(2, videojuego.getVersion());
            java.sql.Date sqlDate = new java.sql.Date(videojuego.getFecha_de_desarrollo().getTime());
            ps.setDate(3, sqlDate);
            ps.setString(4, videojuego.getCategoria());
            ps.setString(5, videojuego.getGenero());
            ps.setInt(6, videojuego.getPrecio());
            ps.setBoolean(7, videojuego.isArrendado());
            ps.setString(8, videojuego.getCodigo());
            ps.executeUpdate();        
            ps.close();
            System.out.println("Videojuego Actualizado en la base de datos.");
            return true;
        }catch(Exception e ){
            System.out.println("Error al actualizar el videojuego en la base de datos\n"+e.getMessage());
        } 
        return false;
    }  
    public boolean actualizar_arriendo_BD(Arriendo arriendo){//arreglar
        try{
            //nombre, version, fecha_de_desarrollo, categoria, genero, precio, arrendado
            String SQL = "UPDATE arriendo SET fecha_arriendo=?, fecha_entrega=? WHERE codigo_arriendo=?";

            PreparedStatement ps = connection.prepareStatement(SQL);

            java.sql.Date sqlDate1 = new java.sql.Date(arriendo.getFecha_arriendo().getTime());
            ps.setDate(1,sqlDate1);
            java.sql.Date sqlDate2 = new java.sql.Date(arriendo.getFecha_entrega().getTime());
            ps.setDate(2,sqlDate2);
            ps.setString(3, arriendo.getCodigo_arriendo());
            
            ps.executeUpdate();        
            ps.close();
            System.out.println("Videojuego Actualizado en la base de datos.");
            return true;
        }catch(Exception e ){
            System.out.println("Error al actualizar el videojuego en la base de datos\n"+e.getMessage());
        } 
        return false;
    } 
//-------------------------------------ELIMINAR-------------------------------------    FUNCIONA
    public boolean eliminar_usuario_BD(String rut){
        try{
            String SQL = "DELETE FROM usuario WHERE rut = ?";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setString(1, rut);
            
            ps.executeUpdate();        
            ps.close();
            System.out.println("usuario eliminado de la base de datos.");
            return true;
        }catch(Exception e ){
            System.out.println("Error al eliminar el usuario de la base de datos");
        } 
        return false;
    }
    public boolean eliminar_vendedor_BD(String rut){
        try{
            String SQL = "DELETE FROM vendedor WHERE rut = ?";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setString(1, rut);
            
            ps.executeUpdate();        
            ps.close();
            System.out.println("vendedor eliminado de la base de datos.");
            return true;
        }catch(Exception e ){
            System.out.println("Error al eliminar el vendedor de la base de datos");
        } 
        return false;
    }
    public boolean eliminar_desarrollador_BD(String rut){
        try{
            String SQL = "DELETE FROM desarrollador WHERE rut = ?";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setString(1, rut);
            
            ps.executeUpdate();        
            ps.close();
            System.out.println("desarrollador eliminado de la base de datos.");
            return true;
        }catch(Exception e ){
            System.out.println("Error al  eliminar el desarrollador de la base de datos");
        } 
        return false;
    }   
    public boolean eliminar_videojuego_BD(String codigo){
        try{
            String SQL = "DELETE FROM videojuego WHERE codigo = ?";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setString(1, codigo);
            
            ps.executeUpdate();        
            ps.close();
            System.out.println("videojuego eliminado de la base de datos.");
            return true;
        }catch(Exception e ){
            System.out.println("Error al eliminar el videojuego de la base de datos");
        } 
        return false;
    }
    public boolean eliminar_arriendo_BD(String codigo_arriendo){
        try{
            String SQL = "DELETE FROM arriendo WHERE codigo_arriendo = ?";
            PreparedStatement ps = connection.prepareStatement(SQL);
            ps.setString(1, codigo_arriendo);
            
            ps.executeUpdate();        
            ps.close();
            System.out.println("arriendo eliminado de la base de datos.");
            return true;
        }catch(Exception e ){
            System.out.println("Error al eliminar el arriendo de la base de datos");
        } 
        return false;
    }       
}