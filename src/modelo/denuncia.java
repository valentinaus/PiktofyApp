/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Vale
 */
public class denuncia {

    private int idDenuncia;
    private String descripcionR;
    private int idPosdf;
    private String correoUD;

    public denuncia() {
    }

    public denuncia(int idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public denuncia(int idDenuncia, String descripcionR) {
        this.idDenuncia = idDenuncia;
        this.descripcionR = descripcionR;
    }

    public denuncia(int idDenuncia, String descripcionR, int idPosdf, String correoUD) {
        this.idDenuncia = idDenuncia;
        this.descripcionR = descripcionR;
        this.idPosdf = idPosdf;
        this.correoUD = correoUD;
    }

    public denuncia(String descripcionR, int idPosdf, String correoUD) {
        this.descripcionR = descripcionR;
        this.idPosdf = idPosdf;
        this.correoUD = correoUD;
    }

    /**
     * Get the value of idDenuncia
     *
     * @return the value of idDenuncia
     */
    public int getIdDenuncia() {
        return idDenuncia;
    }

    /**
     * Set the value of idDenuncia
     *
     * @param idDenuncia new value of idDenuncia
     */
    public void setIdDenuncia(int idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    /**
     * Get the value of correoUD
     *
     * @return the value of correoUD
     */
    public String getCorreoUD() {
        return correoUD;
    }

    /**
     * Set the value of correoUD
     *
     * @param correoUD new value of correoUD
     */
    public void setCorreoUD(String correoUD) {
        this.correoUD = correoUD;
    }

    /**
     * Get the value of idPosdf
     *
     * @return the value of idPosdf
     */
    public int getIdPosdf() {
        return idPosdf;
    }

    /**
     * Set the value of idPosdf
     *
     * @param idPosdf new value of idPosdf
     */
    public void setIdPosdf(int idPosdf) {
        this.idPosdf = idPosdf;
    }

    /**
     * Get the value of descripcionR
     *
     * @return the value of descripcionR
     */
    public String getDescripcionR() {
        return descripcionR;
    }

    /**
     * Set the value of descripcionR
     *
     * @param descripcionR new value of descripcionR
     */
    public void setDescripcionR(String descripcionR) {
        this.descripcionR = descripcionR;
    }

    @Override
    public String toString() {
        return "denuncia{" + "idReporte=" + idDenuncia + ", descripcionR=" + descripcionR + ", idPosdf=" + idPosdf + ", correoUD=" + correoUD + '}';
    }

    public boolean insertarDenunciaSql(String sql) {
        boolean t = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t = false;
            }
        }
        return t;
    }

    public LinkedList<denuncia> buscarDenunciaSql(String sql) {
        ResultSet rs = null;
        LinkedList<denuncia> ld = new LinkedList<>();
        BaseDatos objCon = new BaseDatos();
        int idDenuncia;
        String descripcionR;
        int idPosdf;
        String correoUD;

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idDenuncia = rs.getInt("idDenuncia");
                    descripcionR = rs.getString("descripcionR");
                    idPosdf = rs.getInt("idPosdf");
                    correoUD = rs.getString("correoUD");

                    ld.add(new denuncia(idDenuncia, descripcionR, idPosdf, correoUD));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return ld;
    }

    public void modificarDenuncia(String sql) {

        boolean t = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t = false;
            }
        }
    }

    public void BorrarDenuncia(String sql) {

        boolean t = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t = false;
            }
        }
    }
    
     public boolean consultaDarDenuncia(String sql) {
        ResultSet rs = null;
        LinkedList<denuncia> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();

        boolean DarDenuncia = false;

        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {

                    DarDenuncia = rs.getBoolean(1);
                 
                }

            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }

        return DarDenuncia;

    }

}
