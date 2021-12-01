package Clases;

/**
 * @author Dylan
 * @version 1.0
 * @created 30-nov.-2021 12:20:52
 */
public class EmpleadoOfic extends Empleado {

	public EmpleadoOfic(){

	}

    public EmpleadoOfic(int id, String nombre, String apelldios, double salarioBase, double horasExtras) {
        super(id, nombre, apelldios, salarioBase, horasExtras);
    }

  
    @Override
    public String toString() {
        return "EmpleadoOfic { Id: "+ this.getId()  + ",Nombre: " + this.getNombre() + ",Apelldios: " + this.getApelldios()
                         + ",Salario base: "+ this.getSalarioBase() + ", Horas extras: " + this.getHorasExtras() + '}';
    }
    
            
        
public void finalize() throws Throwable {
    super.finalize();
}

}//end EmpleadoOficina