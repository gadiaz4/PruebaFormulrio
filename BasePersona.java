/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;
import datosPersona.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author
 */
public class BasePersona {
    ArrayList<Persona> listadoPersonas= new ArrayList<Persona>();
    public void instertarPersona(Persona p){
        listadoPersonas.add(p);
    }
    public void mostrarDatos (){

     for(int i = 0 ; i <=listadoPersonas.size();i++){
         if(listadoPersonas.size()==0){
             JOptionPane.showMessageDialog(null, "lista vacia");
         }else{
             JOptionPane.showMessageDialog(null, "\nNombre: "+listadoPersonas.get(i).getNombre().toString()+
                    "\nApellido: "+listadoPersonas.get(i).getApellido().toString()
            +"\nCedula: "+ listadoPersonas.get(i).getCedula().toString()
            +"\nEmail: "+listadoPersonas.get(i).getEmail().toString()
            +"\nTelefono: "+listadoPersonas.get(i).getTelefono().toString());

         }
     }

    }

}
