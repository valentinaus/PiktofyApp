/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.comentario;

/**
 *
 * @author Vale
 */
public class ControlComentario {
        public boolean insertarComentario(comentario nuevoComentario) {
             boolean t=false;
             
             comentario objC= new comentario();
             comentario comment= nuevoComentario;

      String sql="insert into comentarios (textoComentario,idPoscf,correoUC) value ('"+comment.getTextoComentario()+"','"+comment.getIdPoscf()+"','"+comment.getCorreoUF()+"');";
 
      t=objC.insertarComentarioSql(sql);
      return t;
    }
        
           public LinkedList<comentario> consultarComentarios() {
        String sql="Select * from comentarios;";
        comentario objc=new comentario();
              LinkedList<comentario> listc= objc.consultarComentarioSql(sql);
        return listc;
    }
           
               public boolean BorrarComentario(comentario nc) {
        boolean t = false;
        comentario objc = new comentario();
        comentario com = nc;
         String sql="DELETE from comentarios where idcomentarios='"+com.getIdcomentario()+"'";
        t = objc.BorrarComentarioSql(sql);
        return t;
    }

    public LinkedList<comentario> consultarComentarios(int id) {
        String sql= "Select * from comentarios where idposcf='"+ id +"';";
        
         comentario objc=new comentario();
         LinkedList<comentario> co= objc.consultarComentarioporPostSql(sql);
         return co;
    }

  
}
