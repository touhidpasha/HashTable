package MyPackage;
public class HashTable<T, T1> {

	Node<T, T1> head = null, current, temp;

	@SuppressWarnings("hiding")
	class Node<T, T1> {
		T key;
		T1 data;
		Node<T, T1> next;

		
		 //this is a constructor of class Node this constructor will create node with
		 
		Node(T k, T1 value) {
			key = k;
			data = value;
			next = null;
		}

	}

	
	public void addNode(T keys, T1 data) {

		Node<T, T1> newnode = new Node<T, T1>(keys, data);
		if (head == null) {

			head = newnode;
			current = head;

		} else {
			temp = head;
			while (temp != null) {
				if (temp.key == keys) {

					temp.key = keys;
					temp.data = data;
				}
				temp = temp.next;

			}
			head = newnode;
			head.next = current;
			current = head;
		}

	}

	
	public void frequency(T1 data) {
		int count = 0;
		temp = head;
		while (temp != null) {
			if (temp.data == data) {
				count++;
			}
			temp = temp.next;
		}
		System.out.println("Frequency of '" + data + "' is :" + count);
	}

	/*
	 * this method is used to check if linked list is empty it returns boolean true
	 * or false if head is null then true is returned ,meaning list is empty
	 */
	public Boolean isEmpty() {
		temp = head;
		if (temp == null) {
			return true;
		} else {
			return false;
		}
	}
//this method used to print
	public void print() {
		Node<T, T1> tempnode = head;
		if (!isEmpty()) {

			while (tempnode.next != null) {

				System.out.print(tempnode.data + ":\n");
				frequency(tempnode.data);
				tempnode = tempnode.next;
			}
			System.out.println(tempnode.data);
			frequency(tempnode.data);
		} else {
			System.out.println("Queue is empty!!!!");
		}
	}
}
