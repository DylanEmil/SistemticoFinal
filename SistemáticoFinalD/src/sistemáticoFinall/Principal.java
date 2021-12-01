/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemáticoFinall;

import Clases.EmpleadoOfic;
import Clases.EmpleadoProduccion;
import Dao.DEmpleadoOf;
import Dao.DEmpleadoProduccion;

/**
 *
 * @author Dylan
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoOfic empleado1 = new EmpleadoOfic(001, "Dylan", "Diaz", 1500.80, 4);
        EmpleadoOfic empleado2 = new EmpleadoOfic(002, "Carlos", "Alaniz", 500.80, 2);
        EmpleadoOfic empleado3 = new EmpleadoOfic(003, "Cristobal", "Colon", 2900.80, 18);
        
        DEmpleadoOf Empleados_Ofic = new DEmpleadoOf();
        
        Empleados_Ofic.mostrarRegistros(empleado1);
        Empleados_Ofic.mostrarRegistros(empleado2);
        Empleados_Ofic.mostrarRegistros(empleado3);
        
        EmpleadoProduccion empleado01 = new EmpleadoProduccion(110, "Andres", "Catro", 50000.00, 15, 9000);
        EmpleadoProduccion empleado02 = new EmpleadoProduccion(335, "Rosa", "Marina", 9000.00, 32, 4000);
        EmpleadoProduccion empleado03 = new EmpleadoProduccion(122, "Luis", "Diaz", 400.00, 50, 700);
         
        DEmpleadoProduccion Empleados_Produccion = new DEmpleadoProduccion();
        
        Empleados_Produccion.mostrarRegistros(empleado01);
        Empleados_Produccion.mostrarRegistros(empleado02);
        Empleados_Produccion.mostrarRegistros(empleado03);
    }
    
}