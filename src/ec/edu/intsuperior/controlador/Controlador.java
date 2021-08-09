/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.controlador;

import ec.edu.intsuperior.modelo.Cuenta;
import javax.swing.JOptionPane;


/**
 *
 * @author 59399
 */
public class Controlador {
     Cuenta cuenta;
     public void menu(){
         int op=0;
         do {                 
            op=Integer.parseInt(JOptionPane.showInputDialog(opciones()));
            
             } while (op!=5);
    
 }
    
   public String opciones() {
       return "Seleccione una opccion \n "
               +"1.- Crear cuenta \n"
               +"2.- Editar cuenta \n"
               +"3.- Eliminar cuenta \n"
               +"4.- Salir ";
        
       
   }
    
}       
        
    

