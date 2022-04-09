import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;

/**
 * Clase para manejar todos los aspectos del salida y entrada de Main
 * 
 */

class Read{
	
	Scanner scan = new Scanner(System.in);

	/**
	 * Metodo para conseguir los BST del archivo de diccionario
	 * 
	 * @param op define si se utilizan los terminos en frances o ingles. 0 = ingles, cualquier otro numero para frances
	 * @return un BST con las asociaciones cargadas
	 */
	BinaryTree getDic(int op){
		if(op != 0){
			op = 2;
		}
		BinaryTree as = new BinaryTree();
		try{
			Scanner dic = new Scanner(new File("diccionario.txt"));
			while(dic.hasNextLine()){
				String[] data = dic.nextLine().split(",");
				as.insert(new Association(data[op].toLowerCase(), data[1].toLowerCase()));
			}
		} catch(FileNotFoundException e){}
		return as;
	}

	/**
	 * Metodo para conseguir las oraciones a traducir de un archivo de texto
	 * 
	 * @return un arraylist con todas las lineas del archivo
	 */
	ArrayList<String> getTxt(){
		ArrayList<String> data = new ArrayList<String>();
		try{
			Scanner dic = new Scanner(new File("texto.txt"));
			while(dic.hasNextLine()){
				data.add(dic.nextLine());
			}
		} catch(FileNotFoundException e){}
		return data;
	}

	/**
	 * Metodo para mostrar el menu y devolver la opcion escogida por el usuario
	 * 
	 * @return numero entero que represente la opcion del usuario
	 */
	int getMenu(){
		System.out.println("-----------MENU-----------");
		System.out.println("1. Traducir texto.txt");
		System.out.println("2. Agregar asociacion");
		System.out.println("3. Eliminar asociacion");
		System.out.println("4. Mostrar asociaciones in order");
		System.out.println("5. Salir");
		while(true){
			try{
				int t = scan.nextInt();
				if(t > 0 && t < 6){
					return t;
				}
			} catch(Exception e){
				System.out.println("Ingrese una opcion valida");
			}

		}
	}

	/**
	 * Metodo para conseguir una nueva asociacion del usuario
	 * 
	 * @return un arraylist con la asociacion. El primer puesto es la asociacion ENG-ESP y la segunda es FR-ESP
	 */
	ArrayList<Association> getAs(){
		ArrayList<Association> as = new ArrayList<Association>();
		System.out.println("Ingrese la palabra en ingles: ");
		String base = scan.next();
		System.out.println("Ingrese la palabra en español: ");
		String esp = scan.next();
		as.add(new Association(base, esp));
		System.out.println("Ingrese la palabra en frances: ");
		base = scan.next();
		as.add(new Association(base, esp));
		return as;
	}

	/**
	 * Metodo para conseguir la asociacion a borrar del usuario
	 * 
	 * @return un arraylist con la asociacion. El primer puesto es la asociacion ENG-ESP y la segunda es FR-ESP
	 */
	ArrayList<Association> removeAs(){
		ArrayList<Association> as = new ArrayList<Association>();
		System.out.println("Ingrese la palabra en ingles: ");
		String base = scan.next();
		as.add(new Association(base, " "));
		System.out.println("Ingrese la palabra en frances: ");
		base = scan.next();
		as.add(new Association(base, " "));
		return as;
	}
}