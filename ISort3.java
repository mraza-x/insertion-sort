/**
Mohammed Raza
CS 241 
Fall 2013
Programming Assignment 2
November 21, 2013
*/

// Insertion Sort - Average case with n = 32

public class ISort3 
{ 
  public static void main(String[] args) 
  { 
      int n = 32;   
		double swap;
		int compcount = 0;
	
      double[] array = new double[n];       
      for (int i = 0; i < n; i++)
		{
      	array[i] = Math.random();
		}

      System.out.println("Initial Elements:");
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
  
     System.out.println("\nSorted Elements:");
     for (int i = 0; i < n; i++)
	  {
        System.out.print(array[i] + ", ");
	  }
	  System.out.println("\nNumber of comparisons: " + compcount);

   }
}

Output:

    Initial Elements:
    0.988951283949989, 0.29513292462083596, 0.676501031501922, 0.2942292102641815, 0.8941422961868077, 0.33738226990955744, 0.7303204506989067, 0.031721618689416364, 0.2992379729627107, 0.6343621825914426, 0.11992911237304682, 0.5576097314446159, 0.9945729619554318, 0.18885231873200647, 0.11894623062158705, 0.7059243318413041, 0.22069468149912763, 0.8733594076059761, 0.3607977418930336, 0.5920625073506405, 0.6902510975985264, 0.9486283249726627, 0.3582622861048542, 0.39054226914314294, 0.9914331682149053, 0.42517178115268583, 0.6674046789457388, 0.40476548268409307, 0.19380311980214093, 0.7832297863080101, 0.2672158380960037, 0.995470150805528, 
    Sorted Elements:
    0.031721618689416364, 0.11894623062158705, 0.11992911237304682, 0.18885231873200647, 0.19380311980214093, 0.22069468149912763, 0.2672158380960037, 0.2942292102641815, 0.29513292462083596, 0.2992379729627107, 0.33738226990955744, 0.3582622861048542, 0.3607977418930336, 0.39054226914314294, 0.40476548268409307, 0.42517178115268583, 0.5576097314446159, 0.5920625073506405, 0.6343621825914426, 0.6674046789457388, 0.676501031501922, 0.6902510975985264, 0.7059243318413041, 0.7303204506989067, 0.7832297863080101, 0.8733594076059761, 0.8941422961868077, 0.9486283249726627, 0.988951283949989, 0.9914331682149053, 0.9945729619554318, 0.995470150805528, 
    Number of comparisons: 227