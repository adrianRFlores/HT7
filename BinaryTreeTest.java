import junit.framework.TestCase;

public class BinaryTreeTest extends TestCase{
	
	public void testInsert(){
		BinaryTree bst = new BinaryTree();
		BinaryTree bst2 = new BinaryTree();
		Association a = new Association("dog", "perro");
		
		bst.insert(a);
		assertEquals(a, bst.search("dog"));
		
		Association b = new Association("chien", "perro");
		bst.insert(b);
		assertEquals(b, bst.search("chien"));
	}
	
	public void testSearch(){
		Read r = new Read();
		BinaryTree bst = r.getDic(0);

		assertEquals("dog", bst.search("dog").getBase());
		assertEquals("woman", bst.search("woman").getBase());
		assertEquals("pueblo", bst.search("town").get());
	}
	
	public void testDelete(){
		Read r = new Read();
		BinaryTree bst = r.getDic(0);

		assertEquals("dog", bst.search("dog").getBase());
		bst.deleteKey("dog");
		assertEquals(null, bst.search("dog"));
	}
	
}
