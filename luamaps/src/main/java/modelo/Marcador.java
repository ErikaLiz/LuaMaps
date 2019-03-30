package modelo;
// Generated 30/03/2019 01:45:04 PM by Hibernate Tools 4.3.1



/**
 * Marcador generated by hbm2java
 */
public class Marcador  implements java.io.Serializable {


     private int idmarcador;
     private String descripcion;
     private double latitud;
     private double longitud;
     private String datos;
     private int tema;

    public Marcador() {
    }

    public Marcador(int idmarcador, String descripcion, double latitud, double longitud, String datos, int tema) {
       this.idmarcador = idmarcador;
       this.descripcion = descripcion;
       this.latitud = latitud;
       this.longitud = longitud;
       this.datos = datos;
       this.tema = tema;
    }
   
    public int getIdmarcador() {
        return this.idmarcador;
    }
    
    public void setIdmarcador(int idmarcador) {
        this.idmarcador = idmarcador;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public double getLatitud() {
        return this.latitud;
    }
    
    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }
    public double getLongitud() {
        return this.longitud;
    }
    
    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    public String getDatos() {
        return this.datos;
    }
    
    public void setDatos(String datos) {
        this.datos = datos;
    }
    public int getTema() {
        return this.tema;
    }
    
    public void setTema(int tema) {
        this.tema = tema;
    }




}


