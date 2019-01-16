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
	}

}
