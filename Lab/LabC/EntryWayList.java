public class EntryWayList<T> implements EntryWayListInterface<T> {

	private T[] list;
	private int numEntries;
	private static final int DEFAULT_SIZE = 25;
	private static final int MAXIMUM = 10000;

	public EntryWayList() {
		this(DEFAULT_SIZE);
	}

	public EntryWayList(int size) {
		if (size < DEFAULT_SIZE) 	size = DEFAULT_SIZE;

		if (size > MAXIMUM){
			throw new IllegalStateException("Illegal Operations");
		}
		list = (T[]) new Object[size];
		numEntries = 0;
	}

	@Override
	public boolean insertHead(T newEntry) {
		boolean answer = false;
		if (numEntries < MAXIMUM) {
			if (numEntries != 0) {
				for (int i = numEntries - 1; i >= 0; i--) {
					this.list[i + 1] = this.list[i];
				}
			}
			this.list[0] = newEntry;
			numEntries++;
			return !answer;
		}
		return answer;
	}

	@Override
	public boolean insertTail(T newEntry) {
		boolean answer = false;
		if (numEntries < MAXIMUM) {
			this.list[numEntries] = newEntry;
			numEntries++;
			return !answer;
		}
		return answer;
	}

	@Override
	public T deleteHead() {
		if (numEntries > 0) {
			T deleted = this.list[0];
			for (int i = 0; i < numEntries - 1; i++) {
				this.list[i] = this.list[i + 1];
			}
			numEntries--;
			return deleted;
		}
		return null;  //null is needed
	}

	@Override
	public T deleteTail() {
		if (numEntries > 0) {
			T deleted = this.list[numEntries - 1];
			this.list[numEntries - 1] = null;
			numEntries--;
			return deleted;
		}
		return null;  //null is needed 
	}

	@Override
	public void display() {
		StringBuilder sb = new StringBuilder("["); //learned from http://docs.oracle.com/javase/tutorial/java/data/buffers.html
		for (int i = 0; i < numEntries; ++i) {
			sb.append(list[i].toString());
			sb.append(" , ");
		}
		if (numEntries > 0) {
			sb.delete(sb.length() - 2, sb.length());
		}
		sb.append(']');
		System.out.println(sb.toString());
	}


	@Override
	public boolean contains(T anEntry) {
		boolean answer = false;
		for (int i = 0; i < numEntries; ++i) {
			if (list[i].equals(anEntry)) {
				return !answer;
			}
		}
		return answer;
	}


	@Override
	public boolean isEmpty() {
		boolean answer = false;
		if (numEntries == 0) {
			return !answer;
		}
		return answer;
	}

	@Override
	public boolean isFull() {
		boolean answer =false;
		if (numEntries == MAXIMUM) {
			return !answer;
		} else {
			return answer;
		}
	}
}
