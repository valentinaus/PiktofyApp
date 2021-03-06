/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Connection;
import control.BaseDatos;
import java.io.File;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.layout.RowConstraints;

/**
 *
 * @author Vale
 */
public class usuario {

    private String nombre1U;
    private String nombre2U;
    private String apellido1U;
    private String apellido2U;
    private String fotodePerfil;
    public String correoU;
    private String contraseñaU;
    private int estadoBloqueo;
    private int idRolf;
    private byte[] fotousuario;

    public usuario() {
    }

    public usuario(String correoU) {
        this.correoU = correoU;
    }

    public usuario(String correoU, int estadoBloqueo) {
        this.correoU = correoU;
        this.estadoBloqueo = estadoBloqueo;
    }
    
    

    public usuario(String nombre1U, String nombre2U, String apellido1U, String apellido2U, String fotodePerfil, String correoU, String contraseñaU) {
        this.nombre1U = nombre1U;
        this.nombre2U = nombre2U;
        this.apellido1U = apellido1U;
        this.apellido2U = apellido2U;
        this.fotodePerfil = fotodePerfil;
        this.correoU = correoU;
        this.contraseñaU = contraseñaU;
    }

    public usuario(String nombre1U, String nombre2U, String apellido1U, String apellido2U, String fotodePerfil, String correoU, String contraseñaU, int estadoBloqueo, int idRolf) {
        this.nombre1U = nombre1U;
        this.nombre2U = nombre2U;
        this.apellido1U = apellido1U;
        this.apellido2U = apellido2U;
        this.fotodePerfil = fotodePerfil;
        this.correoU = correoU;
        this.contraseñaU = contraseñaU;
        this.estadoBloqueo = estadoBloqueo;
        this.idRolf = idRolf;
    }

    public usuario(String nombre1U, String nombre2U, String apellido1U, String apellido2U,String correoU,String contraseñaU) {
        this.nombre1U = nombre1U;
        this.nombre2U = nombre2U;
        this.apellido1U = apellido1U;
        this.apellido2U = apellido2U;
        this.correoU= correoU;
        this.contraseñaU = contraseñaU;

    }

    public usuario(String nombre1U, String nombre2U, String apellido1U, String apellido2U, byte[] fotousuario, String correoU, String contraseñaU, int estadoBloqueo, int idRolf) {
        this.nombre1U = nombre1U;
        this.nombre2U = nombre2U;
        this.apellido1U = apellido1U;
        this.apellido2U = apellido2U;
        this.correoU = correoU;
        this.contraseñaU = contraseñaU;
        this.estadoBloqueo = estadoBloqueo;
        this.idRolf = idRolf;
        this.fotousuario = fotousuario;
    }

    public byte[] getFotousuario() {
        return fotousuario;
    }

    public void setFotousuario(byte[] fotousuario) {
        this.fotousuario = fotousuario;
    }

    /**
     * Get the value of idRolf
     *
     * @return the value of idRolf
     */
    public int getIdRolf() {
        return idRolf;
    }

    /**
     * Set the value of idRolf
     *
     * @param idRolf new value of idRolf
     */
    public void setIdRolf(int idRolf) {
        this.idRolf = idRolf;
    }

    /**
     * Get the value of estadoBloqueo
     *
     * @return the value of estadoBloqueo
     */
    public int getEstadoBloqueo() {
        return estadoBloqueo;
    }

    /**
     * Set the value of estadoBloqueo
     *
     * @param estadoBloqueo new value of estadoBloqueo
     */
    public void setEstadoBloqueo(int estadoBloqueo) {
        this.estadoBloqueo = estadoBloqueo;
    }

    /**
     * Get the value of contraseñaU
     *
     * @return the value of contraseñaU
     */
    public String getContraseñaU() {
        return contraseñaU;
    }

    /**
     * Set the value of contraseñaU
     *
     * @param contraseñaU new value of contraseñaU
     */
    public void setContraseñaU(String contraseñaU) {
        this.contraseñaU = contraseñaU;
    }

    /**
     * Get the value of correoU
     *
     * @return the value of correoU
     */
    public String getCorreoU() {
        return correoU;
    }

    /**
     * Set the value of correoU
     *
     * @param correoU new value of correoU
     */
    public void setCorreoU(String correoU) {
        this.correoU = correoU;
    }

    /**
     * Get the value of fotodePerfil
     *
     * @return the value of fotodePerfil
     */
    public String getFotodePerfil() {
        return fotodePerfil;
    }

    /**
     * Set the value of fotodePerfil
     *
     * @param fotodePerfil new value of fotodePerfil
     */
    public void setFotodePerfil(String fotodePerfil) {
        this.fotodePerfil = fotodePerfil;
    }

    /**
     * Get the value of apellido2U
     *
     * @return the value of apellido2U
     */
    public String getApellido2U() {
        return apellido2U;
    }

    /**
     * Set the value of apellido2U
     *
     * @param apellido2U new value of apellido2U
     */
    public void setApellido2U(String apellido2U) {
        this.apellido2U = apellido2U;
    }

    /**
     * Get the value of apellido1U
     *
     * @return the value of apellido1U
     */
    public String getApellido1U() {
        return apellido1U;
    }

    /**
     * Set the value of apellido1U
     *
     * @param apellido1U new value of apellido1U
     */
    public void setApellido1U(String apellido1U) {
        this.apellido1U = apellido1U;
    }

    /**
     * Get the value of nombre2U
     *
     * @return the value of nombre2U
     */
    public String getNombre2U() {
        return nombre2U;
    }

    /**
     * Set the value of nombre2U
     *
     * @param nombre2U new value of nombre2U
     */
    public void setNombre2U(String nombre2U) {
        this.nombre2U = nombre2U;
    }

    /**
     * Get the value of nombre1U
     *
     * @return the value of nombre1U
     */
    public String getNombre1U() {
        return nombre1U;
    }

    /**
     * Set the value of nombre1U
     *
     * @param nombre1U new value of nombre1U
     */
    public void setNombre1U(String nombre1U) {
        this.nombre1U = nombre1U;
    }

    @Override
    public String toString() {
        return "usuario{" + "nombre1U=" + nombre1U + ", nombre2U=" + nombre2U + ", apellido1U=" + apellido1U + ", apellido2U=" + apellido2U + ", fotodePerfil=" + fotodePerfil + ", correoU=" + correoU + ", contrase\u00f1aU=" + contraseñaU + ", estadoBloqueo=" + estadoBloqueo + ", idRolf=" + idRolf + '}';
    }

    public boolean insertarUsuarioSql(String sql) {

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

    public LinkedList<usuario> buscarUsuarios(String sql) {
        ResultSet rs = null;

        LinkedList<usuario> lu = new LinkedList<>();
        BaseDatos objuone = new BaseDatos();

        String nombre1u;
        String nombre2u = "";
        String apellido1u;
        String apellido2u = "";
        String fotoperfil;
        String correou;
        String contraseña;
        int estado;
        int idRol;
        byte[] fotousuario;

        if (objuone.crearConexion()) {

            try {
                Statement sentencia = objuone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {

                    nombre1u = rs.getString("nombre1U");
                    try {
                        nombre2u = rs.getString("nombre2U");
                    } catch (NullPointerException n) {
                    }
                    if (nombre2u == null) {
                        nombre2u = "";
                    }

                    apellido1u = rs.getString("apellido1U");
                    try {
                        apellido2u = rs.getString("apellido2U");
                    } catch (NullPointerException n) {
                    }
                    if (apellido2u == null) {
                        apellido2u = "";
                    }
                    // fotoperfil= rs.getString("fotodePerfil");
                    correou = rs.getString("correoU");
                    contraseña = rs.getString("contraseñaU");
                    estado = rs.getInt("estadoBloqueo");
                    idRol = rs.getInt("idRolf");
                    java.sql.Blob blobI = rs.getBlob("fotodePerfil");
                    fotousuario = blobI.getBytes(1, (int) blobI.length());

                    lu.add(new usuario(nombre1u, nombre2u, apellido1u, apellido2u, fotousuario, correou, contraseña, estado, idRol));

                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }

        }
        return lu;
    }

    public boolean borrarUsuarioSql(String sql) {
       
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

    public boolean insertarUsuarioSql(usuario nuevousu, String sql) {
        boolean t = false;
        BaseDatos objCon = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objCon.crearConexion()) {

                objCon.getConexion().setAutoCommit(false);
                File file = new File(nuevousu.getFotodePerfil());
                fis = new FileInputStream(file);
                ps = objCon.getConexion().prepareStatement(sql);

                ps.setString(1, nuevousu.getNombre1U());
                ps.setString(2, nuevousu.getNombre2U());
                ps.setString(3, nuevousu.getApellido1U());
                ps.setString(4, nuevousu.getApellido2U());
                ps.setBinaryStream(5, fis, (int) file.length());
                ps.setString(6, nuevousu.getCorreoU());
                ps.setString(7, nuevousu.getContraseñaU());
                ps.setInt(8, nuevousu.getEstadoBloqueo());// es el estado por defecto con el que se crean los post
                ps.setInt(9, nuevousu.getIdRolf());
                

                ps.executeUpdate();
                objCon.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }
        return t;
    }

    public boolean actualizarUsuarioSql(usuario nuevousu, String sql) {

        boolean p = false;
        BaseDatos objCon = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objCon.crearConexion()) {

                objCon.getConexion().setAutoCommit(false);
                File file = new File(nuevousu.getFotodePerfil());
                fis = new FileInputStream(file);
                //byte[] image = new byte[(int) file.length()];
                ps = objCon.getConexion().prepareStatement(sql);

                ps.setString(1, nuevousu.getNombre1U());
                ps.setString(2, nuevousu.getNombre2U());
                ps.setString(3, nuevousu.getApellido1U());
                ps.setString(4, nuevousu.getApellido2U());
                //ps.setBytes(5, image);
                ps.setBinaryStream(5, fis, (int) file.length());
                ps.setString(6, nuevousu.getContraseñaU());
   
                   ps.setString(7, nuevousu.getCorreoU());

                ps.executeUpdate();
                ps.close();
                objCon.getConexion().commit();
                p = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            p = false;
        }
        return p;

    }

    public boolean consultarCorreoSql(String sql) throws SQLException {
        
        boolean t = false;
        BaseDatos objCon = new BaseDatos();
        //System.out.println("SQL--->"+sql);
         ResultSet rs = null;
        int valor=0;
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
                        int tot = rs.getInt("total");
                       // System.out.println("cuantos--->"+tot);
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
   
        
        

        return t;
        
    }
    
    
    public int consultarCorreoSql1(String sql) throws SQLException {
        
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
                      //  System.out.println("cuantos--->"+tot);
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

    public int consultarLogin(String sql) {
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

    public boolean actualizarUsuarioBloqSql(usuario usubloq, String sql) {
        boolean p = false;
        BaseDatos objCon = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objCon.crearConexion()) {

                objCon.getConexion().setAutoCommit(false);

                ps = objCon.getConexion().prepareStatement(sql);

                   ps.setInt(0, usubloq.getEstadoBloqueo());

                ps.executeUpdate();
                ps.close();
                objCon.getConexion().commit();
                p = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            p = false;
        }
        return p;
    }

    

    

}
