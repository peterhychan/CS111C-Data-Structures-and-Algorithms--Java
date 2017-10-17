/** Lab B Interfaces

    @author Ho Yeung Chan
**/
public interface EntryWayListInterface<T>
{
/**
   * Adds a new entry to the head of the list.
   * The list size is increased by 1.
   *
   * @param newEntry   	The object added as a new entry
   * @return true 		if the insertion is successful, else false
 */
public boolean insertHead(T newEntry);

/**
   *  Adds a new entry to the tail of the list.
   *  The list size is increased by 1.
   *
   * @param newEntry 	The object added as a new entry
   * @return true 		if the insertion is successful, else false
   */
public boolean insertTail(T newEntry);

/**
   * Removes first entry of the list.
   * The list size is decreased by 1.
   *
   * @return 			a reference to the removed entry or null (if the list is now empty)
   */
public T deleteHead();

/**
   * Removes the last entry of the list.
   * The list size is decreased by 1.
   *
   * @return 			a reference to the removed entry or null(if list is now empty)
   */
public T deleteTail();


/**
   * Shows all entries of the list, one entry per line,
   * by order, from head to tail.
   */
public void display();

/**
   * Checks whether a given entry exists,
   * and returns the position of the entry.
   *
   * @param 		anEntry which is the targeted entry.
   * @return 		an integer of the entry's position, or -1 if the entry does not exist
   */
public boolean contains(T anEntry);

/**
   * Checks whether the list is empty.
   *
   * @return      true if the list is empty, else false
   */
public boolean isEmpty();

/** Checks whether the list is full.
   * @return true if the list is full, else false
*/
public boolean isFull();

}

