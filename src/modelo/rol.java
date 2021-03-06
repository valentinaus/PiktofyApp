/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Vale
 */
public class rol {
    
    private int idRol;     
    private String nombreRol;

    public rol() {
    }

    public rol(int idRol, String nombreRol) {
        this.idRol = idRol;
        this.nombreRol = nombreRol;
    }

    public rol(String nombreRol) {
        this.nombreRol = nombreRol;
    }


    /**
     * Get the value of nombreRol
     *
     * @return the value of nombreRol
     */
    public String getNombreRol() {
        return nombreRol;
    }

    /**
     * Set the value of nombreRol
     *
     * @param nombreRol new value of nombreRol
     */
    public void setNombreRol(String nombreRol) {
        this.nombreRol = nombreRol;
    }


    /**
     * Get the value of idRol
     *
     * @return the value of idRol
     */
    public int getIdRol() {
        return idRol;
    }

    /**
     * Set the value of idRol
     *
     * @param idRol new value of idRol
     */
    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    @Override
    public String toString() {
        return "rol{" + "idRol=" + idRol + ", nombreRol=" + nombreRol + '}';
    }
    
    public LinkedList<rol> buscarRol(String sql){
        
        ResultSet r = null;
        LinkedList<rol> l = new LinkedList<>();
        BaseDatos objCon = new BaseDatos();
        int idr;
        String nombrer;
        
        if(objCon.crearConexion()){
            
            try{
                
                Statement sentencia = objCon.getConexion().createStatement();
                r = sentencia.executeQuery(sql);
                while (r.next()) {
                    idr = r.getInt("idRol");
                    nombrer = r.getString("nombreRol");
                                     
                    l.add(new rol(idr, nombrer));
                
            }
            
        }catch (SQLException ex) {
                ex.printStackTrace();

            }    
        
        } return l;
    }
        
}
