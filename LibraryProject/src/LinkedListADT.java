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
 * Linked List Data Structure 
 *
  ***********************************************************************/

import java.util.Scanner;

public class LinkedListADT implements InterfaceADT{

	
	public static Scanner kb = new Scanner(System.in);
	
	private Library first; //refer to the first link on the list
	 
	//Constructor 
	public LinkedListADT()
		{
		first = null;	// no items on the list yet
		}
	
		/*******************************************************************
		// Returns true if LinkList is empty
		********************************************************************/
		public boolean isEmpty()
		{
			return first == null;	
		}

		/*******************************************************************
		// Add method
		********************************************************************/
		public void add(String bookName)
		{
			
			System.out.println("Please enter the name of a book for list:");
			bookName = kb.nextLine();
			
			Library newLink = new Library(bookName);		
				
			newLink.next = first;	
			first = newLink;
		}	
		
		/*******************************************************************
		// Remove First  method
		********************************************************************/
		public void removeFirst()
		{
			
			Library theLink = first;
			
			if(!isEmpty()){
				System.out.println("DELETED first book from the LinkedList \n");
				first = first.next;	
			} else {
				System.out.println("Empty LinkedList");			
			}	
			
		}
		
		/*******************************************************************
		// Deleting all method
		********************************************************************/
		public void removeAll()
		{
			first = null;
		}
		
		/*******************************************************************
		// Displaying all method
		********************************************************************/
		public void display()
		{
			
			System.out.println("The LinkedList: ");
			
			Library theLink = first;

			while(theLink != null){	
				theLink.display();
				theLink = theLink.next;
				System.out.println();
			}
		}
		
		/*******************************************************************
		// Get Number of items method
		********************************************************************/
		public int getCount() 
		{
			Library theLink = first;
			int count=0;
			
			while(theLink != null){	
				count++;
				theLink=theLink.next;
			}
			System.out.print("The number of book in the LinkedList is ");
			return count;
		}


		/*******************************************************************
		* Get at Index method 
		********************************************************************/
		public void displayAtIndex(int index) 
		{
			Library theLink = first;
		
			theLink = theLink.next;
			System.out.println(theLink);
		}

		/*****************************************************************************************
		// Find  method						 
		 * @param bookName 
		********************************************************************/
		public void displayFirst()
		{	
			Library theLink = first;
			
			if(isEmpty()){
				System.out.println("Empty LinkedList");
			}else{
				theLink = theLink.next;	
				System.out.println("The first in List: "+ theLink);
			}
		
		}	
		
	
		public int getMaxSize() {
			throw new UnsupportedOperationException("Should not be called! "
					+ "No max size to this LinkList");	
		}
		
		@Override
		public boolean isFull() {
			System.out.println("LinkedList will not be 'full'");
			return false;	
		}


	}// end LinkedListADT class