/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.exceptions.MySQLIntegrityConstraintViolationException;
import control.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author Vale
 */
public class categoria {

    private int idCategoriast;
    private String tipoCategoria;

    public categoria() {
    }

    public categoria(int idCategoriast) {
        this.idCategoriast = idCategoriast;
    }

    public categoria(int idCategoriast, String tipoCategoria) {
        this.idCategoriast = idCategoriast;
        this.tipoCategoria = tipoCategoria;
    }

    public categoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    /**
     * Get the value of tipoCategoria
     *
     * @return the value of tipoCategoria
     */
    public String getTipoCategoria() {
        return tipoCategoria;
    }

    /**
     * Set the value of tipoCategoria
     *
     * @param tipoCategoria new value of tipoCategoria
     */
    public void setTipoCategoria(String tipoCategoria) {
        this.tipoCategoria = tipoCategoria;
    }

    /**
     * Get the value of idCategoriast
     *
     * @return the value of idCategoriast
     */
    public int getIdCategoriast() {
        return idCategoriast;
    }

    /**
     * Set the value of idCategoriast
     *
     * @param idCategoriast new value of idCategoriast
     */
    public void setIdCategoriast(int idCategoriast) {
        this.idCategoriast = idCategoriast;
    }

    @Override
    public String toString() {
        return "categoria{" + "idCategoriast=" + idCategoriast + ", tipoCategoria=" + tipoCategoria + '}';
    }

    public static ResultSet llamarCategoriaSQL(String sql) {
        ResultSet es = null;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                es = sentencia.executeQuery(sql);

            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return es;
    }

    public boolean insertarCategoriaSql(String sql) {

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

    public LinkedList<categoria> buscarCategoriaSql(String sql) {
        ResultSet rs = null;
        LinkedList<categoria> lc = new LinkedList<>();
        BaseDatos objCon = new BaseDatos();
        int idc;
        String tipoc;

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idc = rs.getInt("idCategoriast");
                    tipoc = rs.getString("tipoCategoria");

                    lc.add(new categoria(idc, tipoc));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
    }

    public boolean borrarCategoriaSql(String sql) {

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

    public boolean modificarCategoriaSql(String sql) {

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

}
