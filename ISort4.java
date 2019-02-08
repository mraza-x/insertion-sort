
// Insertion Sort - Average case with large n = 100

public class ISort4 
{ 
  public static void main(String[] args) 
  { 
      int n = 100;   
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
    
    Number of elements: 100
    
    Number of comparisons: 2370
    
