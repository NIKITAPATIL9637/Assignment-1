package identifier;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		for(int i=0; i<n; i++) 
		{
			//I
			for(int j=0; j<n; j++)
			{
				if(i==0 && j<=(n-1)/2 || 
				   i==(n-1) && j<=(n-1)/2 || 
				   j==n/4
				  )
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			//N
			for(int j=0; j<n; j++)
			{
				if(j==0 || j==(n-1)/2 || i-j==j)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			//E
			for(int j=0; j<n; j++)
			{
				if(j==0 || i==0 && j<=(n-1)/2 || 
				   i==(n-1)/2 && j<=(n-1)/2 || 
				   i==(n-1) && j<=(n-1)/2
				  )
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			//U
			for(int j=0; j<n; j++)
			{
				if(j==0 && i<(n-1)|| 
				   j==(n-1)/2 && i<(n-1) || 
				   i==n-1 && j<((n-1)/2) && j>0
				  )
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			//R
			for(int j=0; j<n; j++)
			{
				if(j==0 || i==0 && j<((n-1)/2) || 
				   i==(n-1)/2 && j<((n-1)/2) || 
				   j==((n-1)/2) && i<((n-1)/2) && i>0 || 
				   i-j==(n-1)/2
				  )
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			//0 
			for(int j=0; j<n; j++)
			{
				if(i==n-1 && j<(n-1)/2 && j>0 || 
				   i==0 && j<(n-1)/2 && j>0 || 
				   j==0 && i<(n-1) && i>0 || 
				   j==(n-1)/2 && i<(n-1) && i>0
				  )
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
			
			//N
			for(int j=0; j<n; j++)
			{
				if(j==0 || j==(n-1)/2 || i-j==j)
				{
					System.out.print("*");
				}
				else 
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}

	}

}
