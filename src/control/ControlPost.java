/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.post;

/**
 *
 * @author Vale
 */
public class ControlPost {

    public boolean insertarPost(post nuevoPost) {
        boolean t = false;

        post objp = new post();
        post p = nuevoPost;

        // String sql="insert into posts (imagen,descripcion,estadobloqueoPost,idCategoriastf,correoUp,etiqueta)value('"+p.getImagen()+"','"+p.getDescripcion()+"','"+p.getEstadoBloqueoPost()+"','"+p.getIdCategoriastf()+"','"+p.getIdUsuariof()+"','"+p.getEtiqueta()+"');";
        String sql = "insert into posts (imagen,descripcion,estadobloqueoPost,idCategoriastf,correoUp,etiqueta)values(?,?,?,?,?,?)";
        t = objp.insertarPostSql(nuevoPost, sql);
        return t;
    }

    public LinkedList<post> consultarPosts() {
        String sql = "Select * from posts;";
        post objp = new post();
        LinkedList<post> listp = objp.consultaPostSql(sql);
        return listp;
    }

    public LinkedList<post> consultarPostsporCorreo(String correo) {
        String sql = "Select * from posts where correoUp='" + correo + "';";
        post objp = new post();
        LinkedList<post> listp = objp.consultaPostSql(sql);
        return listp;
    }

    public LinkedList<post> BusquedaPosts(String busqueda, String categoria) {
        String sql = "Select*from posts inner join usuarios on posts.correoUp=usuarios.correoU  inner join categorias on posts.idCategoriastf= categorias.idCategoriast  and correoUp ='" + busqueda + "' and categorias.tipoCategoria='" + categoria + "';";
        post objp = new post();
        LinkedList<post> lista = objp.consultaPostSql(sql);
        return lista;
    }

    public LinkedList<post> BusquedaPosts2(String busqueda) {//si el usuario no selecciona una categoria para buscar
        String sql = "Select * from posts inner join usuarios on posts.correoUp=usuarios.correoU  inner join categorias on posts.idCategoriastf= categorias.idCategoriast  and categorias.tipoCategoria  ='" + busqueda + "';";
        // String sql=" Select*from posts inner join usuarios on posts.correoUp=usuarios.correoU  inner join categorias on posts.idCategoriastf= categorias.idCategoriast  and categorias.tipoCategoria ='papaya2';";
        post objp = new post();
        LinkedList<post> lista2 = objp.consultaPostSql(sql);
        return lista2;
    }

    public LinkedList<post> BusquedaPostsPorEtiqueta(String busqueda) {//si el usuario no selecciona una categoria para buscar
        String sql = "Select*from posts inner join usuarios on posts.correoUp=usuarios.correoU  inner join categorias on posts.idCategoriastf= categorias.idCategoriast  and lower(posts.etiqueta ='" + busqueda + "');";
        post objp = new post();
        LinkedList<post> lista = objp.consultaPostSql(sql);
        return lista;
    }

    public LinkedList<post> BusquedaPostPorFecha(String busqueda) {
        String sql = "Select * from posts inner join usuarios on posts.correoUp=usuarios.correoU  inner join categorias on posts.idCategoriastf= categorias.idCategoriast  and posts.fechaPost like '%" + busqueda + "%';";
        // String sql=" Select*from posts inner join usuarios on posts.correoUp=usuarios.correoU  inner join categorias on posts.idCategoriastf= categorias.idCategoriast  and categorias.tipoCategoria ='papaya2';";
        post objp = new post();
        LinkedList<post> lista2 = objp.consultaPostSql(sql);
        return lista2;
    }

    public LinkedList<post> BusquedaPostPorRangoFecha(String busqueda, String busqueda2) {
        String sql = "Select * from posts inner join usuarios on posts.correoUp=usuarios.correoU  inner join categorias on posts.idCategoriastf= categorias.idCategoriast  and posts.fechaPost between '" + busqueda + "' and '" + busqueda2 + "';";
        // String sql=" Select*from posts inner join usuarios on posts.correoUp=usuarios.correoU  inner join categorias on posts.idCategoriastf= categorias.idCategoriast  and categorias.tipoCategoria ='papaya2';";
        post objp = new post();
        LinkedList<post> lista2 = objp.consultaPostSql(sql);
        return lista2;
    }

    public boolean BorrarPost(post np) {
        boolean t = false;

        post objp = new post();
        post pos = np;

        String sql = "DELETE FROM posts WHERE idpost = '" + pos.getIdpost() + "'";

        t = objp.borrarPostSql(sql);
        return t;

    }

    public boolean ModificarPost(post np) {
        boolean t = false;

        post objp = new post();
        post pos = np;

        String sql = "UPDATE posts SET descripcion='" + pos.getDescripcion() + "', etiqueta='" + pos.getEtiqueta() + "', idCategoriastf='" + pos.getIdCategoriastf() + "'where idpost='" + pos.getIdpost() + "'";

        t = objp.modificarPost(sql);
        return t;

    }

    public LinkedList<post> consultarPostsFavoritos(String correoglobal) {
               String sql ="select * from posts  inner join favoritos on favoritos.idpostF =posts.idpost\n" +
        "inner join usuarios on usuarios.correoU= favoritos.idUsuarioF where usuarios.correoU='"+ correoglobal+"';";
      
      post objp = new post();
        LinkedList<post> lista2 = objp.consultaPostSql(sql);
        return lista2;
    }

    public int consultarComentarioPorPost(int idcom, String correoglobal, int idp) {
        int res=0;
       String sql= "select count(correoU)  as total from posts  inner join comentarios on posts.idpost=comentarios.idPoscf\n" +
        "inner join usuarios on comentarios.correoUC=usuarios.correoU where usuarios.correoU='"+correoglobal+"' and idpost="+idp+" and idcomentarios="+idcom+";";
       
       
       post objp = new post();
       res= objp.consultarpostsql2(sql);
       System.out.print(res);
       return res;
    }
    
     public LinkedList<post> consultarPostsConMásLikes() {
        //        String sql = "SELECT count(idpostf) ,idpostf\n" +
        //"FROM likes\n" +
        //"GROUP BY idpostf\n" +
        //"ORDER BY count(idpostf) DESC;";

            //  String sql="SELECT count(idpostf) FROM likes ORDER BY count(idpostf) DESC;";
            String sql="SELECT * FROM postsconmaslikes;";
                post objp = new post();
                LinkedList<post> listp = objp.consultaPostSql(sql);
                return listp;
    }


}
