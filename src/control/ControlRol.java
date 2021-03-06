/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.rol;

/**
 *
 * @author Vale
 */
public class ControlRol {
    
    public LinkedList<rol> consultarRol() {
        String sql="Select * from roles;";
        rol objc=new rol();
        LinkedList<rol> list=objc.buscarRol(sql);
        
        return list;
    }
    
}
