
package control;

import java.sql.SQLException;
import java.util.LinkedList;
import modelo.post;

import modelo.usuario;

/**
 *
 * @author Vale
 */
public class ControlUsuario {

    public boolean insertarUsuario(usuario nuevousu) {
        boolean t = false;
        usuario obju = new usuario();
        usuario usu = nuevousu;

        // String sql="insert into usuarios (nombre1U, nombre2U,apellido1U,apellido2U,fotodePerfil,correoU,contraseñaU,estadoBloqueo,idRolf)value('"
        //         +usu.getNombre1U()+"','"+usu.getNombre2U()+"','"+usu.getApellido1U()+"','"+usu.getApellido2U()+"','"+usu.getFotodePerfil()+"','"+usu.getCorreoU()+"','"+usu.getContraseñaU()+"','"+
        //          usu.getEstadoBloqueo()+"','"+usu.getIdRolf()+"');";
        String sql = "insert into usuarios (nombre1U, nombre2U,apellido1U,apellido2U,fotodePerfil,correoU,contraseñaU,estadoBloqueo,idRolf)values(?,?,?,?,?,?,?,?,?)";

        t = obju.insertarUsuarioSql(nuevousu, sql);
        return t;
    }

    public boolean actualizarUsuario(usuario nuevousu) {
        boolean t = false;
        usuario obju = new usuario();
        usuario usu = nuevousu;

        // String sql="insert into usuarios (nombre1U, nombre2U,apellido1U,apellido2U,fotodePerfil,correoU,contraseñaU,estadoBloqueo,idRolf)value('"
        //         +usu.getNombre1U()+"','"+usu.getNombre2U()+"','"+usu.getApellido1U()+"','"+usu.getApellido2U()+"','"+usu.getFotodePerfil()+"','"+usu.getCorreoU()+"','"+usu.getContraseñaU()+"','"+
        //          usu.getEstadoBloqueo()+"','"+usu.getIdRolf()+"');";
//      String sql="UPDATE usuarios SET nombre1U='"+usu.getNombre1U()+"',nombre2U='"+usu.getNombre2U()+"',apellido1U='"+usu.getApellido2U()+"',apellido2U='"+usu.getApellido2U()+"',fotodePerfil='"+usu.getFotodePerfil()+
//              "',correoU='"+usu.getCorreoU()+"',contraseñaU='"+usu.getContraseñaU()+"',estadoBloqueo='"+usu.getEstadoBloqueo()+"',idRolf='"+usu.getIdRolf()+"where correoU='"+usu.getCorreoU()+"';";
//      
        String sql = "UPDATE usuarios SET nombre1U= ? ,nombre2U= ? ,apellido1U= ? ,apellido2U= ? ,fotodePerfil= ? ,contraseñaU= ? where correoU= ?;";

        t = obju.actualizarUsuarioSql(nuevousu, sql);
        return t;
    }

    public boolean actualizarUsuarioNoFoto(usuario nuevousu) {
        boolean t = false;
        usuario obju = new usuario();
        usuario usu = nuevousu;

        String sql = "UPDATE usuarios SET nombre1U='" + usu.getNombre1U() + "',nombre2U='" + usu.getNombre2U() + "',apellido1U='" + usu.getApellido1U() + "',apellido2U='" + usu.getApellido2U() + "',contraseñaU='" + usu.getContraseñaU() + "' where correoU='" + usu.getCorreoU() + "';";

        t = obju.insertarUsuarioSql(sql);
        return t;
    }

    public LinkedList<usuario> consultarUsuarios() {
        String sql = "Select * from usuarios;";
        usuario obju = new usuario();
        LinkedList<usuario> listu = obju.buscarUsuarios(sql);

        return listu;
    }

    public LinkedList<usuario> consultarUsuarios(String busqueda) {
        String sql = "Select * from usuarios where correoU = '" + busqueda + "';";
        usuario obju = new usuario();
        LinkedList<usuario> listu = obju.buscarUsuarios(sql);

        return listu;
    }

    public boolean BorrarUsuario(usuario nu) {
        boolean t = false;
        usuario objc = new usuario();
        usuario usu = nu;
        
        String sql = "DELETE FROM usuarios WHERE correoU ='" + usu.getCorreoU() + "'";
        t = objc.borrarUsuarioSql(sql);
        return t;
    }

    public boolean consultarCorreo(String correo) throws SQLException {
        boolean t = false;
        usuario objc = new usuario();
        //System.out.println("correo   "+correo);

        String sql = "select count(*) as total from usuarios where correoU='" + correo + "';";
        //System.out.println("SQL   "+sql);
        t = objc.consultarCorreoSql(sql);
        //System.out.println("resultado   "+t);
        return t;

    }

    public int consultarCorreo1(String correo) throws SQLException {

        int q = 0;
        //boolean t=false;
        usuario objc = new usuario();
        String sql = "select count(*) as total from usuarios where correoU='" + correo + "';";
        q = objc.consultarCorreoSql1(sql);
        return q;
    }

    public int consultarLogin(String correo, String contraseña) {

        int q = 0;
        //boolean t=false;
        usuario objc = new usuario();
        String sql = "select COUNT(correoU) as total  from usuarios where correoU='" + correo + "'and contraseñaU='" + contraseña + "';";
        q = objc.consultarLogin(sql);
        return q;

    }
/*
    public LinkedList<usuario> consultarBloqueo(String correo) {
        
        
        
    }*/



    public boolean actualizarUsuarioBloqueo(usuario usubloq, String correocon) {
        boolean t = false;
        usuario obju = new usuario();
        usuario usu = usubloq;

        String sql = "UPDATE usuarios SET estadoBloqueo= ? where correoU= ?;";

        t = obju.actualizarUsuarioBloqSql(usubloq, sql);
        return t;
    }


    public boolean actualizarUsuarioEstado(usuario usubloq2) {
        boolean t = false;
        usuario obju = new usuario();
        usuario usu = usubloq2;

        String sql = "UPDATE usuarios SET estadoBloqueo= "+usu.getEstadoBloqueo()+" where correoU='"+usu.getCorreoU()+"';";
       t = obju.insertarUsuarioSql(sql);
        return t;
    }





}
