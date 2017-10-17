import java.util.*;
public class Trio<T extends Comparable<? super T>> implements Comparable<Trio <T>>{

	Object one;
	Object two;
	Object three;
	public Trio(Object one, Object two, Object three){
		this.one = one;
		this.two = two;
		this.three = three;
	}
	public Object getItem1() {
		return one;
	}
	public Object getItem2() {
		return two;
	}
	public Object getItem3(){
		return three;
	}
	public void setItem1(Object one_change){
		 this.one = one_change;
	}
	public void setItem2(Object two_change){
		this.two = two_change;
	}
	public void setItem3(Object three_change){
		this.three = three_change;
	}

	public boolean contains(Object contain){
		return(this.one.equals(contain)||this.two.equals(contain)||this.three.equals(contain));
	}

	public boolean sameItems(){
		return(this.one.equals(this.two)&&this.two.equals(this.three));
	}

	@Override
	public String toString() {
		return(one.toString()+" "+two.toString()+" "+three.toString());
	}
	@Override
	public boolean equals(Object other) {
		if(other instanceof Trio) {
			Trio otherTrio = (Trio) other;
			Object other_one =otherTrio.getItem1();
			Object other_two =otherTrio.getItem2();
			Object other_three =otherTrio.getItem3();
	   		ArrayList checking_other = new ArrayList();
	   		checking_other.add(otherTrio.getItem1());
	   		checking_other.add(otherTrio.getItem2());
	   		checking_other.add(otherTrio.getItem3());

	   		ArrayList checking_trio = new ArrayList();
	   		checking_trio.add(this.getItem1());
	   		checking_trio.add(this.getItem2());
	   		checking_trio.add(this.getItem3());

	   		Collections.sort(checking_trio);
	   		Collections.sort(checking_other);
	   		return (checking_other.get(0)==checking_trio.get(0) && checking_other.get(1)==checking_trio.get(1) && checking_other.get(2) ==checking_trio.get(2));
		} else {
			return false;
		}
	}

	public int compareTo(Trio<T> otherTrio) {
		return this.compareTo(otherTrio);
			}
}