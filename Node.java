class Node { 
    Association key; 
    Node left, right; 
   
    public Node(Association data){ 
        key = data; 
        left = right = null; 
    }

    Association getKey(){
        if(key == null){
            return null;
        } else {
            return key;
        }
    }
} 