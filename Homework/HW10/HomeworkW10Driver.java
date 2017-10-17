import java.util.*;

public class HomeworkW10Driver {

	public static void main(String[] args) {
		Integer[] unsortedNumbers = { 1, 4, 3, 2, 6, 7, 2, 4 };
		Integer[] sortedNumbers = Arrays.copyOf(unsortedNumbers,unsortedNumbers.length);
		Arrays.sort(sortedNumbers);

		// Q7: recursive linear search on unsorted data
		System.out.println("Q7");
		System.out.println("contains 2 (true): "
				+ searchRecursiveLinearFromLast(unsortedNumbers, 2));
		System.out.println("contains 4 (true): "
				+ searchRecursiveLinearFromLast(unsortedNumbers, 4));
		System.out.println("contains 8 (false): "
				+ searchRecursiveLinearFromLast(unsortedNumbers, 8));
		System.out.println("");

		// Q8: recursive linear search on sorted data
		// note: you might want to add additional print statements to make sure
		// that your method is not only returning the correct value, but also
		// taking advantage of the list being sorted
		System.out.println("Q8");
		System.out.println("contains 1 (true): "
				+ searchRecursiveLinearSorted(sortedNumbers, 1));
		System.out.println("contains 4 (true): "
				+ searchRecursiveLinearSorted(sortedNumbers, 4));
		System.out.println("contains 7 (true): "
				+ searchRecursiveLinearSorted(sortedNumbers, 7));
		System.out.println("contains 8 (false): "
				+ searchRecursiveLinearSorted(sortedNumbers, 8));
		System.out.println("");

		// Q9: return all indices of the target; recursive
		System.out.println("Q9");		
		ArrayList<Integer> indices;
		indices = findIndicesUnsorted(unsortedNumbers, new Integer(1));
		System.out.println("1 is at [0]: " + indices.toString());
		indices = findIndicesUnsorted(unsortedNumbers, new Integer(2));
		System.out.println("2 is at [3, 6]: " + indices.toString());
		indices = findIndicesUnsorted(unsortedNumbers, new Integer(4));
		System.out.println("4 is at [1, 7]: " + indices.toString());
		indices = findIndicesUnsorted(unsortedNumbers, new Integer(5));
		System.out.println("5 is at []: " + indices.toString());
		System.out.println("");
		
		//Q11 
		SortedLinkedList<Integer> sortedNumList = new SortedLinkedList<Integer>();
		sortedNumList.add(4);
		sortedNumList.add(2);
		sortedNumList.add(1);
		sortedNumList.add(9);
		sortedNumList.add(3);
		sortedNumList.add(7);
		sortedNumList.add(4);
		System.out.println("Q11");
		System.out.println("contains 2 (true): " + sortedNumList.contains(2));
		System.out.println("contains 9 (true): " + sortedNumList.contains(9));
		System.out.println("contains 1 (true): " + sortedNumList.contains(1));
		System.out.println("contains 4 (true): " + sortedNumList.contains(4));
		System.out.println("contains 11 (false): " + sortedNumList.contains(11));
		System.out.println("contains 5 (false): " + sortedNumList.contains(5));
		SortedLinkedList<String> sortedWordList = new SortedLinkedList<String>();
		sortedWordList.add("plum");
		sortedWordList.add("apple");
		sortedWordList.add("grapes");
		sortedWordList.add("banana");
		sortedWordList.add("plum");
		sortedWordList.add("tomato");
		sortedWordList.add("pear");
		System.out.println("contains tomato (true): " + sortedWordList.contains("tomato"));
		System.out.println("contains banana (true): " + sortedWordList.contains("banana"));
		System.out.println("contains orange (false): " + sortedWordList.contains("orange"));
		System.out.println("");
	}

	// Q7
	public static boolean searchRecursiveLinearFromLast(Object[] array,
			Object target) {
               return search(array, 0, array.length-1, target);
	}	

	public static boolean search(Object[] array, int first, int last, Object target){
              boolean found;
              if(first >last){
                      found = false;
             }else if(target.equals(array[last])){
                      found = true;
             }else{
                      found = search(array, first, last -1, target);
             }
             return found;
	}


	// Q8
	public static boolean searchRecursiveLinearSorted(Comparable[] array, Comparable target) {
			return search(array, 0 ,array.length-1, target);
	}

	public static boolean search (Comparable[] array, int first, int last, Comparable target){
            boolean found;
            if (first>last){
                   found = false;
            }else if(array[first].equals(target)){
                   found = true;
            }else if(array[first].compareTo(target)>0){
                   found = false;
            }else{
                   found = search(array, first+1, last, target);
             }
            return found;
	}

	// Q9
	public static ArrayList<Integer> findIndicesUnsorted(Object[] array,
			Object target) {

          return find(array, target, 0, array.length-1);

}

public static ArrayList<Integer> find(Object[] array, Object target, int first, int last){

          ArrayList<Integer> list= new ArrayList<Integer>();
          if(first== last && array[first].equals(target)){
                  list.add(first);
         }else if(first != last){
                  if (array[first].equals(target)){
                           list.add(first);
                           list.addAll(find(array, target, 1+first, last));
                  }else{
                   list= find(array, target, 1+first, last); 
         }
     }return list;
	}


}

