/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.barometro;

import java.io.File;
import java.util.List;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
/**
 *
 * @author Grupo 4
 */
public class VistaBarometro {
    private ProyectoBarometro control;
    
    public VistaBarometro() {
        this.control = new ProyectoBarometro();
    }
    
    private void show(String args[]) {
        HelpFormatter formatter = new HelpFormatter();
        
        Options opts = new Options();
        opts.addOption("P", "añadir presion");
        opts.addOption("F", "añadir fecha");
        opts.addOption("H", "añadir hora");

        CommandLineParser parser = new DefaultParser();
        
        try {
            CommandLine cmd = parser.parse(opts, args);  
            ProyectoBarometro.Options cOpt = control.new Options();

            if(cmd.hasOption("a")) {
                cOpt.withAll();
            }
            
            if(cmd.hasOption("B")) {
                cOpt.withoutBackups();
            }
            
            if(cmd.hasOption("l")) {
                longInfo = true;
            }
            
            List<String> directorios = cmd.getArgList();
            
            // Si no hay argumentos, toma el directorio actual
            switch(directorios.size()) {
                case 0: 
                    this.dir = ".";
                    control.listaDirectorio();
                    break;
                case 1:
                    this.dir = directorios.get(0);
                    cOpt.lista();
                    break;
                default:
                    for(String dir : directorios) {
                        this.dir = dir;
                        System.out.println(dir + ":");
                        cOpt.lista();
                        System.out.println();    
                    }
            }
           
        } catch (ParseException ex) {
            //Logger.getLogger(VistaCLI.class.getName()).log(Level.SEVERE, null, ex);
            formatter.printHelp( "ls", opts );
        }
    }    
    public static void main(String args[]) {
        VistaBarometro vista = new VistaBarometro();
        vista.show(args);
    }
}

