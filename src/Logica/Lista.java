
package Logica;




public class Lista {
     public Nodo nodoPrincipal;

        /**
     * Adiciona un nodo al final de la lista
     * @param nodo Nodo
     */
    public void adicionarNodoFin(Nodo nodo){
        if (nodo != null){
            //si nodo tiene algo esta lleno sino no existe lista 
            if (nodoPrincipal == null){
                this.nodoPrincipal = nodo;
            }else{
                Nodo aux = this.nodoPrincipal;
                while(aux.siguienteNodo != null){
                    aux = aux.siguienteNodo;
                }
                aux.siguienteNodo = nodo;
            }
           
        }

    }
    /**
     * Adiciona un nodo al inicio de la lista
     * @param nodo Nodo
     */
    public void adicionarNodoInicio(Nodo nodo){
        if (nodo != null){
            //si nodo tiene algo esta lleno sino no existe lista 
            if (nodoPrincipal == null){
                this.nodoPrincipal = nodo;
            }else{
               // Nodo aux = this.nodoPrincipal;
                 nodo.siguienteNodo = nodoPrincipal;
                 this.nodoPrincipal = nodo;
            }
        }

    }
    
    public String obtenerLista(){
        Nodo aux = this.nodoPrincipal;
        StringBuilder listado = new StringBuilder();
        while (aux != null){
            listado.append(aux.informacion+"\n");
            System.out.println(aux.informacion);
            aux = aux.siguienteNodo;

        }
        //System.out.println(this.nodoPrincipal);
        //System.out.println(this.nodoPrincipal.siguienteNodo);
        return listado.toString();
    }
    /**
     * borra el primer nodo de la lista y la reorganiza, El nodo nodo 2 queda de primero.
     * Si solo hay uno queda vacia
     */
    public void borrarPrimero(){
        //llamar metodo para la fecha de inicio
        
        if(this.nodoPrincipal.siguienteNodo == null)
            this.nodoPrincipal=null;
        else{
            nodoPrincipal=nodoPrincipal.siguienteNodo;
        }
    }
    /**
     * Borra el ultimo nodo de la lista y reorganiza. EL penultimo nodo queda de primero 
     * Si solo hay uno queda vacia
     */
    public void borrarUltimo(){
        //LLamar metodo calcular pago
        
        while(nodoPrincipal.siguienteNodo.siguienteNodo==nodoPrincipal.siguienteNodo.siguienteNodo);
            nodoPrincipal.siguienteNodo.siguienteNodo=nodoPrincipal.siguienteNodo;
    }
    /**
     * borra el nodo de la posicion
     */
    public void borrarNodoIntermedio(int posicion){
    }
    
    public int contarEspacios(){
        int cantidad = 1;
   
            if (nodoPrincipal == null){
                cantidad++;
            }else{
                Nodo aux = this.nodoPrincipal;
                while(aux.siguienteNodo != null){
                    aux = aux.siguienteNodo;
                    cantidad++;
                }
                System.out.println(cantidad); 
            }     
        return cantidad;
    }
    public void adicionarInicio(Nodo nodo){
        if(nodoPrincipal==null){
            nodoPrincipal=nodo;
        }else{
            nodo.siguienteNodo=nodoPrincipal;
            nodoPrincipal=nodo;
        }
     }
}
