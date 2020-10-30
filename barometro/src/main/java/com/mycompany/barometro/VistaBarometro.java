/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.barometro;
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
 * @author Josem
 */
public class VistaBarometro {
    private static ControladorBarometro control;
    public VistaBarometro(){
        this.control = new ControladorBarometro(this);
    }
   
    public static void main(String args[]) {
        HelpFormatter formatter = new HelpFormatter();
        
        Options opts = new Options();
        opts.addOption("p", "use a long listing format");
        opts.addOption("f", "all", false, 
                " do not ignore entries starting with .");
        opts.addOption("h", "ignore-backups", false,
                "do not list implied entries ending with ~");

        CommandLineParser parser = new DefaultParser();
        
        try {
            CommandLine cmd = parser.parse(opts, args);  
            ControladorBarometro.Options cOpt = control.new Options();

            if(cmd.hasOption("p")) {
                cOpt.withAll();
            }
            
            if(cmd.hasOption("f")) {
                cOpt.withoutBackups();
            }
            
            if(cmd.hasOption("h")) {
                
            }
            
            ControladorBarometro.getTiempo();
           
        } catch (ParseException ex) {
            formatter.printHelp( "ls", opts );
        }
    }
}

