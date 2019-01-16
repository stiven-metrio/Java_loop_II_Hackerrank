import java.util.Scanner;

public class Java_loop_II_Serie {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int amountSeries = in.nextInt();
		int abnArray[][] = new int[amountSeries][3];
		
		// a, b & n for the series
		int a, b, n;
		for (int i = 0; i < amountSeries; i++) {
			a = in.nextInt();
			b = in.nextInt();
			n = in.nextInt();
			// Save array with a b n values
			abnArray[i][0] = a;
			abnArray[i][1] = b;
			abnArray[i][2] = n;
		}
		in.close();

		// print abnArray
		for (int i = 0; i < amountSeries; i++) {
			System.out.printf("%d\t%d\t%d%n",abnArray[i][0],abnArray[i][1],abnArray[i][2]);
		}
		
		// Print series
		int temp;
		for (int j = 0; j < amountSeries; j++) {
			temp = abnArray[j][0] + abnArray[j][1]; // a + b
			System.out.printf("%d ",temp);
			for (int i = 1; i < abnArray[j][2]; i++) {
				temp = (int) (temp + Math.pow(2, i)*abnArray[j][1]);
				System.out.printf("%d ",temp);
			}
			System.out.println();
		}
		
	}

}
