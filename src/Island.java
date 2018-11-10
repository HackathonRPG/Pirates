import java.util.Random;

public class Island {

	char[][] ocean = new char [15][15];
	int x;
	int y;
	String islandName;
	int islandId;
	Island(String islandName, int islandId, int x, int y) {
		this.islandName = islandName;
		this.islandId = islandId;
		this.x = x;
		this.y = y;
		
		for(int i=0; i<15;i++) {
			for(int k=0;k<15;k++)
			{
				if(i==0||i==14)
				{
					ocean[i][k]='w';
				}
				else if (k==0||k==14)
				{
					ocean[i][k]='w';
				}
				else
				{
					ocean[i][k]='0';
				}
			}
		}
		Random rand = new Random();
		ocean[1][rand.nextInt((14-1) + 1)]=1;
		ocean[rand.nextInt((14-1) + 1)][rand.nextInt((14-1) + 1)]=2;
		ocean[rand.nextInt((14-1) + 1)][rand.nextInt((14-1) + 1)]=2;
		
	}
	
	
}
