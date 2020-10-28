/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.barometro;

/**
 * @version 1.0
 * @author Grupo 4
 */
public class ProyectoBarometro {
    private ModeloBarometro modelo;
    private VistaBarometro vista;
    
    public ProyectoBarometro(VistaBarometro vista){
        this.vista = vista;
        this.modelo = new ModeloBarometro();
    }
    
    static float presion;
    public String fecha;
    public String hora;
    
    public static float getPresion(){
        return presion;
    }
    public static void setPresion(float presion){
        ProyectoBarometro.presion = presion;
    }
    public String getHora(){
        return hora;
    }
    public void setHora(String hora){
        this.hora = hora;
    }
    public String getFecha(){
        return fecha;
    }
    public void setFecha(String fecha){
        this.fecha = fecha;
    }
    public class Options {
        private boolean all = false;
        private boolean noBackup = false;
        
        public Options withAll() {
            all = true;
            return this;
        }
        
        public Options withoutBackups() {
            noBackup = true;
            return this;
        }
    }
}