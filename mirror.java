// Java implementation of the approach
public class GFG {

	// Function that returns true if
	// the array is mirror-inverse
	static boolean isMirrorInverse(int arr[])
	{
		for (int i = 0; i < arr.length; i++) {

			// If condition fails for any element
			if (arr[arr[i]] != i)
				return false;
		}

		// Given array is mirror-inverse
		return true;
	}

	// Driver code
	public static void main(String[] args)
	{
		int arr[] = { 3,2,0,1};
		if (isMirrorInverse(arr))
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
