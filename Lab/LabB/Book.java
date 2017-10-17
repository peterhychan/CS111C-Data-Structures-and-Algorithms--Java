/** LabB- Extra Credits

    @author Ho Yeung Chan
**/
public interface Book<T> {
/**
   * Insert a newBook object as an entry
   * The list size is increased by 1.
   *
   * @param         newBook  The object added as a new entry
   * @return        true if the insertion is successful, else false
  */
public boolean insertbook(T newBook);
/**
   * Removes the entry from the book list.
   * The list size is decreased by 1.
   *
   * @return      a reference to the removed entry or null (if the list is now empty)
   */
public T removebook();
/**
   * Shows all entries of the book list, one entry per line,
   * by order, from head to tail.
   */
public void display();
/**
   * Checks whether the list is empty.
   *
   * @return      true if the list is empty, else false
   */
public boolean isBookEmpty();
/** Checks whether the list is full.
   * @return      true if the list is full, else false
*/
public boolean isBookFull();

/** The necessary main method to compile the program.
*/
public static void main(String[] args){
  System.out.println("To Compile the program");
  }
}