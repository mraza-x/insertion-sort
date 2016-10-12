/**
Mohammed Raza
CS 241 
Fall 2013
Programming Assignment 2
November 21, 2013
*/

// Insertion Sort - Average case with large n = 1000

public class ISort5 
{ 
  public static void main(String[] args) 
  { 
      int n = 1000;   
		double swap;
		int compcount = 0;
	
      double[] array = new double[n];       
      for (int i = 0; i < n; i++)
		{
      	array[i] = Math.random();
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
		
  		  System.out.println("Number of elements: " + n);

     	  System.out.println("\nNumber of comparisons: " + compcount);

   }
}

Output:

    
    Number of elements: 1000
    
    Number of comparisons: 246743
    