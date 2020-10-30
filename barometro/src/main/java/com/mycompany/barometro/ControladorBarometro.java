/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.barometro;

/**
 *
 * @author Josem
 */
public class ControladorBarometro {

    
    private ModeloBarometro modelo;
    private VistaBarometro vista;
    
    public ControladorBarometro(VistaBarometro vista){
        this.vista = vista;
        this.modelo = new ModeloBarometro();
    }
    
    public static double presion;
    public static String fecha;
    public static String hora;
    public static boolean tiempo;
    
    static void getTiempo() {
        if(tiempo == true){
            System.out.println("Hace buen tiempo");
        }else{
            if(tiempo == false){
                System.out.println("Hace mal tiempo");
            }
        }
    }
    public boolean isTiempo(){
        return tiempo;
    }
    public double getPresion(){
        return presion;
    }
    public void setPresion(double presion){
        this.presion = presion;
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