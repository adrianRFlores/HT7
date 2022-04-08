import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.File;

class Read{
	
	Scanner scan = new Scanner(System.in);

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

	ArrayList<Association> getAs(){
		ArrayList<Association> as = new ArrayList<Association>();
		System.out.println("Ingrese la palabra en ingles: ");
		String base = scan.nextLine();
		System.out.println("Ingrese la palabra en español: ");
		esp = scan.nextLine();
		as.add(new Association(base, esp));
		System.out.println("Ingrese la palabra en frances: ");
		base = scan.nextLine();
		as.add(new Association(base, esp));
		return as;
	}
}