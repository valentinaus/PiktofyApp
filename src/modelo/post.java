/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import com.mysql.jdbc.Blob;
import com.mysql.jdbc.Connection;
import control.BaseDatos;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Vale
 */
public class post {

    private int idpost;
    private String imagen;
    private String descripcion;
    private String fechaPost;
    private int estadoBloqueoPost;
    private int idCategoriastf;
    private String CorreoUF;
    private String etiqueta;
    private byte[] fotoPelicula;

    /**
     * Get the value of etiqueta
     *
     * @return the value of etiqueta
     */
    public post() {
    }

    public post(int idpost) {
        this.idpost = idpost;
    }

    public post(int idpost, String descripcion, int idCategoriastf, String etiqueta) {
        this.idpost = idpost;
        this.descripcion = descripcion;
        this.idCategoriastf = idCategoriastf;
        this.etiqueta = etiqueta;
    }

    public post(int idpost, String imagen, String descripcion, String fechaPost, int estadoBloqueoPost, int idCategoriastf, String CorreoUF, String etiqueta) {
        this.idpost = idpost;
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.fechaPost = fechaPost;
        this.estadoBloqueoPost = estadoBloqueoPost;
        this.idCategoriastf = idCategoriastf;
        this.CorreoUF = CorreoUF;
        this.etiqueta = etiqueta;
    }

    public post(String imagen, String descripcion, int estadoBloqueoPost, int idCategoriastf, String CorreoUF, String etiqueta) {
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.estadoBloqueoPost = estadoBloqueoPost;
        this.idCategoriastf = idCategoriastf;
        this.CorreoUF = CorreoUF;
        this.etiqueta = etiqueta;
    }

    public post(String imagen, String descripcion, String fechaPost, int estadoBloqueoPost, int idCategoriastf, String idUsuariof, String etiqueta) {
        this.imagen = imagen;
        this.descripcion = descripcion;
        this.fechaPost = fechaPost;
        this.estadoBloqueoPost = estadoBloqueoPost;
        this.idCategoriastf = idCategoriastf;
        this.CorreoUF = idUsuariof;
        this.etiqueta = etiqueta;
    }

    public post(int idpost, String descripcion, String fechaPost, int estadoBloqueoPost, int idCategoriastf, String CorreoUF, String etiqueta, byte[] fotoPelicula) {
        this.idpost = idpost;
        this.descripcion = descripcion;
        this.fechaPost = fechaPost;
        this.estadoBloqueoPost = estadoBloqueoPost;
        this.idCategoriastf = idCategoriastf;
        this.CorreoUF = CorreoUF;
        this.etiqueta = etiqueta;
        this.fotoPelicula = fotoPelicula;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    /**
     * Set the value of etiqueta
     *
     * @param etiqueta new value of etiqueta
     */
    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    /**
     * Get the value of idUsuariof
     *
     * @return the value of idUsuariof
     */
    public String getIdUsuariof() {
        return CorreoUF;
    }

    /**
     * Set the value of idUsuariof
     *
     * @param idUsuariof new value of idUsuariof
     */
    public void setIdUsuariof(String idUsuariof) {
        this.CorreoUF = idUsuariof;
    }

    /**
     * Get the value of idCategoriastf
     *
     * @return the value of idCategoriastf
     */
    public int getIdCategoriastf() {
        return idCategoriastf;
    }

    /**
     * Set the value of idCategoriastf
     *
     * @param idCategoriastf new value of idCategoriastf
     */
    public void setIdCategoriastf(int idCategoriastf) {
        this.idCategoriastf = idCategoriastf;
    }

    /**
     * Get the value of estadoBloqueoPost
     *
     * @return the value of estadoBloqueoPost
     */
    public int getEstadoBloqueoPost() {
        return estadoBloqueoPost;
    }

    /**
     * Set the value of estadoBloqueoPost
     *
     * @param estadoBloqueoPost new value of estadoBloqueoPost
     */
    public void setEstadoBloqueoPost(int estadoBloqueoPost) {
        this.estadoBloqueoPost = estadoBloqueoPost;
    }

    /**
     * Get the value of fechaPost
     *
     * @return the value of fechaPost
     */
    public String getFechaPost() {
        return fechaPost;
    }

    /**
     * Set the value of fechaPost
     *
     * @param fechaPost new value of fechaPost
     */
    public void setFechaPost(String fechaPost) {
        this.fechaPost = fechaPost;
    }

    /**
     * Get the value of descripcion
     *
     * @return the value of descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Set the value of descripcion
     *
     * @param descripcion new value of descripcion
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * Get the value of imagen
     *
     * @return the value of imagen
     */
    public String getImagen() {
        return imagen;
    }

    /**
     * Set the value of imagen
     *
     * @param imagen new value of imagen
     */
    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    /**
     * Get the value of idpost
     *
     * @return the value of idpost
     */
    public int getIdpost() {
        return idpost;
    }

    /**
     * Set the value of idpost
     *
     * @param idpost new value of idpost
     */
    public void setIdpost(int idpost) {
        this.idpost = idpost;
    }

    public byte[] getFotoPelicula() {
        return fotoPelicula;
    }

    public void setFotoPelicula(byte[] fotoPelicula) {
        this.fotoPelicula = fotoPelicula;
    }

    public String getCorreoUF() {
        return CorreoUF;
    }

    public void setCorreoUF(String CorreoUF) {
        this.CorreoUF = CorreoUF;
    }

    @Override
    public String toString() {
        return "post{" + "idpost=" + idpost + ", imagen=" + imagen + ", descripcion=" + descripcion + ", fechaPost=" + fechaPost + ", estadoBloqueoPost=" + estadoBloqueoPost + ", idCategoriastf=" + idCategoriastf + ", idUsuariof=" + CorreoUF + ", etiqueta=" + etiqueta + '}';
    }

    public boolean insertarPostSql(post objtp, String sql) {
        boolean t = false;
        BaseDatos objCon = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objCon.crearConexion()) {

                objCon.getConexion().setAutoCommit(false);
                File file = new File(objtp.getImagen());
                fis = new FileInputStream(file);
                ps = objCon.getConexion().prepareStatement(sql);
                ps.setBinaryStream(1, fis, (int) file.length());
                ps.setString(2, objtp.getDescripcion());
                ps.setInt(3, 0);// es el estado por defecto con el que se crean los post
                ps.setInt(4, objtp.getIdCategoriastf());
                ps.setString(5, objtp.getIdUsuariof());
                ps.setString(6, objtp.getEtiqueta());

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

    public LinkedList<post> consultaPostSql(String sql) {
        ResultSet rs = null;
        LinkedList<post> lp = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();

        int idpost;
        byte[] fotoPelicula;
        String descripcion = "";
        String fechaPost;
        int estadoBloqueoPost;
        int idCategoriastf;
        String CorreoUp;
        String etiqueta = "";

        if (objcone.crearConexion()) {
            try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {

                    idpost = rs.getInt("idpost");

                    try {
                        descripcion = rs.getString("descripcion");
                    } catch (NullPointerException n) {
                    }
                    if (descripcion == null) {
                        descripcion = "";
                    }
                    fechaPost = rs.getString("fechaPost");
                    estadoBloqueoPost = rs.getInt("estadoBloqueoPost");
                    idCategoriastf = rs.getInt("idCategoriastf");
                    CorreoUp = rs.getString("CorreoUp");
                    try {
                        etiqueta = rs.getString("etiqueta");
                    } catch (NullPointerException n) {
                    }
                    if (etiqueta == null) {
                        etiqueta = "";
                    }

                    java.sql.Blob blobI = rs.getBlob("imagen");
                    fotoPelicula = blobI.getBytes(1, (int) blobI.length());

                    lp.add(new post(idpost, descripcion, fechaPost, estadoBloqueoPost, idCategoriastf, CorreoUp, etiqueta, fotoPelicula));

                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lp;
    }

    public boolean borrarPostSql(String sql) {

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

    public boolean modificarPost(String sql) {
       
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

    public int consultarpostsql2(String sql) {
       
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
