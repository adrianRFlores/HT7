/**
 * Clase para las asociaciones entre palabras
 * 
 */

class Association{
	String base;
	String esp;

	/**
	 * Constructor
	 * 
	 * @param base la palabra en ingles/frances
	 * @param esp la palabra en español
	 */
	public Association(String base, String esp){
		this.base = base;
		this.esp = esp;
	}

	/**
	 * Metodo para comparar dos asociaciones
	 * 
	 * @param a la asociacion a comparar
	 * @return -1 si esta asociacion es menor, 0 si son iguales o 1 si es mayor
	 */
	int compareTo(Association a){
		return base.compareTo(a.getBase());
	}

	/**
	 * Metodo para conseguir la base de la asociacion
	 * 
	 * @return la base
	 */
	String getBase(){
		return base;
	}

	/**
	 * metodo para conseguir la palabra en español
	 * 
	 * @return la palabra en español
	 */
	String get(){
		return esp;
	}

	/**
	 * metodo para comparar si la base es igual a otra
	 * 
	 * @param a la asociacion a comparar
	 * @return true si son iguales o false.
	 */
	boolean equals(Association a){
		if(base.equals(a.getBase())){
			return true;
		}
		return false;
	}

	/**
	 * Metodo toString para mostrar esta asociacion al ser llamada
	 * 
	 * @return un string con los componentes de la asociacion
	 */
	@Override
	public String toString(){
		return "(" + base + ", " + esp + ")";
	}
}