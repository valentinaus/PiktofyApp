/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import static javax.swing.UIManager.get;
import modelo.categoria;

/**
 *
 * @author Vale
 */
public class ControlCategoria {

    public boolean insertarCategoria(categoria nuevacat) {
        boolean t = false;
        categoria objc = new categoria();
        categoria cat = nuevacat;
        String sql = "insert into categorias (tipoCategoria)value('" + cat.getTipoCategoria() + "');";

        t = objc.insertarCategoriaSql(sql);
        return t;
    }

    public LinkedList<categoria> consultarCategoria() {
        String sql = "Select * from categorias;";
        categoria objc = new categoria();
        LinkedList<categoria> listc = objc.buscarCategoriaSql(sql);

        return listc;
    }

    public boolean BorrarCategoria(categoria nc) {
        boolean t = false;
        categoria objc = new categoria();
        categoria cat = nc;
        String sql = "DELETE FROM categorias WHERE idCategoriast = '" + cat.getIdCategoriast() + "';";
        t = objc.borrarCategoriaSql(sql);
        return t;
    }

    public boolean ActualizarCategoria(categoria nc) {
        boolean t = false;
        categoria objc = new categoria();
        categoria cat = nc;
        String sql = "UPDATE categorias SET tipoCategoria='" + cat.getTipoCategoria() + "'where idCategoriast='" + cat.getIdCategoriast() + "'";
        t = objc.modificarCategoriaSql(sql);
        return t;
    }

}
