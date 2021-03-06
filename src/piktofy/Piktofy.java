/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package piktofy;

import control.BaseDatos;

/**
 *
 * @author Vale
 */
public class Piktofy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         BaseDatos objb= new BaseDatos();
        boolean t=objb.crearConexion();
        
        if(t==true){
            System.out.println("conexión exitosa");
        }else {
            System.out.println("conexión No exitosa");
        }
    }
    
}
