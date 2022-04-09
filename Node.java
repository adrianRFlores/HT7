/**
 * Clase para los nodos del BST.
 * 
 * Codigo adaptado de https://www.softwaretestinghelp.com/binary-search-tree-in-java/
 * ¡Gracias World Wide Web!
 */

class Node { 
    Association key; 
    Node left, right; 
   
   /**
    * Constructor
    * 
    * @param data la asociacion a asignar al nodo
    */
    public Node(Association data){ 
        key = data; 
        left = right = null; 
    }

    /**
     * Metodo para que el compilador deje de llorar por un NullPointerException (no se por que xd)
     * 
     * @return la asociacion asignada a este nodo
     */
    Association getKey(){
        if(key == null){
            return null;
        } else {
            return key;
        }
    }
} 