package MyPackage;
public class MainCLass {

	public static void main(String[] args) {
		
		HashTable<Integer, String> hash = new HashTable<Integer, String>();

		String sentence = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves"
				+ "deliberately into paranoid avoidable situations";
		String[] words = sentence.toLowerCase().split(" ");
		int count = 0;
		for (String word : words) {
			count++;
			hash.addNode(count, word);
		}
		hash.print();
		hash.delete("avoidable");
		System.out.println("\n\n\nafter deleting word\n");
		hash.print();
	}


}
