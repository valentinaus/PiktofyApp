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
public class comentario {
    
    private int idcomentario;
    private String fechaComentario;
    private String textoComentario;
    private int idPoscf;
    private String correoUF;

    public comentario() {
    }

    public comentario(int idcomentario) {
        this.idcomentario = idcomentario;
    }

    public comentario(int idcomentario, String fechaComentario, String textoComentario, int idPoscf, String correoUF) {
        this.idcomentario = idcomentario;
        this.fechaComentario = fechaComentario;
        this.textoComentario = textoComentario;
        this.idPoscf = idPoscf;
        this.correoUF = correoUF;
    }

    public comentario(String textoComentario, int idPoscf, String correoUF) {
        this.textoComentario = textoComentario;
        this.idPoscf = idPoscf;
        this.correoUF = correoUF;
    }

    public int getIdcomentario() {
        return idcomentario;
    }

    public String getFechaComentario() {
        return fechaComentario;
    }

    public String getTextoComentario() {
        return textoComentario;
    }

    public int getIdPoscf() {
        return idPoscf;
    }

    public String getCorreoUF() {
        return correoUF;
    }

    public void setIdcomentario(int idcomentario) {
        this.idcomentario = idcomentario;
    }

    public void setFechaComentario(String fechaComentario) {
        this.fechaComentario = fechaComentario;
    }

    public void setTextoComentario(String textoComentario) {
        this.textoComentario = textoComentario;
    }

    public void setIdPoscf(int idPoscf) {
        this.idPoscf = idPoscf;
    }

    public void setCorreoUF(String correoUF) {
        this.correoUF = correoUF;
    }

    @Override
    public String toString() {
        return "comentario{" + "idcomentario=" + idcomentario + ", fechaComentario=" + fechaComentario + ", textoComentario=" + textoComentario + ", idPoscf=" + idPoscf + ", correoUF=" + correoUF + '}';
    }

   
    public boolean insertarComentarioSql(String sql) {
  boolean t= false;
           BaseDatos objCon = new BaseDatos();

           if(objCon.crearConexion())
           {
               try{
                    Statement sentencia= objCon.getConexion().createStatement();
                    sentencia.executeUpdate(sql);
                    t=true; 
               }catch(SQLException ex)
               {
                   ex.printStackTrace();
                   t=false;
               }
           }
           return t;
    }
    
    
        public LinkedList<comentario> consultarComentarioSql(String sql) {
        ResultSet rs = null;
        LinkedList<comentario> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
       
            int idcomentario;
            String fechaComentario;
            String textoComentario;
            int idPoscf;
            String correoUF;

            if (objcone.crearConexion()) {
                try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idcomentario = rs.getInt("idcomentarios");
                    fechaComentario=rs.getString("fechaComentario");
                    textoComentario=rs.getString("textoComentario");
                    idPoscf=rs.getInt("idPoscf");
                    correoUF=rs.getString("correoUC");
                    
                  
                 
                    lc.add(new comentario(idcomentario, fechaComentario, textoComentario, idPoscf, correoUF));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
    }
            public boolean BorrarComentarioSql(String sql) {
       
        boolean t= false;
        
        
           BaseDatos objCon = new BaseDatos();

           if(objCon.crearConexion())
           {
               try{
                    Statement sentencia= objCon.getConexion().createStatement();
                    sentencia.executeUpdate(sql);
                    t=true; 
               }catch(SQLException ex)
               {
                   ex.printStackTrace();
                   t=false;
               }
           }
           return t;
    }

    public LinkedList<comentario> consultarComentarioporPostSql(String sql) {
        ResultSet rs = null;
        LinkedList<comentario> lc = new LinkedList<>();
        BaseDatos objcone = new BaseDatos();
       
            int idcomentario;
            String fechaComentario;
            String textoComentario;
            int idPoscf;
            String correoUF;

            if (objcone.crearConexion()) {
                try {
                Statement sentencia = objcone.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                while (rs.next()) {
                    idcomentario = rs.getInt("idcomentarios");
                    fechaComentario=rs.getString("fechaComentario");
                    textoComentario=rs.getString("textoComentario");
                    idPoscf=rs.getInt("idPoscf");
                    correoUF=rs.getString("correoUC");
                    
                  
                 
                    lc.add(new comentario(idcomentario, fechaComentario, textoComentario, idPoscf, correoUF));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lc;
        
    
    }
    
}
