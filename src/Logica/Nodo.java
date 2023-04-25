
package Logica;




public class Nodo {
    
    public Vehiculo informacion;
    public Nodo siguienteNodo; 
    
    
    
      public Nodo(Vehiculo informacion){
        this.informacion = informacion;
        siguienteNodo =  null;
    }

  
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "informacion : "+informacion+ " Siguiente nodo ->"+siguienteNodo;
    }
}
