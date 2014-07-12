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
 * Application to utilise two Data Structure Classes 
 *
  ***********************************************************************/

import java.util.Scanner;

public class Library extends LibraryBooks 
{
	
	public static Scanner kb = new Scanner(System.in);
	private static ArrayADT bookArray = new ArrayADT();
	private static LinkedListADT bookList = new LinkedListADT();
	private static String inputError = "Input Error, Exiting Program!";
	public static String bookName; 
	public Library next; 
		
	
	public Library(String bookName) 
	{
		super(bookName);
	}

	/*******************************************************************
	// Add, Method  No. 1 							
	********************************************************************/
	public static void insert() 
	{
		bookArray.add(bookName);			
		bookList.add(bookName);
		
		MainMenu();
	}
	
	/*******************************************************************
	// Count, Method  No. 2 						
	********************************************************************/
	public static void count() 
	{
		System.out.println(bookArray.getCount()+ "\n");
		System.out.println(bookList.getCount()+ "\n");
	
		MainMenu();
	}
	
	/*******************************************************************
	// Display at an Index, Method   No.3			
	********************************************************************/
	public static void getAtIndex() 
	{
		if(bookArray.isFull())
		{
			System.out.println("Insert failed, the list is full!");
		}
		else
		{	
			System.out.print("Enter Array book number to display  ");
			int bookArrayNumber = kb.nextInt();
			
			bookArray.displayAtIndex(bookArrayNumber);  
			
			System.out.print("\nEnter List book number to display  ");
			int bookListNumber = kb.nextInt();
			
			bookList.displayAtIndex(bookListNumber);	
		}
		MainMenu();
	}
		
	/*******************************************************************
	// Display, Method  No. 4						
	********************************************************************/
	public static void printAll()
	{
		bookArray.display();	
		bookList.display();
			
		MainMenu();
	}	

	/*******************************************************************
	// Remove All, Method No. 5						
	********************************************************************/
	public static void deleteAll() 
	{
		bookArray.removeAll();
		bookList.removeAll();
	
		System.out.println("DELETED all books");	
			
		count(); // proof of deletion 
		MainMenu();
	}
	
	/*******************************************************************
	// Remove first method, Method  No. 6			
	********************************************************************/
	public static void deleteFirstLink()
	{
		bookList.removeFirst();
		bookArray.removeFirst();
			
		count(); // proof of deletion
		MainMenu();
	}
	
	/*******************************************************************
	// Returns true if Empty, Method No. 7			
	********************************************************************/
	private static void Empty() 
	{	
		System.out.println(bookArray.isEmpty());
		System.out.println(bookList.isEmpty());
			
		MainMenu();
	}
	
	/*******************************************************************
	// Returns true if Full, Method  No. 8			
	********************************************************************/
	private static void Full() 
	{	
		System.out.println(bookArray.isFull());
		System.out.println(bookList.isFull());
			
		MainMenu();
	}
	
	/*******************************************************************
	// Get Max Size of, Method   No. 9				 
	********************************************************************/
	private static void MaxSize() 
	{	
		System.out.println(bookArray.getMaxSize()+"\n");
			
		System.out.print(bookList.getCount()
				+". There is no max size of a LinkedList \n");

		MainMenu();
	}
	
	/*******************************************************************
	// Find Book method, Method   No.10					  	  
	********************************************************************/
	public static void printFirst() 
	{	
		bookArray.displayFirst();
		bookList.displayFirst();

		MainMenu();	
	}
	

	
	/******************************
	// Exit program, Method  No. 0
	*******************************/
	public static void exitProgram() {
		System.out.println("\tGoodbye");
		System.exit(0);
	}
	
	/******************************
	// Main method
	*******************************/
	public static void main(String[] args) 
	{
		// Welcome Title
		final String mainHeadder = "\t*****************************************\n"
				+ "\t* Welcome to the Library Stock Programme *\n"
				+ "\t*****************************************";
		// Prints Title
		System.out.println(mainHeadder);

		// call main menu
		MainMenu();
	}// end Main


	/*******************************************************************
	// Menu method
	********************************************************************/
	public static void MainMenu() 
	{		
		try{
			System.out.println("Test GIT branch");
			System.out.println("---------------");
			int menuNo;
			Scanner kb = new Scanner(System.in);
			System.out.println("\n \t* Main Menu *\n"
				+ "\t-------------" + "\n \tPlease Enter Your Choice, to:"
				+ "\n\t ---------------------------------------------"
				+ "\n \t . 0  exit the program \t . 5  Delete all books" 
				+ "\n \t . 1  Add book \t\t . 6  Delete first " 
				+ "\n \t . 2  Count of books \t . 7  Check if Empty" 
				+ "\n \t . 3  Get book at index  . 8  Check if Full	"
				+ "\n \t . 4  Print books \t . 9  Check Max Size" 
				+ "\n \t\t\t\t . 10 Print First " 
				+ "\n\t ---------------------------------------------");
					
			menuNo = kb.nextInt();
	
			if 		(menuNo == 1) 	{ insert(); 		 }				
			else if (menuNo == 2) 	{ count(); 			 }				
			else if (menuNo == 3) 	{ getAtIndex();  	 }							 
			else if (menuNo == 4) 	{ printAll(); 		 }				
			else if (menuNo == 5) 	{ deleteAll(); 		 }						
			else if (menuNo == 6) 	{ deleteFirstLink(); }				
			else if (menuNo == 7) 	{ Empty(); 		 	 }				
			else if (menuNo == 8) 	{ Full(); 			 }			
			else if (menuNo == 9) 	{ MaxSize(); 		 }			
			else if (menuNo == 10) 	{ printFirst(); 	 }				
			else if (menuNo == 0) 	{ exitProgram(); 	 }
				
		} catch (Exception e) {
            System.out.println(inputError);
            System.exit(0);
        }// close error handling 
	
	}// end MainMenu Method
}// end class Library