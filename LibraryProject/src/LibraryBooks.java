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
 * Over-riding the toString method.
 * Public Variables - so no need for getters and  setters. 
 *
  ***********************************************************************/

public class LibraryBooks 
{
	public String bookName;
	public LibraryBooks next;
	
	public LibraryBooks(String bookName) 
	{
		this.bookName = bookName;
	}
	
	public String toString()
	{
		return bookName;
	}

	public void display() 
	{
		System.out.print("\t"+'"'+bookName+'"');	
	}
}
