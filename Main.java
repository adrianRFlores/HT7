import java.util.ArrayList;

/**
 * Clase main
 * 
 */

class Main{
	
	/**
	 * Metodo main
	 */
	public static void main(String[] args){
		Read r = new Read();
		BinaryTree bstEng = r.getDic(0);
		BinaryTree bstFr = r.getDic(1);
		int menu = 0;

		//Loop principal
		while(menu != 5){
			menu = r.getMenu();
			switch(menu){

				//Traducir archivo
				case 1:
					ArrayList<String> lineas = r.getTxt();
					for(String t : lineas){
						String temp = "";
						String res = "";
						for(int i = 0; i<t.length(); i++){
							if(!Character.isWhitespace(t.charAt(i)) && Character.compare(',', t.charAt(i)) != 0 && Character.compare('.', t.charAt(i)) != 0){
								temp += t.charAt(i);
							} else {
								if(bstEng.search(temp.toLowerCase()) != null){
									res += bstEng.search(temp).get() + t.charAt(i);
								} else if(bstFr.search(temp) != null){
									res += bstFr.search(temp).get() + t.charAt(i);
								} else {
									res += "*" + temp + "*" + t.charAt(i);
								}
								temp = "";
							}
						}
						System.out.println(t);
						System.out.println(res + "\n");
					}
					break;

				//Agregar asociacion
				case 2:
					ArrayList<Association> temp = r.getAs();
					bstEng.insert(temp.get(0));
					bstFr.insert(temp.get(1));
					break;

				//Borrar asociacion
				case 3:
					ArrayList<Association> temp2 = r.removeAs();
					bstEng.deleteKey(temp2.get(0).getBase());
					bstFr.deleteKey(temp2.get(1).getBase());
					break;

				//Mostrar arboles in order
				case 4:
					System.out.println("Eng-Esp:");
					bstEng.inorder();
					System.out.println("Fr-Esp:");
					bstFr.inorder();	
			}
		}

	}
}