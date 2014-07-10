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
 * Array Data Structure 
 *
  ***********************************************************************/

import java.util.Scanner;

public class ArrayADT implements InterfaceADT {

	
	public static Scanner kb = new Scanner(System.in);
	private static final int MAXSIZE = 50; // max length of the list
	private String[] bookArray; // to hold the list
	private int numItems; // length of list


	//Setting up the Constructor 
	public ArrayADT() 
	{
		bookArray = new String[MAXSIZE];
		numItems = 0;
	}
	
	/*******************************************************************
	* Adding books method
	 * @param bookName 
	********************************************************************/
	public void add(String bookName) 
	{
		
        if(this.isFull()){
            System.out.println("ERROR: Insert not allowed, Max items reached");
        }else{
			System.out.println("Please enter the name of a book for array:");
			bookName = kb.nextLine();	
        	bookArray[numItems] = bookName;
            numItems += 1;
        }
    }
	
	/*******************************************************************
	* Checking if Array is full
	********************************************************************/
	public boolean isFull()
	{
		return numItems > MAXSIZE;
	}
	
	/*******************************************************************
	* Checking if Array is Empty
	********************************************************************/
	public boolean isEmpty()
	{
		return numItems == 0 ;
	}
	
	/*******************************************************************
	* Checking Max Size of Array
	********************************************************************/
	public int getMaxSize()
	{
		System.out.print("The Max size of the Array is ");
		return MAXSIZE;
	}
	
	/*******************************************************************
	// Displaying all the books in the Array
	********************************************************************/
	public void display()
	{
		if(this.isEmpty())
		{
			System.out.println("Empty... nothing to display");
		}else
		{
			System.out.println("The Array: ");	
		for (int i =0; i<bookArray.length; i++)
		{
			if(bookArray[i]!=null)
				System.out.println("\t"+'"'+bookArray[i]+'"');
		}
	  }
	}

	/*******************************************************************
	* Get Number of books method
	********************************************************************/
	public int getCount() 
	{
		System.out.print("The number of book in the Array is ");
		return numItems;
		
	}
	
	/*******************************************************************
	* Get Book at Index method 
	********************************************************************/
	public void displayAtIndex(int index)
	{
		if (index >= 1 && index <= numItems) 
		{
			String book = bookArray[index -1];
			System.out.print(book);
		} else 
		{ 
			System.out.println("The index you specified is out of range");
		} 
	} 
	
	/*******************************************************************
	// Deleting all the books method
	********************************************************************/
	public void removeAll() 
	{	
		bookArray = new String[MAXSIZE];
		numItems = 0;
	} // end deleteAllBooks
	
	/*******************************************************************
	// Remove First book method
	********************************************************************/
	public void removeFirst() 
	{
		int position = 1;
		if ( this.isEmpty() || position > numItems || position < 1 )
		{
			System.out.print("This delete can not be performed "+ "an element at position " + position + " does not exist " );
		}
		for (int i=position-1; i< numItems-1; i++)
			this.bookArray[i] = this.bookArray[i+1];
			this.bookArray[numItems-1] = null;
			numItems--;
			System.out.println("DELETED first book from the Array \n");
		
			return ;
	}

	/*******************************************************************
	// Display First book method
	********************************************************************/
	public void displayFirst() {
		System.out.println("The first in Array: " +this.bookArray[0]);
		
		}	
} // end ArrayADT class