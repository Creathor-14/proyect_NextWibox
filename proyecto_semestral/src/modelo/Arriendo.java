/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author thoma
 */
public class Arriendo {
    private String codigo_arriendo;
    private Date fecha_arriendo;
    private Date fecha_entrega;
    
    private VideoJuego videoJuego;
    private Usuario usuario;

    public Arriendo(String codigo_arriendo, VideoJuego videoJuego, Usuario usuario, Date fecha_arriendo, Date fecha_entrega) {
        this.codigo_arriendo = codigo_arriendo;
        this.videoJuego = videoJuego;
        this.usuario = usuario;
        this.fecha_arriendo = fecha_arriendo;
        this.fecha_entrega = fecha_entrega;
    }

    public Arriendo() {
        this.codigo_arriendo = "";
        this.videoJuego = null;
        this.usuario = null;
        this.fecha_arriendo = null;
        this.fecha_entrega = null;
    }

    public String getCodigo_arriendo() {
        return codigo_arriendo;
    }

    public void setCodigo_arriendo(String codigo_arriendo) {
        this.codigo_arriendo = codigo_arriendo;
    }

    public VideoJuego getVideoJuego() {
        return videoJuego;
    }

    public void setVideoJuego(VideoJuego videoJuego) {
        this.videoJuego = videoJuego;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Date getFecha_arriendo() {
        return fecha_arriendo;
    }

    public void setFecha_arriendo(Date fecha_arriendo) {
        this.fecha_arriendo = fecha_arriendo;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    @Override
    public String toString() {
        SimpleDateFormat a = new SimpleDateFormat("dd-MM-yy");
        return "Arriendo{" + "codigo_arriendo=" + codigo_arriendo + ", fecha_arriendo=" + a.format(fecha_arriendo) + ", fecha_entrega=" + a.format(fecha_entrega) + ", videoJuego=" + videoJuego + ", usuario=" + usuario + '}';
    }


    
}
