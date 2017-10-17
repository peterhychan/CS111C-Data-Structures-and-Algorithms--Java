import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// setting up an ArrayBag to test
		ResizableArrayBag<Integer> firstResizableBag = new ResizableArrayBag<Integer>();
		firstResizableBag.add(8);
		firstResizableBag.add(2);
		firstResizableBag.add(4);
		firstResizableBag.add(5);
		firstResizableBag.add(6);
		firstResizableBag.add(2);
		ResizableArrayBag<Integer> secondResizableBag = new ResizableArrayBag<Integer>();
		secondResizableBag.add(3);
		secondResizableBag.add(1);
		secondResizableBag.add(2);
		firstResizableBag.union(secondResizableBag);
		System.out.println(Arrays.toString(firstResizableBag.toArray()));
		System.out.println(Arrays.toString(secondResizableBag.toArray()));
	}
}
