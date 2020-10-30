/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.barometro;
import java.io.File;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * @author Grupo 4
 */
public class ModeloBarometro {
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