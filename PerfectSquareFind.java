public class PerfectSquareFind{

		public static int findNumber(int x){
			
			for(int i = 1; i<x;i++){
				double d = Math.sqrt(x/i);
				System.out.println(i+", "+d);
				if(d == (int)d){
					return i;
				}
			}

			return 0;
		}
		public static void main(String[] args){
			
			int x = 20;
			int n = findNumber(x);
			System.out.println(n);
		}
}