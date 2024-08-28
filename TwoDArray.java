public class TwoDArray {
	public static void main(String[] args) {
		int rows = 3;
		int columns = 3;

		int[][] array = new int[rows][columns];

		int value = 1;
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = value;
				value++;
			}
		}

		System.out.println("The 2D array is: ");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}
