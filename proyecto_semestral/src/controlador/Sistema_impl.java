package controlador;
import bd.Conexion;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.Arriendo;
import modelo.Desarrollador;
import modelo.Fecha;
import modelo.Usuario;
import modelo.Vendedor;
import modelo.VideoJuego;

public class Sistema_impl {
    private List <Desarrollador> lDesarrollador; 
    private List <Usuario> lUsuario; 
    private List <Vendedor> lVendedor; 
    private List <VideoJuego> lVideojugo; 
    private List <Arriendo> lArriendo; 
    private Conexion bd = new Conexion();
    private boolean conectado;
    private boolean cargando_base_de_datos = true;

    public Sistema_impl(){
        lDesarrollador = new ArrayList<>();
        lUsuario = new ArrayList<>();
        lVendedor = new ArrayList<>();
        lVideojugo = new ArrayList<>();
        lArriendo = new ArrayList<>();
        conectado = bd.conectar();
    }
//-------------------------------------BASE_DE_DATOS-------------------------------------
    public void cargar_datos_BD(){
        //bd.borrar_tablas(); 
        
        bd.crear_tablas();
        this.lUsuario = bd.obtener_usuarios_BD();
        this.lVendedor = bd.obtener_vendedores_BD();
        this.lDesarrollador = bd.obtener_desarrolladores_BD();
        List <String[]> listaVi = bd.obtener_videojuegos_BD();
        for(int i=0;i<listaVi.size();i++){
            String [] lVi = listaVi.get(i);
            ingresarVideojuego(lVi[0], lVi[1], lVi[2], lVi[3], lVi[4], lVi[5], lVi[6], lVi[7]);
        }
        List <String[]> listaA = bd.obtener_arriendos_BD();
        for(int i=0;i<listaA.size();i++){
            String [] lA = listaA.get(i);
            ingresarArriendo(lA[0], lA[1], lA[2], lA[3], lA[4]);            
        }
        cargando_base_de_datos = false;
        
    }
    public boolean isConected(){
        return conectado;
    }
//-------------------------------------EXTRAS-------------------------------------
    public boolean rut_unico(String rut){
        for(Desarrollador d : lDesarrollador){
            if(d.getRut().equalsIgnoreCase(rut)){
                return false;
            }
        }
        for(Vendedor v : lVendedor){
            if(v.getRut().equalsIgnoreCase(rut)){
                return false;
            }
        }
        for(Usuario u : lUsuario){
            if(u.getRut().equalsIgnoreCase(rut)){
                return false;
            }
        }
        return true;
    }
    public boolean correo_unico(String correo){
        for(Desarrollador d : lDesarrollador){
            if(d.getCorreo().equalsIgnoreCase(correo)){
                return false;
            }
        }
        for(Vendedor v : lVendedor){
            if(v.getCorreo().equalsIgnoreCase(correo)){
                return false;
            }
        }
        for(Usuario u : lUsuario){
            if(u.getCorreo().equalsIgnoreCase(correo)){
                return false;
            }
        }
        return true;
    }
    public boolean usuario_tiene_juego(String rut, String codigo){
        for(Arriendo a:lArriendo){
            String rutU = a.getUsuario().getRut();
            String codigoV = a.getVideoJuego().getCodigo();
            if(rut.equals(rutU) && codigo.equals(codigoV)){
                return true;
            }
        }
        return false;
    }
    public boolean login(String usuario,String contraseña){
        for(Vendedor v:lVendedor){
            if(v.getCorreo().equals(usuario)){
                if(v.getClave().equals(contraseña)){
                    return true;
                }else{
                    throw new NullPointerException("Contraseña incorrecta.");
                }
            }
        }
        return false;
    }    
    public String como_entrar_menu_vendedor(){
        Vendedor v = lVendedor.get(0);
        String mensaje = "Menu vendedor:\n---> usuario:  "+v.getCorreo()+"\n---> clave:  "+v.getClave();
        return mensaje;
    }
//-------------------------------------INGRESAR-------------------------------------
    public void ingresarDatosPrueba(){
        Fecha f = new Fecha();
        Date date = null;
        try{
            date = f.verificarFecha("12-12-10");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        Usuario u = new Usuario("0", "0", "0", "0", date, "0", "0");
        Vendedor v = new Vendedor("1", "1", "1", "1", "1","1");
        Vendedor v1 = new Vendedor("rut vendedor 1", "nombre vendedor 1", "direccion vendedor 1", "correo vendedor 1", "fono vendedor 1","clave 1");
        Vendedor v2 = new Vendedor("20.574.150-K", "Thomas Rene Quiroga Espinoza", "callao lacra 1", "th.alf.a@xd.com", "+56 9 1111 1111","8811");
        Desarrollador d = new Desarrollador("2", "2", "2", "2", "2");
        VideoJuego vi = new VideoJuego("#3", "3", "3", date, "3", "3", 0, d);
        
        VideoJuego vi1 = new VideoJuego("#00001", "3", "3", date, "3", "3", 0, d);
        Usuario u1 = new Usuario("00.000.000-0", "0", "0", "0", date, "0", "0");
        lUsuario.add(u);
        lVendedor.add(v);
        lVendedor.add(v1);
        lVendedor.add(v2);
        lDesarrollador.add(d);
        lVideojugo.add(vi);

        
        lVideojugo.add(vi1);
        lUsuario.add(u1);
    }      
    public boolean ingresarUsuario(String rut, String nombre, String direccion, String correo, String fecha_de_nacimiento, String comuna, String telefono){
    // rut y correo unico
        if(!rut_unico(rut)){
            throw new NullPointerException("El rut ya existe en el sistema.");
        }
        if(!correo_unico(correo)){
            throw new NullPointerException("El correo ya existe en el sistema.");
        }
    // verificar fecha
        Fecha f = new Fecha();
        Date date = null;
        try{
            date = f.verificarFecha(fecha_de_nacimiento);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
        
    // ingresar el usuario
        Usuario u = new Usuario(rut, nombre, direccion, correo, date, comuna, telefono);
        if(!cargando_base_de_datos && this.conectado){
            bd.agregar_usuario_BD(u);
        }
        return lUsuario.add(u);
    }
    public boolean ingresarVendedor(String rut, String nombre, String direccion, String correo, String fono, String clave){
    // rut y correo unico
        if(!rut_unico(rut)){
            throw new NullPointerException("El rut ya existe en el sistema.");
        }
        if(!correo_unico(correo)){
            throw new NullPointerException("El correo ya existe en el sistema.");
        }
    // ingresar el vendedor
        Vendedor v = new Vendedor(rut, nombre, direccion, correo, fono, clave);
        if(!cargando_base_de_datos && this.conectado){
            bd.agregar_vendedor_BD(v);
        }
        return lVendedor.add(v);
    }
    public boolean ingresarDesarrollador( String rut, String nombre, String direccion, String correo, String fono){
    // rut y correo unico
        if(!rut_unico(rut)){
            throw new NullPointerException("El rut ya existe en el sistema.");
        }
        if(!correo_unico(correo)){
            throw new NullPointerException("El correo ya existe en el sistema.");
        }
    // ingresar el desarrollador
        Desarrollador d = new Desarrollador(rut, nombre, direccion, correo, fono);
        if(!cargando_base_de_datos && this.conectado){
            bd.agregar_desarrollador_BD(d);
        }
        return lDesarrollador.add(d);
    }
    public boolean ingresarVideojuego(String codigo, String nombre, String version, String fechaD, String categoria, String genero, String valor, String rutDesarrollador){
        int precio;
        try{
            precio= Integer.parseInt(valor);
        }catch(Exception e){
            throw new NullPointerException("El precio del viedeoJuego debe ser un valor numerico.");
        }
    // precio negativo
        if(precio<0){
            throw new NullPointerException("El valor del videoJuego no puede ser negativo.");
        }

    // codigo unico
        int posicion = 0;
        for(VideoJuego v:lVideojugo){
            if(v.getCodigo().equals(codigo)){
                throw new NullPointerException("Este codigo ya existe en otro videojuego.");
            }
            posicion++;
        }
    // verificar que no exista un arriendo con ese codigo de videoJuego
    // verificar fecha
        Fecha f = new Fecha();
        Date date = null;
        try{
            date = f.verificarFecha(fechaD);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
    // verificar si existe el desarollador, si existe ingresar videojuego
        for(Desarrollador d:lDesarrollador){
            if(d.getRut().equalsIgnoreCase(rutDesarrollador)){
                VideoJuego v = new VideoJuego(codigo, nombre, version, date, categoria, genero, precio, d);
                if(!cargando_base_de_datos && this.conectado){
                    bd.agregar_videojuego_BD(v);
                }
                return lVideojugo.add(v);
            }
        }
        throw new NullPointerException("No existe el desarrollador con el rut "+rutDesarrollador);
    }
    public boolean ingresarArriendo(String codigo_arriendo, String fechaA, String fechaE, String codigoVideojuego, String rutUsuario){
        int posicionV = buscarVideoJuego(codigoVideojuego);
        if(posicionV == -1){
            throw new NullPointerException("No existe un juego con este codigo.");
        }
        
        int posicionU = buscarUsuario(rutUsuario);
        if(posicionU == -1){
            throw new NullPointerException("No usuario con este rut.");
        }
        Fecha f = new Fecha();
        Date fecha_arriendo = null;
        try{
            fecha_arriendo = f.verificarFecha(fechaA);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
        Date fecha_entrega = null;
        try{
            fecha_entrega = f.verificarFecha(fechaE);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
        VideoJuego videojuego = lVideojugo.get(posicionV);
        Usuario usuario = lUsuario.get(posicionU);
        
        boolean este_usuario_tiene_el_juego = usuario_tiene_juego(rutUsuario, codigoVideojuego);
        if(!este_usuario_tiene_el_juego){
            if(buscarArriendo(codigo_arriendo)==-1){
                Arriendo a = new Arriendo(codigo_arriendo,videojuego, usuario,fecha_arriendo,fecha_entrega);
                lArriendo.add(a);
                if(!cargando_base_de_datos && this.conectado){
                    bd.agregar_arriendo_BD(a);
                }
                return true;
            }
            else{
                throw new NullPointerException("Codigo de arriendo no disponible");
            }  
        }else{
            throw new NullPointerException("Este usuario ya tiene este videojuego");
        } 
    }
//-------------------------------------BUSCAR-------------------------------------
    public int buscarUsuario(String rut){
        for(int i=0;i<lUsuario.size();i++){
            Usuario u = lUsuario.get(i);
            if(u.getRut().equalsIgnoreCase(rut)){
                return i;
            }
        }
        return -1;
    }
    public int buscarVendedor(String rut){
        for(int i=0;i<lVendedor.size();i++){
            Vendedor u = lVendedor.get(i);
            if(u.getRut().equalsIgnoreCase(rut)){
                return i;
            }
        }
        return -1;
    }
    public int buscarDesarrollador(String rut){
        for(int i=0;i<lDesarrollador.size();i++){
            Desarrollador u = lDesarrollador.get(i);
            if(u.getRut().equalsIgnoreCase(rut)){
                return i;
            }
        }
        return -1;
    }
    public int buscarVideoJuego(String codigo){
        for(int i=0;i<lVideojugo.size();i++){
            VideoJuego v = lVideojugo.get(i);
            if(v.getCodigo().equals(codigo)){
                return i;
            }
        }
        return -1;
    }
    public int buscarArriendo(String codigo_arriendo){
        for(int i=0;i<lArriendo.size();i++){
            Arriendo a = lArriendo.get(i);
            if(codigo_arriendo.equalsIgnoreCase(a.getCodigo_arriendo())){
                return i;
            }
        }
        return -1;
    }    
//-------------------------------------ACTUALIZAR-------------------------------------
    public void actualizarUsuario(int posicionUsuario,String fechaN, String comuna, String telefono, String nombre, String direccion){
        Fecha f = new Fecha();
        Date date = null;
        try{
            date = f.verificarFecha(fechaN);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
        Usuario u = lUsuario.get(posicionUsuario);
        u.setFecha_de_nacimiento(date);
        u.setComuna(comuna);
        u.setTelefono(telefono);
        u.setNombre(nombre);
        u.setDireccion(direccion);
        if(this.conectado){
            bd.actualizar_usuario_BD(u);
        }
    }
    public void actualizarVendedor(int posicionUsuario, String fono, String nombre, String direccion, String clave){
        Vendedor v = lVendedor.get(posicionUsuario);
        v.setFono(fono);
        v.setNombre(nombre);
        v.setDireccion(direccion);
        v.setClave(clave);
        if(this.conectado){
            bd.actualizar_vendedor_BD(v);
        }        
    }
    public void actualizarDesarrollador(int posicionUsuario, String fono, String nombre, String direccion){
        Desarrollador d = lDesarrollador.get(posicionUsuario);
        d.setFono(fono);
        d.setNombre(nombre);
        d.setDireccion(direccion);
        if(this.conectado){
            bd.actualizar_desarrollador_BD(d);
        } 
    }
    public void actualizarVideoJuego(int posicionVideoJuego, String nombre, String version, String fechaD, String categoria, String genero, String valor){
        
        int precio;
        try{
            precio= Integer.parseInt(valor);
        }catch(Exception e){
            throw new NullPointerException("El precio del viedeoJuego debe ser un valor numerico.");
        }
        if(precio<0){
            throw new NullPointerException("El valor del videoJuego no puede ser negativo.");
        }
        Fecha f = new Fecha();
        Date date = null;
        try{
            date = f.verificarFecha(fechaD);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
        VideoJuego v = lVideojugo.get(posicionVideoJuego);
        v.setNombre(nombre);
        v.setVersion(version);
        v.setFecha_de_desarrollo(date);
        v.setCategoria(categoria);
        v.setGenero(genero);
        v.setPrecio(precio);
        if(this.conectado){
            bd.actualizar_videojuego_BD(v);
        } 
    }
    public void actualizarArriendo(int posicion_arriendo, String fechaA, String  fechaE){
        Arriendo a = lArriendo.get(posicion_arriendo);

        Fecha f = new Fecha();
        Date fecha_arriendo = null;
        try{
            fecha_arriendo = f.verificarFecha(fechaA);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
        a.setFecha_arriendo(fecha_arriendo);
        
        Date fecha_entrega = null;
        try{
            fecha_entrega = f.verificarFecha(fechaE);
        }catch(Exception e){
            throw new NullPointerException(e.getMessage());
        }
        a.setFecha_entrega(fecha_entrega);
        if(this.conectado){
            bd.actualizar_arriendo_BD(a);
        } 
                  
    }
//-------------------------------------OBTENER-TODOS-------------------------------------    
    public List<String []> obtenerDatosTodos(){
        List<String[]> matriz = new ArrayList<>();
        for(int i=0;i<lUsuario.size();i++){
            Usuario p = lUsuario.get(i);         
    
            String [] datos = new String[2];
            datos[0] = "Usuario";
            datos[1] = p.getRut();
            matriz.add(datos); 
        }
        for(int i=0;i<lVendedor.size();i++){
            Vendedor p = lVendedor.get(i);         
    
            String [] datos = new String[2];
            datos[0] = "Vendedor";
            datos[1] = p.getRut();
            matriz.add(datos); 
        }
        for(int i=0;i<lDesarrollador.size();i++){
            Desarrollador p = lDesarrollador.get(i);         
    
            String [] datos = new String[2];
            datos[0] = "Desarrollador";
            datos[1] = p.getRut();
            matriz.add(datos); 
        }
        for(int i=0;i<lVideojugo.size();i++){
            VideoJuego p = lVideojugo.get(i);         
    
            String [] datos = new String[2];
            datos[0] = "Videojuego";
            datos[1] = p.getCodigo();
            matriz.add(datos); 
        }
        return matriz;
    }
    public List<String[]> obtenerUsuarios(){
        List<String[]> matriz = new ArrayList<>();
        for(int i=0;i<lUsuario.size();i++){
            Usuario p = lUsuario.get(i);             
            String [] datos = new String[4];
            
            datos[0] = p.getRut();
            datos[1] = p.getNombre();
            datos[2] = p.getDireccion();
            datos[3] = p.getCorreo();
            
            matriz.add(datos); 
        }
        return matriz;
    }
    public List<String []> obtenerVendedores(){
        List<String[]> matriz = new ArrayList<>();
        for(int i=0;i<lVendedor.size();i++){
            Vendedor p = lVendedor.get(i);             
            String [] datos = new String[4];
            
            datos[0] = p.getRut();
            datos[1] = p.getNombre();
            datos[2] = p.getDireccion();
            datos[3] = p.getCorreo();
            matriz.add(datos); 
        }
        return matriz;
    }
    public List<String []> obtenerDesarrolladores(){
        List<String[]> matriz = new ArrayList<>();
        for(int i=0;i<lDesarrollador.size();i++){
            Desarrollador p = lDesarrollador.get(i);             
            String [] datos = new String[4];
            
            datos[0] = p.getRut();
            datos[1] = p.getNombre();
            datos[2] = p.getDireccion();
            datos[3] = p.getCorreo();
            matriz.add(datos); 
        }
        return matriz;
    }
    public List<String []> obtenerVideojuegos(){
        List<String[]> matriz = new ArrayList<>();
        SimpleDateFormat form = new SimpleDateFormat("dd-MM-yy");
        for(int i=0;i<lVideojugo.size();i++){
            VideoJuego v = lVideojugo.get(i);             
            String [] datos = new String[4];
            
            datos[0] = v.getCodigo();
            datos[1] = v.getNombre();
            datos[2] = v.getPrecio()+"";
            datos[3] = v.getDesarrollador().getRut();
            matriz.add(datos); 
        }
        return matriz;
    }
    public List<String []> obtenerArriendos(){
        List<String[]> matriz = new ArrayList<>();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yy");
        for(int i=0;i<lArriendo.size();i++){
            Arriendo a = lArriendo.get(i);         
            String [] datos = new String[5];
            datos[0] = a.getCodigo_arriendo();
            datos[1] = a.getUsuario().getRut();
            datos[2] = a.getVideoJuego().getCodigo();
            datos[3] = formato.format(a.getFecha_arriendo());
            datos[4] = formato.format(a.getFecha_entrega());
            matriz.add(datos); 
        }
        return matriz;
    }
//-------------------------------------OBTENER-UNO-------------------------------------  
    public String [] obtenerDatosUsuario(int posicionUsuario){
        Usuario u = lUsuario.get(posicionUsuario);
        String [] datos = new String[7];
        datos[0] = u.getRut();
        datos[1] = u.getNombre();
        datos[2] = u.getCorreo();
        datos[3] = u.getDireccion();
        datos[4] = u.getComuna();
        datos[5] = u.getTelefono();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yy");
        datos[6] = formato.format(u.getFecha_de_nacimiento());
        return datos;
    }
    public String [] obtenerDatosVendedor(int posicionVendedor){
        Vendedor v = lVendedor.get(posicionVendedor);
        String [] datos = new String[6];
        datos[0] = v.getRut();
        datos[1] = v.getNombre();
        datos[2] = v.getCorreo();
        datos[3] = v.getDireccion();
        datos[4] = v.getClave();
        datos[5] = v.getFono();
        return datos;
    }
    public String [] obtenerDatosDesarrollador(int posicionDesarrollador){
        Desarrollador d = lDesarrollador.get(posicionDesarrollador);
        String [] datos = new String[5];
        datos[0] = d.getRut();
        datos[1] = d.getNombre();
        datos[2] = d.getCorreo();
        datos[3] = d.getDireccion();
        datos[4] = d.getFono();   
        return datos;
    }
    public String [] obtenerDatosVideoJuego(int posicionVideoJuego){
        VideoJuego v = lVideojugo.get(posicionVideoJuego);
        String [] datos = new String[8];
        datos[0] = v.getCodigo();
        datos[1] = v.getNombre();
        datos[2] = v.getVersion();
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yy");
        datos[3] = formato.format(v.getFecha_de_desarrollo());
        datos[4] = v.getCategoria();
        datos[5] = v.getGenero();
        datos[6] = v.getPrecio()+"";
        datos[7] = v.getDesarrollador().getRut();
        return datos;
    }
    public String [] obtener_arriendo(int posicionArriendo){
        String [] datos = new String[5];
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yy");
        Arriendo a = lArriendo.get(posicionArriendo);
        datos[0] = a.getCodigo_arriendo();
        datos[1] = a.getUsuario().getRut();
        datos[2] = a.getVideoJuego().getCodigo();
        datos[3] = formato.format(a.getFecha_arriendo());
        datos[4] = formato.format(a.getFecha_entrega());
            
        return datos;
    }
//-------------------------------------ELIMINAR-------------------------------------
    public void eliminar_usuario(String rut){
        int posicion = buscarUsuario(rut);
        if(posicion != -1){
            boolean tiene_arriendo = false;
            for(Arriendo a:lArriendo){
                if(a.getUsuario().getRut().equals(rut)){
                    tiene_arriendo = true;
                    break;
                }
            }
            if(!tiene_arriendo){
                if(this.conectado){
                    bd.eliminar_usuario_BD(rut);
                }
                lUsuario.remove(posicion);
            }else{
                throw new NullPointerException("No se puede eliminar este usuario\nhasta que se elimine su arriendo.");
            }
        }
    }
    public void eliminar_vendedor(String rut){
        int posicion = buscarVendedor(rut);
        if(posicion != -1){
            if(this.conectado){
                bd.eliminar_vendedor_BD(rut);
            }
            lVendedor.remove(posicion);
        }
    }
    public void eliminar_desarrollador(String rut){
        int posicion = buscarDesarrollador(rut);
        if(posicion != -1){
            boolean tiene_videojuego = false;
            for(VideoJuego v:lVideojugo){
                if(v.getDesarrollador().getRut().equals(rut)){
                    tiene_videojuego = true;
                    break;
                }
            }
            if(!tiene_videojuego){
                if(this.conectado){
                    bd.eliminar_desarrollador_BD(rut);
                }
                lDesarrollador.remove(posicion);
            }else{
                throw new NullPointerException("No se puede eliminar este desarrollador\nhasta que se elimine su videojuego.");
            }
        }
    }
    public void eliminar_videojuego(String codigo){
        for(Arriendo a:lArriendo){
           if(a.getVideoJuego().getCodigo().equals(codigo)){
               throw new NullPointerException("No se puede eliminar este videojuego\nhasta que se elimine su arriendo.");
           } 
        }
        int posicion = buscarVideoJuego(codigo);
        if(posicion != -1){
            
            if(this.conectado){
                bd.eliminar_videojuego_BD(codigo);
            }
            lVideojugo.remove(posicion);
            
        }
    }
    public void eliminar_arriendo(String codigo_arriendo){
        int posicion = buscarArriendo(codigo_arriendo);
        if(posicion != -1){
            if(this.conectado){
                bd.eliminar_arriendo_BD(codigo_arriendo);
            }
            lArriendo.remove(posicion);
        }
    }
}