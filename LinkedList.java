import java.util.Optional;

public class LinkedList<V> {
	private LinkedListNode<V> head;

	public LinkedList() {
		head = null;
	}
	
	public void addFront(V item) {
		this.head = new LinkedListNode<>(item, head);
	}
	
	public void deleteFront() {
		Optional<LinkedListNode<V>> node = Optional.ofNullable(this.head);
		//this.head = head.flatMap(LinkedListNode :: getNext);
	}
	
	

}
