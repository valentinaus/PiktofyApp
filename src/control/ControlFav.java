/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.favorito;
import modelo.like;

/**
 *
 * @author danie
 */
public class ControlFav {

    public boolean insertarFav(favorito nuevofav) {
        boolean t = false;

        favorito objf = new favorito();
        favorito fav = nuevofav;

        String sql = "insert into favoritos (idPostF,idUsuarioF)value('" + fav.getIdPostF() + "','" + fav.getIdCorreoF() + "');";

        t = objf.insertarFavSql(sql);
        return t;
    }

    /*public LinkedList<like> consultarLikes(int id) {
       
        String sql="Select * from likes where idPost=" + id+ ";";
        
        like objl= new like();

              LinkedList<like> listl= objl.consultarLikeSql(sql);
        return listl;
    }*/
    public LinkedList<favorito> consultarFavoritos() {
        String sql = "Select * from favoritos;";

        favorito objf = new favorito();

        LinkedList<favorito> listf = objf.consultarFavSQL(sql);
        return listf;

    }

    public boolean consultarLikesPorUsuario(int idPostF, String correoU) {
        boolean llegada = false;
        String sql = " SELECT idFav,idpost,correoU FROM favoritos as f,posts as p, usuarios as u\n"
                + " where u.correoU=f.idUsuarioF and p.idpost=f.idPostF and  u.correoU="+correoU+" and p.idpost="+idPostF+";";
                
 
     
       favorito objf= new favorito();
        llegada = objf.consultaDarFav(sql);
        return llegada;
    }

    public boolean BorrarFav(favorito nf) {
        boolean t = false;

        favorito objf=new  favorito();
       favorito fav = nf;

        String sql = "DELETE FROM favoritos WHERE idPostF = " + fav.getIdPostF() + " and idUsuarioF = '" + fav.getIdCorreoF() + "'";

        t = objf.insertarFavSql(sql);
        return t;

    }

    public int consultarFavoritosPorUsuario(int idpost, String correoglobal) {
        int fav=0;
        
        favorito fa= new favorito();
        
        
        String sql= "select count(correoU) as total from usuarios  inner join favoritos on usuarios.correoU= favoritos.idUsuarioF\n" +
                    "inner join posts on favoritos.idpostF =posts.idpost where usuarios.correoU='"+correoglobal+ "' and idPostF="+idpost+";";
        fav= fa.consultarFavoritosSql(sql);
        
        return fav;
    }


}
