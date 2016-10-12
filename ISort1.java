/**
Mohammed Raza
CS 241 
Fall 2013
Programming Assignment 2
November 21, 2013
*/

// Insertion Sort - Best case with n = 32

public class ISort1
{ 
  public static void main(String[] args) 
  { 
  		int n = 32;  
		int swap;
		int compcount = 0;


      int[] array = new int[n];       
      for (int i = 0; i < n; i++)
		{
     	 array[i] = i;
		}
 

      System.out.println("Initial Array:");
		
      for (int i = 0; i < n; i++)
		{
     	 System.out.print(array[i] + ", ");
		}

		 for (int i = 0; i < n; i++) 
		 {
         for (int j = i; j > 0; j--) 
			{
            while (array[j - 1] > array[j]) 
				{
               swap = array[j];
               array[j] = array[j - 1];
               array[j - 1] = swap;
					compcount++;
            }
         }
      }

      System.out.println("\nSorted Array:");
		
      for (int i = 0; i < n; i++)
		{		
        System.out.print(array[i] + ", ");
		}
		  System.out.println("\nNumber of comparisons: " + compcount);
		

   }
}

//Output:

//    Initial Array:
  //  0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 
    //Sorted Array:
    //0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 
   // Number of comparisons: 0