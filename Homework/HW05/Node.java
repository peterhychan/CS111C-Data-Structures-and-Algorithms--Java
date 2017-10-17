public class Node<T> {
	
	public T data; // Entry in list
	public Node next; // Link to next node

	public Node(T dataPortion) {
		data = dataPortion;
		next = null;
	} // end constructor

	public Node(T dataPortion, Node nextNode) {
		data = dataPortion;
		next = nextNode;
	} // end constructor

	public T getData() {
		return data;
	} // end getData

	public void setData(T newData) {
		data = newData;
	} // end setData

	public Node getNextNode() {
		return next;
	} // end getNextNode

	public void setNextNode(Node nextNode) {
		next = nextNode;
	} // end setNextNode

	public static void main(String[] args){
		Node a = new Node(5);

		Node b = new Node(3, a);

		Node c = new Node(7, b);

		Node firstNode = new Node(2, c);

		Node current = firstNode;

		current.next.next.data = 8;
	}
} // end Node