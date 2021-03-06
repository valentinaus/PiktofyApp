/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import control.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author danie
 */
public class favorito {

    private int idFav;
    private int idPostF;
    private String idCorreoF;

    public favorito() {
    }

    public favorito(int idFav, int idPostF, String idCorreoF) {
        this.idFav = idFav;
        this.idPostF = idPostF;
        this.idCorreoF = idCorreoF;
    }

    public favorito(int idPostF, String idCorreoF) {
        this.idPostF = idPostF;
        this.idCorreoF = idCorreoF;
    }
    
    

    public int getIdFav() {
        return idFav;
    }

    public int getIdPostF() {
        return idPostF;
    }

    public String getIdCorreoF() {
        return idCorreoF;
    }

    public void setIdFav(int idFav) {
        this.idFav = idFav;
    }

    public void setIdPostF(int idPostF) {
        this.idPostF = idPostF;
    }

    public void setIdCorreoF(String idCorreoF) {
        this.idCorreoF = idCorreoF;
    }

    @Override
    public String toString() {
        return "favorito{" + "idFav=" + idFav + ", idPostF=" + idPostF + ", idCorreoF=" + idCorreoF + '}';
    }


        public boolean insertarFavSql(String sql) {
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

    public LinkedList<favorito> consultarFavSQL(String sql) {
        ResultSet rs = null;
        LinkedList<favorito> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();

        int idFav;
        int idPostF;
        String idUsuarioF;

        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idFav = rs.getInt("idFav");
                    idPostF = rs.getInt("idPostF");
                    idUsuarioF = rs.getString("idUsuarioF");

                    

                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
    }



    public boolean consultaDarFav(String sql) {
        ResultSet rs = null;
        LinkedList<favorito> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();

        boolean DarFav = false;

        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {

                    DarFav = rs.getBoolean(1);
                 
                }

            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }

        return DarFav;

    }

    public boolean borrarFavSql(String sql) {

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

    public int consultarFavoritosSql(String sql) {
       boolean t = false;
        BaseDatos objCon = new BaseDatos();
        //System.out.println("SQL--->"+sql);
         ResultSet rs = null;
        
        int tot=0;
        Connection conn=null;

        try {
            conn = (Connection) objCon.crearConexion2();
            if (conn != null){
                try {
                    Statement sentencia = conn.createStatement();
                  //  System.out.println("SQL--->"+sql);
                    rs = sentencia.executeQuery(sql);
                    //System.out.println("rs--->"+rs);
                    if (rs != null) {
                
                        rs.next();
                         tot = rs.getInt("total");
                     //   System.out.println("cuantos--->"+tot);
                        t=true;
                    }
                }
                catch (SQLException ex1){
                    ex1.printStackTrace();
                }
            }
        } catch (Exception ex) {

            ex.printStackTrace();
                

        }
   
        
        

        return tot;
        
    
    }

}
