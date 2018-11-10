
public class Driver
{

	public static void main(String[] args)
	{
		int[][] debugIsland = new int[15][15];
		int i;
		int k;
		for (i = 0; i < 15; i++)
		{
			for (k = 0; k < 15; k++)
			{
				if (i == 0 || i == 14)
				{
					debugIsland[i][k] = -1;
				}
				else if (k == 0 || k == 14)
				{
					debugIsland[i][k] = -1;
				} else 
				{
					debugIsland[i][k] = 0;
				}
			}
		}
		
		debugIsland[3][5] = 1;
		debugIsland[9][2] = 2;
		debugIsland[13][13] = 2;
		for (i = 0; i < 15; i++)
		{
			for (k = 0; k < 15; k++)
			{
				System.out.print(debugIsland[i][k]);
			}
			System.out.println("\n");
		}
	}

}
