/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.like;

/**
 *
 * @author Vale
 */
public class ControlLike {

    public boolean insertarLike(like nuevolike) {
        boolean t = false;

        like objl = new like();
        like lik = nuevolike;

        String sql = "insert into likes (idpostf,correoUL)value('" + lik.getIdpostf() + "','" + lik.getCorreoUL() + "');";

        t = objl.insertarLikeSql(sql);
        return t;
    }

    /*public LinkedList<like> consultarLikes(int id) {
       
        String sql="Select * from likes where idPost=" + id+ ";";
        
        like objl= new like();

              LinkedList<like> listl= objl.consultarLikeSql(sql);
        return listl;
    }*/
    public LinkedList<like> consultarLikes() {
        String sql = "Select * from likes;";

        like objl = new like();

        LinkedList<like> listl = objl.consultarLikeSql(sql);
        return listl;

    }

    public LinkedList<like> consultarLikes(int id) {
        String sql = "Select * from likes where idpostf=" + id + " ;";

        like objl = new like();

        LinkedList<like> listl = objl.consultarLikeSql(sql);
        return listl;
    }

    public int consultarCantidadLikes(int id) {
        // String sql = "SELECT COUNT(*) FROM likes WHERE idpostf="+id+";";
        String sql = "SELECT COUNT(idpostf) AS nolikes FROM likes where idpostf=" + id + "";
        like objl = new like();

        int count = objl.consultarLikeCantidadSql(sql);
        return count;
    }

    public boolean consultarLikesPorUsuario(int idPostF,String correoU) {
         boolean llegada=false;
        String sql = "SELECT idLike,idpost,correoU FROM likes as l,\n"
                + "posts as p, usuarios as u\n"
                + "where u.correoU=l.correoUL and\n"
                + "p.idpost=l.idpostf and \n"
                + "u.correoU='"+correoU+"'\n"
                + "and p.idpost="+idPostF+";";
 
        like objl = new like();

         llegada = objl.consultaDarkLike(sql);
        return llegada;
    }

    public boolean BorrarLikes(like nl) {
        boolean t = false;

        like objl = new like();
        like lik = nl;

        String sql = "DELETE FROM likes WHERE idpostf = " + lik.getIdpostf() + " and correoUL = '" + lik.getCorreoUL() + "'";

        t = objl.insertarLikeSql(sql);
        return t;

    }

}
