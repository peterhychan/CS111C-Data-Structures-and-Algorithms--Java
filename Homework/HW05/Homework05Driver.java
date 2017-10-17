import java.util.Arrays;

public class Homework05Driver {

	public static void main(String[] args) {

		// setting up Nodes to test
		System.out.println("TESTING NODES");

		Node<Integer> node5 = new Node<Integer>(new Integer(6));
		Node<Integer> node4 = new Node<Integer>(new Integer(4), node5);
		Node<Integer> node3 = new Node<Integer>(new Integer(2), node4);
		Node<Integer> node2 = new Node<Integer>(new Integer(8), node3);
		Node<Integer> node1 = new Node<Integer>(new Integer(3), node2);
		// sets up the chain 3 -> 8 -> 2 -> 4 -> 6

		// Q2 determine if divisible
		System.out.println("Are all divisible by 2? false: " + isDivisibleBy(node1, 2));

		node1.data = 4;
		node5.data = 1;
		// sets up the chain 4 -> 8 -> 2 -> 4 -> 1 
		System.out.println("Are all divisible by 2? false: " + isDivisibleBy(node1, 2));
	
		node4.next.data = 6;
		// sets up the chain 4 -> 8 -> 2 -> 4 -> 6 
		System.out.println("Are all divisible by 2? true: " + isDivisibleBy(node1, 2));
		
		// Q3 print every other
		System.out.println("Should print 4, 2, 6");
		printEveryOther(node1);

		node5.next = new Node<Integer>(new Integer(11));
		// sets up the chain 4 -> 8 -> 2 -> 4 -> 6 -> 11
		System.out.println("Should still print 4, 2, 6");
		printEveryOther(node1);
		
		// setting up an LinkedBag to test
		System.out.println("\nTESTING BAG");
		LinkedBag<Integer> numbersBag = new LinkedBag<Integer>();
		numbersBag.add(1);
		numbersBag.add(2);
		numbersBag.add(1);
		numbersBag.add(4);
		numbersBag.add(3);
		System.out.println("The bag contains[3, 4, 1, 2, 1]  (any order)\n\t\t"
				+ Arrays.toString(numbersBag.toArray()));

		// Q4 getMin method
		System.out.println("The min in the bag is 1: " + numbersBag.getMin());
		numbersBag.add(0);
		System.out.println("The bag contains[0, 3, 4, 1, 2, 1]  (any order)\n\t\t"
				+ Arrays.toString(numbersBag.toArray()));
		System.out.println("The max in the bag is 0: " + numbersBag.getMin());

		// Q5 union
		LinkedBag<Integer> firstBag = new LinkedBag<Integer>();
		firstBag.add(8);
		firstBag.add(2);
		firstBag.add(4);
		firstBag.add(5);
		firstBag.add(6);
		firstBag.add(2);
		LinkedBag<Integer> secondBag = new LinkedBag<Integer>();
		secondBag.add(3);
		secondBag.add(1);
		secondBag.add(2);
		BagInterface<Integer> unionBag = firstBag.union(secondBag);
		System.out.println("Bag1 contains   [2, 6, 5, 4, 2, 8]  (any order)\n\t\t"
						+ Arrays.toString(firstBag.toArray()));
		System.out.println("Bag2 contains   [2, 1, 3]  (any order)\n\t\t"
						+ Arrays.toString(secondBag.toArray()));
		System.out.println("Union Bag contains [3, 1, 2, 8, 2, 4, 5, 6, 2] (any order) \n\t\t   "
						+ Arrays.toString(unionBag.toArray()));

		// setting up LList to test
		System.out.println("\nTESTING LIST");
		LList<String> produceList = new LList<String>();
		String[] stringArray = { "banana", "date", "grape", "eggplant",
				"jicama", "grape" };

		// Q6 addAll method
		produceList.addAll(stringArray);
		System.out.println("The list contains[banana, date, grape, eggplant, jicama, grape] \n\t\t "
						+ Arrays.toString(produceList.toArray()));

		// Q7 getPosition method
		System.out.println("Position is 1: " + produceList.getPosition("banana"));
		System.out.println("Position is 3: " + produceList.getPosition("grape"));
		System.out.println("Position is -1: " + produceList.getPosition("mango"));

		
	}

	public static void printEveryOther(Node firstNode) {
		// YOUR CODE HERE
	}

	public static boolean isDivisibleBy(Node<Integer> firstNode, int divisor) {
		// YOUR CODE HERE
		return true;
	}

	

}
