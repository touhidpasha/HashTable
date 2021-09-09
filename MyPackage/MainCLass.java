package MyPackage;
public class MainCLass {

	public static void main(String[] args) {
		
		HashTable<Integer, String> hash = new HashTable<Integer, String>();

		hash.addNode(1, "to");
		hash.addNode(2, "be");
		hash.addNode(3, "or");
		hash.addNode(4, "not");
		hash.addNode(5, "to");
		hash.addNode(6, "be");
		hash.print();
	}


}
