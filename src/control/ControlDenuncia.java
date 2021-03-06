/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.util.LinkedList;
import modelo.denuncia;
import modelo.like;

/**
 *
 * @author Vale
 */
public class ControlDenuncia {

    public boolean insertarDenuncia(denuncia nuevadenu) {

        boolean t = false;
        denuncia objd = new denuncia();
        denuncia denun = nuevadenu;

        String sql = "insert into denuncias(descripcionR,idPosdf,correoUD)values('"
                + denun.getDescripcionR() + "','" + denun.getIdPosdf() + "','" + denun.getCorreoUD() + "');";

        t = objd.insertarDenunciaSql(sql);
        return t;
    }

    public LinkedList<denuncia> consultarDenuncia() {
        String sql = "Select * from denuncias;";
        denuncia objd = new denuncia();
        LinkedList<denuncia> listd = objd.buscarDenunciaSql(sql);

        return listd;
    }

    public LinkedList<denuncia> consultarDenunciaIndividual(denuncia nuevadenuncia) {
        denuncia objd = new denuncia();
        denuncia denun = nuevadenuncia;
        String sql = "Select * from denuncias where idDenuncia='" + denun.getIdDenuncia() + "';";

        LinkedList<denuncia> listd = objd.buscarDenunciaSql(sql);

        return listd;
    }

    public boolean ActualizarDenuncia(denuncia nuevadenu) {

        boolean t = false;
        denuncia objd = new denuncia();
        denuncia denun = nuevadenu;

        String sql = "UPDATE denuncias SET descripcionR='" + denun.getDescripcionR() + "'where idDenuncia='" + denun.getIdDenuncia() + "'";

        t = objd.insertarDenunciaSql(sql);
        return t;
    }

    public boolean BorrarDenuncia(denuncia nuevadenu) {

        boolean t = false;
        denuncia objd = new denuncia();
        denuncia denun = nuevadenu;

        String sql = "DELETE from denuncias where idDenuncia='" + denun.getIdDenuncia() + "'";

        t = objd.insertarDenunciaSql(sql);
        return t;
    }
    
    
        public boolean consultarDenunciasPorUsuario(int idPostF,String correoU) {
         boolean llegada=false;
        String sql = "SELECT idDenuncia,idpost,correoU FROM denuncias as d,\n"
                + "posts as p, usuarios as u\n"
                + "where u.correoU=d.correoUD and\n"
                + "p.idpost=d.idPosdf and \n"
                + "u.correoU='"+correoU+"'\n"
                + "and p.idpost="+idPostF+";";
 
        like objl = new like();

         llegada = objl.consultaDarkLike(sql);
        return llegada;
    }
}
