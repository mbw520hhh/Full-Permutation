public class Test2_5 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3};	
		fullSort(arr, 0, arr.length - 1);
	}

	public static void fullSort(int[] arr, int start, int end) {
		if (start == end) {
			if ((arr[0] != 1)&&(arr[2]!=1)&&(arr[2]!=3)) {
				char x,y,z;
				x=(char)(arr[0]-1+'a');
				y=(char)(arr[1]-1+'a');
				z=(char)(arr[2]-1+'a');
				System.out.println("x-"+ x  + " y-"+y + " z-" +z  );
			}
			return;
		}
		for (int i = start; i <= end; i++) {
			swap(arr, i, start);
			fullSort(arr, start + 1, end);
			swap(arr, i, start);
		}
	}
	private static void swap(int[] arr, int i, int j) {
		int tmp = arr[i];
		arr[i] = arr[j];
		arr[j] = tmp;
	}

}