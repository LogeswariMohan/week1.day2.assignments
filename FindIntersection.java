package week1.day2.assignments;

public class FindIntersection {

	public static void main(String[] args) {
		
		int A[]= {3,2,11,4,6,7};
		int B[]= {1,2,8,4,9,7};
		
		for(int i=0;i<A.length;i++) 
		{
			for(int j=0;j<B.length;j++) 
			{
				if(A[i]==B[j])// check for matches
				{
					System.out.println(A[i]);//what ever matches from array A, it will print
				}
			}	
		}
	}

}
