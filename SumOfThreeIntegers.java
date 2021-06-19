package Programs;

public class SumOfThreeIntegers {
  public static void main(String[] args) {
	  int[] arr = {0,-2,-1,1,7,2,4,0,-6};
	  int sum;
	  int count=0;
      for (int i=0; i<=7; i++ )
      {
	    for (int j=i+1; j<=7; j++ )
	    {
	       for (int k=j+1; k<=7; k++ )
	       {
	       sum=arr[i]+arr[j]+arr[k];
	        if ( sum ==0 )
	        {
	        count++;
	         System.out.println(arr[i] + "," + arr[j]+ "," +arr[k]+"="+ 0);
	       }
	    }
      }
  }
  System.out.println("Count: " + count);
}
}