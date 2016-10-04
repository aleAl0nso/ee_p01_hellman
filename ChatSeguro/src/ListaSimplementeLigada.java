
public class ListaSimplementeLigada<T> {

	private Nodo<T> inicio;
	
	public ListaSimplementeLigada(){
		inicio = null;
	}
	
	public Nodo<T> getInicio() {
		return inicio;
	}
	public void setInicio(Nodo<T> inicio) {
		this.inicio = inicio;
	}
	
	public void insertaInicio(T dato){
		Nodo<T> aux = new Nodo<T>(dato);
		aux.setSiguiente(inicio);
		inicio = aux;
	}
	
	public void insertarFinal(T dato){
		Nodo<T> aux = new Nodo<T>(dato);
		if(inicio!=null){
			Nodo<T> a=recorrer();
			a.setSiguiente(aux);
		}
		aux.setSiguiente(inicio);
	}
	public Nodo<T> recorrer(){
		Nodo<T> aux = inicio;
		while(aux.getSiguiente() != null){
			//System.out.print(aux+"-->");
			aux = aux.getSiguiente();
		}
		return aux;
		}
	
	
	public void recorrer_r(Nodo<T> aux){
		if (aux != null){
		  System.out.println(aux.getDato());
		  recorrer_r(aux.getSiguiente());
		}

	}
	
	

}
