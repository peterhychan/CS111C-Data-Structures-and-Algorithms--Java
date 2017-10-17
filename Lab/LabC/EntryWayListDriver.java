public class EntryWayListDriver {
	public static void main(String... args) {
		new EntryWayListDriver().operate();
		System.out.println("EntryWayList operated");
	}	
	private void operate() {
		EntryWayList<Integer> integerList = new EntryWayList<Integer>();
		integerList.display();    //display an empty list

		integerList.insertHead(3);
		integerList.insertHead(1);
		integerList.insertHead(2);
		integerList.insertTail(5);
		integerList.insertTail(4); //add five entries to the list
		integerList.display();     //display the updated list

		integerList.deleteHead();  //remove the 1st entry
		integerList.deleteTail();  //remove the last entry

		integerList.display();     //display the updated list with head and tail deleted

		System.out.println("test to see if 3 is in the list : " + integerList.contains(3) );
		System.out.println("test to see if 2 is in the list : " + integerList.contains(2) );

		integerList.deleteTail();
		integerList.deleteTail();
		integerList.deleteTail();  //remove the last three elements in the list
		integerList.deleteTail();  //try to remove an element from the empty list
		integerList.display();


		EntryWayList<String> stringList = new EntryWayList<String>();
		stringList.display();	//display an empty list

		stringList.insertHead("apple");
		stringList.insertHead("boy");
		stringList.insertHead("cat");
		stringList.insertTail("dog");
		stringList.insertTail("egg"); // add five entries
		stringList.display();          // display the list

		stringList.deleteHead();       //remove the first entry
		stringList.deleteTail();		  //remove the last entry
		stringList.display();          //display the list
		System.out.println("test to see if apple is in the list : " + stringList.contains("apple") );
		System.out.println("test to see if cat is in the list : " + stringList.contains("cat") );

		stringList.deleteTail();       
		stringList.deleteTail();
		stringList.deleteTail();		 //remove the last three elements in the list
		stringList.deleteTail();      //try to remove an element from the empty list
		stringList.display();
		
	}

}
