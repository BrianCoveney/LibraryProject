/************************************************************************
 * Title: Library Stock Application 
 * 
 * Java Files: 'LibraryApp', 'InterfaceADT', 'ArrayADT', 'LinkedListADT'
 * 			    and 'LibraryBooks' 	
 *
 * Date: 03/05/2014
 *
 * Author: Brian Coveney  Student Id: R00105727
 *
 * About this:
 * -----------
 * Abstract Data Type Interface
 *
  ***********************************************************************/

public interface InterfaceADT 
{	
	public void add(String bookName);
	
	public int getCount();

	public void display();
	
	public void displayAtIndex(int index);
	
	public void removeAll();
	
	public void removeFirst();
	
	public boolean isEmpty();
	
	public boolean isFull();
	
	public int getMaxSize();
	
	public void displayFirst();
}