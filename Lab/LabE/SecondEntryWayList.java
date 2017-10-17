import java.util.Arrays;

public class SecondEntryWayList<T> implements EntryWayListInterface<T> {

	private AList<T> aList;

	public SecondEntryWayList() {
		this.aList = new AList<>();
	}

	public boolean insertHead(T newEntry) {
		boolean done = false;
		aList.add(1, newEntry);
		return !done;
	}

    public boolean insertTail(T newEntry) {
    	boolean done = false;
		aList.add(aList.getLength()+1,newEntry);
		return !done;
    }

	public T deleteHead() {
		if (aList.isEmpty()) {
			return null;
		} else {
			return aList.remove(1);
		}
	}

	public T deleteTail() {
		if(aList.isEmpty()){
			return null;
		}
		else{
			return aList.remove(aList.getLength());
		}
	}

	public void display() {
		System.out.println(Arrays.toString(aList.toArray()));
	}

	public boolean contains(T anEntry) {
		boolean done = false;
		for(int i = 1; i <= aList.getLength(); i++){
			if(aList.getEntry(i).equals(anEntry)){
				return !done;
			}
		}
		return done;
	}

	public boolean isEmpty() {
		boolean done = false;
		if(aList.isEmpty()){
			return !done;
		}else{
			return done;
		}
	}

	public boolean isFull() {
		boolean done = false;
		return done;
	}
}
