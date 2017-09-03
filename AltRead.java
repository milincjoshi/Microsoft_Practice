/*
	Q: Read a 2 dimensional miatrix in spiral way.
	Approach: Use a flag for iterating over alternate rows
*/

public class AltRead{
	public static void main(String[] args){
		int[][] arr = new int[3][3];
		boolean flag = true;
		int c = 0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr[i][j] = c;
				c++;
			}
		}
		for(int i=0;i<3;i++){
			
			if(flag){
				for(int j=0;j<3;j++){
					System.out.print(arr[i][j]+",");
				}	
				flag = false;	
			}
			else{
				for(int j=3-1;j>=0;j--){
					System.out.print(arr[i][j]+",");
				}		
				flag = true;
			}
		}
	}
}