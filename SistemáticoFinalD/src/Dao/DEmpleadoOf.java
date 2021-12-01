/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import Clases.EmpleadoOfic;
import Interface.IOperaciones;
import java.util.ArrayList;



/**
 *
 * @author Dylan
 */
public class DEmpleadoOf implements IOperaciones{  
    ArrayList<EmpleadoOfic> lista = new ArrayList();
    @Override
    public void agregarRegistro(Object registro) {
        lista.add((EmpleadoOfic) registro);
    }
    @Override
    public Object mostrarRegistros(Object registro) {
        System.out.println(registro);
        System.out.println();
        return null;
       
    }

}
