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
public class like {

    private int idLike;
    private int idpostf;
    private String correoUL;

    public like() {
    }

    public like(int idLike, int idpostf, String correoUL) {
        this.idLike = idLike;
        this.idpostf = idpostf;
        this.correoUL = correoUL;
    }

    public like(int idpostf, String correoUL) {
        this.idpostf = idpostf;
        this.correoUL = correoUL;
    }

    /**
     * Get the value of correoUL
     *
     * @return the value of correoUL
     */
    public String getCorreoUL() {
        return correoUL;
    }

    /**
     * Set the value of correoUL
     *
     * @param correoUL new value of correoUL
     */
    public void setCorreoUL(String correoUL) {
        this.correoUL = correoUL;
    }

    /**
     * Get the value of idpostf
     *
     * @return the value of idpostf
     */
    public int getIdpostf() {
        return idpostf;
    }

    /**
     * Set the value of idpostf
     *
     * @param idpostf new value of idpostf
     */
    public void setIdpostf(int idpostf) {
        this.idpostf = idpostf;
    }

    /**
     * Get the value of idLike
     *
     * @return the value of idLike
     */
    public int getIdLike() {
        return idLike;
    }

    /**
     * Set the value of idLike
     *
     * @param idLike new value of idLike
     */
    public void setIdLike(int idLike) {
        this.idLike = idLike;
    }

    @Override
    public String toString() {
        return "like{" + "idLike=" + idLike + ", idpostf=" + idpostf + ", correoUL=" + correoUL + '}';
    }

    public boolean insertarLikeSql(String sql) {
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

    public LinkedList<like> consultarLikeSql(String sql) {
        ResultSet rs = null;
        LinkedList<like> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();

        int idlike;
        int idPost;
        String correoUF;

        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idlike = rs.getInt("idLike");
                    idPost = rs.getInt("idpostf");
                    correoUF = rs.getString("correoUL");

                    lc.add(new like(idlike, idPost, correoUF));

                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
    }

    public int consultarLikeCantidadSql(String sql) {
        ResultSet rs = null;
        LinkedList<like> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();

        int count = 0;

        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    count = rs.getInt(1);
                  
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return count;
    }

    public boolean consultaDarkLike(String sql) {
        ResultSet rs = null;
        LinkedList<like> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();

        boolean DarLike = false;

        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {

                    DarLike = rs.getBoolean(1);
                 
                }

            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }

        return DarLike;

    }

    public boolean borrarLikeSql(String sql) {

        boolean t = false;
        BaseDatos objCon = new BaseDatos();

        try {
            if (objCon.crearConexion()) {
               
                objCon.getSt().executeUpdate(sql);
            }

            return t;
        } catch (Exception ex) {

            ex.printStackTrace();
            t = false;

        }

        return t;
    }

}
