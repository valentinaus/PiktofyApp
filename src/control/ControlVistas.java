/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
 
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
 
/**
 * A JTable used to display a SQL ResultSet.
 * @author fahdshariff
 *
 */
public class ControlVistas extends JTable{
    
    JTable tabla;
    
   public JTable traervistas(String sql){
   
       //sql="SELECT * FROM vistamaximosposts;";
       ResultSet rs = null;
       
   
       BaseDatos objCon = new BaseDatos();
   
        if (objCon.crearConexion()) {
       
        try {
            
            Statement sentencia = objCon.getConexion().createStatement();
            rs = sentencia.executeQuery(sql);
            
            DefaultTableModel modelo = new DefaultTableModel();
            tabla = new JTable(modelo);
            
            modelo.addColumn("total posts");
            modelo.addColumn("nombre1");
            modelo.addColumn("nombre2");
            modelo.addColumn("apellido1");
            modelo.addColumn("apellido2");
            modelo.addColumn("correoUsuario");

            while (rs.next())
                {
                   // Se crea un array que será una de las filas de la tabla.
                   Object [] fila = new Object[6]; // Hay tres columnas en la tabla
 
                    // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
                   for (int i=0;i<6;i++)
                      fila[i] = rs.getObject(i+1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                      
                   // Se añade al modelo la fila completa.
                   modelo.addRow(fila);
                }
            /*
            ResultSetMetaData metaDatos = rs.getMetaData();
            
                        // Se obtiene el número de columnas.
            int numeroColumnas = metaDatos.getColumnCount();

            // Se crea un array de etiquetas para rellenar
            Object[] etiquetas = new Object[numeroColumnas];

            // Se obtiene cada una de las etiquetas para cada columna
            for (int i = 0; i < numeroColumnas; i++)
            {
               // Nuevamente, para ResultSetMetaData la primera columna es la 1.
               etiquetas[i] = metaDatos.getColumnLabel(i + 1);
               
               
               System.out.println("METADATO  "+i+" : "+ metaDatos.getColumnLabel(i + 1)); 
               System.out.println("ETIQUETA  "+i+"  :"+etiquetas[i]); 
            }   
            
            
            modelo.setColumnIdentifiers(etiquetas);*/
            
           System.out.println(modelo); 
                  
            }catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
   return tabla;
   }
   
   
    public JTable traervistasDenuncias(String sql) {

        //sql="SELECT * FROM vistamaximosposts;";
        ResultSet rs = null;

        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {

            try {

                Statement sentencia = objCon.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);

                DefaultTableModel modelo = new DefaultTableModel();
                tabla = new JTable(modelo);

                modelo.addColumn("id Denuncia");
                modelo.addColumn("Descripción");
                modelo.addColumn("id del post");
                modelo.addColumn("Remitente");
                modelo.addColumn("Denunciado");
                

                while (rs.next()) {
                    // Se crea un array que será una de las filas de la tabla.
                    Object[] fila = new Object[5]; // Hay tres columnas en la tabla

                    // Se rellena cada posición del array con una de las columnas de la tabla en base de datos.
                    for (int i = 0; i < 5; i++) {
                        fila[i] = rs.getObject(i + 1); // El primer indice en rs es el 1, no el cero, por eso se suma 1.
                    }
                    // Se añade al modelo la fila completa.
                    modelo.addRow(fila);
                }
              

                System.out.println(modelo);

            } catch (Exception ex) {
                Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return tabla;
    }
    

  
  
}
