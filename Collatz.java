// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]){
	 int N = Integer.parseInt(args[0]);
	 int cnt;
	 int seed;
	 String mode = args[1];
	 if(mode.equals("v"))	
	 {
		for(int i = 1; i<= N; i++)
		{
			seed=i;
			cnt = 0;
			if(seed == 1)
			{
				cnt++;
				System.out.print(seed+ " ");
				seed+=3;
			}

			while(seed != 1)
			{	cnt++;
				System.out.print(seed + " ");
				if(seed % 2 == 1)
				{	
					seed = seed * 3 + 1;
				}
				else if (seed % 2 == 0)
				{	
					seed = seed / 2;
				}
			}
			cnt++;
			System.out.println(seed+ " (" + cnt + ")");

		}
		System.out.println("");
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");


	}
	if(mode.equals("c"))
	{
		System.out.println("Every one of the first " + N + " hailstone sequences reached 1.");
	}		
	 }
	}
	