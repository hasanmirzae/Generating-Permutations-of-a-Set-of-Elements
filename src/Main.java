import java.util.Arrays;

/**
 * Generating Permutations of a Set of Elements
 *Source: http://www.cs.utexas.edu/users/djimenez/utsa/cs3343/lecture25.html
 */
public class Main {

	static int count = 0;
	public static void main(String[] args) {
		int[] array = {0, 1, 1, 1, 4};
		perm(array, 5, 0);
		System.out.println("Count = "+count);
	}
	/* function to swap array elements */

	static void swap (int v[], int i, int j) {
		int	t;

		t = v[i];
		v[i] = v[j];
		v[j] = t;
	}
	
	/* recursive function to generate permutations */
	 static void perm (int[] v, int n, int i) {

		/* this function generates the permutations of the array
		 * from element i to element n-1
		 */
		int	j;

		/* if we are at the end of the array, we have one permutation
		 * we can use (here we print it; you could as easily hand the
		 * array off to some other function that uses it for something
		 */
		if (i == n) {
			System.out.println(Arrays.toString(v));
			count++;
		} else
			/* recursively explore the permutations starting
			 * at index i going through index n-1
			 */
			for (j=i; j<n; j++) {

				/* try the array with i and j switched */

				swap (v, i, j);
				perm (v, n, i+1);

				/* swap them back the way they were */

				swap (v, i, j);
			}
	}
	
	

}
