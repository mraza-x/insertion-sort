
// Insertion Sort - Worst case with n = 32

public class ISort2
{ 
  public static void main(String[] args) 
  { 
  		int n = 32;   
		int swap;
		int compcount = 0;
		
		int[] array = new int[]{31,30,29,28,27,26,25,24,23,22,21,20,19,18,17,16,15,14,13,12,11,10,9,8,7,6,5,4,3,2,1,0};
 

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

Output:

    Initial Array:
    31, 30, 29, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0, 
    Sorted Array:
    0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 
    Number of comparisons: 496
    
